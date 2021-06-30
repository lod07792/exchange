package exchange;

public class euro_ex {

	data d = new data();
	
	public void e_w(double money)
	{
		d.won_Exchange1 = money/d.euro;
		d.won_Exchange2 = money/d.euro;
		
		int i_won = (int) d.won_Exchange2;
		i_won = (int) d.won_Exchange2;

		
		d.remain = (d.won_Exchange1 - i_won);
		d.won_Exchange1 -= (d.won_Exchange1 - i_won);
		System.out.println("받는 유로는 : " + d.won_Exchange1 + "유로   남은 돈은  " + (int) (d.remain * d.euro) + "원");
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		System.out.println();
		System.out.println("환전할때 받는 유로");
		System.out.println();

		int money2 = (int) d.won_Exchange1;

		while (money2 >= 1) {

			if (money2 / 200 > 0) {

				System.out.println();
				System.out.println("200유로 " + (money2 / 200) + "장");
				money2 -= (money2 / 200) * 200;
				System.out.println("남은 돈 : " + money2 + "유로");
				System.out.println();

			} else if (money2 / 100 > 0) {
				System.out.println("100유로 " + (money2 / 100) + "장");
				money2 -= (money2 / 100) * 100;
				System.out.println("남은 돈 : " + money2 + "유로");
				System.out.println();

			} else if (money2 / 50 > 0) {
				System.out.println("50유로 " + (money2 / 50) + "장");
				money2 -= (money2 / 50) * 50;
				System.out.println("남은 돈 : " + money2 + "유로");
				System.out.println();

			} else if (money2 / 20 > 0) {
				System.out.println("20유로 " + (money2 / 20) + "장");
				money2 -= (money2 / 20) * 20;
				System.out.println("남은 돈 : " + money2 + "유로");
				System.out.println();

			} else if (money2 / 10 > 0) {
				System.out.println("10유로 " + (money2 / 10) + "장");
				money2 -= (money2 / 10) * 10;
				System.out.println("남은 돈 : " + money2 + "유로");
				System.out.println();

			} else if (money2 / 5 > 0) {
				System.out.println("5유로 " + (money2 / 5) + "장");
				System.out.println();

				money2 -= (money2 / 2) * 2;

			} else if (money2 <5) {
				
				System.out.println("나머지" +money2+"유로");
				money2=0;

			}

		}
		
	}
}
