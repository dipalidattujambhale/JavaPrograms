package junit;

public class Apple {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public boolean chackColor() {
		if(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green"))
			return true;
		else
			return false;
	}
}
