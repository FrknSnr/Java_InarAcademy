package chapters.Chapter04.Checkpoints;

public class Checkpoint20 {

	public static void main(String[] args) {
		
		String s1 = " Welcome ";
		String s2 = " welcome ";
		
		// a
		System.out.println(s1.equals(s2));
		// b
		System.out.println(s1.equalsIgnoreCase(s2));
		// c
		int x = s1.compareTo(s2);
		System.out.println(x);
		// d 
		int x1 = s1.compareToIgnoreCase(s2);
		System.out.println(x1);
		// e
		boolean b = s1.startsWith("AAA");
		System.out.println(b);
		// f
		boolean b1 = s1.endsWith("AAA");
		System.out.println(b);
		// g
		int x2 = s1.length();
		System.out.println(x2);
		// h
		char x3 = s1.charAt(0);
		System.out.println(x3);
		// i 
		String s3 = s1 .concat( " "+ s2);
		System.out.println(s3);
		// j
		System.out.println(s1.substring(0));
		// k
		System.out.println(s1.substring(0,3));
		// l 
		String s33 = s1.toLowerCase();
		System.out.println(s33);
		// m
		String s333 = s1.toUpperCase();
		System.out.println(s333);
		// n
		String s3333 = s1.trim();
		System.out.println(s3333);
		// o
		int x4 = s1.indexOf('e');
		System.out.println(x4);
		// p
		int x5 = s1.lastIndexOf("abc");
		System.out.println(x5);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
