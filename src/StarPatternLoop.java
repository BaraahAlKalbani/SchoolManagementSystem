
public class StarPatternLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loop\n");

		int k=1;
		String p="* * * *";
		while(k<=4)
		{
			System.out.println(p);
			k++;
		}

		System.out.println("\n");
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}


		System.out.println("\n");
		int f=1;
		for (int i = 1; i <= 4; i++) //rows
		{
			for (int j = 1; j <= i; j++)// column
			{
				System.out.print(f * j+" ");
			}
			System.out.println();
		}

		System.out.println("\n");
		
		for (int i = 1; i <= 5; i++) 
		{
			k=5;
			
			for (int j = 0; j <= i-1; j++) 
			{ 

				System.out.print(" ");

				
			}
			while(k >= i)
			{
				System.out.print("* ");
				k--;
			}
			System.out.println();
		}



	}

}
