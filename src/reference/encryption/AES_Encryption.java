package reference.encryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * ## AES 암호화 ##
 * 
 * 1.AES의 종류는 크게 두 가지가 있다.
 *  - AES128 : 암호화키의 길이가 16바이트(128bit)
 *  - AES256 : 암호화키의 길이가 32바이트(256bit)
 * 
 * 2.운용방식(암호화 수행방식)으로는 ECB/CBC 등. 여러가지가 있다.
 *  - 암호화를 하게될 원문을 16byte씩 블록을 지어 암/복호화를 한다.
 *  - ECB는 단순하게 블록 단위로 암호화를 수행한다.
 *  - CBC는 현재 암호화블록과 직전에 암호화된 블록을 XOR 연산을 한 다음에 암호화를 수행한다.
 *    · XOR 연산 : 2진법 기준으로 두 비교대상이 같으면 false, 다르면 true를 반환한다.
 *    · 첫번째 암호화블록은 직전블록이 없으므로 초기화벡터를 사용한다. (각 블록이 16byte이므로 초기화벡터 또한 16byte가 되어야한다.)
 * 
 * 3.패딩방식(마지막 암호화블록의 처리방식)으로는 NoPadding/PKCS5Padding 등. 여러가지가 있다.
 *  - 마지막 암호화블록에서 16byte를 다 채우지 못하는 경우 어떻게 처리할 것인가에 대한 방식이다.
 *  - NoPadding은 아무 처리를 하지 않기 때문에 원문의 길이를 미리 16byte의 배수가 되도록 맞추어야한다.
 *    · 문자열이 오른쪽 정렬이 되도록 왼쪽에 공백문자를 채워서 16byte를 맞춘다. (ex. 'ABCDEFGHIJ' -> '      ABCDEFGHIJ')
 *  - PKCS5Padding은 마지막 암호화블록의 남은 공간의 길이를 8로 나눈 나머지의 값으로 자동으로 채워준다.
 *    (ex. [ AB CD EF GH IJ __ __ __ ] -> [ AB CD EF GH IJ 03 03 03 ])
 *    (ex. [ AB CD EF GH IJ AB CD EF ] -> [ AB CD EF GH IJ AB CD EF ][ 08 08 08 08 08 08 08 08 ])
 *  - 마지막 암호화블록에 남은 공간이 없더라도 블록을 하나 더 추가하여 값을 채워준다.
 *    · 마지막 암호화블록의 마지막 바이트가 '01'인 경우 패딩인지 실데이터인지 알 수 없기 때문이다.
 *    (ex. [ AB CD EF GH IJ AB CD 01 ] -> [ AB CD EF GH IJ AB CD 01 ][ 08 08 08 08 08 08 08 08 ])
 * 
 * </pre>
 */
public class AES_Encryption
{
	private static AES_Encryption INSTANCE;
	
	private AES_Encryption() {}
	
	public static AES_Encryption getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new AES_Encryption();
		}
		
		return INSTANCE;
	}
	
	final static String DEFAULT_OPTIONS 	= "AES/CBC/PKCS5Padding";	// 암호화 옵션(암호화방식/운용모드/패딩방식)
    final static String DEFAULT_ENNAME 		= "AES";					// 사용할 암호화의 이름
    final static String DEFAULT_ENCODING 	= "UTF-8";					// 암호화에 사용할 인코딩 타입

    static String CRYPTO_IV 	= "1661636216616362";	// 초기화벡터 값
    static String CRYPTO_KEY 	= "abcdefghijklmnop";	// 암호화키
