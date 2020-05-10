package practice.week05.hyunjin;

//## ����
//https://www.acmicpc.net/problem/10825
//
//## ����
//�����̳� �� �л� N���� �̸��� ����, ����, ���� ������ �־�����. �̶�, ������ ���� �������� �л��� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//���� ������ �����ϴ� ������
//���� ������ ������ ���� ������ �����ϴ� ������
//���� ������ ���� ������ ������ ���� ������ �����ϴ� ������
//��� ������ ������ �̸��� ���� ������ �����ϴ� ������
//(��, �ƽ�Ű �ڵ忡�� �빮�ڴ� �ҹ��ں��� �����Ƿ� ���������� �տ� �´�.)
//
//## �Է�
//ù° �ٿ� �����̳� ���� �л��� �� N (1 �� N �� 100,000)�� �־�����.
//��° �ٺ��� �� �ٿ� �ϳ��� �� �л��� �̸�, ����, ����, ���� ������ �������� ������ �־�����.
//������ 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
//�̸��� ���ĺ� ��ҹ��ڷ� �̷���� ���ڿ��̰�, ���̴� 10�ڸ��� ���� �ʴ´�.
//
//## ���
//������ �����ִ� ���� �������� ������ �� ù° �ٺ��� N���� �ٿ� ���� �� �л��� �̸��� ����Ѵ�.
//
//## ���� �Է� 1 
//12
//Junkyu 50 60 100
//Sangkeun 80 60 50
//Sunyoung 80 70 100
//Soong 50 60 90
//Haebin 50 60 100
//Kangsoo 60 80 100
//Donghyuk 80 60 100
//Sei 70 70 70
//Wonseob 70 70 90
//Sanghyun 70 70 80
//nsj 80 80 80
//Taewhan 50 60 90
//
//## ���� ��� 1 
//Donghyuk
//Sangkeun
//Sunyoung
//nsj
//Wonseob
//Sanghyun
//Sei
//Kangsoo
//Haebin
//Junkyu
//Soong
//Taewhan

class Subject {
	int korean;
	int english;
	int math;
	
	public Subject() {}

	public Subject(Subject sb) {
		this(sb.korean, sb.english, sb.math);
	}
	
	public Subject(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
}

class Student extends Subject{
	String[] name;
	
	public Student() {
		super();
	}
	
	public Student(String[] name) {
		this.name = name;
	}
}

public class Grade_OOP_hyunjin_200426 {

}
