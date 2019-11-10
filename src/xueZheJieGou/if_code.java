package xueZheJieGou;

import java.util.Scanner;

public class if_code {
     public static void main(String[] args) {
         jiBen(); //调用方法
         jie_1(); //调用方法
         jie_2(); //调用方法
     }

     public static void jiBen() {
         //扫描仪，监控用户录入信息
         Scanner input = new Scanner(System.in);
         //使用错误输出内容
         System.err.print("请输入角色耐力值：");
         //接收用户录入数据
         int maiLi = input.nextInt();

         //使用if判断
         if (maiLi >= 0 && maiLi <= 1000) {
             System.out.println("不堪一击");
         } else if (maiLi > 1000 || maiLi < 3000) {
             System.out.println("还有点水平");
         }
     }

     public static void jie_1()  {
         String js = null; //用户状态
         //扫描仪，监控用户录入信息
         Scanner input = new Scanner(System.in);
         //使用错误输出内容
         System.err.print("请输入角色耐力值：");
         //接收用户录入数据
         int maiLi = input.nextInt();

         //使用if判断
         if (maiLi >= 0 && maiLi <= 1000) {
             js = "不堪一击";
         } else if (maiLi > 1000 || maiLi < 3000) {
             js = "还有点水平";
         }
         System.out.println("张飞" + js);
     }

    public static void jie_2()  {
        String js = null; //用户状态
        //扫描仪，监控用户录入信息
        Scanner input = new Scanner(System.in);
        //使用错误输出内容
        System.err.print("请输入角色耐力值：");
        //接收用户录入数据
        int maiLi = input.nextInt();

        //使用if判断
        if (maiLi >= 0 && maiLi <= 1000) {
            js = "不堪一击";
            //!取反
        } else if (!(maiLi < 1000 || maiLi > 3000)) {
            js = "还有点水平";
        } else {
            js = "数据输入错误！！！";
        }
        System.out.println("张飞" + js);
    }
}
