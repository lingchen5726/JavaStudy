package singleton;

//http://blog.csdn.net/abing37/article/details/4391222

public enum EnumWeekday {
	Mon("Monday"), Tue("Tuesday"), Wed("Wednesday"), Thu("Thursday"), Fri("Friday"), Sat("Saturday"), Sun("Sunday");
	
	private final String day;
	private EnumWeekday (String day) {
		this.day = day;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public static void printDay(int i) {
		switch (i) {
		case 1: System.out.println("Weekday.Mon");break;
		case 2: System.out.println("Weekday.Tue");break;
		case 3: System.out.println("Weekday.Wed");break;
		case 4: System.out.println("Weekday.Thu");break;
		case 5: System.out.println("Weekday.Fri");break;
		case 6: System.out.println("Weekday.Sat");break;
		case 7: System.out.println("Weekday.Sun");break;
		}
	}
	
//	Mon("Monday"), Tue("Tuesday"),Wed("Wednesday"), Thu("Thursday"), Fri("Friday"), Sat("Saturday"), Sun("Sunday");
	public static void main(String[] args) {
		for (EnumWeekday day: EnumWeekday.values()) {
			System.out.println(day+" is "+day.getDay()); 
		}
		printDay(5);
	}
}

