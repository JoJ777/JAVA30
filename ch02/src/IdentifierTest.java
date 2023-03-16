/**
 * ClassName: IdentifierTest
 * Package: PACKAGE_NAME
 * Description: 测试标识符的使用
 * 1.什么是标识符？Java中变量、方法、类、包、常量等要素命名时使用的字符序列，称为标识符
 * （技巧：凡是自己可以起名字的地方都叫标识符）
 *
 * 2.标识符的命名规则（必须要遵守！！否则，编译不通过）
 * -26个英文字母大小写、0-9、_或$组成
 * -数字不能开头
 * -不可以使用关键字和保留字，但能包含关键字和保留字
 * -Java中严格区分大小写，长度无限制
 * -标识符不能包含空格
 * 说明：在定义标识符时，要“见名知意”
 *
 * 3.标识符的命名规范（建议遵守。如果不遵守，编译和运行都能正常执行。只是容易被人鄙视）
 * > 包名：多单词组成时所有字母都小写：xxxyyyzzz。
 *   例如：java.lang、com.atguigu.bean
 *
 * > 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
 *   例如：HelloWorld，String，System等
 *
 * > 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
 *   例如：age,name,bookName,main,binarySearch,getName
 *
 * > 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
 *   例如：MAX_VALUE,PI,DEFAULT_CAPACITY
 * @Author: iEdHu
 * @Create: 2023/3/5 - 22:35
 * @Version: v1.0
 */
public class IdentifierTest {
    public static void main(String[] args) {

        int age = 12;   //age:标识符
        char gender = '男';  //gender:标识符
    }
}
