package di.constructor02;

public class Player implements PlayerItfc{
	DiceItfc d;
	int totalValue=0;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(DiceItfc d) {
		super();
		this.d = d;
	}
	@Override
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	@Override
	public int getTotalValue(){
		return totalValue;
	}
	public DiceItfc getD() {
		return d;
	}
	public void setD(DiceItfc d) {
		this.d = d;
	}
}