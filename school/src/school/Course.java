package school;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private int id;
	int index=0;
	boolean check =true;
	
	List<Mark> markList = new ArrayList<>();
//----------------------- seters and geters-------------------------	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//------------------ class methods-------------------
	void addNewMark() {
		markList.add(new Mark());
		index++;
	}

	void stopAdding() {
		check =true;
	}
}
