package com.dp;

public class MinSquares {


    public static int minCount(int n) {
        //Your code goes here
        int dp[] = new int[n+1];
        for (int i=0;i<n+1;i++)
            dp[i]=-1;

        return minCountHelper(n,dp);
    }

    private static int minCountHelper(int n, int[] dp)
    {
        if (n==0)
            return 0;

        int minVal = Integer.MAX_VALUE;
        for (int i=1;i*i<=n;i++)
        {
            if (dp[n-(i*i)]==-1)
                dp[n-(i*i)]=minCountHelper(n-(i*i),dp);
            int currVal = dp[n-(i*i)];
            if (currVal<minVal)
                minVal=currVal;
        }

        return minVal+1;
    }

    public static void main(String[] args) {

        int n = 12;

        int dp[] = new  int[n+1];
		for(int i=0; i<dp.length; i++) {
			dp[i] = -1;
		}

        int ans = minCount(n);
        System.out.println(ans);

    }
}
