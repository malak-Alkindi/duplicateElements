package school;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private String type;
	private String name;
	int index=0;
	boolean check =true;
	
	List<Student> studentList = new ArrayList<>();
//----------------------- seters and geters-------------------------	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//------------------ class methods-------------------
	void addNewStudent() {
		studentList.add(new Student());
		index++;
	}

	void stopAdding() {
		check =true;
	}
}
