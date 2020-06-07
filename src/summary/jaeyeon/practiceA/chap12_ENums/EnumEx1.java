package summary.jaeyeon.practiceA.chap12_ENums;

enum Direction {
	EAST, SOUTH, WEST, NORTH
};

class EnumEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1 = " + d1);
	}

}
