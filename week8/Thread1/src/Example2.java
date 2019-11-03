
public class Example2{

	public static void main(String[] args) {
			
		 SaleThread saleThread=new SaleThread();
		 
		 new Thread(saleThread,"num 1").start();
		 new Thread(saleThread,"num 2").start();
		 new Thread(saleThread,"num 3").start(); 
		 new Thread(saleThread,"num 4").start();

	}

}

//class SaleThread implements Runnable{
//	
//	private int tickets=1000;
//	Object lock=new Object();
//	
//	public void run() {
//		
//		while(true) {
//			
//			synchronized(lock) {				
//			
//			try {
//				
//				Thread.sleep(10);
//			}catch(Exception e) {
//				
//				e.printStackTrace();
//			}
//			
//			
//			
//			if(tickets>0)
//			  System.out.println(Thread.currentThread().getName()+"ÕıÔÚÂôµÄÆ±"+tickets--);
//			else
//			  break;
//		   }	
//			
//		}
//		
//		
//	}
//	
//	
//}
