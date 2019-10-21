//Throwable可抛出的 里面直系子类分为Error，Exception Throwable有一些固定的其子类可以继承的方法，String getMessage（），void printStackTrace（），要注意这些方法的返回值
//Error 错误，通过修改代码无法解决，如 无法加载或找不到主类
//Exception 异常，编译时异常（语法有误）和运行时异常（内在的逻辑错误），运行时异常如算数异常
//Exception thread 
//发声Excpetion的时候，程序异常终止，无法再继续执行，为了处理这样的情况，出现了 try，，，catch语句进行异常捕获，针对异常进行处理的代码
//
public class Main {

	public static void main(String[] args) {

		try{
			
			int result=divide(4,0);//发生异常，程序立即终止，无法向下继续执行，
		    System.out.println(result);
		    
		    System.out.println("continue last111");
			
		}catch(Exception e){//Exception 类及其子类  加了try catch之后，程序不会终止，会在try的异常处跳入catch里，当然，try里异常后到代码就不会被执行了
			
			 System.out.println(e.getMessage());
		}//catch里的代码执行完毕后会继续运行下面的话
		
		System.out.println("continue last");
		
		
	}
	
	public static int divide(int x,int y){
		
		int result=x/y;
		
		return result;
	}
}
public class Gongchang {

	public static void main(String[] args) {
			
		try{
			
			int result=divide(4,0);
			System.out.println(result);
			
		}catch(Exception e){
			
			e.printStackTrace();
			return ;//catch里面用了 return ；用于结束当前方法，之后就不会再往下执行了，但是无论程序发布发生异常，finally里的代码块一定会被执行
		}finally{
			
			System.out.println("finally 代码块被执行了");
		}
		
		System.out.println("continue last");
		
	}
	
	public static int divide(int x,int y){
		
		 int result=x/y;
		 
		 return result;
	}
	

}



public class Example22 {

	public static void main(String[] args)throws Exception {
			

		int result=divide(4,0);
		System.out.println(result);
		
		
//		try{
//			
//			int result=divide(4,0);
//			System.out.println(result);
//			
//		}catch(Exception e){
//			
//			System.out.println(e.getMessage());
//			
//			return ;
//			
//		}finally{
//			
//			System.out.println("ac");
//		}
//		
//		
//		System.out.println("sssssss");
	}
	
	public static int divide(int x,int y)throws Exception{//这里方法声明抛出异常 是因为别人写的方法，在给你用的时候，可能会存在异常，所以声明了一下
														  //如果不对异常进行处理，调用的时候直接是编译错误，处理方法1.try--catch 2.
		  int result=x/y;
		  
		  return result;
	}

}


