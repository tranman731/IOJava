package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Thông tin một sinh viên 
		System.out.println("Nhap thong tin mot sinh vien");
		System.out.println("Nhap ten vao day");
		String nameSv = sc.nextLine();
		
		System.out.println("Nhap ma sinh vien vao day");
		String msv = sc.nextLine();
		
		System.out.println("Nhap chung minh nhan dan vao day");
		String cmnd = sc.nextLine();
		
		System.out.println("Nhap lop cua ban vao day");
		String lop = sc.nextLine();
		
		System.out.println("Nhap ten truong cua ban vao day");
		String tentruong = sc.nextLine();
		
		System.out.println("Nhap diem trung binh cua ban vao day");
		String dtb = sc.nextLine();
		
		System.out.println("Tên: " + nameSv + "Mã sinh viên: " + msv + "Chứng minh nhân dân: " + cmnd +"Lớp: "+ lop + "Tên trường: "+ tentruong + "Điểm trung bình: " + dtb );

		System.out.println();
	
		// Thông tin một công nhân 
		System.out.println("Nhap thong tin mot cong nhan");
		System.out.println("Nhap ten cong nhan vao day");
		String nameCn = sc.nextLine();
		
		System.out.println("Nhap dia chi cua ban vao day");
		String diachi = sc.nextLine();
		
		System.out.println("Nhap so dien thoai cua ban vao day");
		String sdt = sc.nextLine();
		
		System.out.println("Nhap he so luong cua ban vao day");
		String hsl = sc.nextLine();
		
		System.out.println("Tên: " + nameCn + "Địa chỉ: " + diachi + "Số điện thoại: " + sdt + "Hệ số lương: " + hsl );
		
		System.out.println();
		
		// Thông tin một chiếc xe
		System.out.println("Nhap thong tin mot chiec xe");
		System.out.println("Nhap ten cua ban vao day");
		String nameCar = sc.nextLine();
		
		System.out.println("Nhap hang xe cua ban vao day");
		String hang = sc.nextLine();
		
		System.out.println("Nhap gia xe cua ban vao day ");
		String gia = sc.nextLine();
		
		System.out.println("Nhap mau son xe cua ban vao day");
		String mauSon = sc.nextLine();
		
		System.out.println("Tên: " + nameCar + "Hãng: " + hang + "Giá: " + gia + "Màu Sơn: " + mauSon);
	}

}
