import java.util.Scanner;  
class Box

{ 
int w = 10; 

int h = 10; 

int d = 10; 


int volume()
{ 
return (w*h*d); 
} 

 

public static void main(String[] args) 

{ 
Scanner sc = new Scanner(System.in); 

Box bObj = new Box(); 

System.out.println("The default values are:\n" + 

"width = " + bObj.w + " units" + '\n' + 

"height = " + bObj.h + " units" + '\n' + 

"depth = " + bObj.d + " units" + '\n'); 

 

System.out.println("The volume using default values is: " + bObj.volume() + " cubic units" + '\n'); 

 

System.out.println("Enter new values:"); 

System.out.print("width = "); 

bObj.w = sc.nextInt(); 

System.out.print("height = "); 

bObj.h = sc.nextInt(); 

System.out.print("depth = "); 

bObj.d = sc.nextInt(); 

 

System.out.println('\n' + "The volume of the box is " + bObj.volume() + " cubic units"); 

 

} 

} 