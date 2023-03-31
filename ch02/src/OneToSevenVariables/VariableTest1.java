package OneToSevenVariables;

/**
 * ClassName: VariableTest1
 * Package: PACKAGE_NAME
 * Description:
 * 测试整形和浮点型变量的使用
 *
 * @Author: iEdHu
 * @Create: 2023/3/6 - 7:21
 * @Version: v1.0
 */
public class VariableTest1 {
    public static void main(String[] args) {
        //1.测试整形变量的使用
        //byte(1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
        byte b1 = 12;
        byte b2 = 127;
        //编译不通过。因为超出了byte的存储范围
        //byte b3 = 128;
        short s1 = 1234;
        int i1 = 123234123;
        //1.1声明long类型变量时，需要提供后缀。后缀为'l'或'L'
        long l1 = 123123123L;
        //1.2开发中，定义整形变量时，没有特殊情况的话，通常都声明为int类型

        //2.测试浮点类型变量的使用
        //float \ double
        double d1 = 12.3;
        //2.1声明float类型变量时，需要提供后缀。后缀为'f'或'F'
        float f1 = 12.3f;
        System.out.println("f1 = " + f1);

        //2.2开发中，定义浮点型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高
        //2.3float类型表数范围要大于long类型的表数范围。但精度不高

        //测试浮点型变量的精度
        //结论：通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量
        //测试1：
        System.out.println(0.1 + 0.2);

        //测试2：
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);
        System.out.println(ff2);
        System.out.println(ff1 == ff2); //判读两数是否相等。相等为true,否则为false
    }
}
