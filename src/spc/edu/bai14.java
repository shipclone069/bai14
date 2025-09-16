/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class bai14 {
    public static void main(String[] args) {
        System.out.println("tinh diem trung binh");
 Scanner scanner = new Scanner(System.in);
        double tongdiem = 0;
        int somon = 6;
        int diem;

        for (int i = 1; i <= somon; i++) {
            while (true) {
                System.out.printf("nhap so diem mon %d: ", i);
                diem = scanner.nextInt();

                if (diem >= 0 && diem <= 10) {
                    tongdiem += diem;
                    break;
                } else {
                    System.out.println("so diem khong hop le vui long nhap lai.");
                }
            }
        }

        double diemtb = tongdiem / somon;
        System.out.printf("So diem trung binh la: %.2f\n", diemtb);
        scanner.close();
    }
}
