import java.util.Scanner;
import java.lang.Math;

public class baitap1 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai cua hcn");
        double chieudai = scanner.nextDouble();
        System.out.println("nhap chieu rong cua hcn");
        double chieurong = scanner.nextDouble();
        double dientich = chieudai * chieurong;
        double chuvi = 2 * (chieudai + chieurong);
        double duongcheo = Math.sqrt(Math.pow(chieudai, 2) + Math.pow(chieurong, 2));
        System.out.println("dien tich cua hcn " + dientich);
        System.out.println("chu vi cua hcn " + chuvi);
        System.out.println("duong cheo cua hcn " + duongcheo);
        scanner.close();

    }
}