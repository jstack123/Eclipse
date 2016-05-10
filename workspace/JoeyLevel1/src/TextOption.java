
public class TextOption {
	private String option1;
	private String option2;
	private String option3;
	private String type;

	public TextOption(String option1, String option2, String option3, String type) {
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.type = type;
	}

	String getOption1() {
		return option1;
	}

	String getOption2() {
		return option2;
	}

	String getOption3() {
		return option3;
	}

	String getType() {
		return type;
	}
}
