import java.util.Scanner;  

 
class Print_Name

{ 
public static void main(String[] args) 

{ 
Scanner sc = new Scanner(System.in); 

System.out.print("Enter your first name: "); 

String f_name = sc.nextLine(); 

 
System.out.print("Enter your last name: "); 

String l_name = sc.nextLine(); 

printing(f_name,l_name);
  
}

static void printing(String fname, String lname)

{
String full_name = fname + " " + lname; 
System.out.println("Your full name is " + full_name); 
} 

} 