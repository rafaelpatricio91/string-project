package programas;

public class Trim
{
	public static void main(String[] args)
	{
		String txt1 = "abcf ALL poIUY POLOPPLL aaa     ";
		String txt2 = " ppoolliikk mmm";
		System.out.println("TXT1+TXT2: "+ txt1+txt2);
		
		String frmt = txt1.trim() + txt2.trim();
		System.out.println("FORMATADO: "+frmt);
	}
}
