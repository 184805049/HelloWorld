
package stu;

public class Student{
	
	public boolean flag;
	public String name;
	public String num;
	public String qq;
	
	 Student(String name,String num,String qq){
		
		this.name=name;
		this.num=num;
		this.qq=qq;
		this.flag=true;
	}
	
	 Student(){
		 
		 this.name="";
		 this.num="";
		 this.qq="";
		 this.flag=true;
	 }
	 //get
	 public String getName(){
		 
		 return name;
	 }
	 public String getNum(){
		 
		 return num;
	 }
	 public String getQq(){
		 
		 return qq;
	 }
	 
	 //set
	 public void setName(String name){
		 
		 this.name=name;
	 }
	 public void setNum(String num){
		 
		 this.num=num;
	 }
	 public void setQq(String qq){
		 
		 this.qq=qq;
	 }
}