package Lab5;

	class Transport {
	    void ticketPrice() {
	        System.out.println("Ticket price for transport");
	    }
	}

	
	class Bus extends Transport {
	    @Override
	    void ticketPrice() {
	        System.out.println("Price of Bus ticket is 20.");
	    }
	}

	
	class Train extends Transport {
	    @Override
	    void ticketPrice() {
	        System.out.println("Price of Train ticket is 200.");
	    }
	}


	public class inheritance_Overriding {
	    public static void main(String[] args) {
	        Transport t1 = new Bus();   
	        Transport t2 = new Train(); 

	        t1.ticketPrice(); 
	        t2.ticketPrice(); 
	        }
	}



