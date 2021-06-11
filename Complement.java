public class Complement
{
	public static void main(String[] args)
 {
         String seq1="ggtaagtcctctagtacaaacacccc-aatattgtgatctgttgcca aaaacacttttaggctatattagagccatcttctttg";
         String seq= seq1.toUpperCase();
         int l=0, i, a=0, t=0, g=0, c=0, k=0;
         
         char b;
         
         l=seq.length();
         
         System.out.println("           Sequence : "+ seq);
         System.out.print("Complement Sequence : ");
         
         for (i=0;i<l;i++)
         {
             b= seq.charAt(i);
             
             if(b=='A')
             System.out.print("T");
             else if(b=='T')
            System.out.print("A");
             else if(b=='G')
             System.out.print("C");
             else if(b=='C')
             System.out.print("G");
             else
             System.out.print(b);
         }
        
               }
}

