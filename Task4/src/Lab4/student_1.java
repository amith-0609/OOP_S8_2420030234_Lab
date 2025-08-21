package Lab4;

public class student_1 {
	
	 public static void main(String[] args) {
	   access_Modifiers s1= new access_Modifiers();

	    
	     s1.setDetails(111, 'A', "Amith");

	 
	     System.out.println("Public variable name (changed): " + s1.name);
	     
	     System.out.println("Protected variable grade (changed): " + s1.grade);
	     //s1.rollNumber=13;

	     s1.showDetails();
	 }
	}


