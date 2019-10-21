
public class Example1 {

	public static void main(String[] args) {
		 
		MyThread myThread=new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();
		
//		new Thread(new MyThread()).start();
		
		while(true){
			
			System.out.println("main is running++++++");
		}
			
	}

}
//class MyThread implements Runnable{
//	
//	   public void run(){
//		   
//		   while(true){
//			   System.out.println("MyThread.run is running ----");
//		   }
//		   
//	   }
//	
//}
