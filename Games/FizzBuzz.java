import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力：");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%15==0) System.out.println("フィズバズ");
            else if(i%5==0) System.out.println("バズ");
            else if(i%3==0) System.out.println("フィズ");
            else System.out.println(i);
        }
    }
}