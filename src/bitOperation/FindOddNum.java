package bitOperation;
//在一个整数数组中,大部分数字成对出现,有一个数字奇数次出现, 找到他,要求时间复杂度O(N) ,空间O(1)
public class FindOddNum {
    //利用异或运算去重特性找到单个的
    //异或运算又称无进位相加
    //异或运算中 0^N=N  N^N=0
    public static void find(int[] arr){
        int tem=0;
        for (int i = 0; i < arr.length; i++) {
            tem=tem^arr[i];
        }
        System.out.println(tem);
    }
    public static void main(String[] args) {
        int[] arr={2,2,4,4,4,3,3,3,4};
        find(arr);

    }
}
