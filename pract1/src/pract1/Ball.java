package pract1;

public class Ball {
	
	private double X;
	private double Y;
	private double R;
	
	Ball()
	{
		this.X=0;
		this.Y=0;
		this.R=0;
	}
	
	Ball(double X, double Y, double R)
	{
		this.X=X;
		this.Y=Y;
		this.R=R;
	}
	
	public void setX(double X) {
		this.X=X;
	}
	
	public void setY(double Y) {
		this.Y=Y;
	}
	
	public void setR(double R) {
		this.R=R;
	}
	
	public double getX() {
		return this.X;
	}
	
	public double getY() {
		return this.Y;
	}
	
	public double getR() {
		return this.R;
	}
	
	public double Volume() {
		return this.R*this.R*this.R*3.14*4/3;
	}
	
	@Override
	public String toString()
	{
		return "Center("+this.X+", "+this.Y+"), Radius - "+this.R;
	}

}
