
public class Example6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Thread minPriority=new Thread(new MinPriority(),"�����ȼ�");
		Thread maxPriority=new Thread(new MaxPriority(),"�����ȼ�");
		
		minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.setPriority(Thread.MAX_PRIORITY);
		
		minPriority.start();
		maxPriority.start();
		
	}

}
class MaxPriority implements Runnable{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			
			System.out.println(Thread.currentThread().getName()+"is outing"+i);
		}
	}
}
class MinPriority implements Runnable{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			
			System.out.println(Thread.currentThread().getName()+"is outing"+i);
		}
	}
	
}