package jibensujuleixin;

public class IntXing {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        zhengXing(); //调用方法
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        geShiHua(); //调用方法
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        shuChu(); //调用方法
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        qingDan(); //调用方法
    }
    //整数的不同打印方式
    public static void zhengXing() {
        int value = 2147483647 + 1; //数据异常
        System.out.println(1.0 - 0.9); //是一个无限接近0.1的小数，和正常的数学算法不同
        System.out.println(value); //打印输出
        System.out.println(Integer.MAX_VALUE); //最大值
        System.out.println(Integer.MIN_VALUE); //最小值
    }

    //格式化声明变量 与 输出错误信息
    public static void geShiHua() {
        //使用占位符构建了一个字符串
        String str = String.format("%.2f%10d",20.3,10);
        System.out.println(str); //打印输出
        System.err.println("我是bug,我怕谁！！！"); //输出错误信息
    }

    //电脑配置表
    public static void shuChu() {
        String pingPei = "华硕 ASUS";
        String xingHao = "GTX 1080";
        int pinlv = 1569;
        float chang = 29.8F;
        float kuan = 13.4F;
        float gao = 5.25F;

        System.out.println("\t品牌；" + pingPei + "\n\t型号：" + xingHao + "\n核心频率：" + pinlv + "\n长,宽,高：" + chang + '/' + kuan + '/' +gao);


    }

    //格式化输出吃货清单
    public static void qingDan() {
        System.out.println("某吃货清单\n-----------------------");
        System.out.println("商品名称\t单价\t数量\t备注");
        String goodsName1 = "鸡排";       //商品名称
        float price1 = 11.5F;             //单价
        int count1 = 999;                 //数量
        String remark1 = "憨憨爱吃";      //备注

        System.out.printf("%s\t\t%.2f\t%d\t\t%s",goodsName1,price1,count1,remark1);
    }
}