package com.company;

/**
 * Created by am411 on 2/23/17.
 */
public class Euclid {
    public static int iterative (int x1, int x2){
        while (x2 != 0){
            int hold = x2;
            x2 = x1 % x2;
            x1 = hold;
        }
        return x1;

    }
    public static int recursive (int x1, int x2){
        if (x2 == 0)
            return x1;
        else
            return recursive(x2, x1 % x2 );

    }
}
