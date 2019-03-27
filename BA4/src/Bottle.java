
public class Bottle implements Recycleable {

	private String name;
	private String material;
	private double weight;
	
	public Bottle() {
		this("item", "brand", 1.0);
	}
	
	public Bottle(String name, String material, double weight) {
		this.name = name;
		this.material = material;
		this.weight = weight;
	}
	@Override
	public void reuse() {
		System.out.println("Please reuse this bottle! it would make a cute vase :-)");
		
	}

	@Override
	public double recycle() {
		if(material.toLowerCase().equals("aluminum")) {
			return weight * ALUMINUMPRICE;
		}
		if(material.toLowerCase().equals("plastic")) {
			return weight * PLASTICPRICE;
		}
		if(material.toLowerCase().equals("glass")) {
			return weight * GLASSPRICE;
		}
		else {
			return 0.0;
		}
		
	}

	public String getName() {
		return name;
	}

	public String getMaterial() {
		return material;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
