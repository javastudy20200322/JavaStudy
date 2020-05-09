package summary.dohyun.chapter07.Exercise;

abstract class Unit {
		 int x,y;
		abstract void move(int x, int y);
		 void stop() {};
}

class Marine extends Unit {
	void move(int x, int y) {
	}

	void stimPack() {
	}
}

class Tank extends Unit {
	
void move(int x, int y) {};  //주석처리하면 에러 무브 추상클래스의 메서드 상속받는중이니깐? 일듯
	void changeMode() {
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
	}

	void load() {
	}

	void unload() {
	}
}

public class Exercise17 {

}
