import java.util.Scanner;
public class AdultApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating a object
		System.out.println("Enter the age");//printing age value
		int age=scan.nextInt();//reading a value
		Adult ag=new Adult();//creating object using class name
		ag.AdultAge(age);//calling a method using reference variable
		

	}

}
