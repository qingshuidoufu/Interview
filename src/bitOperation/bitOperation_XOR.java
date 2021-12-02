package bitOperation;

public class bitOperation_XOR {
    //异或运算, 两个数字交换
    //异或运算中两个,相同为0,不同为1
    public static void swap(int[] arr){
        int tem=arr[0];
        arr[0]=arr[0]^arr[1]^arr[0];
        arr[1]=tem;

    }
    public static void main(String[] args) {
        int[] arr={2,3};
        swap(arr);
        for (int a:arr
             ) {
            System.out.println(a);
        }

    }
}
