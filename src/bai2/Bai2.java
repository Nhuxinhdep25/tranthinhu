package bai2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kk = new Scanner(System.in);
        System.out.println("nhap ho va ten: ");
        String hoten = kk.nextLine();
        System.out.println("nam sinh: ");
        int namsinh = kk.nextInt();
        System.out.println("tuoi: ");
        int tuoi = kk.nextInt();
        kk.nextLine();
        System.out.println("gioi tinh: ");
        String gioitinh = kk.nextLine();
        System.out.println("GPA: ");
        float GPA = kk.nextFloat();
        kk.nextLine();
        System.out.println("que quan: ");
        String quequan = kk.nextLine();
        System.out.println("ho va ten: " +hoten);
        System.out.println("nam sinh: " +namsinh);
        System.out.println("tuoi: " +tuoi);
        System.out.println("gioi tinh: " +gioitinh);
        System.out.println("GPA: " +GPA);
        System.out.println("que quan: " +quequan); 
    }
    
}
