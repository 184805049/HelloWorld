class Student{
	
	private int score;
	private String name;
	
	public int getScore(){
		return score;
	}
	public void setScore(int score){
		this.score=score;
	}
	
	public String getString(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void speak(){
		
		System.out.println("my name is "+name+" , my score is "+score+".");
	}
	
	
	Student(){}
	Student(int score,String name){
		
		this.score=score;
		this.name=name;
	}
	
}
public class HomeWork {

	public static void main(String[] args) {
		 
		    Student stu1=new Student();
		    Student stu2=new Student(18,"Nice");
		    
		    stu1.speak();
		    stu2.speak();
	}

}
