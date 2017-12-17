package domain;

public class Person {
	private String name;
	private String sex;
	private String car;
	private String rocket;

	public Person(String name, String sex, String car, String rocket) {
		this.name = name;
		this.sex = sex;
		this.car = car;
		this.rocket = rocket;
	}

	public String getName() {
		return name;
	}

	public String getRocket() {
		return rocket;
	}

	public String getCar() {
		return car;
	}

	public String getSex() {
		return sex;
	}
}
