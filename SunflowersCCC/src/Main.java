import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int [][] p = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = in.nextInt();
            }
        }
        int N = n-1;
        int corner = 0;

        if(p[0][0] < p[N][N] && p[0][0] < p[0][N] && p[0][0] < p[N][0]) corner = 1;
        if(p[0][N] < p[N][N] && p[0][N] < p[0][0] && p[0][N] < p[N][0]) corner = 2;
        if(p[N][0] < p[N][N] && p[N][0] < p[0][N] && p[N][0] < p[0][0]) corner = 3;
        if(p[N][N] < p[0][0] && p[N][N] < p[0][N] && p[N][N] < p[N][0]) corner = 4;

        int [][] q = new int[n][n];

        if(corner == 2){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    q[i][j] = p[j][N-i];
                }
            }
        }
        else if(corner == 3){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    q[i][j] = p[N-j][i];
                }
            }
        }
        else if(corner == 4){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    q[i][j] = p[N-i][N-j];
                }
            }
        }else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    q[i][j] = p[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(q[i][j]);
            }
            System.out.println("");
        }
    }
}