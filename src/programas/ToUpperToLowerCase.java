package programas;

public class ToUpperToLowerCase
{
	public static void main(String[] args)
	{
		String original = "abcf ALL poIUY POLOPPLL aaa     ";
		System.out.println("ORIGINAL: "+original );
		
		String upper = original.toUpperCase();
		System.out.println("TO UPPER: "+upper);
		
		String lower = original.toLowerCase();
		System.out.println("TO LOWER: "+lower);
		
		
	}
}
