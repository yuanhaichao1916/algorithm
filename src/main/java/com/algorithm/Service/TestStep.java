package com.algorithm.Service;

import org.junit.Test;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author Lenovo
 * @Date 2021/3/29 16:42
 */
public class TestStep {
    public static void main(String[] args) {
        System.out.println(f(4));
        System.out.println(loop(4));
    }

    // 递归
    public static int f(int n) {
        if(n<1) throw new IllegalArgumentException(n + "是非法参数。");
        if(n==1||n==2) return n;
        return f(n-2) + f(n-1);
    }

    // 迭代
    public static int loop(int n){
        if(n<1) throw new IllegalArgumentException(n + "是非法参数。");
        if(n==1||n==2) return n;
        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;
    }

}
