
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Ticket1 ticket=new Ticket1();
		
		new Thread(ticket,"num 1").start();
		new Thread(ticket,"num 2").start();
		new Thread(ticket,"num 3").start();
		new Thread(ticket,"num 4").start();
			
	}

}
class Ticket1 implements Runnable{

	private int tickets=1000;
	
	public void run() {
		
		while(true) {
			
			SaleTicket();
			
			if(tickets<=0)
				break;
		}
		
	}
	
	public synchronized void SaleTicket() {
		
		if(tickets>0) {
					
		try {
			
			Thread.sleep(10);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		 
		System.out.println(Thread.currentThread().getName()+"-------"+tickets--);
		}
	}
	
	
	
	
}
