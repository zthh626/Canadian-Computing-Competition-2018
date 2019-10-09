import java.io.*;
import java.util.*;
public class Main {
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //number of wood pieces
        int n = in.nextInt();
        in.nextLine();

        //lengths of pieces
        String l = in.nextLine();

        //lengths array
        String [] x = l.split(" ");
        int [] w = new int[n];
        List a = new ArrayList();
        int count = 0;
        int length = 0;
        Object y = 0;
        Object e = 0;

        //Convert String to Int for wood
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(x[i]);
        }

        //add the boards together
        for (int i = 0; i < (n - 1); i++) {
            for (int k = (i + 1); k < n; k++) {
                if(w[i] != w[k]) a.add(w[i] + w[k]);
            }
        }

        Collections.sort(a);

        //Determine how many boards have the same height
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    count++;
                }
            }
        }

        //if there is at least one board, set length = count + 1
        if(count != 0) length = count + 1;
        //else, there is only one board with all the combinations
        else {length = 1; count = a.size();}
        //output
        System.out.println(length + " " + count);
    }
}