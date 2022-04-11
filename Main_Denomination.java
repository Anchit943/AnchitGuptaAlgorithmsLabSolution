import java.util.Scanner;

public class Main_Denomination 
{

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of currency denominations : ");
		 int size = sc.nextInt();
		 
		 int[] curr_denom = new int[size]; 
		 System.out.println("Enter the currency denominations value : ");
		 
		 for(int i=0 ; i < size ; i++)
		 {
			 curr_denom[i] = sc.nextInt() ; 
		 }

		 System.out.println("Enter the amount you want to pay : ");
		 int amount = sc.nextInt(); 
		
		 Currency_Denomination.denomCurrency(curr_denom, amount);
		 sc.close();
	}

}
