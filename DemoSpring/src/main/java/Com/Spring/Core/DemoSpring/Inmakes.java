package Com.Spring.Core.DemoSpring;

public class Inmakes {

	
	
		private String technology;
		private int duration;
		public double amount;
		
		public Inmakes() {
			System.out.println("Inmakes object created");
		}
		
		public Inmakes (String technology,int duration,double amount) {
			
			super();
			this.technology=technology;
			this.duration=duration;
			this.amount=amount;
		}

		   public  void mockTest() {
			   
			    System.out.println("Mock Test Completed");
			    System.out.println("Technology="+technology);
		        System.out.println("duration="+duration);
		        System.out.println("amount="+amount);
		   
		   }	
	
	}
