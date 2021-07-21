package ArithmeticPack;  
import java.util.Scanner; 
class Arithmetic

{ 
double AddTwo(double a, double b)
{ 
return (a + b); 
} 

 

double SubTwo(double a, double b)
{ 
return (a - b); 
} 

 

double MulTwo(double a, double b)
{ 
return (a * b); 
} 

 

double DivTwo(double a, double b)
{ 
return (a / b); 
} 

 

double ModTwo(double a, double b)
{ 
return (a % b); 
} 

 

public static void main(String[] args) 
{ 
Scanner sc= new Scanner(System.in); 

System.out.print("Enter two numbers: "); 

double a = sc.nextDouble(); 

double b = sc.nextDouble(); 

 
Arithmetic clsObj = new Arithmetic(); 

 

System.out.println(); 
System.out.println("The addition of " + a + " and " + b + " is " + clsObj.AddTwo(a, b)); 
System.out.println("The subtraction of " + a + " and " + b + " is " + clsObj.SubTwo(a, b)); 
System.out.println("The product of " + a + " and " + b + " is " + clsObj.MulTwo(a, b)); 
System.out.println("The divided quotent of " + a + " by " + b + " is " + clsObj.DivTwo(a, b)); 
System.out.println("The modulo of " + a + " to " + b + " is " + clsObj.ModTwo(a, b)); 

} 
} 
 
