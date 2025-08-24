package assignment_4;

public class AirIndia implements Airfare{
	private int hours;
	private double costPerHour;
	
	 public AirIndia(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    public int getHours() { return hours; }
	    public void setHours(int hours) { this.hours = hours; }

	    public double getCostPerHour() { return costPerHour; }
	    public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

	    @Override
	    public double calculate() {
	        return hours * costPerHour;
	    }

	    @Override
	    public void display() {
	        System.out.printf("%.2f%n", calculate());
	    }
	

}