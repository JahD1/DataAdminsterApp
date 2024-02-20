package dataAdmin;
import java.util.Scanner;

public class Student {
	
		private String firstName;
		private String lastName;
		private int gradeYear;
		private String studentId;
		private String courses = "";
		private double tuitionbalance = 0;
		private static int costOfCourse = 600;
		public static int id = 1000;
		
		public Student()
		{
			Scanner keyboard =new Scanner(System.in);
			System.out.println("Enter students first name ");
			this.firstName = keyboard.nextLine();
			System.out.println("Enter students last name");
			this.lastName = keyboard.nextLine();
			System.out.println("1 for Freshman\n2 for Sophmore\n3 for Junior\n4 for senior");
			this.gradeYear = keyboard.nextInt();
			
			setStudentId();
		}
		
		public void setStudentId()
		{
			id++;
			this.studentId = gradeYear + "" + id;
			
		}
		
		public void enroll()
		{
			String course;
			Scanner keyboard = new Scanner(System.in);;
		
			do
			{
				System.out.println("Enter course to enroll (Enter Q to quit)");
				course = keyboard.nextLine();
				
				
					if(!course.equals("Q")) {
					courses = courses + "\n" + course;
					tuitionbalance = tuitionbalance + costOfCourse;
					}else 
						continue;
			
				
			}while (!course.equals("Q"));
			
			
		
}
		public void viewBalance() {
			System.out.println("Tuition Balance = $"+tuitionbalance);
		}
		
		public void payTuition() {
			
			double payment = 0.0;
			System.out.println("Enter the amount to be paid towards tuition" );
			Scanner keyboard = new Scanner(System.in);
			payment = keyboard.nextDouble();
			
			
			tuitionbalance = tuitionbalance - payment;
			
			System.out.println("Thanks for your payment of: $" + payment);
			
			viewBalance();
			

			}
		
		public void showStaus(){
			
			System.out.println("Name: " +firstName + " " + lastName);
			System.out.println("Grade Year: " +gradeYear);
			System.out.println("Student ID: "+ studentId);
			System.out.println("Courses Enrolled: "+ courses);
			System.out.println("Tuition Balance: " + tuitionbalance);
		
			
		}
		
		
		}
