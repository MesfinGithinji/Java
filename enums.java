public class enums {
  public enum Days_Of_Week {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
  }
  public static void main(String[] args) {
    Days_Of_Week[] daysOfWeek = Days_Of_Week.values();
    for (int i=0; i < daysOfWeek.length ; i++){
	    System.out.println("Today is " + daysOfWeek[i]);
    }
  }
}
