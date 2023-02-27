/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam;

/**
 *
 * @author Nam Le
 */

    



public class Point2D {


	private float x;
	private float y;

	public Point2D(float x, float y) {
		// super();
		this.x = x;
		this.y = y;
	}


	public float getX() {
		return x;
	}


	public float getY() {
		return y;
	}	


}

package Lab3_c1;

public class Triangle {

	private float Cd;
	private float Cr;
	public Triangle(float cd, float cr) {
		// super();
		Cd = cd;
		Cr = cr;
	}

	public float getCd() {
		return Cd;
	}
	public void setCd(float cd) {
		Cd = cd;
	}
	public float getCr() {
		return Cr;
	}
	public void setCr(float cr) {
		Cr = cr;
	}

	@Override
	public String toString() {
		return "Triangle [Cd=" + Cd + ", Cr=" + Cr + "]";
	}

}

package Lab3_c1;

public class Fraction {


	private int den;
	private int num;
	public Fraction(int num, int den) {
		super();
		this.den = den;
		this.num = num;
	}


	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public int timSoNhoNhat(int a, int b) {

		while(a != b) {
			if(a>b) {
				a -=b;
			}else {
				b -=a;
			}
		}
		return a;
	}

    public void toiGianPhanSo() {
        int i = timSoNhoNhat(this.getNum(), this.getDen());
        this.setNum(getNum()/i);
        this.setDen(getDen()/i);
    }

	public void Cong(Fraction f) {
		int tu =  this.num * f.getDen() + this.den * f.getNum();
		int mau = this.getDen() * f.getDen();
		Fraction Cong = new Fraction(tu, mau);
		Cong.toiGianPhanSo();
		System.out.println("Cong cua 2 phan tu la: "+Cong.num+"/"+Cong.den);
	}
	public void Tru(Fraction f) {
		int tu = this.num * f.getDen() - this.den * f.getNum();
		int mau = this.getDen() * f.getDen();
		Fraction Tru = new Fraction(tu, mau);
		Tru.toiGianPhanSo();
		System.out.println("Tru cua 2 phan tu la: "+Tru.num+"/"+Tru.den);
	}
	public void Nhan(Fraction f) {
		int tu = this.getNum() *  f.getNum() ;
		int mau = this.getDen() * f.getDen();
		Fraction Nhan = new Fraction(tu, mau);
		Nhan.toiGianPhanSo();
		System.out.println("Nhan cua 2 phan tu la: "+Nhan.num+"/"+Nhan.den);
	}
	public void Chia(Fraction f) {
		int tu = this.getNum() *  f.getDen() ;
		int mau = this.getDen() * f.getNum();
		Fraction Chia = new Fraction(tu, mau);
		Chia.toiGianPhanSo();
		System.out.println("Chia cua 2 phan tu la: "+Chia.num+" /"+ Chia.den);
	}


    @Override
	public String toString() {
		return "Fraction [num=" + num + ", den=" + den + "]";
	}
}

package Lab3_c1;

import java.util.Scanner;

public class Text1 {
	public static void main(String[] args) {
		int luaChon = 0;
		System.out.println("Nhap loai phep tinh ");
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("----------------");
				System.out.println("1. Point2D");
				System.out.println("2. Triagle");
				System.out.println("3. Fraction");
				luaChon = sc.nextInt();
				sc.nextLine();

				if(luaChon==1) {
					while (true) {
						System.out.println("Nhap x");
						float x = sc.nextFloat();
						System.out.println("Nhap y");
						float y = sc.nextFloat();

						Point2D p = new Point2D(x, y);
						System.out.println("Gia tri poin2d cua x la: "+p.getX());
						System.out.println("Gia tri poin2d cua x la: "+p.getY());
						break;
					}
				}else if(luaChon==2) {
					while (true) {
						System.out.println("Nhap Cd");
						float a = sc.nextFloat();
						System.out.println("Nhap Cr");
						float b = sc.nextFloat();

						Triangle t = new Triangle(a, b);
						System.out.println(t);
						break;
					}
				}else if(luaChon==3) {
					while (true) {
						System.out.println("Nhap cho a");
						System.out.println("Nhap phan num(tu): ");
						int a1 = sc.nextInt();
						System.out.println("Nhap phan den(mau): ");
						int b1 = sc.nextInt();

						System.out.println("Nhap cho b");
						System.out.println("Nhap phan num(tu): ");
						int a2 = sc.nextInt();
						System.out.println("Nhap phan den(mau): ");
						int b2 = sc.nextInt();

						Fraction a = new Fraction(a1, b1);
						Fraction b = new Fraction(a2, b2);

						a.Cong(b);
						a.Tru(b);
						a.Nhan(b);
						a.Chia(b);

						break;
					}
				}



			} while (luaChon!=0);
		}

