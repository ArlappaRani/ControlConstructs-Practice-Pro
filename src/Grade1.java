import java.util.Scanner;
public class Grade1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating an object for taking user inputs
		System.out.println("Enter the Grade");//printing the grade of user
		int Grade=scan.nextInt();//reading the user grade
		Grade Gd=new Grade();//creating object of Classname
		Gd.StudentGrade(Grade);//calling a method using reference variable

	}

}
