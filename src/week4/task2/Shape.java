package week4.task2;

/**
 * @author Nguyễn Đức Hiếu
 * MSSV: 17020742
 */
public class Shape{
	String color = "red";
	boolean filled = true;
	
	/**
	 * hàm khởi tạo mặc định
	 */
	public Shape () {}
	/**
	 * hàm khởi tạo với tham số màu sắc, tính chất
	 * @param color màu sắc
	 * @param filled tính chất
	 */
	public Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	/**
	 * hàm trả về màu sắc
	 * @return màu sắc
	 */
	public String getColor() {
		return this.color;
	}
	/**
	 * hàm lấy giá trị màu sắc
	 * @param color màu sắc
	 */
	public void setColor(String color)
	{
		this.color = color;
	}
	/**
	 * hàm trả về tính chất
	 * @return tính chất
	 */
	public boolean isFilled() {
		return filled;
	}
	/**
	 * hàm lấy giá trị tính chất 
	 * @param filled tính chất (đặc hay rỗng)
	 */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	/* (non-Javadoc)
	 * hàm xuất thông tin đầy đủ ra màn hình
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		if(this.filled == true) return this.color+ " filled.";
		else return this.color+" not filled.";
	}
}
