package week4.task1;

public class Cam extends HoaQua{
	protected String Ten;
	protected String Ngay_nhap;
	/**
	 * hàm khởi tạo mặc định
	 */
	public Cam() {}
	/**
	 * hàm lây giá trị tên 
	 * @param Ten Tên 
	 */
	public void setTen(String Ten)
	{
		this.Ten = Ten;
	}
	
	/**
	 * hàm trả về tên 
	 * @return tên 
	 */
	public String getTen()
	{
		return this.Ten;
	}
	/**
	 * hàm lấy giá trị ngày
	 * @param Ngay ngày 
	 */
	public void setNgaynhap(String Ngay)
	{
		this.Ngay_nhap = Ngay;
	}
	/**
	 * hàm trả về giá trị ngày nhập 
	 * @return ngày nhập
	 */
	public String getNgaynhap()
	{
		return this.Ngay_nhap;
	}
	/* (non-Javadoc)
	 * @see week4.task1.HoaQua#Thongtin()
	 * hàm xuất thông tin ra màn hình
	 */
	public void Thongtin()
	{
		super.Thongtin();
		System.out.println("Ten loai qua: "+ this.Ten);
		System.out.println("Ngày nhập:"+this.Ngay_nhap);
	}
}
