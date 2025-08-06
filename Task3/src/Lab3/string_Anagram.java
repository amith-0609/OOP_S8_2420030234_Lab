package Lab3;
import java.util.*;

public class string_Anagram {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1 :");
        String w1 = sc.nextLine();
        System.out.println("Enter String 2 :");
        String w2 = sc.nextLine();

       
        char[] a = w1.toCharArray();
        char[] b = w2.toCharArray();

        
        if (a.length != b.length) 
        {
            System.out.println("Not Anagram");
            
        }

        
        Arrays.sort(a);
        Arrays.sort(b);

      
        if (Arrays.equals(a, b)) 
        {
            System.out.println("Anagram");
        } 
        else 
        {
            System.out.println("Not Anagram");
        }
    }

}
