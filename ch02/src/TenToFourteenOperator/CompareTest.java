package TenToFourteenOperator;

/**
 * ClassName: CompareTest
 * Package: TenToFourteenOperator
 * Description: P36
 * 测试运算符的使用3：比较运算符
 *
 * 1.   ==   !=    >   <   >=   <=     instanceof
 *
 * 2. 说明
 *  2.1  instanceof  在面向对象的多态的位置讲解
 *  2.2  ==   !=    >   <   >=   <=  适用于基本数据类型(细节： > < >= <=  不适用于boolean类型)
 *      运算的结果为boolean类型
 *  2.3  了解： ==  !=  可以适用于*引用数据类型*
 *  2.4  区分： ==  与  =
 *
 * @Author: iEdHu
 * @Create: 2023/3/23 - 7:37
 * @Version: v1.0
 */
public class CompareTest {
    public static  void main(String[] args) {
        int m1 = 10;
        int m2 = 20;
        boolean compare1 = m1 > m2;
        System.out.println(compare1);

        int n1 = 10;
        int n2 = 20;
        System.out.println(n1==n2);
        System.out.println(n1 = n2);

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 == b2);   //false
        System.out.println(b1 = b2);    //true

    }
}
