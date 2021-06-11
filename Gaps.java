public class Gaps
{
	public static void main(String[] args)
 {
         String seq1="ggtaagtcctctagt  acaaacacccc-aatattgtgat---gcca aaaacacttttagg  tattagagccatcttctttg";
         String seq= seq1.toUpperCase();
         int l=0, i, a=0;
         
         char b;
         
         l=seq.length();
         
         System.out.println("Sequence : "+ seq);
         
         
         for (i=0;i<l;i++)
         {
             b= seq.charAt(i);
             
             if(b==' ' ||b=='-' )
             a++;
         }
         System.out.println("length= "+l);
        System.out.println("No. of Gaps= "+a);
        System.out.println("Percentage of Gaps= "+a*100/l+ "%");
        }
}

