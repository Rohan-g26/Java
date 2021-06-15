class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0, b=1, i, n;
		System.out.println("Fibonacci series till 50: \n");
		System.out.println(" " +a);
		System.out.println(" " +b);
		for(i=2; i<10; ++i)
		{
			n=a+b;
			System.out.println(" " +n);
			a=b;
			b=n;
			
		}
	}
}