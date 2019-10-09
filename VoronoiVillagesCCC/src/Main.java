import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        int [] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = in.nextInt();
        }

        Arrays.sort(V);
        List<Double> x = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            double y = Math.abs(((double)V[i] - V[i + 1])/2);
            x.add(y);
        }

        double[] size = new double[N - 2];

        for (int i = 0; i < N - 2; i++) {
            size[i] = x.get(i) + x.get(i + 1);
        }

        double z = size[0];

        for (int i = 0; i < size.length; i++) {
            if(size[i] < z){
                z = size[i];
            }
        }

        String [] o = Double.toString(z).split("");

        int count = 0;
        int a = 0;

        for (int i = 0; i < o.length; i++) {
            if(!o[i].equals(".")){
                count++;
            }if(o[i].equals(".")){
                a = count;
            }
        }

        System.out.println("");

        for (int i = 0; i < a + 2; i++) {
            System.out.print(o[i]);
        }
    }
}