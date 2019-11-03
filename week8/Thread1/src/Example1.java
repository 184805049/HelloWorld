
public class Example1 {

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
//	private int tickets=10;
//	
//	public void run() {
//		
//		while(tickets>0) {
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
			
			
			System.out.println(Thread.currentThread().getName()+"ÕıÔÚÂôµÄÆ±"+tickets--);
			
			
			
		}
		
		
	}
	
	
}
