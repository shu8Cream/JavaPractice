import java.util.*;
public class GunkanHit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] field = new int[30];

        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<30; i++){
            li.add(i);
        }

        Collections.shuffle(li);
        for(int i=0; i<3; i++){
            field[li.get(i)]++;
        }
        System.out.println("30マスのマップに軍艦を配置しました");
        System.out.println("ゲームスタート！！");
        int gekiha = 0;
        int turn = 0;
        while(true){
            turn++;
            System.out.println("軍艦の場所を予想しましょう");
            int n = sc.nextInt();
            if(field[n-1]==0) System.out.println("外れました");
            else{
                gekiha++;
                System.out.println("軍艦を沈めました！");
                if(gekiha==3) break;
                System.out.println("残り" + (3 - gekiha) + "隻");
            }
        }
        System.out.println("推測回数：" + turn);
    }
}