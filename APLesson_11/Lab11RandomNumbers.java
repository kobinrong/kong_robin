public class Lab11RandomNumbers
{
	public static void main(String[]args)
	{
		//filling the array 
		int [][]values = new int [4][4];
		
		//int num = 1;
		//for(int i = 0; i < values.length; i++)
		//{
		//	for(int j = 0; j < values[i].length; j++)
		//	{
		//		values[i][j] = num;
		//		num ++;
		//	}
		//}
		
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for (int j = 0; j <values[i].length; j++)
			{
				values[j][i] = (int)(Math.random() * 10 + 1);
				num++;
			}

		}
		
		//print out the array 
		
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j <values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
	
		