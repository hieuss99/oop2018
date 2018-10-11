package week4.task1;

public class Cam_thanh_phong extends Cam {
	int Gia,So_luong;
	 protected String Nguon;
	 /**
	 * hàm khởi tạo mặc định 
	 */
	public Cam_thanh_phong() {}
	 /**
	  * hàm lấy giá trị giá 
	 * @param a giá bán đồng/kg
	 */
	public void setGia(int a)
		{
			this.Gia = a;
		}
		/**
		 * hàm lấy giá trị số lượng 
		 * @param b số lượng 
		 */
		public void setSoluong(int b)
		{
			this.So_luong = b;
		}
		/**
		 * hàm lấy giá trị nguồn
		 * @param Nguon
		 */
		public void setNguon(String Nguon)
		{
			this.Nguon = Nguon;
		}
		/* (non-Javadoc)
		 * @see week4.task1.HoaQua#getThuoctinh()
		 * hàm lấy thuộc tính
		 */
		public String getThuoctinh()
		{
			return this.Thuoctinh;
		}
		/* (non-Javadoc)
		 * @see week4.task1.HoaQua#getMien()
		 * hàm lây giá trị miền 
		 */
		public String getMien()
		{
			return this.Mien;
		}
		/* (non-Javadoc)
		 * @see week4.task1.Cam#Thongtin()
		 * hàm xuất thông tin ra màn hình
		 */
		public void Thongtin()
		{
			super.Thongtin();
			System.out.println("Gia ban :"+this.Gia+" đồng/kg");
			System.out.println("so luong: "+this.So_luong+" kg");
			System.out.println("Tong so tien:"+(this.So_luong*this.Gia)+" đ");
		}
}
