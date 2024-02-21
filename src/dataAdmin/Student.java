package dataAdmin;
import java.util.Scanner;


//Student class represents each student and some basic information
public class Student {
		
		private String firstName; // students first name 
		private String lastName; //students last name 
		private int gradeYear; // number of years student has been  enrolled
		private String studentId; // student unique identification number 
		private String courses = ""; //the courses the student is enrolled in 
		private double tuitionbalance = 0; // the tuition balance 
		private static int costOfCourse = 600; // cost of each course
		public static int id = 1000; // used to make a unique id for each student
		
		
		//constructor prompting to enter students name and grade year 
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
		
		//generates student id
		public void setStudentId()
		{
			id = id+1;
			this.studentId = gradeYear + "" + id;
			
		}
		
		//enrolls students into courses
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
		// views tuition balance 
		public void viewBalance() {
			System.out.println("Tuition Balance = $"+tuitionbalance);
		}
		
		// pays tuition
		public void payTuition() {
			
			double payment = 0.0;
			System.out.println("Enter the amount to be paid towards tuition" );
			Scanner keyboard = new Scanner(System.in);
			payment = keyboard.nextDouble();
			
			
			tuitionbalance = tuitionbalance - payment;
			
			System.out.println("Thanks for your payment of: $" + payment);
			
			viewBalance();
			

			}
		
		//shows all the students information
		public void showStaus(){
			
			System.out.println("Name: " +firstName + " " + lastName);
			System.out.println("Grade Year: " +gradeYear);
			System.out.println("Student ID: "+ studentId);
			System.out.println("Courses Enrolled: "+ courses);
			System.out.println("Tuition Balance: " + tuitionbalance);
		
			
		}
		
		
		}
