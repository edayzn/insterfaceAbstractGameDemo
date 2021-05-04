package Entities;

public class Campaign {
	private int id;
	private String campaignNamae;
	private double discount;

	public Campaign() {
		super();
	}

	public Campaign(int id, String campaignNamae, double discount) {
		super();
		this.id = id;
		this.campaignNamae = campaignNamae;
		this.discount=discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignNamae() {
		return campaignNamae;
	}

	public void setCampaignNamae(String campaignNamae) {
		this.campaignNamae = campaignNamae;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
