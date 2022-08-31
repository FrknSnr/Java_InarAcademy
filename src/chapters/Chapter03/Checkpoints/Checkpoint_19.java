package chapters.Chapter03.Checkpoints;

public class Checkpoint_19 {

	public static void main(String[] args) {

		double number = Math.random()*200 - 50 ;
		
		boolean result = number< 100 && number > 1 ;
				System.out.println(result); 
		
		boolean result2 = (number < 100 && number > 1) || number < 0 ;
		System.out.println(result2);
		
	}

}
