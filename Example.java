
//类的继承 子类extends父类的所有属性和方法 
//final 关键字 
//对父类方法的重构，变量的值的修改  final修饰的类为最终类，不能被继承，final修饰的方法为最终方法，不能被子类修改，final修饰的变量为常量，在定义的时候就要初始化、
//super 关键字
//如果想要在已经重构的子类中调用父类的被重构的方法 用关键字super super（）；父类的无参的构造方法， super.变量 访问父类的相关变量，
//在实例化一个子类的对象的时候，虚拟机会自动调用子类的构造方法，而子类也会自动调用父类的构造方法。
//要想在子类中调用父类的有参的构造方法，需要在子类的构造方法的第一行写

class Animal{//若类名被 final 修饰，则该类为最终类，不能被其他类继承
    
	final String name="abcd";//被final 修饰的变量变为了常量，且在定义的时候一定要初始化，因为虚拟机不会对final修饰的量初始化
	
	final void shout(){
		
	}
	
}
class Dog extends Animal{
	
	//public void shout(){} 不能对父类中的final 方法进行重写
	
}

public class Test {

	
	public static void main(String [] args){
		
		 Dog dog=new Dog();
		 
		 
		 
	}
}
