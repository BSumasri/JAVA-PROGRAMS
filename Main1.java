import java.lang.*;
import java.util.*;
class Employee
{
int id,sal;
String name;
}
class Employee1 extends Employee
{
void getdetails()
{
Scanner s= new Scanner(System.in);
System.out.println("Enter Employee Details* ");
System.out.println("Enter Employee Name:");
name = s.nextLine();
System.out.println("Enter Employee ID: ");
id = s.nextInt();
System.out.println("Enter Employee Salary: ");
sal =s.nextInt();
}
}
class Employee2 extends Employee1
{
void display()
{
System.out.println("***Employee Details***");
System.out.println("Employee Name is:"+name);
System.out.println("Employee ID is:"+id);
System.out.println("Employee Salary is:"+sal);
}
}
class Main1
{
public static void main(String ar[])
{
Employee1 e1 = new Employee1();
Employee2 e2 = new Employee2();
e1.getdetails();
e2.display();
}
}