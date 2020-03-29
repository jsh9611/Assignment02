package interfaceOffer;

abstract class Person implements Comparable<Object> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}