public class TASystem {
	public static void main(String[] args) {
		 
		MapUser User = new MapUser("123456789");
		 
		User.generateCommunicateRecord();
		User.printDetails();
		User.printCallToDetails();
	}
}