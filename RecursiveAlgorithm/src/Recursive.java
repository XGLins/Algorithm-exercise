import static java.lang.Math.pow;

/**
 * @author XGLins
 * @date 2023/5/11 10:43
 */
public class Recursive {
    public static void main(String[] args) {
        /**
         * 等差算法
         * 公差：d = 2
         * */
//        int result1 = dengcha(4);
//        System.out.println(result1);

        /**
         * 等比算法
         * 首项：a1 = 1
         * 公比：q = 2
         * */
        double result = dengbi(2);
        System.out.println(result);
    }

    /* 递归算法-等差公式:公差为2 */
    public static int dengcha(int x) {
        if (x == 0) {
            return 0;
        } else {
            return dengcha(x - 1) + 2;
        }
    }

    /* 等比公式：首项为1，公比为2 */
    public static double dengbi(int n) {
        if (n == 0) {
            return 0;
        } else {
            return dengbi(n-1) + 1 * pow(2,n) / 2;
        }
    }
}
