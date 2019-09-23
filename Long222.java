class Single{
	
	private static int age=10;
	private static String name="abc";
	
	private static final Single instance=new Single();
	
	public static Single getInstance(){
		return instance;
	}
	
}
class Single{
	
	private static Single instance;
	
	private Single(){}
	
	public static synchronized Single getInstance(){
		
			if(instance==null){
				instance=new Single();
			}
			
			return instance;
	}
	
	
	
	
}
class Stu{
	
	static{
		
		
		num=1000;
		name="string";
		
		System.out.println("sdfsdf");
	}
	
	static int num;
	static String name;
	
	
	
	
}


public class Test {

	public static void main(String[] args) {

		 Stu s=new Stu();
	
	}

}
/*class Animal{
	
	
	public Animal(){
		
		System.out.println("我是一只Animal");
	}
	public Animal(String name){
		
		System.out.println("我是一只"+name);
	}
}
class Dog extends Animal{
	
	public Dog (){} 
}
public class Example {

	public static void main(String[] args) {
	   
		Dog dog=new Dog();
		
		
	}

}*/

 
/*class Animal{
	
	public Animal(){
		
		System.out.println("无参的父类构造方法被调用了"); 
	} 
	public Animal(String name){
		
		System.out.println("我是一只"+name); 
	}
	
}
class Dog extends Animal{
	
	public Dog(){
		
		super( );//父类的构造函数的调用必须在子类的构造函数中的第一行，可调用有参的，也可调用无参的。
		System.out.println("无参的子类构造方法被调用了"); 
		
	}
	
	
}
public class Example {

	public static void main(String[] args) {
	  
		
		Dog dog=new Dog();
	}

}*/

/*class Animal{
	
	String name="动物";
	
	void shout(int a){
		
		System.out.println("动物发出叫声a="+a);
	}
}
class Dog extends Animal{
	
	String name="犬类";
	
	void shout(){
		
		super.shout(int a);
	}
	
	void printName(){
		
		System.out.println("name="+super.name);
	}
	
}
public class Example {

	public static void main(String[] args) {
	  
		Dog dog=new Dog();
		dog.shout();
		dog.printName();

	}

}*/

/*class Animal{
	
	 String name;
	 
	 void shout(){
		 
		 System.out.println("动物发出叫声");
	 }
}
class Dog extends Animal{
	
	void shout(){
		
		System.out.println("汪，汪，汪");
	}
	
	
}


public class Example {

	public static void main(String[] args) {
	  
		Dog dog=new Dog();
		dog.shout();

	}

}*/


/*class Animal{
	
	String name;
	
	void shout(){
		
		System.out.println("动物发出叫声");
	}
	
	
}
class Dog extends Animal{
	
	  public void printName(){
		  
		   System.out.println("name="+name);
	  }
	
}

public class Example {

	public static void main(String[] args) {
		 
		Dog dog=new Dog();
		dog.name="沙皮狗";
		
		dog.printName();
		dog.shout();

	}

}*/
