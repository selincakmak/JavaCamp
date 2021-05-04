package homework3.Entities;

public class Game {

	private int id;
	private String gameName;
	private double price;
	
    public Game() {
		
	}
	
	public Game(int id, String name, double price) {
		super();
		this.id = id;
		this.gameName = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return gameName;
	}
	public void setName(String name) {
		this.gameName = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
