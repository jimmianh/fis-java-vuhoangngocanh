package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        int menuChoice;
        do {
            main.showMenu();
            menuChoice = scanner.nextInt();
            switch (menuChoice){
                case 1:
                    account.showList();
                    break;
                case 2:
                    account.addList();
                    break;
                case 3:
                    break;
                case 4:
                    account.removeById();
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
        }while (menuChoice != 6);

        }



    public void showMenu(){
        System.out.println("===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN=======");
        System.out.println("  1. Danh Sach Tai Khoan");
        System.out.println("  2. Them moi Tai Khoan");
        System.out.println("  3. Cap Nhat Thong Tin Tai Khoan");
        System.out.println("  4. Xoa Tai Khoan");
        System.out.println("  5. Chuyen Khoan");
        System.out.println("  6. Exit");
        System.out.println("Chọn....");
    }
}

