package summary.jaeyeon.practiceA.chap14_Stream;

class StreamEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3[] stuArr = {};

	}

}

class Student3 implements Comparable<Student3> {
	String name;
	int ban;
	int totalScore;

	Student3(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String toString() {
		return String.format("[%s,%d,%d]", name, ban, totalScore).toString();
	}

	String getName() {
		return name;
	}

	int getBan() {
		return ban;
	}

	int getTotalScore() {
		return totalScore;
	}
	
	public int compareTo(Student3 s) {
		return s.totalScore - this.totalScore;
	}
	
}