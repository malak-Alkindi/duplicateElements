package school;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		List<primarySchool> schoolList = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		
		int index=0;
		boolean check =true;
		
		
		
		while(check) {
			System.out.println("do you want to add a new school ?");
			String schoolResponse=sc.nextLine();
			if(schoolResponse.equals("y")) {
				System.out.println(schoolResponse);
				schoolList.add(new primarySchool());	
			
				System.out.println(schoolResponse.equals("y"));
				
				System.out.println("do you want to add a new department ?");
				String departmentResponse=sc.nextLine();
				while(schoolList.get(index).check) {
				if(departmentResponse.equals("y")) {
					schoolList.get(index).departmentList.add(new Department());
					
					schoolList.get(index).index++;
				}
				else {
					schoolList.get(index).check=false;
					System.out.println("department finshed");}
				schoolList.get(index).index++;
			}//department while
			}
			else {
				check=false;
				System.out.println("school finshed");}
			index++;
		}//school while
	}


/*
if(schoolResponse.equals("y")) {
				
			}
			else {
				check=false;}






*/

	}