//	Cau 2/lab3
package Lab3_c4;

public class Student {
	private String stID;
	private String stName;
	private String stClass;
	public Student(String stID, String stName, String stClass) {
		super();
		this.stID = stID;
		this.stName = stName;
		this.stClass = stClass;
	}
	public String getStID() {
		return stID;
	}
	public void setStID(String stID) {
		this.stID = stID;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStClass() {
		return stClass;
	}
	public void setStClass(String stClass) {
		this.stClass = stClass;
	}
	@Override
	public String toString() {
		return "Student [stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + "]";
	}


}
package Lab3_c4;

public class Book {
	private String boCode;
	private String boTitle;
	private String boAuthor;
	public Book(String boCode, String boTitle, String boAuthor) {
		super();
		this.boCode = boCode;
		this.boTitle = boTitle;
		this.boAuthor = boAuthor;
	}
	public String getBoCode() {
		return boCode;
	}

	public String getBoTitle() {
		return boTitle;
	}

	public String getBoAuthor() {
		return boAuthor;
	}



}

package Lab3_c4;

import java.util.Scanner;

public class text3 {
	public static void main(String[] args) {
		System.out.println("Nhap cac gia tri");
		System.out.println("----------------");
		try (Scanner sc = new Scanner(System.in)) {
			int luaChon=0;

			do {
				System.out.println("1. Nhap 1 chon Student");
				System.out.println("2. Nhap 2 chon Book");
				luaChon = sc.nextInt();
				sc.nextLine();

				if(luaChon==1) {
					System.out.println("NHap Id student ");
					String a = sc.nextLine();
					System.out.println("Nhap ten student ");
					String b = sc.nextLine();
					System.out.println("Nhap Class student ");
					String c = sc.nextLine();

					Student st = new Student(a, b, c);
					System.out.println("Studen gom: "+st);

				}else if(luaChon==2) {
					System.out.println("NHapCode book ");
					String a = sc.nextLine();
					System.out.println("Nhap title book ");
					String b = sc.nextLine();
					System.out.println("Nhap author book ");
					String c = sc.nextLine();

					Book bo = new Book(a, b, c);
					System.out.println("Code la "+bo.getBoCode());
					System.out.println("title la "+bo.getBoTitle());
					System.out.println("author la "+bo.getBoAuthor());
				}

			} while (luaChon!=0);
		}
	}
}

//	Cau3 ( trong cau 1 tren bang)
package Lab3_c3_4;

public class HinhVuong {

	private int cd;
	private int cr;

	public HinhVuong(int cd, int cr) {
		super();
		this.cd = cd;
		this.cr = cr;
	}

	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	public int getCr() {
		return cr;
	}
	public void setCr(int cr) {
		this.cr = cr;
	}

}

package Lab3_c3_4;

public class HinhTron {


	private double r;

	public HinhTron(double r) {
		super();
		this.r = r;
	}
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}

package Lab3_c3_4;

import java.util.Scanner;

