package Assignment_8;

public class Question11_CountProfit {

	public static void main(String[] args) {

System.out.println(c_profit(15000,1500));
	}

	public static String c_profit (int buyPrice, int sellPrice) {
	
		
		String result="";
		
		if(sellPrice>buyPrice)
			result= "profit";
		if(sellPrice<buyPrice)
			result= "loss";
		if(sellPrice==buyPrice)
			result= "no loss";
		
		return result;
	}

}
