import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//crating a object for taking user inputs
		System.out.println("Enter the purchase amount");//printing the statement
		int purchase=scan.nextInt();//reading the user Input
		Discount1 ds=new Discount1();//creating a object using class name
		ds.Amount(purchase);//calling a method using reference variable

	}

}
