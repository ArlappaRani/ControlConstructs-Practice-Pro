import java.util.Scanner;
public class VoteEligible1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating a object for taking user inputs
		System.out.println("Enter the age of a person");//printing the age
		int Age=scan.nextInt();//readilng the age value using Age variable
		VoteEligible ve=new VoteEligible();//creating a object using non-static method class
		ve.Vote(Age);//calling a method using reference variable

	}

}
