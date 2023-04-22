public class LeetCodeArrayQ1 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println("Integers with even no. of digits "+findNumbers(nums));
        System.out.println(digits2(0));
    }

    private static int findNumbers(int[] nums) {
         int count=0;
         for(int num:nums){
             if(even(num)) count++;
         } return count;
    }

    // alternative method to find no. of digits...
    static int digits2(int n){
        if (n<0) n=-n;
        if (n==0) return 1;
        return (int)(Math.log10(n)+1);
    }
    private static boolean even(int num) {
        int numOfdig=digits2(num);
        if (numOfdig%2==0) return true;
        return false;
    }

//to calculate no. of digits....
//    private static int digits(int num) {
//        int count=0;
//        if (num==0) count=1;
//        if (num<0) num=-num;
//        while (num>0){
//            count++;
//            num/=10;
//        } return count;//}


}
