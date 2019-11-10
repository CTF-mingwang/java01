package xueZheJieGou;

import java.util.Scanner;

public class switch_code {
    /**
     * 实现菜单跳转的练习：
     * 需要用户录入信息
     * 使用if和switch嵌套来进行跳转
     */
    public static void main(String[] args) {
        code_1();
    }

    public static void code_1() {
        //提高用户体验
        System.out.print("这是一个菜单跳转程序\n\t1、登录成功\n\t2、退出游戏\n请输入对应数字：");
        //使用扫描仪，监控用户录入情况
        Scanner input = new Scanner(System.in);
        //定义接收用户信息的变量
        int xz = input.nextInt();

        //使用if语句实现外层框架
        if (xz == 1) {
            System.out.println("登录成功");
            System.out.print("\n\t1、传音入密\n\t2、举目四望\n\t3、会会老友\n\t4、自我欣赏\n\t5、观察地形\n\t6、到此一游\n请输入对应数字：");
            int xz_2 = input.nextInt();
            switch (xz_2) {
                case 1:
                    System.out.println("传音入密");
                    System.out.print("\n\t1、雷达\n\t2、信号塔");
                    int xz_3 = input.nextInt();
                    switch (xz_3) {
                        case 1:
                            System.out.println("雷达");
                            break;
                        case 2:
                            System.out.println("信号塔");
                            break;
                        default:
                            System.out.println("数据有误，请输入：1 或 2 ！！！");
                    }
                    break;
                case 2:
                    System.out.println("举目四望");
                    System.out.print("\n\t1、天眼卫星\n\t2、道路监控");
                    int xz_4 = input.nextInt();
                    switch (xz_4) {
                        case 1:
                            System.out.println("天眼卫星");
                            break;
                        case 2:
                            System.out.println("道路监控");
                            break;
                        default:
                            System.out.println("数据有误，请输入：1 或 2 ！！！");
                    }
                    break;
                case 3:
                    System.out.println("会会老友");
                    System.out.print("\n\t1、苏联\n\t2、非洲");
                    int xz_5 = input.nextInt();
                    switch (xz_5) {
                        case 1:
                            System.out.println("苏联");
                            break;
                        case 2:
                            System.out.println("非洲");
                            break;
                        default:
                            System.out.println("数据有误，请输入：1 或 2 ！！！");
                    }
                    break;
                case 4:
                    System.out.println("自我欣赏");
                    System.out.print("\n\t1、北京\n\t2、上海");
                    int xz_6 = input.nextInt();
                    switch (xz_6) {
                        case 1:
                            System.out.println("北京");
                            break;
                        case 2:
                            System.out.println("上海");
                            break;
                        default:
                            System.out.println("数据有误，请输入：1 或 2 ！！！");
                    }
                    break;
                case 5:
                    System.out.println("观察地形");
                    System.out.print("\n\t1、山地\n\t2、平原");
                    int xz_7 = input.nextInt();
                    switch (xz_7) {
                        case 1:
                            System.out.println("山地");
                            break;
                        case 2:
                            System.out.println("平原");
                            break;
                        default:
                            System.out.println("数据有误，请输入：1 或 2 ！！！");
                    }
                    break;
                case 6:
                    System.out.println("到此一游");
                    System.out.print("\n\t请输入exit退出：");
                    String xz_8 = input.next();
                    if (xz_8 == "exic") {
                        System.out.println("感谢您对程序的大力支持！！！");
                    } else {
                        System.out.println("数据输入错误，请输入：exit");
                    }
                    break;
                default:
                    System.out.println("数据有误，请输入：1 - 6 之间的整数！！！");
            }
        } else if (xz == 2) {
            System.out.println("退出游戏");
        } else {
            System.out.println("数据输入错误，请输入：1 或 2 ！！！");
        }
    }
}
