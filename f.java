import java.util.*;
class f
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");
f ob=new f();
int n=sc.nextInt();
int m=n,i=0,d=0,e=0,g=1,l=0,f=0,p=n,j=0;//circularprimeno.
while(n>0)
{
g=g*10;
i++;
n/=10;
}g=g/10;
e=ob.prime(m);
if(e==1)
{
while(l!=i)
{f=0;
d=(p%g)*10+p/g;
f=ob.prime(d);
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
System.out.println("Is a circular prime no.");
if(l!=i)
System.out.println("Not a circular prime no.");
}
int prime(int z)
{int b=0,j;
for(j=1;j<=z;j++)
{
if(z%j==0)
{
b++;}}
if(b==2)
return 1;
else
return 0;}}