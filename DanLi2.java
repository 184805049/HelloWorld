class Student{
	
    private static Student stu;
    
    public static Student getStu(){
		
    	if(stu==null){
    		stu=new Student(18,"abc");
    	}
		return stu; 
	}
    
    
	private static int score;
	private static String name;
	
	public static int getScore(){
		return score;
	}
 
	public static String getName(){
		return name;
	}
	
	
	 
	public static void speak(){
		
		System.out.println("my name is "+name+" , my score is "+score+".");
	}
	
	private Student(){}
	private Student(int score,String name){
		
		Student.score=score;
		Student.name=name;
	}
	
	
}
public class DanLi2 {

	public static void main(String[] args) {
		 
		
		Student stu1=Student.getStu();
		Student stu2=Student.getStu();
		
		System.out.println(stu1==stu2);
		
		    
		     
	}

}
