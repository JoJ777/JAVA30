package TenToFourteenOperator;

import java.sql.SQLOutput;

/**
 * ClassName: AriTest
 * Package: TenToFourteenOperator
 * Description: P34
 * 测试运算符的使用1：算术运算符
 *  1. + - + - * / % （前）++ （后）++ （前）-- （后）-- +
 *
 * @Author: iEdHu
 * @Create: 2023/3/17 - 9:46
 * @Version: v1.0
 */
public class AriTest {
    public static void main(String[] args) {
        //-------------------------分割线-------------------------------------
        //除法: /
        int m1 = 12;
        int n1 = 5;
        int k1 = m1 / n1;
        System.out.println(k1); //2
        System.out.println(m1 / n1 * n1);   //10

        //-------------------------分割线-------------------------------------
        //取模or取余：%
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1);    //2

        //开发中，经常用来判断某个数num1能整除另外一个是数num2。num1 % num2 == 0
        //比如：判断num1是否是偶数：num1 % 2 == 0 /奇数：num1 % 2 != 0

        //结论：取模以后，结果与被模数的符号相同

        //-------------------------分割线-------------------------------------
        //（前）++:先自增1，再运算
        //（后）++:先运算，后自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " + b1);   //a1 = 11,b1 = 11

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " + b2);   //a2 = 11,b2 = 10

        //练习1
        int i = 10;
        //i++;
        ++i;
        System.out.println("i = " + i); //11

        //练习2
        short s1 = 10;
        //方式1：
        //编译不通过
        //s1 = s1 + 1;

        //s1 = (short)(s1 + 1);
        //System.out.println(s1);

        //方式2：
        s1 ++;
        System.out.println(s1);

        //-------------------------分割线-------------------------------------
        //（前）--:先自减1，再运算
        //（后）--:先运算，再自减1
        //略

        // 结论：++ 或 --运算，不会改变变量的数据类型！

        //-------------------------分割线-------------------------------------
        //+：连接符，只适用于String与其他类型的变量间的运算，而且运算的结果也是String类型。

    }
}
