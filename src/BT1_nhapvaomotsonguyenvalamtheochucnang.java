import java.util.Scanner;

public class BT1_nhapvaomotsonguyenvalamtheochucnang {
    public static void main(String[] args) {
        System.out.println("************MENU*************");
        System.out.println("1.In ra các số chẳn và tính tổng trong khoảng từ 0..n");
        System.out.println("2.In ra các số lẻ và tính tổng trong khoảng từ 0....n");
        System.out.println("3.Kiểm tran có phải số nguyên tố không");
        System.out.println("4.Kiểm tra n có phải là số hoàn hảo không");
        System.out.println("5.In ra các số nguyên tố trong khoảng từ 0....n");
        System.out.println("6.In ra các ước số của n và tính tổng");
        System.out.println("7.Thoát");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập sự lựa chọn của bạn: ");
        int a = scanner.nextInt();
        int sum = 0;

        if (a == 1) {
            System.out.println("Bạn đã chọn:In ra các số chẳn và tính tổng trong khoảng từ 0..n");
            System.out.println("vui lòng nhập n trong khoảng từ 0-->n ");
            int n = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.printf("các số chẳn trong khoảng từ 0 đến%d là ", n);
                    System.out.println(i);
                    sum += i;
                }
            }
            System.out.println("tổng :" + sum);
        }
        if (a == 2) {
            System.out.println("Bạn đã chọn:In ra các số lẻ và tính tổng trong khoảng từ 0....n");
            System.out.println("vui lòng nhập n trong khoảng từ 0-->n ");
            int n = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.printf("các số lẻ trong khoảng từ 0 đến%d là ", n);
                    System.out.println(i);
                    sum += i;
                }
            }
            System.out.println("tổng :" + sum);
        }
        if (a == 3) {
            System.out.println("Bạn đã chọn:Kiểm tra n có phải số nguyên tố không");
            System.out.println("Nhập số:");
            int num = scanner.nextInt();
            if (num == 2) {
                System.out.printf(num + " là số nguyên tố");
            }
            int so = (int) Math.sqrt(num);
            for (int i = 2; i < so; i++) {
                if (num % i == 0) {
                    System.out.println(num + "không phải là số nguyên tố");
                    break;
                } else {
                    System.out.println(num + "là số nguyên tố");
                }
            }
        }
        if (a==4){
            System.out.println("Bạn đã chọn:Kiểm tra n có phải số hoàn hảo không");
            System.out.println("Nhập số:");
            int num = scanner.nextInt();
            for (int i = 1; i <num ; i++) {
                if (num%i==0){
                    System.out.printf("các ước số trong khoảng từ 0 đến%d là ", num);
                    System.out.println(i);
                    sum += i;
                }
            }if (sum==num){
                System.out.println(num+" là số hoàn hảo");
            }else {
                System.out.println(num+" không phải số hoàn hảo");
            }
        }
        if (a==5){
            System.out.println("Bạn đã chọn:In ra các số nguyên tố trong khoảng 0..n");
            System.out.println("Nhập số:");
            int num = scanner.nextInt();
           if (num>=2){
               for (int i = 0; i <= num; i++) {
                   boolean check=false;
                   for (int j = 2; j <=Math.sqrt(i) ; j++) {
                       if (i%j==0){
                           check=true;
                           break;
                       }
                   }
                   if (!check){
                       System.out.printf("các số nguyên tố từ 0-->%d %d\n",num,i);
                   }

               }
           }


        }
        if (a==6){
            System.out.println("Bạn đã chọn:In ra các ước số của n và tính tổng");
            System.out.println("Nhập số:");
            int num = scanner.nextInt();
            for (int i = 1; i <num ; i++) {
                if (num%i==0){
                    System.out.println("các ước là:"+i);
                    sum+=i;
                }else {
                    continue;
                }
            }System.out.println("tổng các ước là:"+sum);
        }
        if (a==7){
            System.exit(0);
        }

    }
}
