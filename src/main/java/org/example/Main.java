package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {

    }
    @Test
    public void diagonalSumTest(){
        Assert.assertEquals(25, new Solution().diagonalSum(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }

}

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat[i].length - i - 1];
            if(i == mat[i].length - i - 1){
                sum -= mat[i][i];
            }
        }
        return sum;
    }
}