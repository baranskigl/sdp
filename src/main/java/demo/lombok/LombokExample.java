package demo.lombok;

public class LombokExample {
	public static void main(String[] args) {
		PersonWithOutLombok personWithoutLombok = new PersonWithOutLombok();
		personWithoutLombok.setAge(33);
		personWithoutLombok.setName("Bartosz");
		personWithoutLombok.setLastName("Baranski");
		System.out.println("Printing person without lombok=" + personWithoutLombok);

		PersonWithLombok personWithLombok = new PersonWithLombok();
		personWithLombok.setAge(33);
		personWithLombok.setName("Bartosz");
		personWithLombok.setLastName("Baranski");
		System.out.println("Printing person with lombok=" + personWithLombok);

	}
}
