package jibensujuleixin;//导入Scanner工具，以便使用
import java.util.Scanner;
public class yuanMianJi {
    public static void main(String[] args) {

        //强制类型转换
        //double a = 12.9;
        //int c = (int) a;
        //float b = 123F;

        //扫描仪，扫描接盘的录入内容
        Scanner input = new Scanner(System.in); //input是输入的意思

        System.out.print("男一：");
        //他会忽略空格和回车，打印全部内容
        String zfc2 = input.nextLine();
        System.out.println(zfc2);

        //需要用户手动输入圆的半径
        System.err.print("这是一个求圆面积的程序\n请输入圆的半径：");
        double r = input.nextInt();    //圆的半径
        double mianJi = 3.14 * r * r;
        System.out.printf("圆面积为：%.2f\n",mianJi);

        //录入什么类型的数据next(Xxx)就写什么类型
        //难点是录入char类型
        System.out.print("请输入性别：");
        //获取用户输入字符串的第一个字符，charAt()的括号里必须有参数，他前面的点可以理解为“的”
        char xb = input.next().charAt(0);
        System.out.println("性别是：" + xb);

//        //和性别冲突
//        System.out.print("男二：");
//        //只会识别空格前的内容
//        String zfc = input.next();
//        System.out.println(zfc);
    }
}
