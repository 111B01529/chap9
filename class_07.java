package L9;
class MathUtil {
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}        

public class Ex07 {
    public static void main(String[] args) {
        int result1 = MathUtil.power(2, 5); // 计算2的5次方
        System.out.println("2^5 = " + result1);

        int result2 = MathUtil.power(3, 2); // 计算3的2次方
        System.out.println("3^2 = " + result2);
    }
}
