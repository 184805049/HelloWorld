
public class TTaxi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Taxi t=new Taxi();
		
		new Thread(t,"Taxi 1").start();
		new Thread(t,"Taxi 2").start();
		new Thread(t,"Taxi 3").start();
		new Thread(t,"Taxi 4").start();
		new Thread(t,"Taxi 5").start();
	}

}
class Taxi implements Runnable{
	
	private int passenger=100;
	
	public void run(){
		
		while(true){
			
			if(passenger>0){
				
				System.out.println(Thread.currentThread().getName()+"���ڴ��ص�"+passenger--+"����");
			}
		}
	}
	
}
