package Lab4;

public class access_Modifiers {

        
		private int rollNumber;
		protected char grade;
		public String name;
		
	
		
		public void setDetails(int roll,char grd, String nm) {
			
	        rollNumber=roll;
	        grade=grd;
	        name=nm;
	    }
		public static void main(String[] args) {
			
			
			
		}
			
		
		void showDetails()
		{
			
			System.out.println(rollNumber);
			
			
		}

	}


