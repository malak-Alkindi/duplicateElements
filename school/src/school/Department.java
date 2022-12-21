package school;
import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int floor;
	int index=0;
	boolean check =true;
	
	List<Teacher> teachertList = new ArrayList<>();
//----------------------- seters and geters-------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	//------------------ class methods-------------------
	void addNewTeacher() {
		teachertList.add(new Teacher());
		index++;
	}

	void stopAdding() {
		check =true;
	}
}
