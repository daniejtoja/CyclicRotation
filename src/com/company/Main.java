package com.company;

public class Main {

    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] A, int K) {

                if(A.length == 0)
                    return A;

                int temp = 0;

                for(int i = 0; i < K; ++i){

                    temp = A[A.length-1];

                    for(int j = A.length-1; j>0 ;j--)
                    {
                        A[j] = A[j-1];
                    }

                    A[0] = temp;

                }



                return A;

            }
        }
    }
}
