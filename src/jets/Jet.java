package jets;

public class Jet 
{
	private String model;
	private float speed;
	private float range;
	private float price;
	
	public Jet(String model, float speed, float range, float price)
	{
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

//	private void convertToMach(float speed)
//	{
//		float mach = speed / 761.2F;
//		
//		System.out.printf("%1$.2f %n", mach);
//	}
	
	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public float getSpeed() 
	{
		return speed;
	}

	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}

	public float getRange() 
	{
		return range;
	}

	public void setRange(float range) 
	{
		this.range = range;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price;
	}
	
}
