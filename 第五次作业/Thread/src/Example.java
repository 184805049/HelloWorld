
public class Example {

	public static void main(String[] args) {
		 
			MyThread myThread=new MyThread();
			myThread.start();  
			
			while(true){
				
				System.out.println("main() is running ++++++++");
			}
		
//			new MyThread().run();
	}

}
//class MyThread extends Thread{
	
	public void run(){
		
		while(true){
			
			System.out.println("MyThread.run() is running------");
		}
		
	}
	
}