package hospital;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class HospitalMain {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	patient p = new patient();

	System.out.println("pls enter name for paint 1");
	p.setName(s.nextLine());
	System.out.println("pls enter id for paint 1");
	p.setId(s.nextInt());

	
	

	
	
	try {
		FileOutputStream ff = new FileOutputStream(new File("mm.txt"));
		ObjectOutputStream o = new ObjectOutputStream(ff);

		// Write objects to file
		o.writeObject(p);

		o.close();
		ff.close();
}catch(Exception error) {
error.getMessage();
}
try {				FileInputStream fi = new FileInputStream(new File("mm.txt"));
		ObjectInputStream oi = new ObjectInputStream(fi);

		// Read objects
		patient po = (patient) oi.readObject();

		System.out.println("the out put from the saved opjects : ");
		System.out.println("patint name :"+po.getName());
		System.out.println("patint id :"+po.getId());
		oi.close();
		fi.close();
	}catch(Exception error) {
		error.getMessage();
	}
	}

}
