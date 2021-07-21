import java.util.Scanner;
  
class PrintName
{ 

static void n_times(String name, int num)
{ 
for(int i = 0; i < num; i++) 

System.out.println(name); 

} 


public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);  

System.out.print("Enter your name: "); 

String name = sc.nextLine(); 

System.out.print("Enter the number of times you want to be printed: "); 

int num = sc.nextInt(); 

n_times(name, num); 

} 

} 

 