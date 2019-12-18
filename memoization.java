import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int opt(ArrayList<Integer> list, int size, HashMap<Integer, Integer> hmap) {
        if(size == 0) {
            return 0;
        }
        else if(size == 1) {
            hmap.put(size, list.get(0));
            return list.get(0);
        }
        else if(size == 2) {
            hmap.put(size, list.get(0) + list.get(1));
            return list.get(0) + list.get(1);
        }
        else {
            int x = opt(list, size - 3, hmap) + list.get(size - 3) + list.get(size - 2) + (list.get(size - 1) * 2);
            int y = opt(list, size - 1, hmap) + list.get(size - 1);
            if(x > y) {
                hmap.put(size, x);
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
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        Scanner myScanner = new Scanner(System.in);
        while(myScanner.hasNextInt()) {
            list.add(myScanner.nextInt());
        }
        System.out.println(opt(list, list.size(), hmap));
    }
    
}
