package Unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		abc obj = new abc();
		//obj.basicException();
		//obj.handleException();
		//obj.multipleCatch();
		//obj.inputMismatchException();
		//obj.stackOverFlowError(6);
		//obj.indexOutOfBoundException();
		//obj.nullPointerException();
		//obj.useofThrow(34);
		//obj.useOfThrowsandFinally();
        //obj.checkedAndUncheckedException();
	}

}
class abc {
	 //compiler can not catch this exception at compile time
	void basicException() {
		int b=0;
		int a=100/b;
		System.out.println(a);
		
	}
	void handleException() {
		try {
			//sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e) {   //how exception would be handled 
			System.out.println(e.getMessage());
			
		}
		System.out.println("We are done !");
	}
	void multipleCatch() {
		try {
			//sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		//child class exception comes before super class 
		catch(ArithmeticException e) {                 
			System.out.println(e.getMessage()+ "hello ");
		}
		catch(Exception e) {    // exception is a super class
			System.out.println(e.getMessage());
			
		}
}
	void inputMismatchException() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		System.out.println("Number is "+ num);
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Its done !");
		
	}
	void stackOverFlowError(int i) {
		//error can not be handled, that's why catch can not work with error
		try {
		while(i>0) {
			i=i+1;
			stackOverFlowError(i);
		}
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	void indexOutOfBoundException() {
		try {
		int arr[]= {1,4,7,9,6};
		System.out.println(arr[10]);   //array out of bound 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Now its fine !");
	}
	
	void nullPointerException() {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
	void useofThrow(int age) throws Exception{
		if(age<18) {
			throw new Exception();
		}
		else {
			System.out.println("You are not allowed to enter=");
		}
	}
	void useOfThrowsandFinally(){
		try {
			useofThrow(17);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("if any try is fell then come in finally");
		}
	}
	void checkedAndUncheckedException() {
		//Unchecked exception
		int b=0;
		int a=100/b;
		System.out.println(a);
		//Checked Exception
		try {
			useofThrow(17);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}