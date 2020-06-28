package practice.week12.jaeyeon;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import reference.encryption.AES_Encryption;

/**
 * <pre>
 * Date 	: 2020. 6. 20.
 * Author	: pureboyz
 *
 * ## 파일 입출력 연습
 * 3개의 SongInfo 객체를 암호화 후 직렬화하여 만든 파일 songInfo.ser를 읽어서
 * 역직렬화, 복호화 작업을 하여 songInfoList에 담은 후
 * 내용으로 가사를 담은 '#{가수명} - #{노래제목}.txt' 파일을 생성하세요.
 * 
 * ## SongInfo 정보
 * singer(가수명), title(노래제목), lirics(노래가사)를 담을 수 있는 직렬화가 가능한 클래스
 * 
 * ## songInfo.ser 정보
 * SongInfo 객체의 각 멤버변수를 AES128암호화를 적용 후 직렬화하여 출력한 파일.
 * 
 * </pre>
 */
public class FileInOutExample_JY
{
	// SongInfo를 담을 수 있는 ArrayList
	static ArrayList<SongInfo_JY> songInfoList = new ArrayList<>();

	public static void main(String[] args)
	{
		// Code Start..
		
		try {
			FileInputStream fis = new FileInputStream("D:\\workspaceC\\javastudy\\javastudy\\src\\practice\\week12\\jaeyeon\\songInfo.ser");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			//Hashtable<String, String> h  = (Hashtable<String, String>)ois.readObject();
			
			//songInfoList = (ArrayList<SongInfo>) ois.readObject();
			
			//System.out.println(songInfoList.toString());
			
			AES_Encryption aes = AES_Encryption.getInstance();
			
			songInfoList.add((SongInfo_JY)ois.readObject());
			
			System.out.println(songInfoList);
			//SongInfo_JY s2 = (SongInfo_JY)ois.readObject();
			//SongInfo_JY s3 = (SongInfo_JY)ois.readObject();
			
			/*
			 * Iterator it = ((ArrayList<SongInfo>) songInfoList).iterator();
			 * 
			 * while(it.hasNext()) { System.out.println(it.next() + " ");
			 * 
			 * 
			 * }
			 */
			
			//System.out.println(s1.toString());
			//System.out.println(s2.toString());
			//System.out.println(s3.toString());
			
			//ois.readObject(fis);
			fis.close();
			bis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
