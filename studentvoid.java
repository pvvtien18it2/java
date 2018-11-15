package thi;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

import javax.xml.bind.util.ValidationEventCollector;

import JAVA.student;

public class studentvoid {
	String name;
	double diemToan;
	double diemLy;
	double diemHoa;
	float tb;
	Vector list=new Vector();
	public studentvoid() {
		
		while (true) {
			System.out.println("-*-*-*-*-*-");
			System.out.println("Nhap Thong Tin Sinh Vien");
			System.out.println("1 . Nhap Thong Tin");
			System.out.println("2 . Xem Thong Tin");
			System.out.println("3 . Xem Diem Trung Binh");
			Scanner key=new Scanner(System.in);
			System.out.println("Moi Ban Chon Chuc Nang : ");
			int n;
			n=key.nextInt();
			switch(n) {
			case 1 : NhapTT();
			break;
			case 2 : XemTT();
			break;
			case 3 : DiemTB();
			break;
			
			}
		}
	}
		public void NhapTT()  {
			Scanner key = new Scanner(System.in);
			int sl;
			System.out.println("Nhap So Luong Hoc Sinh \n");
			sl=Integer.parseInt(key.nextLine());
				for(int i=1;i<=sl;i++)
				{
					System.out.println("Nhap Thong Tin Sinh Vien Thu "+i+"\n******************");
			System.out.println("Ho Va Ten :");
			this.name=key.nextLine();
			System.out.println("Diem Mon Toan :");
			this.diemToan=Double.parseDouble(key.nextLine());
			System.out.println("Diem Mon Ly :");
			this.diemLy=Double.parseDouble(key.nextLine());
			System.out.println("Diem Mon Hoa :");
			this.diemHoa=Double.parseDouble(key.nextLine());
			System.out.println("Diem Trung Binh :");
			this.tb=Float.parseFloat(key.nextLine());

			Student obj1=new Student(name ,diemToan , diemHoa ,diemLy , tb );
			list.add(obj1);
			
			
			
			
				}
		
		}
		public void XemTT() {
			Enumeration EStudent=list.elements();
			int i=1;
			while(EStudent.hasMoreElements()) {
				Student obj2=(Student)EStudent.nextElement();
				System.out.println("Ten Hoc Sinh : " + obj2.getName()+"\nDiem Toan : "+obj2.getDiemToan()+"\nDiem Hoa : "+obj2.getDiemHoa()+"\nDiem Ly : "+obj2.getDiemLy());
			} 

		}
		public void DiemTB() {
			Student[] obj2 = new Student[list.size()];
			int index=0;
			Enumeration vEnum =list.elements();
			while(vEnum.hasMoreElements())
			{
				obj2[index]=(Student)vEnum.nextElement();
				index++;
			}
			Arrays.sort(obj2);
			System.out.println("Danh sach sau khi sap xep\n");
			for (index=0;index <obj2.length;index++)
			{
				System.out.println("       "+(index+1)+"\nHo Va Ten :"+obj2[index].getName()+"\nCo Diem Trung Binh La : "+ obj2[index].getTb());
			}
			System.out.println("\n------------\n");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new studentvoid();
		
	}

}

