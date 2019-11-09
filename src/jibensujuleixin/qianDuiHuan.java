package jibensujuleixin;

import java.util.Scanner;

/**
 * 整钱换零的练习题：要求将给定的钱数分成较小的货币单位
 * 例如：
 *      125.7
 *      10元纸币：12张
 *      5元纸币：1张
 *      1元纸币：0张
 *      5角纸币/硬币：1张/枚
 *      1角纸币/硬币：2张/枚
 * 构思：
 *      10元的 = 钱数 / 10
 *      5元的 = 钱数 % 10 / 5
 *      1元的 = 钱数 % 10 - 5
 *      5角的 = （int）（钱数 * 10） / 5
 *      1角的 = （int）（钱数 * 10） - 5
 */
public class qianDuiHuan {

    public static void main(String[] args) {
        //扫描仪，扫描用户输入的内容
        Scanner input = new Scanner(System.in);

        System.out.print("请输入小钱钱的数额：");
        //定义一个接收数据的变量
        double money = input.nextDouble();

        //定义元的部分 =====>>>>存在bug,数据异常
        int yuan = (int)money;
        int tanYuan = yuan / 10; //10元纸币的数量
        int fiveYuan = yuan % 10 / 5; //5元纸币的数量
        int oneYuan = yuan % 10 - 5; //1元纸币的数量

        //定义角部分 =====>>>>存在bug,数据异常
        int fiveJiao = (int)(money * 10) % 10 / 5; //5角纸币/硬币的数量
        int oneJiao = (int)(money * 10) % 10 - 5; //1角纸币/硬币的数量
        System.out.println("10元有：" + tanYuan + "张");
        System.out.println("5元有：" + fiveYuan + "张" );
        System.out.println("1元有：" + oneYuan + "张");
        System.out.println("5角有：" + fiveJiao + "张");
        System.out.println("1角有：" + oneJiao + "张");

    }
}
