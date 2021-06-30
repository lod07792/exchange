package exchange;

public class yen_ex {
	
	data d = new data();
	
	public void y_w(double money)
	{
		d.won_Exchange1 = money/d.yen;
		d.won_Exchange2 = money/d.yen;
		
		int i_won = (int) d.won_Exchange2;
		i_won = (int) d.won_Exchange2;

		
		d.remain = (d.won_Exchange1 - i_won);
		d.won_Exchange1 -= (d.won_Exchange1 - i_won);
		System.out.println("받는 엔은 : " + d.won_Exchange1 + "엔   남은 돈은  " + (int) (d.remain * d.yen) + "원");
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("환전할때 받는 엔");
		System.out.println();

		int money2 = (int) d.won_Exchange1;

		while (money2 >= 1) {

			if (money2 / 10000 > 0) {

				System.out.println();
				System.out.println("10000엔 " + (money2 / 10000) + "장");
				money2 -= (money2 / 10000) * 10000;
				System.out.println("남은 돈 : " + money2 + "엔");
				System.out.println();

			} else if (money2 / 5000 > 0) {
				System.out.println("5000엔 " + (money2 / 5000) + "장");
				money2 -= (money2 / 5000) * 5000;
				System.out.println("남은 돈 : " + money2 + "엔");
				System.out.println();

			} else if (money2 / 2000 > 0) {
				System.out.println("2000엔 " + (money2 / 2000) + "장");
				money2 -= (money2 / 2000) * 2000;
				System.out.println("남은 돈 : " + money2 + "엔");
				System.out.println();

			} else if (money2 / 1000 > 0) {
				System.out.println("1000엔 " + (money2 / 1000) + "장");
				money2 -= (money2 / 1000) * 1000;
				System.out.println("남은 돈 : " + money2 + "엔");
				System.out.println();

			} else if (money2 / 500 > 0) {
				System.out.println("500엔 " + (money2 / 500) + "장");
				money2 -= (money2 / 10) * 10;
				System.out.println("남은 돈 : " + money2 + "엔");
				System.out.println();

			} else if (money2 / 100 > 0) {
				System.out.println("100엔 " + (money2 / 100) + "장");
				System.out.println();

				money2 -= (money2 / 100) * 100;

			} else if (money2 <100) {
				
				System.out.println("나머지" +money2+"엔");
				money2=0;

			}
			
		}
		
	}

}
