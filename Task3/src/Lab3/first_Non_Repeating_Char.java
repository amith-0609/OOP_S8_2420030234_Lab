package Lab3;

import java.util.*;

public class first_Non_Repeating_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String :");
        String s = sc.nextLine();

        int i, j, count;
        boolean found = false;

        for (i = 0; i < s.length(); i++)
        {
            count = 0;
            for (j = 0; j < s.length(); j++) 
            {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                System.out.println(s.charAt(i));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("No non-repeating character");

	}

}
