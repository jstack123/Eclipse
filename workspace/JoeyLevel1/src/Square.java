
public class Square {
	public static void main(String[] args) {

	}

	public int square(int n) {
		return n * n;
	}

	public String getShape(int nSides) {

		if (nSides == 4) {
			return "square";
		}
		return "";
	}

	public void write(int area,String shape) {
	System.out.println("Your" + shape + "has an area of" + area);																												)
 }
}
