class Pyramid
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=0;i<Integer.parseInt(args[0]);i++)
		{
			for(j=Integer.parseInt(args[0])-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}