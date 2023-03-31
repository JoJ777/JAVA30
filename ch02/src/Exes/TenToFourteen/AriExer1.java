package Exes.TenToFourteen;

/**
 * ClassName: AriExer1
 * Package: Exes.TenToFourteen
 * Description:
 * 案例2：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 * @Author: iEdHu
 * @Create: 2023/3/22 - 21:57
 * @Version: v1.0
 */
public class AriExer1 {
    public static void main(String[] args) {
        int hours = 89;

        int day = hours / 24;
        int hour = hours % 24;

        System.out.println("共奋战了" + day + "天零" + hour + "小时");
    }
}
