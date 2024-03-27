import java.util.Random;  
public class JavaRandomExample1 {  
public static void main(String[] args) {  
Random random= new Random();  
System.out.println("Longs value : "+random.longs());  
boolean val = random.nextBoolean();  
System.out.println("Random boolean value : "+val);  
byte[] bytes = new byte[10];  
random.nextBytes(bytes);  
System.out.print("Random bytes = ( ");  
for(int i = 0; i< bytes.length; i++)  
{  
System.out.printf("%d ", bytes[i]);  
}  
System.out.print(")");  
}  
}