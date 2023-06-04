import java.util.Calendar;
import java.util.Scanner;

public class findDay {

  public static String findDay(int day, int month, int year) {

    //create a calendar object
    Calendar cal = Calendar.getInstance(); //create a calendar object

    //set month, day and year
    cal.set(Calendar.MONTH, month-1); //month starts from 0 so -1 is needed
    cal.set(Calendar.DAY_OF_MONTH, day);
    cal.set(Calendar.YEAR, year);

    //get dayId from the calendar
    int dayId= cal.get(Calendar.DAY_OF_WEEK);

    //create an empty string
    String dayOfWeek ="";

    //assign day values for dayId
    if (dayId == 1) {
      dayOfWeek = "SUNDAY";
    } else if (dayId == 2) {
      dayOfWeek = "MONDAY";
    } else if (dayId == 3) {
      dayOfWeek = "TUESDAY";
    } else if (dayId == 4) {
      dayOfWeek = "WEDNESDAY";
    } else if (dayId == 5) {
      dayOfWeek = "THURSDAY";
    } else if (dayId == 6) {
      dayOfWeek = "FRIDAY";
    } else {
      dayOfWeek = "SATURDAY";
    }

    return dayOfWeek;

  }

  public static void main(String[] args){

    // Create a Scanner object to take input
    Scanner myObj = new Scanner(System.in);

    //set initial dummy values
    int day = 0;
    int month = 0;
    int year = 0;

    //create a while loop to repeat the process until a valid input is entered
    boolean repeat = true;
    while(repeat) {
      try {
        //take user input
        System.out.println("Enter date in the format dd mm yyyy:");

        //read user input
        //split the input into day, month, year
        day = myObj.nextInt();
        month = myObj.nextInt();
        year = myObj.nextInt();

        //break the loop when a valid input is entered
        repeat = false;

      }
      catch(Exception e) {
        //error message when a wrong type of input is entered
        System.out.println("Invalid input. Please enter a correct date.");
        myObj.next();
      }
    }


    //parse the argument
    System.out.println(findDay(day, month, year));

  }

}
