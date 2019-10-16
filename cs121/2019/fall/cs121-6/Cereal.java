/**
 * Represents a breakfast cereal.
 * 
 * name, calories, protein, fat, carbs
 * @author marissa
 *
 */
public class Cereal
{
	private String name;
	private int calories;
	private double protein;
	private double fat;
	private double carbs;
	
	public Cereal(String name, int calories, double protein, double fat, double carbs)
	{
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.fat = fat;
		this.carbs = carbs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}
	
	public String toString()
	{
		return String.format("%-30s %10d %10.1f %10.1f %10.1f", name, calories, protein, fat, carbs);

	}
}
