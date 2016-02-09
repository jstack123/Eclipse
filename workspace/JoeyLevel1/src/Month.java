import javax.swing.JOptionPane;

public class Month {
	public static void main(String[] args) {
		Month january = new Month("January", 31);
		Month february = new Month("February", 28);
		Month march = new Month("March", 31);
		Month april = new Month("April", 30);
		Month may = new Month("May", 31);
		Month june = new Month("June", 30);
		Month july = new Month("July", 31);
		Month august = new Month("August", 31);
		Month september = new Month("September", 30);
		Month october = new Month("October", 31);
		Month november = new Month("November", 30);
		Month december = new Month("December", 31);
		january.setNextMonth(february);
		february.setNextMonth(march);
		march.setNextMonth(april);
		april.setNextMonth(may);
		may.setNextMonth(june);
		june.setNextMonth(july);
		july.setNextMonth(august);
		august.setNextMonth(september);
		september.setNextMonth(october);
		october.setNextMonth(november);
		november.setNextMonth(december);
		december.setNextMonth(january);
		String monthChosen = JOptionPane.showInputDialog("Please type in your birthday month.");
		Month month = january;
		if (monthChosen.equals(january.getMonthName())) {
			month = january;
		}
		if (monthChosen.equals(february.getMonthName())) {
			month = february;
		}
		if (monthChosen.equals(march.getMonthName())) {
			month = march;
		}
		if (monthChosen.equals(april.getMonthName())) {
			month = april;
		}
		if (monthChosen.equals(may.getMonthName())) {
			month = may;
		}
		if (monthChosen.equals(june.getMonthName())) {
			month = june;
		}
		if (monthChosen.equals(july.getMonthName())) {
			month = july;
		}
		if (monthChosen.equals(august.getMonthName())) {
			month = august;
		}
		if (monthChosen.equals(september.getMonthName())) {
			month = september;
		}
		if (monthChosen.equals(october.getMonthName())) {
			month = october;
		}
		if (monthChosen.equals(november.getMonthName())) {
			month = november;
		}
		if (monthChosen.equals(december.getMonthName())) {
			month = december;
		}
		JOptionPane.showMessageDialog(null,
				"The month after your birthday month is " + month.getNextMonth().getMonthName() + " .");

	}

	String monthName;
	int numDay;
	Month nextMonth;

	public Month(String monthName, int numDay) {
		this.monthName = monthName;
		this.numDay = numDay;
	}

	public Month getNextMonth() {
		return nextMonth;
	}

	public void setNextMonth(Month nextMonth) {
		this.nextMonth = nextMonth;
	}

	public String getMonthName() {
		return monthName;
	}
}
