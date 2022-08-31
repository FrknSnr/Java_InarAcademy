package chapters.chapter02_checkpoints;

public class Checkpoint02_23 {

	public static void main(String[] args) {

		double millisecond = System.currentTimeMillis();
		
		double second = millisecond / 1000 ; 
		double minute = second / 60 ;
		double hour = minute / 60 ;
		
		
		double CurrentHour = hour % 24 ;
		double CurrentMinute = minute % 60 ;
		double CurrentSecond = second % 60 ;
		 
		System.out.println("The current time is " + (int)CurrentHour + ": " + (int)CurrentMinute +": " + (int)CurrentSecond);
		
	}

}
