import java.util.Scanner;
public class PosOrNeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//Creating a object for taking user input
		System.out.println("Enter the Number");//printing the user input statement
		
		int Num=scan.nextInt();//reading the number from user
		PosOrNeg pn=new PosOrNeg();//creating a object using class name
		pn.Number(Num);//calling a method using reference  variable
		
	}

}
