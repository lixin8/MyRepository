package com.company;

//给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
//其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
public class MultiplyArray {
    public static void main(String args[]){
        int a[]={1,2,1,2,1};
        int b[]=multiply(a);
        for (int i=0; i<a.length; i++){
            System.out.println(b[i]);
        }
    }

    private static int[] multiply(int[] A){
        if(A==null||A.length<=0){
            return null;
        }
        int[] c = new int[A.length];
        int[] d = new int[A.length];
        int[] b = new int[A.length];

        d[0] = 1; // 计算D
        for (int i = 1; i < A.length; i++) {
            d[i] = d[i-1] * A[i-1];
        }

        c[A.length-1] = 1; // 计算C
        for (int j = A.length-1; j > 0; j--) {
            c[j-1] = c[j] * A[j];
        }

        // 计算B
        for (int i = 0; i < A.length; i++) {
            b[i] = d[i]*c[i];
        }

        return b;
    }
}
