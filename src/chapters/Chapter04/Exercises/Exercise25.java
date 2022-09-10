
package chapters.Chapter04.Exercises;

public class Exercise25 {

	public static void main(String[] args) {

		int l1 = (int) (Math.random() * 26) + 65;
		int l2 = (int) (Math.random() * 26) + 65;
		int l3 = (int) (Math.random() * 26) + 65;

		int d1 = (int) (Math.random() * 10);
		int d2 = (int) (Math.random() * 10);
		int d3 = (int) (Math.random() * 10);
		int d4 = (int) (Math.random() * 10);

		System.out.println((char)l1 +""+(char) l2+""+(char) l3+""+d1+""+d2+""+d3+""+d4);
		
		
	}

}
