
public class Example7 {

	public static void main(String[] args)throws Exception {
		// TODO �Զ����ɵķ������
		
		new Thread(new SleepThread()).start();
		
		for(int i=0;i<=10;i++){
		
	        if(i==5){
	        	
	        	Thread.sleep(2000);
	        }
	        System.out.println("main is outing"+i);
	        Thread.sleep(500);
		}
		
	}

}
class SleepThread implements Runnable{
	
	public void run(){
		
		for(int i=0;i<=10;i++){
			
			if(i==3){
				
				try{
					
					Thread.sleep(2000);
				}catch(InterruptedException e){
					
					e.printStackTrace();
				}
				
			}
			System.out.println("�߳�һ�������"+i);
			
			try{
				
				Thread.Sleep(500);
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
	}
}
