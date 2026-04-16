package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//		配列作成　itemNames[5]、prices[5]
		String[] itemNames;
		itemNames = new String[5];
		int[] prices;
		prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください：＞");
			itemNames[i] = reader.readLine();
		}

		System.out.println("\n各商品の単価を入力してください");
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価：＞");
			String str = reader.readLine();
			prices[i] = Integer.parseInt(str);

		}
		System.out.println("\n登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] + "円");
		}
	}

}
