package Exes.TenToFourteen;

/**
 * ClassName: LogicExer
 * Package: Exes.TenToFourteen
 * Description: P37
 * 1. 定义类 LogicExer
 * 2. 定义 main方法
 * 3. 定义一个int类型变量a,变量b,都赋值为20
 * 4. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
 * 5. 输出a的值,bo1的值
 * 6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
 * 7. 输出b的值,bo2的值
 * @Author: iEdHu
 * @Create: 2023/3/23 - 10:32
 * @Version: v1.0
 */
public class LogicExer {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;

        boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
        System.out.println("a = " + a + ",bo1 = " + bo1);

        boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
        System.out.println("b = " + b + ",bo2 = " + bo2);   //&&只执行了一个++才导致b = 21

    }
}
