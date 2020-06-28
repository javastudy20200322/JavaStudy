package summary.jaeyeon.example.chap14_Lambda;

import java.util.Map;

class Q8 {
	/*
	 * 다음은 불합격(150점 미만)한 학생의 수를 남자와 여자로 구별하여 출력하는 프로그램이다.
	 * (1) 에 알맞은 코드를 넣어 완성하시오.
	 * 
	 * 각 반별 총점을 학년 별로 나누어 출력하는 코드를 (2) 에 작성하시오
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stuArr = {

				new Student("나자바",true,1, 3, 300),
				new Student("김지미",false,1, 1, 250),
				new Student("김자바",true,1, 1, 200),
				new Student("이지미",false,1, 2, 150),
				new Student("남자바",true,1, 2, 100),
				new Student("안지미",false,1, 2, 50),
				new Student("황지미",false,1, 1, 100),
				new Student("강지미",false,1, 3, 150),
				new Student("이자바",true,1, 3, 200),
				
				new Student("나자바",true,2, 3, 300),
				new Student("김지미",false,2, 1, 250),
				new Student("김자바",true,2, 1, 200),
				new Student("이지미",false,2, 2, 150),
				new Student("남자바",true,2, 2, 100),
				new Student("안지미",false,2, 2, 50),
				new Student("황지미",false,2, 1, 100),
				new Student("강지미",false,2, 3, 150),
				new Student("이자바",true,2, 3, 200)

		};
		
		Map<Boolean, Map<Boolean,Long>> failedStuBySex;
		/* 
		 *(1) 8 - 알맞은 코드를 넣으시오. 
		 */
		//long failedMaleStuNum = failedStuBySex.get(true).get(true);
		//long failedFemaleStuNum = failedStuBySex.get(true).get(true);
		
		//System.out.println("불합격[남자] : " + failedMaleStuNum + "명");
		
		Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan;
		/*
		 * (2) 9 - 알맞은 코드를 넣어 완성하시오.
		 */
		/*
		for(Object e  : totalScoreByHakAndBan.entrySet()) {
			System.out.println(e);
		}
		*/
	}
}

class Student {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;

	Student(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;

	}

	public String toString() {
		return String.format("[%s,%s, %d학년, %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);

	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;

	}

	int getHak() {
		return hak;
	}

	int getBan() {
		return ban;

	}

	int getScore() {
		return score;
	}

	// groupingBy() 에서 사용
	enum Level {
		HIGH, MID, LOW
	}// 성적을 상, 중, 하 세 단계로 분류

}
