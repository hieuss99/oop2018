package week4.task2;

/**
 * @author Nguyễn Đức Hiêu  
 * MSSV: 17020742
 * @since Shape
 */
public class Rectangle extends Shape{
	double 	width = 1.0;
	double lenghth = 1.0;
	/**
	 * hàm khởi tạo mặc định
	 */
	public Rectangle() {};
	/**
	 * hàm khởi tạo với tham số truyền vào là chiều dài và chiều rộng 
	 * @param width chiều rộng
	 * @param length chiều dài 
	 */
	public Rectangle(double width,double length) 
	{
		this.width = width;
		this.lenghth = length;
	};
	/**
	 * hàm khởi tạo với tham số truyền vào là chiều dài, chiều rộng, màu sắc, tính chất
	 * @param width chiều rộng 
	 * @param length chiều dài 
	 * @param color màu sắc
	 * @param filled tính chất
	 */
	public Rectangle(double width,double length, String color, boolean filled) 
	{
		this.width = width;
		this.lenghth = length;
		this.color = color;
		this.filled = filled;
	};
	/**
	 * hàm trả về giá trị chiều rộng 
	 * @return chiều rộng
	 */
	public double getWidth() {
		return this.width;
	}
	/**
	 * hàm lấy giá trị chiều rộng 
	 * @param giá trị chiều rộng 
	 */
	public void setWith(double Width)
	{
		this.width = Width;
	}
	
	/**
	 * hàm trả về chiều dài 
	 * @return chiều dài
	 */
	public double getLength() {
		return this.lenghth;
	}
	
	/**
	 * hàm lấy giá trị chiều dài 
	 * @param length giá trị chiều dài 
	 */
	public void setLength(double length)
	{
		this.lenghth = length;
	}
	/**
	 * hàm trả về diện tích 
	 * @return diện tích 
	 */
	public double getArea()
	{
		return this.lenghth * this.width;
	}
	
	/**
	 * hàm trả về chu vi
	 * @return chu vi 
	 */
	public double getPerimeter() {
		return 2*(this.width+this.lenghth);
	}
	/* (non-Javadoc)
	 * @see week4.task2.Shape#toString()
	 * hàm in ra màn hình thông tin đầy đủ 
	 */
	public String toString()
	{
		return super.toString()+" "+this.getWidth()+" "+this.getLength()+" "+this.getArea()+" "+this.getPerimeter();
	}
}
