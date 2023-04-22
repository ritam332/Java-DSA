class LeetCodeArrayQ2{
	//Richest Customer Wealth....
	public static void main(String[] args) {
		int[][] bankacc={{67,4,322,7},{78,5,43}};
		System.out.println(maximumWealth(bankacc));
	}
	public static int maximumWealth(int[][] accounts){
		int sum=0; int ans=Integer.MIN_VALUE;
		 for(int person=0;person<accounts.length;person++){
			 for (int acc = 0; acc < accounts[person].length; acc++) {
					sum+=accounts[person][acc];
			 }
		 } if (sum>ans) ans=sum;
		 return ans;
	}
}