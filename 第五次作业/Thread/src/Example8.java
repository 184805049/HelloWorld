class YieldThread extends Thread{
	
	public YieldThread(String name){
		
		super(name);
	}
	
	public void run(){
		
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"----"+i);
			
			if(i==3){
				
				System.out.print("�س��ò�:");
				Thread.yield();
			}
		}
	}
	
}
public class Example8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Thread th1=new YieldThread("Thread 1");
		Thread th2=new YieldThread("Thread 2");
		
		th1.start();
		th2.start();
		
	}

}
