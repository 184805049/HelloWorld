
public class Example4 {

	public static void main(String[] args) {
		 
		System.out.println("main是后台线程吗？"+Thread.currentThread().isDaemon());
		
		DaemonThread dt=new DaemonThread();
		Thread th=new Thread(dt,"后台线程");
		
		System.out.println("th是后台线程吗"+th.isDaemon());
		th.setDaemon(true);
		th.start();
		
		for(int i=0;i<10;i++)
			System.out.println(i);

	}

}
//class DaemonThread implements Runnable{
//	
//	public void run(){
//		
//		while(true){
//			
//			System.out.println(Thread.currentThread().getName()+"------is runnnig");
//		}
//	}
//			
//}
