
public class ChangeMaker {
	CoinChanger penny = new CoinChanger(20, 1);
	CoinChanger nickel = new CoinChanger(75, 5);
	CoinChanger dime = new CoinChanger(50, 10);
	CoinChanger quarter = new CoinChanger(25, 25);

	public ChangeMaker(int penny, int nickel, int dime, int quarter) {
		this.penny = new CoinChanger(penny, 1);
		this.nickel = new CoinChanger(nickel, 5);
		this.dime = new CoinChanger(dime, 10);
		this.quarter = new CoinChanger(quarter, 25);
	}

	void makeChange(int numberOfCoins) {
		if (numberOfCoins > quarter.getCoinDenomination()) {

		}
	}

	int giveOneCoin(int amount) {
		if (amount > 24) {
			amount -= quarter.getCoinDenomination();
			quarter.dispenseCoin();
		} else if (amount > 9 && amount < 25) {
			amount -= dime.getCoinDenomination();
			dime.dispenseCoin();
		} else if (amount > 4 && amount < 10) {
			amount -= nickel.getCoinDenomination();
			nickel.dispenseCoin();
		} else if (amount > 0 && amount < 5) {
			amount -= penny.getCoinDenomination();
			penny.dispenseCoin();
		}
		return amount;
	}

	public static void main(String[] args) {
		ChangeMaker change = new ChangeMaker(20, 10, 17, 9);
		for (int i = 0; i < 10; i++) {
			System.out.println(change.giveOneCoin(67));
		}

	}
}
