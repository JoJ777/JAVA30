package OneToSevenVariables;

/**
 * ClassName: FloatDoubleExe02
 * Package: PACKAGE_NAME
 * Description:
 * 将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
 * ℃ = (℉ - 32) / 1.8
 * @Author: iEdHu
 * @Create: 2023/3/6 - 7:57
 * @Version: v1.0
 */
public class FloatDoubleExe02 {
    public static void main(String[] args) {

        double hua = 80.0;

        double she = (hua - 32) / 1.8;

        System.out.println("华氏度" + hua + "℉ 对应的摄氏度为" + she + "℃");

    }
}
