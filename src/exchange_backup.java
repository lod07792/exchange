package exchange;


import java.util.Scanner;

public class exchange_backup {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double dollar = 1136.80;
		double euro = 1349.41;
		double yen = 10.26;
		double won_Exchange1;
		double won_Exchange2;
		double remain=0;
		int won_remain;
	
		
		while(true)
		{
			
			System.out.println();
			System.out.println("환전할 화폐를 선택 : 1.달러 2.유로 3.엔화 4.종료");
			int select = s.nextInt();
			
		
			if(select ==4)
				break;
			
				
			System.out.println("환전할 금액 : ");
			double money = s.nextDouble();
			
		

		if(select ==1)
		{
			won_Exchange1 = money/dollar;
			won_Exchange2 = money/dollar;
			
			int i_won = (int) won_Exchange2;
			i_won = (int) won_Exchange2;

			
			remain = (won_Exchange1 - i_won);
			won_Exchange1 -= (won_Exchange1 - i_won);
			System.out.println("받는 달러는 : " + won_Exchange1 + "달러   남은 돈은  " + (int) (remain * dollar) + "원");
		
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("환전할때 받는 달러");
			System.out.println();

			int money2 = (int) won_Exchange1;

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

			System.out.println("------------------------------------------------");
 		}
		else if(select ==2)
		{
			won_Exchange1 = money/euro;
			won_Exchange2 = money/euro;
			
			int i_won = (int) won_Exchange2;
			i_won = (int) won_Exchange2;

			
			remain = (won_Exchange1 - i_won);
			won_Exchange1 -= (won_Exchange1 - i_won);
			System.out.println("받는 유로는 : " + won_Exchange1 + "유로   남은 돈은  " + (int) (remain * euro) + "원");
			System.out.println();
			System.out.println("-----------------------------------------------");
			
			System.out.println();
			System.out.println("환전할때 받는 유로");
			System.out.println();

			int money2 = (int) won_Exchange1;

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

			System.out.println("-----------------------------------------------");
			
		}
		else if(select ==3)
		{
			won_Exchange1 = money/yen;
			won_Exchange2 = money/yen;
			
			int i_won = (int) won_Exchange2;
			i_won = (int) won_Exchange2;

			
			remain = (won_Exchange1 - i_won);
			won_Exchange1 -= (won_Exchange1 - i_won);
			System.out.println("받는 엔은 : " + won_Exchange1 + "엔   남은 돈은  " + (int) (remain * yen) + "원");
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println();
			System.out.println("환전할때 받는 엔");
			System.out.println();

			int money2 = (int) won_Exchange1;

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

			System.out.println("-----------------------------------------------");
		}
		
	
		
		// 환전하고 남은 돈
		System.out.println();
		System.out.println();
		System.out.println("환전하고 남은 원화 거스름돈");
		System.out.println();
		
		
		
		
		if (select == 1)
			won_remain = (int) (remain * dollar);
		else if(select == 2) 
			won_remain = (int)(remain * euro);
		else
			won_remain = (int)(remain * yen);
		
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
}


