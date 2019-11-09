import java.util.Scanner;

public class youXi {
    public static void main(String[] args) {
        guDing();
        shuRu();
    }

    public static void guDing() {
        System.err.println("生 命 值：📦📦📦📦📦📦🗄🗄🗄🗄\n物理攻击：📦📦📦📦📦📦📦🗄🗄🗄\n技能伤害：📦🗄🗄🗄🗄🗄🗄🗄🗄🗄🗄\n上手难度：📦📦📦📦📦🗄🗄🗄🗄🗄\n");
        //声明变量
        double sh;
        int gjjl;
        double hj,mk,smz,smhf,flz,flhf;
        int ys;
        String dw;
        int dj,jb;
        //格式化赋值输出
        System.out.printf("伤害：%.2f(+4.5)\t\t攻击距离：%d\n护甲：%.3f(+3.0)\t\t魔抗：%.1f(+1.25)\n生命值：%.2f(+84.25)\t生命回复：%.2f(+0.5)\n法力值：%.1f(+0.0)\t\t法力回复：%.1f(+0.0)\n移速：%d\t\t\t\t定位：%s\n点券：%d\t\t\t\t金币：%d\n",57.88,172,27.536,32.1,616.28,7.84,0.0,0.0,340,"上单、辅助、打野",450,1000);
    }

    public static void shuRu() {
        //扫描仪，用来记录用户输入的数据
        Scanner input = new Scanner(System.in);

        //分割线以及提醒
        System.out.println("####################################\n请在下方输入相应内容");
        System.out.print("伤害：");
        //接管double类型
        double sh = input.nextDouble();
        System.out.print("攻击距离：");
        //接管int类型
        int gjjl = input.nextInt();
        System.out.print("护甲：");
        //接管double类型
        double hj = input.nextDouble();
        System.out.print("魔抗：");
        //接管double类型
        double mk = input.nextDouble();
        System.out.print("生命值：");
        //接管double类型
        double smz = input.nextDouble();
        System.out.print("生命回复：");
        //接管double类型
        double smhf = input.nextDouble();
        System.out.print("法力值：");
        //接管double类型
        double flz = input.nextDouble();
        System.out.print("法力回复：");
        //接管double类型
        double flhf = input.nextDouble();
        System.out.print("移速：");
        //接管int类型
        int ys = input.nextInt();
        System.out.print("点券：");
        //接管int类型
        int dj = input.nextInt();
        System.out.print("金币：");
        //接管int类型
        int jb = input.nextInt();
        System.out.print("（例如：中单、法师、刺客）定位：");
        //接管String类型
        String dw = input.next();

        //整理数据并输出结果
        System.err.println("\n生 命 值：📦📦📦📦📦📦🗄🗄🗄🗄\n物理攻击：📦📦📦📦📦📦📦🗄🗄🗄\n技能伤害：📦🗄🗄🗄🗄🗄🗄🗄🗄🗄🗄\n上手难度：📦📦📦📦📦🗄🗄🗄🗄🗄\n");
        System.out.println("伤害："+ sh +"(+4.5)\t\t攻击距离："+ gjjl +"\n护甲："+ hj +"(+3.0)\t\t魔抗："+ mk +"(+1.25)\n生命值："+ smz +"(+84.25)\t生命回复："+ smhf +"(+0.5)\n法力值："+ flz +"(+0.0)\t\t法力回复："+ flhf +"(+0.0)\n移速："+ ys +"\t\t\t\t定位："+ dw +"\n点券："+ dj +"\t\t\t\t金币："+ jb);
    }
}
