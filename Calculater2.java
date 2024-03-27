import java.util.*;
import java.lang.*;
class Calculater
{
static int  a,b,id;
static int choice;
float res;
boolean bn;
String name;
}
class Calculater1 extends Calculater
{
int a=100,b=450;
public void getdata()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter Your Name:");
name =s.nextLine();
System.out.println("ID should contain only Numerals");
System.out.println("Enter Your ID:");
id =s.nextInt();
System.out.println("**Enter Numbers for Calculation**");
System.out.println("Enter Your first Number:");
super.a =s.nextInt();
System.out.println("Enter Your Second Number:");
super.b =s.nextInt();
System.out.println("1.Addition||2.Subtraction||3.Multiplication||4.Division");
System.out.println("Enter Your Choice from 1 to 4:");
choice = s.nextInt();
}
public void disp()
{
System.out.println("WELCOME TO CALCULATION WORLD!");
System.out.println("Hello Ms/Mr/Mrs."+name);
System.out.println("Your id is:"+id);
}
public void addition()
{
Scanner s1 =new Scanner(System.in);
System.out.println("Your choice is Addition operation");
System.out.println("Do You Want to add another number?");
System.out.println("Either True or False");
bn = s1.nextBoolean();
if(bn==true)
{
System.out.println("Enter Your Third Number:");
int c =s1.nextInt();
res =super.a+super.b+c;
System.out.println("Result of addition Operation is:"+res);
}
else if(bn==false)
{
res = super.a+super.b;
System.out.println("Result of addition Operation is:"+res);
}
else
{
    res =a+b;
    System.out.println("Default values addition operation:"+res);
}
}
public int subtraction ()
{
System.out.println("Your choice is Subtraction operation");
res =super.a-super.b;
System.out.println("Result of Subtraction Operation is:"+res);
return 0;
}
public int multiplication ()
{
System.out.println("Your choice is Multiplication operation");
res =super.a*super.b;
System.out.println("Result of Multiplication Operation is:"+res);
return 0;
}
public void division ()
{
System.out.println("Your choice is Division operation");
if(super.b==0)
{
try
{
res = a/0;
}
catch(ArithmeticException e)
{
System.out.println("Divided by zero is an error");
}
finally
{
System.out.println("Cannot perform Division Operation");
}
}
else
{
float c = super.a;
float d= super.b;
res =c/d;
System.out.println("Result of Division Operation is:"+res);
}
}
}
class Calculater2 extends Calculater1
{
 final void greetings()
    {
System.out.println("Thank you for Choosing");
System.out.println("Have a Nice Day!");
    }
Calculater2()
{
System.out.println("Enter the Details For Performing Calculation");
}
public static void main(String ar[])
{
Calculater2 c1 =new Calculater2();
c1.getdata();
c1.disp();
switch (choice)
{
case 1:
c1.addition();
 break;
case 2:
 c1.subtraction();
 break;
case 3:
 c1.multiplication();
 break;
case 4:
 c1.division();
 break;
default:
 System.out.println("Invalid Choice");
 System.out.println("Better Luck next Time !");
 break;
}
c1.greetings();
}
}