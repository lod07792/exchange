package exchange;

import java.util.Scanner;

public class exchange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

		data d = new data();
		dollar_ex ex1 = new dollar_ex();
		euro_ex ex2 = new euro_ex();
		yen_ex ex3= new yen_ex();
		
		while(true)
		{
			
			System.out.println();
			System.out.println("ȯ���� ȭ�� ���� : 1.�޷� 2.���� 3.��ȭ 4.����");
			int select = s.nextInt();
			
			if(select ==4)
				break;
			
			System.out.println("ȯ���� �ݾ� : ");
			double money = s.nextDouble();
			
			
		if(select ==1)
		{
			ex1.d_w(money);
			System.out.println("------------------------------------------------");
 		}
		else if(select ==2)
		{
			
			ex2.e_w(money);
			System.out.println("-----------------------------------------------");
			
		}
		else if(select ==3)
		{
			ex3.y_w(money);
			System.out.println("-----------------------------------------------");
		}
	
		// ȯ���ϰ� ���� ��
		System.out.println();
		System.out.println();
		System.out.println("ȯ���ϰ� ���� ��ȭ �Ž�����");
		System.out.println();
			
		remain re = new remain();
		
		if (select == 1)
		{	
			ex1.d.won_remain = (int)(ex1.d.remain * d.dollar);
			re.cal_remain(ex1.d.won_remain);
		
		}
		else if(select == 2) 
		{
			ex2.d.won_remain = (int)(ex2.d.remain * d.euro);
			re.cal_remain(ex2.d.won_remain);
		}
		else
		{	ex3.d.won_remain = (int)(ex3.d.remain * d.yen);
			re.cal_remain(ex3.d.won_remain);
		
		}
	
		}
		
	}
}

