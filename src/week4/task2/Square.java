package week4.task2;

/**
 * @author Nguyễn Đức Hiếu	
 * MSSV: 17020742
 * @since Rectangle
 */
public class Square extends Rectangle{
	/**
	 * hàm khởi tạo mặc định 
	 */
	public Square() {};
	
	/**
	 * hàm khởi tạo với tham số side
	 * @param side cạnh
	 */
	public Square(double side)
	{
		this.lenghth = this.width = side;
	};
	/**
	 * hàm khởi tạo có tham số diện tích, màu , tính chất
	 * @param side diện tích
	 * @param color màu sắc
	 * @param filled tính chất thế hiện hình rỗng hay đặc 
	 */
	public Square(double side, String color, boolean filled)
	{
		this.lenghth = this.width = Math.sqrt(side);
		this.color = color;
		this.filled = filled;
	};
	/**
	 * hàm trả về giá trị các cạnh
	 * @return cạnh 
	 */
	public double getSide()
	{
		return this.width;
	}
	/**
	 * hàm lấy giá trị cạnh
	 * @param side cạnh
	 */
	public void setSide(double side) {		
		this.setWith(side);
		this.setLength(side);
	}
	/**
	 * hàm lây giá trị cho chiều rộng (cạnh hình vuông)
	 * @param side diện tích
	 */
	public void setWith(double side)
	{
		this.width = side ;
	}
	/**
	 * hàm lấy giá trị cho chiều dài (cạnh hình vuông)
	 * @param side diện tích 
	 */
	public void setLength(double side)
	{
		this.lenghth = side ;
	}
}
