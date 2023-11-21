package L9;
class Calculator {
    public int add2n(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add2n(5);
        System.out.println("1+2+...+5 = " + result1);

        int result2 = calculator.add2n(10);
        System.out.println("1+2+...+10 = " + result2);
    }
}
