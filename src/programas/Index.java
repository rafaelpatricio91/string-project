package programas;

public class Index
{
	public static void main(String[] args)
	{
		String original = "abcf ALLAB poIUYab POLOPPLL aaaba";
		int i = original.indexOf("ab");
		int i2 = original.lastIndexOf("ab");
		
		System.out.println("INDEX: "+i);
		System.out.println("LASTINDEX: "+i2);
	}
}
