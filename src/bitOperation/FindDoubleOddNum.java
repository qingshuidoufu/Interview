package bitOperation;
//数组中有两个数字奇数次出现,其余偶数次出现,找出这两个数
public class FindDoubleOddNum {
    //利用异或运算(无进位相加)去重,然后对数组分类, 利用异或运算交换结合律得出
    //数组一遍异或运算后,得出的tem1必定为a^b(两个奇数次数)
    //因为a!=b,所以a和b的二进制位必定有一位不为1(这位不同才能得出1)
    //利用这特性给下一次异或设定条件,用tem2异或这数组, 得出的tem2必然是a或者b
    //然后用tem1^tem2, 即为a^b^a或者b, 得出另一个数
    public static void  find(int[] arr){
        int tem1=0;
        int tem2=0;
        for (int i = 0; i < arr.length; i++) {
            tem1=arr[i]^tem1;
        }
        System.out.println("a^b的结果:"+tem1);
        //此时tem1=a^b
       String bitString=findBitOne(tem1);
        int bitIndex=bitString.length()-1;
        System.out.println("二进制右1下标:"+bitIndex);

        for (int i = 0; i < arr.length; i++) {
            if('1'==Integer.toBinaryString(arr[i]).toCharArray()[bitIndex]){
                tem2=tem2^arr[i];
            }
        }
        System.out.println("其中一个奇数次数:"+tem2);
        //此时tem2必为a或者b
        tem1=tem1^tem2;
        System.out.println("最终结果:"+tem1+" "+tem2);

    }
    public static String findBitOne(int num){
        num=num&(~num+1);
        return Integer.toBinaryString(num);
    }
    public static void main(String[] args) {
        int[] arr={2,2,4,4,4,3,3,3,4,5,5,5};
        find(arr);
    }
}
