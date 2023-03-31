package Exes.TwoPointSeven;

/**
 * ClassName: Exes.Exe01String
 * Package: PACKAGE_NAME
 * Description:公安局身份登记
 * 要求填写自己的姓名、年龄、性别、体重、婚姻状况(已婚用true表示，单身用false表示)、联系方式等等
 * @Author: iEdHu
 * @Create: 2023/3/9 - 8:10
 * @Version: v1.0
 */
public class Exe01String {
    public static void main(String[] args) {
        String name = "Edward";
        int  age = 24;
        char gender = '男';
        double weight = 57.8;
        boolean isMarried = false;
        String phoneNumber = "183****1951";
        String info = "\nname = " + name + "\nage = " + age + "\ngender = " + gender + "\nweight = " + weight + "\nisMarried = " + isMarried + "\nphoneNumber = " + phoneNumber;
        System.out.println(info);
    }
}
