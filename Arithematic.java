class Arithematic {
int a =10;
int b =20;
float c;
void addition()
{
c =a+b;
System.out.println("Addition"+c);
}
void subtraction()
{
c =a-b;
System.out.println("Subtraction"+c);
}
void multiplication()
{
c =a*b;
System.out.println("multiplication"+c);
}
void division()
{
c =b/a;
System.out.println("division"+c);
}
void modulo()
{
c =b%a;
System.out.println("modulo"+c);
}
public static void main(String ar[]){
Arithematic obj =new Arithematic();
obj.addition();
obj.subtraction();
obj.multiplication();
obj.division();
obj.modulo();
}
}