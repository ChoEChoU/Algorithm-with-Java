package decisionTree;

public class Person {
	private String name;
	private String gender;
	private int hairLength;
	private int weight;
	private int age;
	
	public Person(String name, int hairLength, int weight, int age, String gender) {
		this.name = name;
		this.gender = gender;
		this.hairLength = hairLength;
		this.weight = weight;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getHairLength() {
		return hairLength;
	}
	public void setHairLength(int hairLength) {
		this.hairLength = hairLength;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
