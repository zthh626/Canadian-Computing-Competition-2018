import java.io.*;
import java.util.*;
public class Main {
    public static void main(String [] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        int[] Sw = new int[N];
        int[] Se = new int[N];
        int SwC = 0;
        int SeC = 0;
        int K = 0;

        for (int i = 0; i < N; i++) {
            Sw[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Se[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            SwC +=  Sw[i];
            SeC +=  Se[i];
            if(SwC == SeC){
                K = i + 1;
            }
        }
        System.out.println(K);
    }
}