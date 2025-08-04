package Lab2;
import java.util.Scanner;

public class sum_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	    
	    int num;
	    System.out.println("Enter the Number: ");
	    num = sc.nextInt();
	    
	    int S=0;
	    int R;
	    
	    while(num>0)
	    {
	      R=num%10;
	      
	      S=S+R;
	      
	      num=num/10;
	    }
	    
	    System.out.println(S);
	

	}

}
