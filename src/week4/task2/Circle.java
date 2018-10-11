package week4.task2;

/**
 * @author Nguyễn Đức Hải
 * MSSV: 17020715
 * @since Shape
 */
public class Circle extends Shape{
	double radius = 1.0;
	double PI = 3.14;
	/**
	 * hàm khởi tạo mặc định
	 */
	public Circle() {}
	/**
	 * hàm khởi tạo với tham số bán kính
	 * @param radius bán kính
	 */
	public Circle( double radius)
	{
		this.radius = radius;
	}
	/**
	 * hàm khởi tạo với tham số màu sắc, tính chất, bán kính
	 * @param color màu sắc
	 * @param filled tính chất
	 * @param radius bán kính
	 */
	public Circle(String color, boolean filled, double radius)
	{
		this.color = color;
		this.filled = filled;
		this.radius = radius;
	}
	/**
	 * hàm trả về giá trị bán kính 
	 * @return bán kính
	 */
	public double getRadius()
	{
		return this.radius;
	}
	/** 
	 * hàm lấy giá trị bán kính
	 * @param radius bán kính
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	/**
	 * hàm lấy giá trị diện tích 
	 * @return diện tích  	
	 */
	public double getArea()
	{
		return this.radius*this.PI;
	}
	/**
	 * lấy giá trị chu vi
	 * @return chu vi 
	 */
	public double getPerimeter() {
		return this.radius*2*this.PI;
	}
	/* (non-Javadoc)
	 * @see week4.task2.Shape#toString()
	 * hàm xuất ra thông tin đầy đủ theo chuỗi 
	 */
	public String toString()
	{
		return super.toString()+" "+this.radius+" "+this.getArea()+" "+this.getPerimeter();
	}
}
