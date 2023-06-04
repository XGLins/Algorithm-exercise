import org.junit.Test;

/**
 * @author XGLins
 * @date 2023/6/3 22:34
 * <p>
 * 1.理论总结
 * switch格式执行顺序注意事项
 * 三种循环的格式，执行流程，使用区别
 * 2.代码练习
 * 课堂上练习至少三遍以上(优先读代码以ivm角度读)
 * 买可乐案例
 * 需求给20元买可乐每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱问最多可以喝到多少瓶可乐?
 * 提示:读懂以下分析，每个数据用一个变量记录
 * 分析
 * 1> 20/3一次可以买6瓶(计数6)剩余2元
 * 2> 每个空瓶子换1元剩余6元+2元=8元
 * 3> 8/3再买2瓶(计数2)剩余2元+换两个空瓶2元=总剩4元
 * 4> 4/3再买1瓶(计数1)剩余1元+换一个空瓶1元=总剩2元
 * 5> 总剩余额不足以买可乐，总购买9瓶
 * <p>
 * <p>
 * 3.从键盘输入年份，请输出该年的2月份的总天数其中国年2月份29天，平年28天。
 * 闺年条件:(1)能被4整除，不能被100整除(2)能被400整除
 * 4.扩展练习
 * 如果作业全部完成后可以进行day03的扩展练习
 * 注意:一定是作业完成后仍有时间，再去完成扩展练习
 */
public class CokeTest {
    /**
     * 版本2
     * 解题-详解-优化后
     * */
    @Test
    public void test2() {
        //总共20块钱
        int money = 20;
        //可乐单价3元/瓶
        int price = 3;
        //可购买瓶数
        int numCoke = 0;

        //使用do……while循环：3元购买一瓶可乐，依次类推
        do {
            if (money >= 3) {
                //消费余额中的3元
                money -= 3;
                //累加购买1瓶可乐
                numCoke ++;
                //我们喝完了,用空瓶子换回1元加入到余额中继续购买
                money ++;
            }

        } while (money >= price);

        //逻辑判断
        if (money >= price) {
            money -= 1;
            System.out.println("总计可购买可乐：" + numCoke + "瓶");
            System.out.println("余额：" + money + "元");
        } else if (money<0) {
            System.out.println("本店购买可乐不允许赊账！");
        } else {
            System.out.println("总计可购买可乐：" + numCoke + "瓶");
            System.out.println("余额：" + money + "元");
        }
    }

    /**
     * 版本1-错误
     * */
    @Test
    public void test1() {
        //总共20块钱
        int money = 20;
        //可乐单价3元/瓶
        int price = 3;

        for (int i = 0; i <= money; i++) {
            i += price;

            money += 1;
        }
        money += 1;
        System.out.println("总计可购买：" + money / price + "瓶");
        System.out.println("余额：" + money % price + "元");

    }

}
