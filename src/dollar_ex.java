package exchange;

public class dollar_ex {
	
	
	data d= new data();
	
	
	public void d_w(double money)
	{

	d.won_Exchange1 = money/d.dollar;
	d.won_Exchange2 = money/d.dollar;
	
	int i_won = (int) d.won_Exchange2;
	i_won = (int) d.won_Exchange2;

	
	d.remain = (d.won_Exchange1 - i_won);
	d.won_Exchange1 -= (d.won_Exchange1 - i_won);
	System.out.println("받는 달러는 : " + d.won_Exchange1 + "달러   남은 돈은  " + (int) (d.remain * d.dollar) + "원");

	System.out.println();
	System.out.println("-----------------------------------------------");
	System.out.println("환전할때 받는 달러");
	System.out.println();

	int money2 = (int) d.won_Exchange1;

	while (money2 >= 1) {

		if (money2 / 100 > 0) {

			System.out.println();
			System.out.println("100달러 " + (money2 / 100) + "장");
			money2 -= (money2 / 100) * 100;
			System.out.println("남은 돈 : " + money2 + "달러");
			System.out.println();

		} else if (money2 / 50 > 0) {
			System.out.println("50달러 " + (money2 / 50) + "장");
			money2 -= (money2 / 50) * 50;
			System.out.println("남은 돈 : " + money2 + "달러");
			System.out.println();

		} else if (money2 / 20 > 0) {
			System.out.println("20달러 " + (money2 / 20) + "장");
			money2 -= (money2 / 20) * 20;
			System.out.println("남은 돈 : " + money2 + "달러");
			System.out.println();

		} else if (money2 / 10 > 0) {
			System.out.println("10달러 " + (money2 / 10) + "장");
			money2 -= (money2 / 10) * 10;
			System.out.println("남은 돈 : " + money2 + "달러");
			System.out.println();

		} else if (money2 / 5 > 0) {
			System.out.println("5달러 " + (money2 / 5) + "장");
			money2 -= (money2 / 5) * 5;
			System.out.println("남은 돈 : " + money2 + "달러");
			System.out.println();

		} else if (money2 / 2 > 0) {
			System.out.println("2달러 " + (money2 / 2) + "장");
			System.out.println();

			money2 -= (money2 / 2) * 2;

		} else if (money2 == 1) {
			System.out.println("1달러 " + money2 + "장");
			money2--;

		}
		
		}

	}
}
