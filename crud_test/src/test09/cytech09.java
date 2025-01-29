package test09;

public class cytech09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] scores = {
				{ 80, 70, 65, 90},
				{ 60, 75, 95, 50},
				{ 70, 77, 55, 70},
				{ 50, 90, 85, 100},
				{ 40, 30, 95, 60}
				};
		
		String[] subjects = { "国語", "数学", "理科", "社会"};
		
		for (int i = 0; i < scores.length; i++) {
            System.out.println("学生 " + (i + 1) + " の点数:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(subjects[j] + ": " + scores[i][j]);
            }
            System.out.println(); 
        }
		
		

	}

}
