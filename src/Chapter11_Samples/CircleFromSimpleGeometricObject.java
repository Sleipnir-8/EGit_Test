public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
	//extends SimpleGeometricObject
	private double radius;
	
	public CircleFromSimpleGeometricObject() {
	}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this. radius = radius;
	}
	
	public CircleFromSimpleGeometricObject
	(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Return area */
	public double getArea() {
	return radius * radius * Math . PI;
	}
	
	/** Return diameter */
	public double getDiameter() {
	return 2 * radius;
	}
	
	/**return pertimeter */
	public double getPerimeter() {
	return 2 * radius * Math . PI;
	}
	
	/** Print the circle info */
    public void printCirclef () {
    System.out.println("The circle is created " + getDateCreated()
    +"and the radius is "+ radius);
    }
}
