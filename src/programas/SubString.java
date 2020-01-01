package programas;

public class SubString
{
	public static void main(String[] args)
	{
		String original = "abcf ALL poIUY POLOPPLL aaa";
		
		System.out.println("SBSTRING: "+original.substring(2)); //A partir do 2 (começa em 0)
		System.out.println("SBSTRING INIC FIM: "+original.substring(2, 10));
	}
}
