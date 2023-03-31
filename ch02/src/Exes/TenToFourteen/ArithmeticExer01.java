package Exes.TenToFourteen;

/**
 * ClassName: ArithmeticExer01
 * Package: Exes.TenToFourteen
 * Description:
 * 拓展练习：获取一个四位数的个位，十位，百位，千位
 * @Author: iEdHu
 * @Create: 2023/3/22 - 21:52
 * @Version: v1.0
 */
public class ArithmeticExer01 {
    public static void main(String[] args) {

        int num = 1234;

        int ge = num % 10;
        int shi = num % 100 / 10;
        int bai = num % 1000 / 100;
        int qian = num / 1000;

        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
        System.out.println("千位是：" + qian);

    }
}