//    static byte[] CRYPTO_KEY = {
//    		(byte)0x61, (byte)0x62, (byte)0x63, (byte)0x64,
//    		(byte)0x65, (byte)0x66, (byte)0x67, (byte)0x68,
//    		(byte)0x69, (byte)0x6a, (byte)0x6b, (byte)0x6c,
//    		(byte)0x6d, (byte)0x6e, (byte)0x6f, (byte)0x70
//    };

	/**
	 * <pre>
	 * MethodName	: encode
	 * Date 		: 2020. 5. 30.
	 * Author		: pureboyz
	 * 
	 * Params		: String source
	 * ReturnType	: String
	 * 
	 * 1.암호화할 문자열 source를 매개변수로 받는다.
	 * 2.암호화키, 초기화벡터 객체를 생성한다.
	 * 3.암호화클래스(Cipher)인스턴스를 생성하여 초기화한다.
	 *  - 초기화메소드(init())의 매개변수로는
	 *    · CBC모드의 경우 '암/복호화 모드', '암호화키 객체', '초기화벡터 객체' 순서.
	 *    · ECB모드의 경우 '암/복호화 모드', '암호화키 객체' 순서. (초기화벡터가 필요없다.)
	 * 4.Cipher의 doFinal()을 사용하여 byte[] 타입으로 암호화한다.
	 * 5.암호화된 byte[]타입의 값을 Base64 또는 Hex방식을 사용하여 문자열로 디코딩하여 반환한다.
	 * </pre>
	 */
    public String encode(String source)
	{
		String result = null;	// 암호화가 끝나고 최종적으로 얻은 값을 담아 반환하는 변수
		
		try
		{
			SecretKey 		secretKey 	= new SecretKeySpec(CRYPTO_KEY.getBytes(), DEFAULT_ENNAME);	// 암호화키 객체
			IvParameterSpec ips 		= new IvParameterSpec(CRYPTO_IV.getBytes());				// 초기화벡터 객체
			
			Cipher 			cipher 		= Cipher.getInstance(DEFAULT_OPTIONS);	// 암호화 클래스
			
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ips);	// 암호화 클래스 초기화
			
			byte[] encrypted = cipher.doFinal(source.getBytes(DEFAULT_ENCODING));	// DEFAULT_ENCODING을 사용해서 암호화하여 encrypted에 저장
			
			result = DatatypeConverter.printBase64Binary(encrypted);	// Base64(64진법)로 디코딩
//			result = DatatypeConverter.printHexBinary(encrypted);		// Hex(16진법)로 디코딩
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * <pre>
	 * MethodName	: decode
	 * Date 		: 2020. 5. 30.
	 * Author		: pureboyz
	 * 
	 * Params		: String source
	 * ReturnType	: String
	 * 
	 * 1.복호화할 문자열 source를 매개변수로 받는다.
	 * 2.암호화키, 초기화벡터 객체를 생성한다.
	 * 3.암호화클래스(Cipher)인스턴스를 생성하여 초기화한다.
	 *  - 초기화메소드(init())의 매개변수로는
	 *    · CBC모드의 경우 '암/복호화 모드', '암호화키 객체', '초기화벡터 객체' 순서.
	 *    · ECB모드의 경우 '암/복호화 모드', '암호화키 객체' 순서. (초기화벡터가 필요없다.)
	 * 4.매개변수로 받은 source를 Base64 또는 Hex방식을 사용하여 byte[] 타입으로 인코딩한다.
	 * 5.Cipher의 doFinal()을 사용하여 byte[] 타입으로 복호화한다.
	 * 6.복호화된 byte[] 타입의 값을 문자열로 변경하여 반환한다.
	 * </pre>
	 */
	public String decode(String source)
	{
		String result = null;	// 복호화가 끝나고 최종적으로 얻은 값을 담아 반환하는 변수
		
		try
		{
			SecretKey 		secretKey 	= new SecretKeySpec(CRYPTO_KEY.getBytes(), DEFAULT_ENNAME);	// 암호화키 객체
			IvParameterSpec ips 		= new IvParameterSpec(CRYPTO_IV.getBytes());				// 초기화벡터 객체
			
			Cipher 			cipher 		= Cipher.getInstance(DEFAULT_OPTIONS);	// 암호화 클래스
			
			cipher.init(Cipher.DECRYPT_MODE, secretKey, ips);	// 암호화 클래스 초기화
			
			byte[] convertSrc = DatatypeConverter.parseBase64Binary(source);	// Base64(64진법)로 인코딩
//			byte[] convertSrc = DatatypeConverter.parseHexBinary(source);		// Hex(16진법)로 인코딩
			
			byte[] decrypted = cipher.doFinal(convertSrc);	// 복호화하여 decrypted에 저장
			
			result = new String(decrypted, DEFAULT_ENCODING);	// DEFAULT_ENCODING을 사용해서 문자열로 변환
			
			return result;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	

}
