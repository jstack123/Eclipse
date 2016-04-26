
public class CoinChanger {
	int numberOfCoins;
	int coinDenomination;

	public CoinChanger(int numberOfCoins, int coinDenomination) {
		this.numberOfCoins = numberOfCoins;
		this.coinDenomination = coinDenomination;
	}

	int dispenseCoin() {
		if (numberOfCoins < 0) {
			System.out.println("I don't have enough coins to dispense another coin.");
		} else {
			numberOfCoins--;
			System.out.println("I am now dispensing a " + coinDenomination);
		}
		return coinDenomination;
	}

	void addCoins(int numberOfCoins) {
		this.numberOfCoins += numberOfCoins;
	}

	void addDollar(int numberOfDollars) {
		this.numberOfCoins += 100 / coinDenomination * numberOfDollars;

	}

	void printCoins() {
		System.out.println("You have a number of " + numberOfCoins + " coins.");
	}

	int getCoinDenomination() {
		return this.coinDenomination;
	}

	public static void main(String[] args) {
		CoinChanger coinChanger = new CoinChanger(1, 5);
		coinChanger.dispenseCoin();
		coinChanger.addCoins(10);
		coinChanger.addDollar(2);
		coinChanger.printCoins();
	}
}
