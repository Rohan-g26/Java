class ExcepHandling

{  
public static void main(String[] args) 
{ 
try
{ 
int a = 10/0; 
}catch (Exception e)
{ 
System.out.println("Diving by 0 is not allowed."); 
} 

System.out.println("End"); 
} 
} 

