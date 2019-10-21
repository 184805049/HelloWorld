
public class Example9 {

	public static void main(String[] args)throws Exception {
		 
		Thread t=new Thread(new EmergencyThread(),"thread 1");
		t.start();
		
		for(int i=0;i<=10;i++){
			
			System.out.println("main -----"+i);
			
			if(i==3){
				
				t.join();
			}
			
			Thread.sleep(500);
		}
		
		
		
	}

}
class EmergencyThread implements Runnable{
	
	public void run(){
		
		for(int i=1;i<100;i++){
			
			System.out.println(Thread.currentThread().getName()+"------"+i);
			try{
				
				Thread.sleep(500);
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
			
		}
	}
	
	
}