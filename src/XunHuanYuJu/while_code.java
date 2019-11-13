package XunHuanYuJu;

import java.util.Scanner;

public class while_code {
    public static void main(String[] args) {
        /**
         * 使用循环计算1-100的累加和
         * 需要累加变量
         * 需要累加和变量
         */
        jiBeng();
        jinJie();
        /**
         * 计算输入的整形数字中每位数字之和
         */
        jiBeng2();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        jinJie2();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        /**
         * 使用循环实现三次密码登录错误 退出系统
         */
        jiBeng3();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        jinJie3();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        /**
         *某宝双十一2015年的交易额为800亿，每年递增25%，按此速度那年交易额达到2000亿？
         */
        jiBeng4();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        jinJie4();
    }

    public static void jiBeng() {
        //写出基本循环结构
        int sum = 0;    //用来保存累加和
        int i = 0;
        while (i < 100) {
            //sum = sum + (i + 1);  //累加i + 1的值
            sum += i + 1;   //累加的核心代码！！！
            i++;
        }
        System.out.println("1-100的累加和是：" + sum);
    }

    public static void jinJie() {
        //写出基本循环结构
        int sum = 0;    //用来保存累加和
        int i = 1;
        while (i <= 100) {
            //sum = sum + (i + 1);  //累加i + 1的值
            //相当于先算(sum += i)然后执行++
            sum += i++;  //累加的核心代码！！！
        }
        System.out.println("1-100的累加和是：" + sum);
    }

    public static void jiBeng2() {
        //得到要计算的整型数字
        int num = 678;
        //声明相关变量
        int i = 0;  //循环变量------我们这里用不到i
        int sum = 0;    //用来保存累加和
        //循环操作计算累加和
        while (num > 0) {
            //拿个位数：input % 10 取出个位
            // / 10  使用完就丢弃它（卸磨杀驴）
            sum += num % 10;
            num /= 10;  //卸磨杀驴：清除个位数据
        }
        System.out.println("位数累加和是：" + sum);
    }

    public static void jinJie2() {
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~\n请输入一个整型数字，让我来给你计算它的位数累加和：");
        //得到要计算的整型数字
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int tempNum = num;  //临时变量
        //声明相关变量
        int i = 0;  //循环变量------我们这里用不到i，在golang语言中声明变量不使用是不可以的
        int sum = 0;    //用来保存累加和
        //循环操作计算累加和
        while (tempNum > 0) {
            //拿个位数：input % 10 取出个位
            // / 10  使用完就丢弃它（卸磨杀驴）
            sum += tempNum % 10;
            tempNum /= 10;  //卸磨杀驴：清除个位数据
        }
        System.out.println( num + "的位数累加和是：" + sum);
    }

    public static void jiBeng3() {
        //循环实现三次密码登录错误 退出系统
        //数据录入
        Scanner input = new Scanner(System.in);
        //声明相关变量
        String password = null; //密码
        String userName = " ";
        int i = 0;
        //循环操作
        while (i < 3) {
            System.err.println("请输入密码：");
            password= input.next();
            //在Java中字符串不允许这样判断：if(password == "123456")
            i++;
            if (!"123456".equals(password)) {
                if (i < 3) {
                    System.err.println("密码输入错误，请重新输入！(剩余" + (3 - i) + "次)");
                }
                if (i == 3) {   //输入密码错误的情况
                    System.out.println("密码已累积错误三次，强制退出程序！！！");
                    System.exit(0);
                }
            } else {    //输入密码正确的情况
                //System.exit(0);   //退出方法1
                //break;    //退出方法2
                i = 9;  //退出方法3,使用数据溢出跳出循环
            }
        }
        System.out.println("密码输入正确，成功登录本系统！！！");
    }

    public static void jinJie3() {
        //循环实现三次密码登录错误 退出系统
        //数据录入
        Scanner input = new Scanner(System.in);
        //声明相关变量
        final String PASSWORD= "123456";    //final 常量，不能修改他的值，名字一般大写
        String password = null; //密码
        String userName = " ";
        int i = 0;
        //循环操作
        while (i < 3) {
            System.err.println("请输入密码：");
            password= input.next();
            //在Java中字符串不允许这样判断：if(password == "123456")
            i++;
            if (!PASSWORD.equals(password)) {
                if (i < 3) {
                    System.err.println("密码输入错误，请重新输入！(剩余" + (3 - i) + "次)");
                }
                if (i == 3) {   //输入密码错误的情况
                    System.out.println("密码已累积错误三次，强制退出程序！！！");
                    System.exit(0);
                }
            } else {    //输入密码正确的情况
                //对i = 9 进行升级
                i = Integer.MAX_VALUE;  //让i的最大最大值为整型的最大值
            }
        }
        System.out.println("密码输入正确，成功登录本系统！！！");
    }

    public static void jiBeng4() {
        //某宝双十一2015年的交易额为800亿，每年递增25%，按此速度那年交易额达到2000亿？
        //确定循环变量
        int year = 2015;    //年份
        double money = 800; //交易额
        //使用循环结构
        while (money <=2000) {  //选取循环变量时，应选择有最大值的
            year++; //年份每循环一次自增1
            money = money * (1 + 0.25); //交易额每循环一次，在原有交易额上递增0.25（25% = 0.25）
        }
        System.out.println("交易额会在" + year + "年达到2000亿，交易额是：" + money);
    }

    public static void jinJie4() {
        //某宝双十一2015年的交易额为800亿，每年递增25%，按此速度那年交易额达到2000亿？
        //确定循环变量
        int year = 2015;    //年份
        double money = 800; //交易额
        //使用循环结构
        while (money <=2000) {  //选取循环变量时，应选择有最大值的
            year++; //年份每循环一次自增1
            money *= 1.25; //交易额每循环一次，在原有交易额上递增0.25（25% = 0.25）
        }
        //格式化声明变量内容
        String str = String.format("交易额会在%d年达到2000亿，交易额是：%.2f",year,money );
        System.out.println(str);
    }
}
