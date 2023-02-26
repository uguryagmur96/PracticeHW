package uguryagmur;

public class Takim {
	
	private String name;
	private int score;
	private int wallet;
	
	
	public Takim() {
		
	}
	
	public Takim(String name, int score, int wallet) {
		super();
		this.name = name;
		this.score = score;
		this.wallet = wallet;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getWallet() {
		return wallet;
	}
	public void setVault(int wallet) {
		this.wallet = wallet;
	}
	public void financialRecords() {
		System.out.println(this.getName() + " Takımının bakiyesi: " + this.getWallet());
	}
	
	

}
