package Assignment_14_OOP;

public class Value {

	int val;
	int valLast;

	public Value() {

	}

	int counter = 0;

	public Value(int val) {
		this.val = val;
		counter++;
	}

	int count = 0;

	public void setVal(int valLast) {
		this.valLast = valLast;
		count++;

	}

	public boolean wasModified() {
		if (count > 0) {
			return true;
		}

		return false;

	}

	public int getVal() {
		if (count > 0) {
			return valLast;
		} else if (counter > 0) {
			return val;
		} else
			return 0;
	}

	public static void main(String[] args) {

		Value vl = new Value(3);

		System.out.println(vl.count);
		System.out.println(vl.counter);
		System.out.println(vl.wasModified());
		System.out.println(vl.valLast);
		System.out.println(vl.getVal());

	}

}
