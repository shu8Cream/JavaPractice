public class BowlingScore {
    /*
      このメソッドを完成させて、
      ボウリングゲームのスコアを正しく計算できるプログラムにしてください
    */
    static int playGame(int[] rolls) {
        int res = 0;
        int len = rolls.length;
        int games = 1, cur = 0;
        while(games!=10){
            if(rolls[cur] + rolls[cur+1]<10){
                res += rolls[cur] + rolls[cur+1];
                cur+=2;
            }else if(rolls[cur]==10){
                res += 10 + rolls[cur+1]+rolls[cur+2];
                cur++;
            }else{
                res += 10 + rolls[cur+2];
                cur+=2;
            }
            games++;
        }
        if(rolls[cur]==10) res+=10+rolls[cur+1]+rolls[cur+2];
        else if(rolls[cur]+rolls[cur+1]==10) res+=10+rolls[cur+2];
        else res+=rolls[cur]+rolls[cur+1];
        return res;
    }

    /*
      "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0"という文字列を
      {0, 0, 0 ... }という整数型配列に変換して返します
    */
    static int[] convertInputToRolls(String input) {
        String[] rollStrings = input.split(" ");
        int[] rolls = new int[rollStrings.length];

        for (int i = 0; i < rollStrings.length; i++) {
            rolls[i] = Integer.parseInt(rollStrings[i]);
        }

        return rolls;
    }

    public static void main(String[] args) {
        System.out.print("倒したピンの数をスペース区切りで入力してください > ");
        String input = new java.util.Scanner(System.in).nextLine();
        int[] rolls = convertInputToRolls(input);

        int score = playGame(rolls);

        System.out.println("あなたのスコアは" + score + "です");
    }
}
