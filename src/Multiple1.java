import java.util.Scanner;
public class Multiple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating  a object for taking user input
		System.out.println("Enter the number");//printing a statement
		int Number=scan.nextInt();//reading a number
		Multiple mn=new Multiple();//creating a object
		mn.MultipleNum(Number);//calling a method 

	}

}
