import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("☆★☆★☆★ブラックジャックへようこそ！☆★☆★☆★");
        System.out.println("ゲームを開始します");
        int myScore = 0, dealerScore = 0;
        int[] tramp = new int[52];
        for(int i=0; i<52; i++){
            tramp[i]=i;
        }
        for (int i=0; i < tramp.length; i++) {
            int rnd = (int)( Math.random() * (double)tramp.length );
            int w = tramp[i];
            tramp[i] = tramp[rnd];
            tramp[rnd] = w;
        }

        System.out.print("あなたの引いたカードは");
        if(0<=tramp[0] && tramp[0]<=12) System.out.println("ハートの" + (tramp[0]%13+1) + "です");
        else if(13<=tramp[0] && tramp[0]<=25) System.out.println("ダイヤの" + (tramp[0]%13+1) + "です");
        else if(26<=tramp[0] && tramp[0]<=38) System.out.println("スペードの" + (tramp[0]%13+1) + "です");
        else System.out.println("クラブの" + (tramp[0]%13+1) + "です");
        System.out.print("あなたの引いたカードは");
        if(0<=tramp[1] && tramp[1]<=12) System.out.println("ハートの" + (tramp[1]%13+1) + "です");
        else if(13<=tramp[1] && tramp[1]<=25) System.out.println("ダイヤの" + (tramp[1]%13+1) + "です");
        else if(26<=tramp[1] && tramp[1]<=38) System.out.println("スペードの" + (tramp[1]%13+1) + "です");
        else System.out.println("クラブの" + (tramp[1]%13+1) + "です");

        myScore += Math.min(tramp[0]%13+1,10) + Math.min(tramp[1]%13+1,10);

        System.out.print("ディーラーの引いたカードは");
        if(0<=tramp[2] && tramp[2]<=12) System.out.println("ハートの" + (tramp[2]%13+1) + "です");
        else if(13<=tramp[2] && tramp[2]<=25) System.out.println("ダイヤの" + (tramp[2]%13+1) + "です");
        else if(26<=tramp[2] && tramp[2]<=38) System.out.println("スペードの" + (tramp[2]%13+1) + "です");
        else System.out.println("クラブの" + (tramp[2]%13+1) + "です");
        System.out.println("ディーラーの2枚目のカードは分かりません");
        dealerScore += Math.min(tramp[2]%13+1,10) + Math.min(tramp[3]%13+1,10);

        int cardCur = 4;
        boolean burst = false;
        while(true){
            System.out.println("あなたの現在の得点は" + myScore + "です");
            System.out.print("カードを引きますか？引く場合はYを、引かない場合はNを入力してください > ");
            String yn = sc.nextLine();
            if(yn.equals("N")) break; 
            System.out.print("あなたの引いたカードは");
            if(0<=tramp[cardCur] && tramp[cardCur]<=12) System.out.println("ハートの" + (tramp[cardCur]%13+1) + "です");
            else if(13<=tramp[cardCur] && tramp[cardCur]<=25) System.out.println("ダイヤの" + (tramp[cardCur]%13+1) + "です");
            else if(26<=tramp[cardCur] && tramp[cardCur]<=38) System.out.println("スペードの" + (tramp[cardCur]%13+1) + "です");
            else System.out.println("クラブの" + (tramp[cardCur]%13+1) + "です");
            myScore += Math.min(tramp[cardCur]%13+1,10);
            cardCur++;
            if(myScore>21){
                burst = true;
                System.out.println("バースト！！ あなたの負けです：（");
                break;
            }
        }
        if(burst){
            System.out.println("ゲームを終了します");
            System.exit(0);
        }
        System.out.println("ディーラーの2枚目のカードは" + (tramp[3]%13+1) + "でした");

        while(true){
            System.out.println("ディーラーの現在の得点は" + dealerScore + "です");
            if(dealerScore>=17) break;
            System.out.print("ディーラーの引いたカードは");
            if(0<=tramp[cardCur] && tramp[cardCur]<=12) System.out.println("ハートの" + (tramp[cardCur]%13+1) + "です");
            else if(13<=tramp[cardCur] && tramp[cardCur]<=25) System.out.println("ダイヤの" + (tramp[cardCur]%13+1) + "です");
            else if(26<=tramp[cardCur] && tramp[cardCur]<=38) System.out.println("スペードの" + (tramp[cardCur]%13+1) + "です");
            else System.out.println("クラブの" + (tramp[cardCur]%13+1) + "です");
            dealerScore += Math.min(tramp[cardCur]%13+1,10);
            cardCur++;
        }
        System.out.println("あなたの得点は" + myScore + "です");
        System.out.println("ディーラーの得点は" + dealerScore + "です");
        if(dealerScore>21 || myScore>dealerScore) System.out.println("あなたの勝ちです！");
        else if(myScore<dealerScore) System.out.println("あなたの負けです！");
        else System.out.println("引き分けです");
    }
}