package programs;

public class WallArea {
	
	
	double width;
	double height;
	
	public WallArea() {
		
	}
	
	public WallArea(double width, double height) {
		
		this.setWidth(width);
		this.setHeight(height);
	}
	
	
	public double getWidth() {
		return this.width;
	}
	
	
	public double getHeight() {
		return this.height;
	}
	
	
	public void setWidth(double width) {
		if(width < 0) {
			this.width = 0;
		}else {
			this.width = width;
		}
	}
	
	
	public void setHeight(double height) {
		if(height < 0) {
			this.height = 0;
		}else {
			this.height = height;
		}
		
	}
	
	
	
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	


	public static void main(String[] args) {
		
		
		WallArea wa = new WallArea(5,4);
		System.out.println("area= " + wa.getArea());
		
		wa.setHeight(-1.5);
		System.out.println("height= " + wa.getHeight());
		
		System.out.println("area= " + wa.getArea());
		
		

	}

}
