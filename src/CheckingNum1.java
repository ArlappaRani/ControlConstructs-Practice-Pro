import java.util.Scanner;
public class CheckingNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating a object for taking user inputs
		System.out.println("Enter a Number");//printing the input statement
		int Num=scan.nextInt();//reading the input
		CheckingNum Cn=new CheckingNum();//creating a object
		Cn.Number(Num);//calling method using reference variable

	}

}
