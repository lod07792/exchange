package exchange;

public class remain {
	
	
	public void cal_remain(int won_remain)
	{
		while (won_remain >= 10) {
		if (won_remain > 1000) {
			System.out.println("1000원짜리 " + won_remain / 1000 + "장");
			won_remain -= (won_remain / 1000) * 1000;
			System.out.println("남은 돈 : " + won_remain + "원");
			System.out.println();

		} else if (won_remain > 500) {
			System.out.println("500원 짜리 " + won_remain / 500 + "개");
			won_remain -= (won_remain / 500) * 500;
			System.out.println("남은 돈 : " + won_remain + "원");
			System.out.println();

		} else if (won_remain > 100) {
			System.out.println("100원 짜리 " + won_remain / 100 + "개");
			won_remain -= (won_remain / 100) * 100;
			System.out.println("남은 돈 : " + won_remain + "원");
			System.out.println();
		} else if (won_remain > 50) {
			System.out.println("50원 짜리 " + won_remain / 50 + "개");
			won_remain -= (won_remain / 50) * 50;
			System.out.println("남은 돈 : " + won_remain + "원");
			System.out.println();
		} else if (won_remain >= 10) {
			System.out.println("10원 짜리 " + won_remain / 10 + "개");
			won_remain -= (won_remain / 10) * 10;
			System.out.println("남은 돈 : " + won_remain + "원");
			System.out.println();
		}
	}
		if(won_remain>0)
		System.out.println("1원 짜리 " + won_remain + "개");
		
		
	}
	
	

}
