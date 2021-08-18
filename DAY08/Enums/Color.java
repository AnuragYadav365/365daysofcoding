package DAY08.Enums;
public enum Color {

	RED("Passion"), GREEN("Health"), BLUE("Calm");

	private String meaning;

	Color(String meaning) {
		this.meaning = meaning;
	}

	public String getMeaning() {
		return meaning;
	}

	public String toString() {
		return "This color's meaning is: " + meaning;
	}

}
