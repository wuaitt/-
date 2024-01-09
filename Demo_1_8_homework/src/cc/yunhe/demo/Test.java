package cc.yunhe.demo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //创建一个扫描器
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //输入提示信息
            System.out.println("欢迎进入我的电话本");
            System.out.println("请输入你的选择" +
                    "1：查看所有的联系人" +
                    "2:查看某个人的详细信息，需要输入手机号码" +
                    "3:修改某个联系人，可以修改姓名和性别" +
                    "4：删除联系人" +
                    "5:添加联系人" +
                    "-1:退出系统");
            //接受用户输入的结果
            int i = scanner.nextInt();
            //选择
            switch (i){
                case 1:
                   new Service().show();
                    break;
                case 2:
                    new Service().oneShow();
                    break;
                case 3:
                    new Service().update();
                    break;
                case 4:
                    new Service().delete();
                    break;
                case 5:
                    new Service().add();
                    break;
                case -1:
                    System.out.println("再见");
                    return;
                default:
                    System.out.println("你输入的有误，请重新出入");
            }
        }
    }

}
