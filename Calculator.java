/*Constructor and operator*/
public class Calculator{
    public  Calculator() {
        int a = 1, b = 2;
        System.out.println("Add: " + (a + b)); 
        System.out.println("Subtract: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

    }
    public static void main(String[] args){
        new Calculator();
    }
}


