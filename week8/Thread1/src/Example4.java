class DeadLockThread implements Runnable{
	
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	
	boolean flag;
	DeadLockThread(boolean flag){
		
		this.flag=flag;
	}
	
	public void run() {
		
		if(flag) {
			
			while(true) {
				
				synchronized(chopsticks) {
					
					System.out.println(Thread.currentThread().getName()+"-------------if--chopsticks");
					
					synchronized(knifeAndFork) {
						
						System.out.println(Thread.currentThread().getName()+"----------if--knifeAndFork");
					}
					
					
				}
			}
 
			
		}else {
			
			while(true) {
				
				synchronized(knifeAndFork) {
				
				System.out.println(Thread.currentThread().getName()+"-------------if--knifeAndFork");
				
				synchronized(chopsticks) {
					
					System.out.println(Thread.currentThread().getName()+"----------if--chopsticks");
				}
			}
             	 
				
				
			}
			    
		}
		
	}
	
	
	
	
}
public class Example4 {

	public static void main(String[] args) {
		
		DeadLockThread d1=new DeadLockThread(true);
		DeadLockThread d2=new DeadLockThread(false);
		
		new Thread(d1,"chinese").start();
		new Thread(d2,"american").start();
 	
	}
	
	
}
