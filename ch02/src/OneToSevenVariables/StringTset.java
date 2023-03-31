package OneToSevenVariables;

/**
 * ClassName: StringTset
 * Package: PACKAGE_NAME
 * Description:
 * 基本数据类型与String的运算
 *
 * 一、关于String的理解
 * 1.String类，属于引用数据类型，俗称字符串
 * 2.String类型的变量，可以使用一对""的方式进行赋值
 * 3.String声明的字符串内部，可以包含0个，1个或多个字符
 *
 * 二、String与基本数据类型变量间的运算
 * 1.这里的基本数据类型包括boolean在内的8种
 * 2.String与基本数据类型变量间只能做连接运算，使用"+"表示  （String类型的变量 + 其他基本数据类型）
 * 3.运算的结果是String类型(只能是)
 * @Author: iEdHu
 * @Create: 2023/3/7 - 23:11
 * @Version: v1.0
 */
public class StringTset {
    public static void main(String[] args) {
        String str1 = "HelloWorld!";
        System.out.println("str1");
        System.out.println(str1);

        String str2 = "";   //String声明的字符串内部可以包含0、1、多个字符
        String str3 = "a"; //char c1 = 'a';

        //测试连接运算
        int num1 = 10;
        boolean b1 = true;
        String str4 = "hello";

        System.out.println(str4 + b1);

        String str5 = str4 + b1;    //连接运算后的变量为 字符串类型
        String str6 = str4 + b1 + num1;
        System.out.println(str6);   //hellotrue10

        //编译不能通过
        //String str7 = b1 + num1 + str4;

        //如何将String类型的变量转换为基本数据类型

        String str8 = "abc";    //不能考虑转换为基本数据类型的

        int num2 = 10;
        String str9 = num2 + ""; //"10"
        //编译不通过
        //int num3 = (int)str9;  //引用数据类型String 不能跨越到 基本数据类型int

        //如何实现呢？使用Integer类，暂时了解
        int num3 = Integer.parseInt(str9);
        System.out.println(num3 + 1);

    }
}
