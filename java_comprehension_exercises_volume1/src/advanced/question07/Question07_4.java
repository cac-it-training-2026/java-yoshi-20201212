package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int sum = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数＞");
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);

		}
		System.out.println("\n各商品の小計");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] * amounts[i] + "円");
			sum += prices[i] * amounts[i];
		}
		if (sum >= 5000) {
			System.out.println("割引前合計：" + sum + "円");
			System.out.println("割引適用（10%OFF）：" + (int) (sum * 0.9) + "円");
			System.out.println("税込み合計" + (int) (sum * 0.9 * 1.1) + "円");
		} else {
			System.out.println("税込み合計" + (int) (sum * 1.1) + "円");
		}
	}

}
