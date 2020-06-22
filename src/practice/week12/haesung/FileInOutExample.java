package practice.week12.haesung;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import practice.week12.SongInfo;
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
public class FileInOutExample
{
	// SongInfo를 담을 수 있는 ArrayList
	static ArrayList<SongInfo> songInfoList = new ArrayList<>();

	public static void main(String[] args)
	{
		// Code Start..
		try
		{
			String filePath = "src/practice/week12/songInfo.ser";
			
			FileInputStream 	fis = new FileInputStream(filePath);
			ObjectInputStream 	ois = new ObjectInputStream(fis);
			
			System.out.println(filePath);
			System.out.println("파일 불러오기 성공!!");
			
			songInfoList.add((SongInfo) ois.readObject());
			songInfoList.add((SongInfo) ois.readObject());
			songInfoList.add((SongInfo) ois.readObject());
			
			System.out.println("역직렬화 성공!!");
			
			ois.close();
			fis.close();
			
			for(int i=0; i<3; i++)
			{
				SongInfo songInfo = songInfoList.get(i);
				String singer 	= AES_Encryption.getInstance().decode(songInfo.getSinger());
				String title 	= AES_Encryption.getInstance().decode(songInfo.getTitle());
				String lirics 	= AES_Encryption.getInstance().decode(songInfo.getLirics());
				
				FileWriter 		fw = new FileWriter("src/practice/week12/haesung/" + singer + " - " + title + ".txt");
				BufferedWriter 	bw = new BufferedWriter(fw);
				
				bw.write(lirics);
				
				System.out.println((i+1) + "번째 파일 생성 완료!!");
				
				bw.close();
				fw.close();
			}
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!!");
	}

}
