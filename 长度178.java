//object 类是所有类的父类，每个类都直接或间接与object 类有关，可以调用它的方法 也可以在其子类中重写该方法
class Animal{
	
	public void shout(){
		
		System.out.println("Animal shout");
	}
	
	public String toString(){
		
		return "abcdefg";
	}
}
public class Test{
public static void main(String[] args){
	
	 Animal an=new Animal();
	 
	 System.out.println(an.toString());

	
}
}

/*interface Animal{
	
	void shout();
}
class Cat implements Animal{
	
	public void shout(){
		System.out.println("miao miao");
	}
	
	public void sleep(){
		System.out.println("cat sleep");
	}
}
class Dog implements Animal{
	
	 public void shout(){
		 
		 System.out.println("wang wang");
	 }
}
public class Test{
	
	public static void main(String[] args){
		
		//Cat cat=new Cat();
		Dog dog=new Dog();
		
		animalShout(dog);
		
	
		
	}
	public static void animalShout(Animal an){
       //创建一个子类的实例化对象，传参的接口为父类的变量，这样的化只能在函数中调用父类有的函数，子类自己有的函数不能被调用
			
			if(an instanceof Cat){
			
			Cat cat=(Cat) an;//lei de qiang zhuan 不同的子类之间是不能墙砖的，
		    cat.shout();
		    cat.sleep();
			}
			else {}
			
			
		}
	
}*/






//定义了一个动物的接口，狗类与毛类实现该接口，并实现其抽象的方法，创建父类的变量来承接子类的实例化对象，以此作为参数传递给animalShout（）函数来实现多态
//
/*interface Animal{

	 void shout();
}
class Cat implements Animal{
	
	public void shout(){
		System.out.println("miao miao");
	}
}
class Dog implements Animal{
	
	public void shout(){
		
		System.out.println("wang wang");
	}
}

public class Test {
	
	public static void main(String [] args){
		
		 Animal an1=new Cat();
		 Animal an2=new Dog();
		 
		 animalShout(an1);
		 animalShout(an2);
		 
	}



  public static void animalShout(Animal an){
	  
	  an.shout();
  }//这个函数是在主函数里面的
  } */
 


//interface 接口 如果一个abstract class 中的所有方法都是abstract的，则这个类我们可以将之定义为接口
//对于接口中的抽象的方法不用再加修饰词，虚拟机自动设置为public abstract 的，变量自动设置为全局变量
//类实现了接口之后，需要对接口里的抽象的方法具体化
/*interface Animal{//interface 里的方法都是 public abstract的
	
	 int ID=1;
	 void shout();
	 void run();
}
class Dog implements Animal{
	
	public void shout(){
		
		System.out.println("wang");
	}
	
	public void run(){
		
		System.out.println("running");
	}
}
public class Test {
	
	public static void main(String [] args){
		
		 Dog dog=new Dog();
		 
		 dog.shout();
         dog.run();		 
		 
	}
}*/

//abstract void shout(); 抽象的方法没有方法体,抽象的方法必须放在抽象的类里面，但是抽象的类里面不一定包含抽象的方法体，抽象的方法不能被调用
//为什末要定义一个抽象的类 因为里面含有抽象的方法，定义抽象的方法是因为 方法的方法题不能在此时被确定，只有在继承的子类中才能被确定，被具体化
//即在子类中一定要把父类中的抽象化的方法具体化
/*abstract class Animal{
	
	abstract void shout();
}
class Dog extends Animal{
	
	public void shout(){
		
		System.out.println("wang wang wang");
	}
	
}
public class Test {
	
	public static void main(String [] args){
		
		 Dog dog=new Dog();
		 dog.shout();
		 
		 
	}
}*/
