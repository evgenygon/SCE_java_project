package Package_Mobility;

import java.awt.Point;

public abstract class Mobile implements ILocatable {
	private Point location;
	private double totalDistance; // < 0
	
	protected Mobile(int point_x,int point_y) {
		this.location = new Point(point_x,point_y);

	}
	public void addTotalDistance(double new_distance) {
		this.totalDistance = this.totalDistance + new_distance;
	}
	public double calcDistance(Point p) { // Distance bewtween object to the point
		 double dx = this.location.getX() - p.getX();
		 double dy = this.location.getY() - p.getY();
		 return Math.sqrt(dx * dx + dy * dy);
	}
	public double move(Point p) { // distance traveled (0 if non)
		double calcDistance = calcDistance(p);
		if (!(calcDistance == 0)) {
			setLocation(p);
		}
		return calcDistance;
		
	}
	public Point getLocation() {
		return this.location;
	}
	public boolean setLocation(Point change_point_location) {
		boolean changed_location = false;
		if(this.location instanceof Point) {
			this.location.x = change_point_location.x;
			this.location.y = change_point_location.y;
			changed_location = true;
			this.totalDistance = 0;
		}
		return changed_location;
	}
	private double get_location_x() {return this.location.getX();};
	private double get_location_y() {return this.location.getY();};
	
	public String toString() {
		return "location" + " x: " + this.get_location_x() + " y: " + this.get_location_y();};
}
