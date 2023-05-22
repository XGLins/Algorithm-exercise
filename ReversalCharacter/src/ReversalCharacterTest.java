import java.util.Scanner;


/**
 * @author XGLins
 * @date 2023/5/22 11:06
 *
 * 题目：逆转字符串
 * 题目描述
 * 现在有一个字符串 str，你需要对它从后往在原地进行逆转。
 *
 * 输入格式
 * 一个只包含大小写字母，长度小于 10的4次方
 * 输出格式
 * 逆转后的字符串
 *
 * 输入输出示例
 * 输入：
 * asdfghjkl
 * 输出：
 * lkjhgfdsa
 */
public class ReversalCharacterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
