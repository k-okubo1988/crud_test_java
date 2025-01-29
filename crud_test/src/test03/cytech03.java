package test03;

import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long durationSeconds = Instant.now().getEpochSecond();
		
		System.out.println(durationSeconds);
		if(durationSeconds % 2 == 0) {
			System.out.println("偶数です。");
		} else {
			System.out.println("奇数です。");
		}

	}

}
