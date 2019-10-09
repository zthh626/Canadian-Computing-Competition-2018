import java.io.*;
import java.util.*;
public class Main {
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int R = N;
        int z = N;
        for(int i = 0; i < K; i++) {
            z = z*10;
            R += z;
        }
        System.out.println(R);
    }
}