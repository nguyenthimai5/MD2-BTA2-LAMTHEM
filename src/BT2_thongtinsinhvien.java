import java.util.Scanner;

public class BT2_thongtinsinhvien {
    public static void main(String[] args) {
        System.out.println("*************MENU*****************");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3. Tính tuổi sinh viên");
        System.out.println("4. Thoát");
        System.out.println("NHẬP SỰ LỰA CHỌN CỦA BẠN: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        sc.nextLine();
        String studentId;
        if (a==1) {
            System.out.println("Bạn đã chọn: Nhập thông tin sinh viên");
            System.out.println("nhập mã  sinh viên: ");
           studentId= sc.nextLine();
            System.out.println("nhập tên sinh viên: ");
            String studentName = sc.nextLine();
            System.out.println("nhập năm sinh viên: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("nhập  giới tính: ");
            String gender = sc.nextLine();
            System.out.println("nhập email sinh viên: ");
            String email = sc.nextLine();
            System.out.println("nhập số điện thoại sinh viên: ");
            String phone = sc.nextLine();
            System.out.println("nhập địa chỉ: ");
            String address = sc.nextLine();
        }if (a==2) {
            System.out.printf("%-15s%-30s%-15s%-30s%-7s%-20d\n", "Student ID:", studentId, "Student Name:", studentName, "Age:", age);
            System.out.printf("%-15s%-30s%-15s%-30s%-7s%-20s\n", "Gender:", gender, "Email:", email, "Phone:", phone);
            System.out.printf("%-15s%-5s", "Address:", address);
        }if (a==3){
            int tuoi=2022-age;
            System.out.println("Tuổi của sinh viên là:"+tuoi);
        }if (a==4){
                System.exit(0);
        }
    }
}
