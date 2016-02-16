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
		 System.out.print("\nВведите первое число: "); 
		   double a = s.nextDouble(); 
		   System.out.print("\nВыберите нужное действие: ");   
		   System.out.println("\n1.Сложение");   
		   System.out.println("2.Вычитание");   
		   System.out.println("3.Умножение");   
		   System.out.println("4.Деление");   
		   System.out.print("\nВаш выбор: ");   
		   int selected = s.nextInt(); 
		   System.out.print("\nВведите второе число: ");
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
		   System.err.println("Неверный выбор!\n");   
		   break;   
	}

}
}
