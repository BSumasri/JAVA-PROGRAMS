class Iterration
{
public static void main(String a[])
{
int arr[]=new int[10];
int i;
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
arr[5]=6;
arr[6]=7;
arr[7]=8;
arr[8]=9;
arr[9]=10;
try{
for (i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
System.out.println(a[i]+"is an Even number");
}
else{
System.out.println(a[i]+"is an Odd number");
}
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}