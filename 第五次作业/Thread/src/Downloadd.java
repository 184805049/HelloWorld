
public class Downloadd {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			//System.out.println("hahahaa");
		new Thread(new DownLoad(),"������1").start();;
		new Thread(new DownLoad(),"������2").start();;
	}

}
class DownLoad implements  Runnable{
	
	private int num=100;
	
	public void run(){
		
		while(true){
			
			if(num>0){
				
				System.out.println(Thread.currentThread().getName()+"��������"+num--+"%");
			}
			if(num<=0){
				
				System.out.println("���������");
				break;
			}

		}
			}
}
