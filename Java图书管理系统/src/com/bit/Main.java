package com.bit;

import com.bit.book.BookList;
import com.bit.user.Admin;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

public class Main {

    public static User login(){
        Scanner in = new Scanner(System.in);
        System.out.println("输入你的用户名：");
        String name = in.nextLine();

        System.out.println("请输入你的身份（0代表用户，1代表管理员）");
        int who = in.nextInt();
        if(who == 0){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList booklist = new BookList();

        while(true){
            User user = login();
            int num = user.menu();

            user.doOperation(num,booklist);
        }

    }
}
