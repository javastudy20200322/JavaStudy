package summary.seungha.Ch07_Exercise;

/* Exercise 7-13. Math클래스의 생성자는 접근 제어자가 private이다.
 * 그 이유는 무엇인가?
 * [답]	Math클래스는 인스턴스 변수 및 인스턴스 메서드가 없고 (불필요)
 *		매개변수를 받아서 처리하는 기능만을 수행하므로 Singleton 패턴이 적합하다.
 *		그러므로 매번 생성자를 만드는 것을 방지하기 위해 생성자에 private을 붙여 제한하고
 *		해당 클래스의 static 변수 및 메서드를 바로 호출하도록 안내하는 것이다.
 */