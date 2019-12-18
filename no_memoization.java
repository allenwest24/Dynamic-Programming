import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int opt(ArrayList<Integer> list, int size) {
        if(size == 0) {
            return 0;
        }
        else if(size == 1) {
            return list.get(0);
        }
        else if(size == 2) {
            return list.get(0) + list.get(1);
        }
        else {
            int x = opt(list, size - 3) + list.get(size - 3) + list.get(size - 2) + (list.get(size - 1) * 2);
            int y = opt(list, size - 1) + list.get(size - 1);
            if(x > y) {
                return x;
            }
            else {
                return y;
            }
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner myScanner = new Scanner(System.in);
        while(myScanner.hasNextInt()) {
            list.add(myScanner.nextInt());
        }
        System.out.println(opt(list, list.size()));
    }
    
}
