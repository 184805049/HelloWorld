
public class Example4 {

	public static void main(String[] args) {
		 
		System.out.println("main�Ǻ�̨�߳���"+Thread.currentThread().isDaemon());
		
		DaemonThread dt=new DaemonThread();
		Thread th=new Thread(dt,"��̨�߳�");
		
		System.out.println("th�Ǻ�̨�߳���"+th.isDaemon());
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
