package exercise3;
import java.util.Scanner;
public class season {

	public static void main(String[] args) {
		System.out.print("Enter a month and date ");
		 Scanner scan = new Scanner(System.in);
	     int month = scan.nextInt();
	     
	     int day = scan.nextInt();
	     String season =Season(month, day);
	     
	     System.out.println(season);
	}
  public static String Season(int month, int day) {
  	 

  	    if((month == 12 && day >= 16 && day <= 31) || (month == 1 && day >=1 && day <= 31) || (month == 2 && day >= 1 && day <= 28) || (month == 3 && day >=1 && day <=15))
  	    {
  	        return "Winter";
  	    }
  	    else if((month == 3 && day >= 16 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=15))
  	    {
  	       return "Spring";
  	    }
  	    else if((month == 6 && day >= 16 && day <= 30) || (month == 7 && day >=1 && day <= 31) || (month == 8 && day >= 1 && day <= 31) || (month == 9 && day >=1 && day <=15))
  	    {
  	        return "Summer";
  	    }
  	    else if((month == 9 && day >= 16 && day <= 30) || (month == 10 && day >=1 && day <= 31) || (month == 11 && day >= 1 && day <= 30) || (month == 12 && day >=1 && day <=15))
  	    {
  	       return "Fall";
  	    }
			return null;

  	
  
  }
	}

