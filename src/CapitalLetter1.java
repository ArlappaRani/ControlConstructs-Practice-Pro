import java.util.Scanner;
public class CapitalLetter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a object for taking a input from the user
		Scanner scan=new Scanner(System.in);
		//printing the taking input statement
		System.out.println("Enter the Letter ");
		//Reading the Letter
		char Letter=scan.next().charAt(0);
		//Again creating object using the non-static class name
		CapitalLetter Cl=new CapitalLetter();
		//calling a method using reference variable
		Cl.Capital(Letter);
		

	}

}
