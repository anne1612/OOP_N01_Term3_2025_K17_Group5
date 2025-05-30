/*import TestUser;
import TestProduct;
import TestOrder;
import TestPayment;*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        TestPayment.main();
        TestTime.test();
        TestUser.test();

        TestUser us = new TestUser();
        us.testEdit();*/
 
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= MENU CHÍNH =========");
            System.out.println("1. Đăng ký người dùng mới");
            System.out.println("2. Nhập sản phẩm mới");
            System.out.println("3. Tạo đơn hàng mới (nhập tay)");
            System.out.println("0. Thoát");
            System.out.print("👉 Chọn chức năng: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    TestUser.testRegisterUser();
                    break;
                case "2":
                    TestProduct.testProductInput();
                    break;
                case "3":
                    TestOrder.testOrderFromInput(sc);
                    break;
                case "0":
                    System.out.println("👋 Thoát chương trình. Tạm biệt!");
                    return;
                default:
                    System.out.println("⚠️ Vui lòng chọn đúng từ 0 đến 3.");
            }
        }

    }
}