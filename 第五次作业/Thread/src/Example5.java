
public class Example5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 
		Thread th=new DaemonThread("后台进程");
		System.out.println("th 是不是后台进程"+th.isDaemon());
		
		th.setDaemon(true);
		th.start();
		
	}

}
class DaemonThread extends Thread{
	
	 public DaemonThread(String name){
		 
		 super(name);
	 }
	
      public void run(){
    	  
    	  while(true){
    		  
    		  System.out.println(Thread.currentThread().getName()+"is running");
    	  }
    	  
      }
	
	
}
