package week4.task1;

public class HoaQua{
	protected String Thuoctinh;
	protected String Mien;
	
	/**
	 * hàm khởi tạo hoa quả 
	 */
	public HoaQua() {}
	/**
	 * hàm lấy giá trị thuộc tính
	 * @param Thuoctinh thuộc tính
	 */
	public void setThuoctinh(String Thuoctinh)
	{
		this.Thuoctinh = Thuoctinh;
	}
	/**
	 * hàm lấy giá trị miền 
	 * @param Mien miền
	 */
	public void setMien(String Mien)
	{
		this.Mien = Mien;
	}
	/**
	 * hàm trả về giá trị thuộc tính
	 * @return thuộc tính
	 */
	public String getThuoctinh()
	{
		return this.Thuoctinh;
	}
	/**
	 * hàm trả về giá trị miền
	 * @return miền 
	 */
	public String getMien()
	{
		return this.Mien;
	}
	/**
	 * hàm xuất thông tin ra màn hình
	 */
	public void Thongtin()
	{
		System.out.println("Thuoc tinh cua hoa qua: "+ this.Thuoctinh);
		System.out.println("Hoa qua thuoc mien: "+ this.Mien);
	}
}
