
public interface Recycleable {

	final double ALUMINUMPRICE = 1.60;
	final double PLASTICPRICE = 0.58;
	final double GLASSPRICE = 0.10;
	
	public void reuse();
	
	public double recycle();

	public String getName();
	
	public String getMaterial();
	
	public double getWeight();
	
	
}