public class Text2 {
	public static void main(String[] args) {
		System.out.println("Nhap cac lua Chon");
		try (Scanner sc = new Scanner(System.in)) {
			int luaChon = 0;

			do {
				System.out.println("----------------");
				System.out.println("1. Hinh vuong");
				System.out.println("2. Hinh tron");
				luaChon = sc.nextInt();
				sc.nextLine();
				if(luaChon==1) {
					System.out.println("Nhap Cd");
					 int a = sc.nextInt();
					 System.out.println("Nhap Cd");
					 int b = sc.nextInt(); 
					HinhVuong h = new HinhVuong(a, b);
					System.out.println("Hinh vuong co Cd  la: "+h.getCd()+" va Cr la: "+h.getCr());
				}else if(luaChon==2) {
					System.out.println("Nhap r");
					float r = sc.nextFloat();
					HinhTron tron = new HinhTron(r);
					System.out.println("r cua hinh tron la: "+tron.getR());
				}
			} while (luaChon!=0);
		}
	}
}

//	Cau4(trong cau 3 tren bang)
package Lab3_c3_4;

import java.util.Scanner;

// import java.util.Objects;

public class NhanVien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	private double LUONG_MAX;
	public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double lUONG_MAX) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		LUONG_MAX = lUONG_MAX;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getLUONG_MAX() {
		return LUONG_MAX;
	}
	public void setLUONG_MAX(double lUONG_MAX) {
		LUONG_MAX = lUONG_MAX;
	}
	// tinh tang luong
	public double tinhLuong() {
		return this.luongCoBan * this.heSoLuong;
	}

	// in thong tin nhan vien
	public String inTTin() {
		return "NhanVien [tenNhanVien=" + tenNhanVien + ", luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong
				+ ", LUONG_MAX=" + LUONG_MAX + "]";
	}

	// tinh tang luong
	public boolean tangluong(double a1) {
		// vi gia tri tren may tra ve " return false" truoc nen lam nguoc lai
		return this.LUONG_MAX>a1;
	}

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("Vui long nhap cac gia tri sau");
		System.out.println("-----------------------------");
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("Nhap ten nhan vien: ");
				String a = sc.nextLine();
				System.out.println("Nhap luong co ban: ");
				double b = sc.nextDouble();
				System.out.println("Nhap he so luong: ");
				double c = sc.nextDouble();
				System.out.println("Nhap he Luong_Max: ");
				double d = sc.nextDouble();

				NhanVien nv = new NhanVien(a, b, c, d);
				System.out.println("Tinh luong: "+nv.tinhLuong());
				System.out.println("Co nen tang luong: "+nv.tangluong(b));
				System.out.println(nv.inTTin());
			}
		}
	}
}
//	Cau5( trong cau 2 tren bang, kha khum num nen chac sai )

package Lab3_c3_4;


import java.util.Scanner;

public class Vector {


	private int a;
	private int b;

	public Vector(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public int CongVector() {
		return this.a + this.b;
	}

	@Override
	public String toString() {
		return "Vector [a=" + a + ", b=" + b + "]";
	}


	 public static void main(String[] args) {
		 int luaChon = 0;
		System.out.println("Nhap lan luot 3 loai vector ");
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap gia tri o (a, )");
				int a1 = sc.nextInt();
				System.out.println("Nhap gia tri o (, b)");
				int b1 = sc.nextInt();
			System.out.println("Nhap gia tri vector 1");
			Vector v1 = new Vector(a1, b1);

			System.out.println("Nhap gia tri o (a2, )");
				int a2 = sc.nextInt();
			System.out.println("Nhap gia tri o (, b2)");
				int b2 = sc.nextInt();
			System.out.println("Nhap gia tri vector 2");
			Vector v2 = new Vector(a2, b2);

			System.out.println("Nhap gia tri o (a3, )");
				int a3 = sc.nextInt();
			System.out.println("Nhap gia tri o (, b3)");
				int b3 = sc.nextInt();
			System.out.println("Nhap gia tri vector 3");
			Vector v3 = new Vector(a3, b3);

			do {
				System.out.println("----------------");
				System.out.println("1. Cong");
				System.out.println("2. Tru");
				System.out.println("3. Nhan 1 hang so");
				System.out.println("3. Nhan 2 hang so");
				luaChon = sc.nextInt();
				sc.nextLine();

				if(luaChon==1) {
					System.out.println(v1);
					System.out.println(v2);
					System.out.println(v3);
				}
			} while (luaChon!=0);
		}