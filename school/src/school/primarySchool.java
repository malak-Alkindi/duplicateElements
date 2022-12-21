package school;

import java.util.ArrayList;
import java.util.List;

public class primarySchool {
	private String location;
	private int phoneNumber;
	int index=0;
	boolean check =true;

	List<Department> departmentList = new ArrayList<>();

	//----------------------- seters and geters-------------------------

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//------------------ class methods-------------------
	void addNewDepartment() {
		departmentList.add(new Department());
		index++;
	}

	void stopAdding() {
		check =true;
	}
	}


