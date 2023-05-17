import java.util.Scanner;

/**
 * @author XGLins
 * @date 2023/5/17 17:55
 * <p>
 * 【折半二分查找】
 * 编程要求
 * 本关的编程任务是补全右侧代码片段中 Begin 至 End 中间的代码，使用折半查找法查找目标值，具体要求如下：
 * <p>
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 T ，写一个函数搜索 nums 中的 T，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 测试举例
 * 测试输入:
 * <p>
 * 6
 * -1 0 3 5 9 12
 * 9
 * 解释：n = 6，nums = [-1,0,3,5,9,12]，T = 9。
 * <p>
 * 预期输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4。
 */

public class FindHalfAndHalf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        System.out.println(binarySearch(nums, target));
    }

    public static int binarySearch(int[] nums, int target) {
        int begin = 0, end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                begin = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}

