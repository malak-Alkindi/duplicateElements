package school;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	int index=0;
	boolean check =true;
	
	List<Course> courseList = new ArrayList<>();
//----------------------- seters and geters-------------------------	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//------------------ class methods-------------------
	void addNewCourse() {
		courseList.add(new Course());
		index++;
	}

	void stopAdding() {
		check =true;
	}
}
