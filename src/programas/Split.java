package programas;

public class Split
{
	public static void main(String[] args)
	{
		String original = "abcf ALLAB poIUYab POLOPPLL aaaba";
		String[] vet = original.split(" ");
		
		for (int i = 0; i < vet.length; i++)
		{
			System.out.println("Indice "+i +" - "+ vet[i]);
		}
	}
}
