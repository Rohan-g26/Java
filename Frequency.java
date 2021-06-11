public class Frequency
{
	public static void main(String[] args)
 {
         String seq1="ggtaagtcctctagtacaaacacccccaatattgtgatctgttgccagaaaaaacacttttaggctatattagagccatcttctttg";
         String seq= seq1.toUpperCase();
         int l=0, i, a=0, t=0, g=0, c=0, k=0,ma,mi;
         char b;
         
         l=seq.length();
          
         for (i=0;i<l;i++)
         {
             b= seq.charAt(i);
             
             if(b=='A')
             a=a+1;
             else if(b=='T')
             t=t+1;
             else if(b=='G')
             g=g+1;
             else if(b=='C')
             c=c+1;
         }
         
         
         ma=Math.max(g,Math.max(c,Math.max(t,a)));
         mi=Math.min(g,Math.min(c,Math.min(t,a)));
         
         
      System.out.println("Sequence : "+ seq);
      System.out.println("Total no. of nucleotides= " +l);
      System.out.println("frequency of A residues= " +a*100/l+"%");
      System.out.println("frequency of T residues= " +t*100/l+"%");
      System.out.println("frequency of G residues= " +g*100/l+"%");
      System.out.println("frequency of C residues= " +c*100/l+"%");
      System.out.println("Maximum is : "+ ma*100/l+ "%");
      System.out.println("Minimum is : "+ mi*100/l+ "%");
               }
}
