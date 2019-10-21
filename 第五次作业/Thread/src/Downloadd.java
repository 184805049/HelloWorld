
public class Downloadd {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			//System.out.println("hahahaa");
		new Thread(new DownLoad(),"分任务1").start();;
		new Thread(new DownLoad(),"分任务2").start();;
	}

}
class DownLoad implements  Runnable{
	
	private int num=100;
	
	public void run(){
		
		while(true){
			
			if(num>0){
				
				System.out.println(Thread.currentThread().getName()+"正在下载"+num--+"%");
			}
			if(num<=0){
				
				System.out.println("下载已完成");
				break;
			}

		}
			}
}
