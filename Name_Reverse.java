import java.util.Scanner; 
class Name_Reverse

{ 


static void Reverse(String name)

{ 
System.out.print("The reversed form is :");
for(int i = (name.length()-1) ; i >= 0; i--) 

{
System.out.print(name.charAt(i));
} 

} 

 
public static void main(String[] args) 

{ 
Scanner sc = new Scanner(System.in); 

System.out.print("Enter your name: "); 

String name = sc.nextLine(); 

Reverse(name); 

} 

} 

 