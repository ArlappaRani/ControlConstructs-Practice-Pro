import java.util.Scanner;
public class SeniorCitizen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating a object for taking user input
		System.out.println("Enter the Age");//printing a statement for user input
		int Age=scan.nextInt();//reading a age of person
		SeniorCitizen sc=new SeniorCitizen();//creating a object using class name
		sc.Discount(Age);//calling a method

	}

}
