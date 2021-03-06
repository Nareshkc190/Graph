package graphPoint;



/*
 * Naresh Kc
 */



public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void shift(){
		++this.x;
		++this.y;
		
	}
	
	public String quadrant(){
		String quadrantNum = "";
		if(x>0 && y >0)
			quadrantNum = "First Quadrant";
		else if(x<0 && y>0)
			quadrantNum = "Second Quadrant";
		else if(x<0 && y <0)
			quadrantNum = "Third Quadrant";
		else
			quadrantNum = "Fourth Quadrant";
		return quadrantNum;
	}
	
	public double distance(Point point){
		double difX = Math.pow((this.x - point.x) , 2);
		double difY = Math.pow((this.y - point.y) , 2);
		return Math.sqrt(difX+difY);
	}
		
	
	public String toString(){
		return ("(" + this.x + ","  + this.y + ")");
	}
		
	


}






