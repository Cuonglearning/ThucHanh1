package Bai1a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        Vehicle xe1=new Vehicle();
        Vehicle xe2=new Vehicle();
        Vehicle xe3=new Vehicle();
        System.out.println("1.Nhap thong tin xe");
        System.out.println("2.Xuat thong tin xe");
        System.out.println("3.Thoat");
        System.out.println("chon chuc nang muon su dung:");
        n=scan.nextInt();
        do{
        switch (n){
            case 1:{
                xe1.Nhap();
                xe2.Nhap();
                xe3.Nhap();
            }break;
            case 2:{
                System.out.println("Ten chu xe      Loai xe     Dung tich       Tri gia     Thue phai nop");
                System.out.println("======================================================================");
                xe1.Xuat();
                xe2.Xuat();
                xe3.Xuat();
            }break;
            case 3:break;
            default:System.out.println("So khong hop le!");break;
        }
        }while(n<3||n>1);
        
    }
    
}
