
public class Example5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 
		Thread th=new DaemonThread("��̨����");
		System.out.println("th �ǲ��Ǻ�̨����"+th.isDaemon());
		
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
