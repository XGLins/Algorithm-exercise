package square;

public class Square {

    //私有化成员变量
    private String str = "♥";
    public int num;

    //提供get、set方法录入数据
    public int getNum(){
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    //打印第一行
    public void firstRow() {
        for (int i = 0; i < num; i++) {
                System.out.print(str);
        }
        System.out.println("");
    }

    //打印中间行
    public void middlRow() {
        //新建一个字符串拼接对象
        StringBuilder sb = new StringBuilder();
        String space = " ";

        //从第二行开始，第二行第一列输入“#”
        sb.append(str);
        //拼接正方形中间的空格(用“空格”填充)
        for (int i = 1; i < num - 1; i++) {
            sb.append(space);
        }
        //第二行最后一列“#”
        sb.append(str);

        //拼接后，统一输出
        String sbb= sb.toString();
        for (int i = 0; i < num-2; i++) {
            System.out.println(sbb);
        }
    }

    //打印最后一行
    public void endRow() {
        this.firstRow();
    }
}
