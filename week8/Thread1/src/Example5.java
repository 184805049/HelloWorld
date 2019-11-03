public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Storage st=new Storage();
		InPut input=new InPut(st);
		OutPut output=new OutPut(st);
		
		new Thread(input,"input").start();
		new Thread(output,"output").start();
	}

}
class Storage{
	
	private int[] cells=new int[10];
	
	private int inPos=0,outPos=0;
	
	public void  put(int num) {
		
		cells[inPos]=num;
		
		System.out.println("cells["+inPos+"]"+"is putting"+num);
		
		inPos++;
		
		if(inPos==cells.length)
			inPos=0;
		
	}
	
	public void get() {
		
		int data=cells[outPos];
		
		System.out.println("cells["+outPos+"]"+"is getting"+data);
		
		outPos++;
		
		if(outPos==cells.length)
			outPos=0;
		
		
	}
 
}
class InPut implements Runnable{
	
	private Storage st;
	private int num=0;
	
	InPut(Storage st){
		
		this.st=st;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("num="+num);
			st.put(num++);
		}
		
	}

}
class OutPut implements Runnable{
	
	private Storage st;
	
	OutPut(Storage st){
		
		this.st=st;
	}
	
	public void run() {
		
		while(true) {
			
			st.get();
		}
		
		
	}
 
	
}