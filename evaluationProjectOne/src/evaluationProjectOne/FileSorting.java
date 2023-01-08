package evaluationProjectOne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.io.FileNotFoundException;


public class FileSorting {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	 ArrayList<String> usersInput = new ArrayList<>();
	 Random random = new Random();
	 boolean listFlag=true;
	 
	 
	
System.out.println("enter words you want to add to your list and then to file ");
while(listFlag) {
usersInput.add(sc.nextLine());
	System.out.print("do you want to add another word y/n?   ");
	if(sc.nextLine().toLowerCase().endsWith("y")) {
		listFlag=true;
		System.out.println("type the new word");
	}else {
		listFlag=false;
	}
	
}


		for(Integer i =0 ;i<100;i++) {
			try {
		
			File createPdf = new File("FileNo"+(i.toString())+".pdf");
		
		    if (createPdf.createNewFile()) {
		        System.out.println("File created: " + createPdf.getName());
		      } else {
		        System.out.println("File already exists.");
		        System.out.println( createPdf.getPath());
		       
		      }
			}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
			 FileWriter  writeToPDF = new FileWriter("FileNo"+(i.toString())+".pdf");
			 int index = random.nextInt(usersInput.size());
			
			 writeToPDF.write(usersInput.get(index));
	
			 writeToPDF.close();
	}

}
}