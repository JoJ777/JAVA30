package Exes.TenToFourteen;

/**
 * ClassName: ConditionExer
 * Package: Exes.TenToFourteen
 * Description:
 * 今天是周2，10天以后是周几？
 * 要求：控制台输出"今天是周2，10天以后是周x"。
 * @Author: iEdHu
 * @Create: 2023/3/31 - 17:06
 * @Version: v1.0
 */
public class ConditionExer {
    public static void main(String[] args) {

        int week = 2;
        //week = 4;

        week += 10;

        week %= 7;

        System.out.println("今天是周2，10天以后是周" + ((week == 0)? "日" : week));
    }
}
