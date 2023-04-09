import java.util.Scanner;
class AltPrimeNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter numbers");
		int n=scn.nextInt();
		int m=scn.nextInt();
		//int sum=0;
		int num = 0;   
//prints alternate prime numbers  
//System.out.print("Alternate prime numbers up to " + num+" are: ");    
//method calling  
//printAlternatePrimeNumber(num);   
//}  
//method checks that the number is prime or not  
//static int checkPrime(int num)   
//{   
int i,j, flag = 0;   
// we have started i=2 because 2 is a known prime number  
for(i = 2; i<= num; i++)   
{   
if(num % i == 0)   
{   
flag = 1;   
break;   
}   
}   
if(flag == 0)    
System.out.print("Alternate prime numbers" +num);
} 
}
}
