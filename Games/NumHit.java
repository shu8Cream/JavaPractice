import java.util.*;
public class NumHit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            // ランダムで正解を決める
            Random r = new Random();
            int ans = r.nextInt(101);
            while(true){
                System.out.println("数を予想しましょう");
                int n = sc.nextInt();
                if(n>ans) System.out.println("大きすぎます");
                else if(n<ans) System.out.println("小さすぎます");
                else{
                    System.out.println("あたり！おめでとう");
                    System.out.println("もう一度やるなら1を入力、終了するなら0を入力");
                    break;
                }
            }
            int cmd = sc.nextInt();
            if(cmd==1) continue;
            if(cmd==0) break;
        }
    }
}