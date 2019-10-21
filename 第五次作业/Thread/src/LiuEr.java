
public class LiuEr {

	public static void main(String[] args)throws Exception{
		// TODO 自动生成的方法存根
		Thread t=new Thread(new MyThread());
		t.start();
		
		for(int i=0;i<100;i++){
			
			if(i==3){
				
				Thread.yield();
			}
			
			if(i==30){
				
				t.join();
			}
			
			System.out.println("main");
			
			Thread.sleep(500);
		}
		
	}

}
class MyThread implements Runnable{
	
	public void run(){
		
		for(int i=0;i<50;i++){
			
			System.out.println("--------------new");
			try{
				
				Thread.sleep(500);
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
	}
	
}
