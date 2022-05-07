package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        ArrayList<Long> ar=new ArrayList<>();
        ar.add(3L);
        ar.add(4L);
        ar.add(1L);
        ar.add(9L);
        ar.add(56L);
        ar.add(7L);
        ar.add(9L);
        ar.add(12L);
        int member=5;
        System.out.println("Difference is: " + findMinDiff(ar,ar.size(),member) );
    }
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        if (m > n)
            return -1;
        if (m == 0 || n == 0)
            return 0;
        Collections.sort(a);
        long min = Long.MAX_VALUE;
        for (int i = 0; i + m + -1 < n; i++) {
            long mindiff = a.get(i + (int)m - 1) - a.get(i);
            if (mindiff < min)
                min = mindiff;
        }
        return min;
    }
}
