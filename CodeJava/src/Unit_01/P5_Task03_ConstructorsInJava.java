package Unit_01;
/*
 * It is called when an instance of the class is created
  - At the time of calling the constructor , memory for the object is allocated in the memory
  - It is a special type of method which is used to initialise the object
  - Every time an object is created using the new() keyword , at least one constructor is called
  - Two types of Constructors in Java
    - Parameterised constructor
    - Default constructor 
 */

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		
		abc4 obj=new abc4();
		abc4 obj1=new abc4(1);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		

	}

}
class abc4{
	int a;
	//ClassName(Constructor Parameters)
	//all the class and instance variable can be initialized here!
	
	abc4(){
		a=10;
	}
	abc4(int a){
		this.a=a;
	}
	void display() {
		int b=10;
		System.out.println(a);
		System.out.println(b);
	}
	int display2() {
		System.out.println(a);
		//as a was a local variable so we can not access it outside the method
		//System.out.println(b);
		return a;
	}
}
