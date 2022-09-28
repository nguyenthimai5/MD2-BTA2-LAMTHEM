import java.util.Scanner;

public class BT2_thongtinsinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentId="";
        String studentName="";
        int age=2022,tuoi=0;
        String gender="nữ";
        String email="";
        String phone="";
        String address="";
        do {
            System.out.println("*************MENU*****************");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tính tuổi sinh viên");
            System.out.println("4. Thoát");
            System.out.println("NHẬP SỰ LỰA CHỌN CỦA BẠN: ");

            int a = sc.nextInt();
            sc.nextLine();

            if (a == 1) {
                System.out.println("Bạn đã chọn: Nhập thông tin sinh viên");
                System.out.println("nhập mã  sinh viên: ");
                studentId = sc.nextLine();
                System.out.println("nhập tên sinh viên: ");
                studentName = sc.nextLine();
                System.out.println("nhập năm sinh viên: ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("nhập  giới tính: ");
                gender = sc.nextLine();
                System.out.println("nhập email sinh viên: ");
                email = sc.nextLine();
                System.out.println("nhập số điện thoại sinh viên: ");
                phone = sc.nextLine();
                System.out.println("nhập địa chỉ: ");
                address = sc.nextLine();
            }
                if (a == 2) {
                    System.out.printf("%s%s%s%s%s%d\n", "Student ID:", studentId, "Student Name:", studentName, "Age:", age);
                    System.out.printf("%s%s%s%s%s%s\n", "Gender:", gender, "Email:", email, "Phone:", phone);
                    System.out.printf("%-15s%-5s\n", "Address:", address);
                }
                if (a == 3) {
                     tuoi = 2022 - age;
                    System.out.println("Tuổi của sinh viên là:" + tuoi);
                }
                if (a == 4) {
                    System.exit(0);
                }

        } while (true);
    }
}
