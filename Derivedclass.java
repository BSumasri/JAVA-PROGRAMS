class Baseclass
{
int x=10;
int y=20;
int result;
}
class Derivedclass extends Baseclass
{
void addition()
{
result =x+y;
System.out.println("Addition of two numbers:"+result);
}
public static void main(String ar[])
{
Derivedclass d= new Derivedclass();
d.addition();
}
}