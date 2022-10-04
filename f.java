
QUESTION 1.WRITE A PROGRAM TO PRINT WHETHER INPUTTED NUMBER IS CIRCULAR PRIME OR NOT.
PROGRAMMING LANGUAGE-JAVA
 INPUT AND EXPECTED  OUTPUT:
==========================================================================================================================  
  
Enter a no.
23
Number after shifting digits
32
23  Not a circular prime no.
  
  
Enter a no.
79
Number after shifting digits
97
79
79  Is a circular prime no.
  
  
Enter a no.
797
Number after shifting digits
977
779
797  Not a circular prime no.

Enter a no.
1193
Number after shifting digits
1931
9311
3119
1193
1193  Is a circular prime no.
  =========================================================================================================================

import java.util.*;
class f
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");//to check that the number is circular prime or not
f ob=new f();                      //making object
int n=sc.nextInt();
int m=n,i=0,d=0,e=0,g=1,l=0,f=0,p=n,j=0; //initialization
System.out.println("Number after shifting digits");
while(n>0)                        //looping
{
g=g*10;
i++;
n/=10;
}g=g/10;
e=ob.prime(m);
if(e==1)                        //condition to check prime number 
{
while(l!=i)                      //looping
{f=0;
d=(p%g)*10+p/g;
f=ob.prime(d);                   //calling function to check prime.
System.out.println(d);
if(f==1)
{l++;
p=d;}
if(f==0)
{
j++;
break;}
}
}
if(l==i)
System.out.println(m+"  Is a circular prime no."); //printing circular prime number.
if(l!=i)
System.out.println(m+"  Not a circular prime no.");
}
int prime(int z)                             //function to check prime numbers
{int b=0,j;
for(j=1;j<=z;j++)                            //looping
{
if(z%j==0)
{
b++;}}
if(b==2)
return 1;                          //returning 1 or 2 to tell that the number is prime or not
else
return 0;}}
  
 


