class Calculator {
   int c;
	
   public void addition(int a, int b) {
      c = a + b;
      System.out.println("Сумма чисел: " + c);
   }
	
   public void subtraction(int a, int b) {
      c = a - b;
      System.out.println("Разность чисел: " + c);
   }
}

public class My_Calculator extends Calculator {
   public void multiplication(int a, int b) {
      c = a * b;
      System.out.println("Произведение чисел: " + c);
   }
	
   public static void main(String args[]) {
      int a = 10, b = 20;
      My_Calculator cal = new My_Calculator();
      cal.addition(a, b);
      cal.subtraction(a, b);
      cal.multiplication(a, b);
   }
}