package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long durationSeconds = Instant.now().getEpochSecond();
		int a = (int)(durationSeconds % 2);
		
		switch(a) {
		case 0:
			System.out.println("偶数です。");
			break;
		
		case 1:
			System.out.println("奇数です。");
			break;
		}

	}

}
