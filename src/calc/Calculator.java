package calc;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class Calculator {
	public static double Summ(double a, double b){
		   return a + b ;
	   }
	public static double Mult(double a, double b){
		   return a * b ;
	   }
	public static double Division(double a, double b){
		   return a / b ;
	   }
	public static double Minus(double a, double b){
		   return a - b ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.print("\n������� ������ �����: "); 
		   double a = s.nextDouble(); 
		   System.out.print("\n�������� ������ ��������: ");   
		   System.out.println("\n1.��������");   
		   System.out.println("2.���������");   
		   System.out.println("3.���������");   
		   System.out.println("4.�������");   
		   System.out.print("\n��� �����: ");   
		   int selected = s.nextInt(); 
		   System.out.print("\n������� ������ �����: ");
		   double b = s.nextDouble(); 
		   
		   switch (selected) { 
		   case 1: System.out.println(Summ(a,b));
		   break;  
		   case 2:   
			   System.out.println(Minus(a,b)); 
		   break;   
		   case 3:   
			   System.out.println(Mult(a,b));  
		   break;   
		   case 4:   
			   System.out.println(Division(a,b));  
		   break;   
		   default: 
		   System.err.println("�������� �����!\n");   
		   break;   
	}

}
}
