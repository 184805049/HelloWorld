
public class LiuSan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Teacher th=new Teacher();
		 new Thread(th,"teacher 1").start();;
		 new Thread(th,"teacher 2").start();
		 new Thread(th,"teacher 3").start();
	}

}
class Teacher implements Runnable{
	
	private int nodes=80;
	
	public void run(){
		
		while(true){
			
			if(nodes>0){
			
			System.out.println(Thread.currentThread().getName()+" ���ڷ���"+nodes--+"����ҵ");
			}
		}
	}
	
}
