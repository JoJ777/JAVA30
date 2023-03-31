package Exes.TenToFourteen;

/**
 * ClassName: ArithmeticExer2
 * Package: Exes.TenToFourteen
 * Description:
 * 算术运算符：自加、自减
 * @Author: iEdHu
 * @Create: 2023/3/22 - 22:01
 * @Version: v1.0
 */
public class ArithmeticExer2 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i); //10
        System.out.println("i1="+i1);//11
        i = ++i1;
        System.out.print("i="+i);//12
        System.out.println("i1="+i1);//12
        i = i2--;
        System.out.print("i="+i);//20
        System.out.println("i2="+i2);//19
        i = --i2;
        System.out.print("i="+i);//18
        System.out.println("i2="+i2);//18

        //额外的练习1：
        System.out.println("5+5=" + 5 + 5); //打印结果是？ 5+5=55 ?
        System.out.println("5+5=" + (5 + 5));

        //额外的练习2：
        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);//-128

        //额外的练习3：
        int i3 = 1;
        int j = i3++ + ++i3 * i3++;
        System.out.println("j = " + j);

        //额外的练习4：
        int i4 = 2;
        int j1 = i4++;
        System.out.println(j1);

        int m = 2;
        m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
        System.out.println(m);

    }
}
