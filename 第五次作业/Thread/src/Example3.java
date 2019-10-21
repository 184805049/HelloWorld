
public class Example3 {

	public static void main(String[] args) {
	 
		 TicketWindow tw=new TicketWindow();
		 
		 new Thread(tw,"ticketwindow 1").start();
		 new Thread(tw,"ticketwindow 2").start();
		 new Thread(tw,"ticketwindow 3").start();
		 new Thread(tw,"ticketwindow 4").start();
	}

}
//class TicketWindow implements Runnable{
//	
//	private int tickets=100;
//	
//	public void run(){
//		
//		while(true){
//			
//			if(tickets>0){
//				
//				Thread th=Thread.currentThread();
//				String th_name=th.getName();
//				
//				System.out.println(th_name+"正在出售第"+tickets--+"张票");
//				
//			}
//			
//		}
//	}
//}
