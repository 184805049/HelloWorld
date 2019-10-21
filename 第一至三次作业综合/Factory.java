 abstract class Tv{
	
	public abstract void play();
}
 class HaierTv extends Tv{
	
	public void play(){
		
		System.out.println("This is HaierTv.");
	}
}
 class HaixinTv extends Tv{
	
     public void play(){
		
		System.out.println("This is HaixinTv.");
	}
	 
}
 class TVFactory{
	 
	 public static Tv produceTv(String brand){//传过来啥牌子的需求，就让相应的工厂生产相应的电视返回给Main函数
		 
		 if(brand.equals("HaierTv"))
			  return new HaierTv();
		 
		 if(brand.equals("HaixinTv"))
			  return new HaixinTv();
		 
		 return null;//如果想添加的话，就需要修改src code
	 }
 }

public class Main {

	public static void main(String[] args) {
			
		Tv tv;
		String brandName = XMLUtilTV.getBrandName();
		tv=TVFactory.produceTv(brandName);//传入什么样的要求，造什么样的牌子的电视。
		tv.play();//直到这一步才知道是啥牌子的电视，
		
	}

}
