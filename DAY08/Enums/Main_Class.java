package DAY08.Enums;
public class Main_Class {

	public static void main(String[] args) {

		Color color = Color.GREEN;

		switch (color) {
		case BLUE:
			System.out.println("Blue");
			break;
		case GREEN:
			System.out.println("Green");
			break;
		case RED:
			System.out.println("Red");
			break;
		default:
			break;
		}

		System.out.println(Color.RED);
		System.out.println("Enum meaning as a string is: " + Color.RED.name());
		System.out.println(Color.GREEN.getClass());
		System.out.println(Color.GREEN instanceof Enum);
		System.out.println(Color.RED.getMeaning());

		Color color1 = Color.valueOf("RED");
		System.out.println(color1);

	}

}
