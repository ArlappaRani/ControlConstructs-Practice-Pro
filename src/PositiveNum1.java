import java.util.Scanner;
public class PositiveNum1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating a object for taking inputs
		System.out.println("Enter a Number");//printing the inputs
		int a=scan.nextInt();//reading the input
		PositiveNum pn=new PositiveNum();//creating a object using class name 
		pn.Number(a);//calling a method
		

	}
}


