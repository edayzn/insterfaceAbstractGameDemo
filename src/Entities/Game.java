package Entities;

public class Game {
	private int id;
	private String gameName;
	private double price;
   
	
	private Campaign campaign;
	
	public Game(Campaign campaign) {
		this.campaign = campaign;
	}


	public Game() {
		super();
	}
	

	public Game(int id, String gameName, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public double getUnitPriceAfterDiscount() {
		return this.price - (this.price * (this.campaign.getDiscount()) / 100);
	}

	public void setPrice(double price) {
		this.price = price;
	}


	

	
}
