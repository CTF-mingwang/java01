package XunHuanYuJu;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
//        jiChu();
//        jinJie();
        //存在bug的方法，n带有穿透
//        zhongJi();
        wan();
    }

    public static void jiChu() {
        Scanner input = new Scanner(System.in); //用户录入信息
        String answer = "y";    //用户判断是否继续
        String name = null; //给定初值
        do {
            System.out.println("欢迎走进计管832班，请想一个外号：");
            name = input.next();
            System.out.println("外号是：" + name + "\n年龄：18\n" + name + "同学，你满意你的外号吗？（y / n）");
            answer = input.next();
        } while (!"y".equalsIgnoreCase(answer)); //Ignore：忽略；Case：大小写
        System.out.printf("【%s】同学，正式成为我们班级的一员！！！",name);
        input.close();  //习惯和Sanner配套使用
    }

    public static void jinJie() {
        //用do-while和switch-case做一个计算器
        Scanner input = new Scanner(System.in);
        String op = " ";    //运算符，初始符为空字符串
        String answer = null;   //用户选择是否继续
        double num1,num2,result;    //两个操作数，一个结果变量

        do {
            //录入两个操作数
            System.out.println("华人牌计算器007，很高兴为您服务，请输入两个操作数：");
            num1 = input.nextDouble();
            num2 = input.nextDouble();
            //录入运算符
            System.out.println("请输入一个运算符：");
            op = input.next();
            //根据运算符的判断，进行相应的运算
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    //需要判断被除数是否为零
                    if (num2 == 0) {
                        System.out.println("除数不能为0");
                        result = 0;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("未知运算符,运算失败！");
                    result = 0;
                    System.exit(0);
            }
            System.out.printf("%.2f %s %.2f = %.2f\n",num1,op,num2,result);
            System.out.println("是否继续使用？（y / n）");
            answer = input.next();
        } while ("y".equalsIgnoreCase(answer)); //忽略大小写
        System.out.println("程序以退出，感谢你的使用！");
        input.close(); //和Scanner两者相伴
    }

    public static void zhongJi() {
        //用do-while和switch-case做一个计算器
        Scanner input = new Scanner(System.in);
        String op = " ";    //运算符，初始符为空字符串
        String answer = null;   //用户1选择是否继续
        String answer2 = null;   //用户2选择是否继续
        double num1,num2,result;    //两个操作数，一个结果变量
        do {
            //控制输入范围
            do {
                System.out.println("华人牌计算器007，很高兴为您服务，请输入两个操作数：");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
                if (num1 > 1000 && num2 > 1000) {
                    System.err.println("数据超出范围，是否重新录入两个操作数？（y / n）");
                    answer2 = input.next();
                } else {
                    System.exit(0);
                }
            }   while ("y".equalsIgnoreCase(answer2));

            //录入运算符
            System.out.println("请输入(+、-、*、/、%)中的任意一个运算符：");
            op = input.next();
            //根据运算符的判断，进行相应的运算
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    //需要判断被除数是否为零
                    if (num2 == 0) {
                        System.out.println("除数不能为0");
                        result = 0;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("未知运算符,运算失败！");
                    result = 0;
                    System.exit(0);
            }
            System.out.printf("%.2f %s %.2f = %.2f\n",num1,op,num2,result);
            System.out.println("是否继续使用？（y / n）");
            answer = input.next();
        } while ("y".equalsIgnoreCase(answer)); //忽略大小写
        System.out.println("程序以退出，感谢你的使用！");
        input.close(); //和Scanner两者相伴
    }

    public static void wan() {
        //用do-while和switch-case做一个计算器
        Scanner input = new Scanner(System.in);
        String op = " ";    //运算符，初始符为空字符串
        String answer = null;   //用户1选择是否继续
        String answer2 = null;   //用户2选择是否继续
        double num1,num2,result;    //两个操作数，一个结果变量
        do {
            //控制输入范围
            do {
                System.out.println("华人牌计算器007，很高兴为您服务，请输入两个操作数：");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
                if (num1 > 1000 && num2 > 1000 ) {
                    System.err.println("恭喜你发现了bug！！！按要求写完就可以走了\n请输入“ y ”重新录入两个操作数，否者请强制退出！！！");
                    answer2 = input.next();
                } else {
                    break;
                }
            }   while ("y".equalsIgnoreCase(answer2)); //忽略大小写

            //录入运算符
            System.out.println("请输入(+、-、*、/、%)中的任意一个运算符：");
            op = input.next();
            //根据运算符的判断，进行相应的运算
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    //需要判断被除数是否为零
                    if (num2 == 0) {
                        System.out.println("除数不能为0");
                        result = 0;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("未知运算符,运算失败！");
                    result = 0;
                    System.exit(0);
            }
            System.out.printf("%.2f %s %.2f = %.2f\n",num1,op,num2,result);
            System.out.println("是否继续使用？（y / n）");
            answer = input.next();
        } while ("y".equalsIgnoreCase(answer)); //忽略大小写
        System.out.println("程序以退出，感谢你的使用！");
        input.close(); //和Scanner两者相伴
    }
}
