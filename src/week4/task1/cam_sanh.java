package week4.task1;

public class Cam_sanh extends Cam{
	 int Gia,So_luong;
	 protected String Nguon;	 
	/**
	 * hàm khởi tạo mặc định
	 */
	public Cam_sanh() {}
	 /**
	  * lấy giá trị giá bán
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
		 * hàm lấy giá trị nguôn gốc
		 * @param Nguon nguồn gốc 
		 */
		public void setNguon(String Nguon)
		{
			this.Nguon = Nguon;
		}
		/* (non-Javadoc)
		 * @see week4.task1.HoaQua#getThuoctinh()
		 * hàm lấy thuộc tính thừa kế từ class Cam
		 */
		public String getThuoctinh()
		{
			return this.Thuoctinh;
		}
		/* (non-Javadoc)
		 * @see week4.task1.HoaQua#getMien()
		 * hàm lấy giá trị miền thừa kế từ class Cam
		 */
		public String getMien()
		{
			return this.Mien;
		}
		/* (non-Javadoc)
		 * @see week4.task1.Cam#Thongtin()
		 * hàm xuất ra thông tin thừa kế từ class Cam
		 */
		public void Thongtin()
		{
			super.Thongtin();
			System.out.println("Gia ban :"+this.Gia+" đồng/kg");
			System.out.println("so luong: "+this.So_luong+" kg");
			System.out.println("Tong so tien:"+(this.So_luong*this.Gia)+" đ");
		}
}
