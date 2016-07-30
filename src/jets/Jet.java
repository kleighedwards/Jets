package jets;

public class Jet 
{
	private String model;
	private float speed;
	private float mach;
	private float range;
	private float price;
	
	public Jet(String model, float speed, float range, float price)
	{
		this.model = model;
		this.range = range;
		this.price = price;
		this.mach = speed / 761.2F;
		this.speed = this.mach;
	}

//	public void convertToMach(float speed)
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
		this.speed = this.mach;
		return speed;
	}

	public void setSpeed(float speed) 
	{
		this.mach = speed / 761.2F;
		this.mach = speed;
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
		return "Model: " + model + ", Speed: " + mach + ", Range: " + range + ", Price: " + price;
	}
	
}
