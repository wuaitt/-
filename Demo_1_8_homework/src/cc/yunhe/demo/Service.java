package cc.yunhe.demo;

import cc.yunhe.demo.domain.PhoneBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    //定义一个电话本集合存储数据
    static ArrayList<PhoneBooks> books = new ArrayList<>();
    //创建添加用户信息
    public static void add(){
        PhoneBooks phoneBooks = new PhoneBooks();
        //定义一个集合进行存储信息

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        int id = scanner.nextInt();
        System.out.println("请输入手机号");
        String phone = scanner.next();
        System.out.println("请输入性别");
        String sex = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        //设置值
        phoneBooks.setId(id);
        phoneBooks.setPhone(phone);
        phoneBooks.setSex(sex);
        phoneBooks.setAge(age);
        boolean bl = true;
        //判断手机号是否已经存在
        for (PhoneBooks book : books) {
            if (book.getPhone().equals(phone)){
                System.out.println("手机已经存在，添加失败");
                bl = false;
                break;
            }
        }
        if (bl == true){
            //添加到集合中
            books.add(phoneBooks);
        }

    }

    //创建查看所有联系人的方法
    public static void show(){
        for (PhoneBooks book : books) {
            System.out.println(book.toString());
        }
    }

    //根据手机号查看默认的详细信息
    public static void oneShow(){
        System.out.println("请输入要查询的手机号");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        boolean bl = false;
        for (PhoneBooks book : books) {
            //获取电话本中的手机号
            String phone = book.getPhone();
            //判断是否相等
            if (phone.equals(next)){
                System.out.println(book);
                bl=true;
            }
        }
        if (bl == false){
            System.out.println("未查到该手机号");
        }

    }

    //根据手机号删除联系人
    public static void delete(){
        System.out.println("请输入要删除的手机号");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        boolean bl = false;
        for (PhoneBooks book : books) {
            //获取电话本中的手机号
            String phone = book.getPhone();
            //判断是否相等
            if (phone.equals(next)){
                books.remove(book);
                System.out.println("删除成功");
                bl  = true;
            }
        }
        if (bl== false){
            System.out.println("未查到该手机号");
            System.out.println("删除失败");
        }
    }
    //根据手机号修改姓名和性别
    public static void update(){
        System.out.println("请输入要修改信息的手机号");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        boolean bl = false;
        for (PhoneBooks book : books) {
            //获取电话本中的手机号
            String phone = book.getPhone();
            //判断是否相等
            if (phone.equals(next)){
                System.out.println("请输入要修改的性别");
                String sex = scanner.next();
                book.setSex(sex);
                System.out.println("请输入要修改的年龄");
                int age = scanner.nextInt();
                book.setAge(age);
                System.out.println("修改成功");
                bl = true;
            }
        }
        if (bl==false){
            System.out.println("输入的手机号不存在，请重新输出");
        }

    }

}
