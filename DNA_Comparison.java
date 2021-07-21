import java.util.Scanner;  
class DNA_Comparison
{ 
 
public static void main(String[] args) 
{ 

Scanner sc = new Scanner(System.in);

System.out.print("Enter first sequence: "); 

String seq1 = sc.nextLine(); 

System.out.print("Enter second sequence: "); 

String seq2 = sc.nextLine(); 

seq1 = seq1.toUpperCase(); 

seq2 = seq2.toUpperCase(); 

if(seq1.length() == seq2.length()){ 

if(seq1.equals(seq2)) 

System.out.println("The entered sequences are identical."); 

else 

System.out.println("The entered sequences are not the same."); 

}
else 

System.out.println("The entered sequences aren't of equal length\n Thus can't be same"); 

} 

} 

 