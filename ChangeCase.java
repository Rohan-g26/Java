import java.util.Scanner; 

class ChangeCase

{ 
static void Uppercase(String text)

{ 
System.out.println(text.toUpperCase()); 
} 

static void Lowercase(String text)
{ 
System.out.println(text.toLowerCase()); 
} 

 

public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);

System.out.print("Enter a string to change its case: "); 

String txt = sc.nextLine();

System.out.print("Enter the case to which you want to convert to: "); 

String C = sc.nextLine(); 

if (C.equals("UPPER") || C.equals("Upper") || C.equals("upper"))
{
Uppercase(txt); 
}

else if (C.equals("LOWER") || C.equals("Lower") || C.equals("lower"))

{
Lowercase(txt); 
} 

else 
{
System.out.println("Invalid case!!");
} 

} 

} 

 