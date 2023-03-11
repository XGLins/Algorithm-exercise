package SquareDemo;

import SquareDemo.square.Square;

/**
 * 练习题，打印边长为n的正方形。用#或者*表示边的长度。编程语言不限
 * */
public class AppTest {

    public static void main(String[] args) {
        Square square = new Square();

        square.setNum(6);

        for (int i = 0; i < 3; i++) {
            square.firstRow();
            square.middlRow();
            square.endRow();
            System.out.println("-------");
        }
        System.out.println(square.getNum());
    }

}
