import java.util.Scanner;  

class ArmstrongNo

{ 

static void Check(int num)

{ 
int[] dec = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
 
int buff = num; 

int i; 

for(i = 0; buff != 0 ; i++)
{ 
dec[i] = buff%10; 
buff /= 10; 
} 

int answer = 0; 

for (int j : dec)

{ 
answer += power(j, i); 

} 

if(num == answer) 

System.out.println("The number " + num + " is an Armstrong num."); 

else 

System.out.println("The number " + num + " is not an Armstrong num."); 

} 

 

static int power(int b, int p)
{ 

int cube = 1; 

for(short i = 0; i < p; i++) 

cube *= b; 

return cube; 

} 

 

public static void main(String[] args) 

{ 
Scanner sc = new Scanner(System.in); 

System.out.print("Enter a number: "); 

int num = sc.nextInt(); 

Check(num); 

} 

} 

 