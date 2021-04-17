package Assignment_14_OOP;

class Db {

	private String data;
	private int yint;

	public void insertData(String data, int yint) {

		this.data = data;
		this.yint = yint;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getYint() {
		return yint;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}

	public static void main(String[] args) {

		Db db = new Db();
		db.insertData("aaa", 123);
		System.out.println(db.getData());
		System.out.println(db.getYint());

	}

}
