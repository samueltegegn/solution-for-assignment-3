package exercise3;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		
		System.out.print("Enter a student record :");
		        Scanner studentgrade = new Scanner(System.in);
		        printGPA(studentgrade);

				}
			public static void printGPA(Scanner s) {
				String name= s.next();

				int numcourses=s.nextInt();
				double sum=0, average=0;

				for (int i=1; i<=numcourses; i++) {
					int n1= s.nextInt();
					sum=sum + n1;

				}
				average= sum/numcourses;
				System.out.println(name +"\'s " +" grade is " + average);

			}

			}

