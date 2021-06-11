public class Repeats
{
	public static void main(String[] args)
 {
         String seq1="ggtattccatcttatttg";
         String seq= seq1.toUpperCase();
         int l=0, i,r=0;
         String seqs="ATT";
         char a;
         char b;
         char c;
         
         l=seq.length();
         
         System.out.println("Sequence : "+ seq);
         System.out.println("Search Sequence : "+ seqs);
         
         for (i=0;i<l;i++)
         {
             a= seq.charAt(i);
             b= seq.charAt(i+1);
             c= seq.charAt(i+2);
            
            if(a=='A')
            {
                if(b=='T')
                {
                    if(c=='T')
                    {
                        System.out.println("00");
                        r++;
                    }
                    else
                    {continue;}
                }
            }
           
         }
          System.out.println(r);
     }
}

