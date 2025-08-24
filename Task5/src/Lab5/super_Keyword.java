package Lab5;

	class Order {
	    int orderId;
	    double amount;

	    Order(int orderId, double amount) {
	        this.orderId = orderId;
	        this.amount = amount;
	    }

	    void printDetails() {
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Order Amount: " + amount);
	    }
	}

	class OnlineOrder extends Order {
	    String deliveryAddress;

	    
	    OnlineOrder(int orderId, double amount, String deliveryAddress) {
	        super(orderId, amount);
	        this.deliveryAddress = deliveryAddress;
	    }

	    // Overriding method
	    @Override
	    void printDetails() {
	        super.printDetails();
	        System.out.println("Delivery Address: " + deliveryAddress);
	    }
	}


	public class super_Keyword {
	    public static void main(String[] args) {
	        OnlineOrder order = new OnlineOrder(101, 2500.75, "KL Bachupally");
	        order.printDetails();
	    }
	}


