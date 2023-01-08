package objectIntoFile;
import java.io.Serializable;
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;

	Student() {
	};

	Student(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String rrr() {
		return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
	}
	@Override
	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
	}
}
