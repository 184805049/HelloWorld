
public class LiuYi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		new myThread("AAA").start();
		new myThread("BBB").start();
		
	}

}
//class myThread extends Thread{
//	
//	public myThread(String name){
//		
//		super(name);
//	}
//	
//	public void run(){
//		
//		System.out.println("current----->"+Thread.currentThread().getName());
//	}
//}