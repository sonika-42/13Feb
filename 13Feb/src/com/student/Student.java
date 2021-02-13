package com.student;

public class Student {
	 int roll_no;
	 String name;
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
        s1.roll_no=1;
        s1.name="Ram";
        
        Student s2=new Student();
        s2.roll_no=2;
        s2.name="Sham";
        
        Student s3=new Student();
        s3.roll_no=3;
        s3.name="Vinit";
        
        Student s4=new Student();
        s4.roll_no=4;
        s4.name="Prathamesh";
        
        Student s5=new Student();
        s5.roll_no=5;
        s5.name="Sushant";

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        
     }
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}
}


