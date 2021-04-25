import java.util.*;
public class Numer0n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            ArrayList<Integer> li = new ArrayList<>();
            for(int i=0; i<10; i++){
                li.add(i);
            }
            Collections.shuffle(li);
            String tar = "";
            tar+=String.valueOf(li.get(0));
            tar+=String.valueOf(li.get(1));
            tar+=String.valueOf(li.get(2));
            int turn = 0;
            System.out.println("番号をセットしました");
            while(true){
                turn++;
                System.out.print("3桁の数字を入力してください: ");
                String n = sc.nextLine();
                int eat = 0, bite = 0;
                int[] cnt = new int[10];
                if(n.charAt(0)==tar.charAt(0)) eat++;
                if(n.charAt(1)==tar.charAt(1)) eat++;
                if(n.charAt(2)==tar.charAt(2)) eat++;
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        if(n.charAt(i)==tar.charAt(j)) bite++;
                    }
                }
                bite-=eat;
                System.out.println(eat + "EAT-" + bite + "BITE");
                if(eat==3) break;
                // break;
            }
            System.out.println("推測回数：" + turn);
            System.out.println("練習を続けますか？(y/n)");
            String yn = sc.nextLine();
            if(yn.equals("n")) break;
        }
    }
}