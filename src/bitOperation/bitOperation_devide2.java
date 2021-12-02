package bitOperation;

public class bitOperation_devide2 {
    //移位运算,
    public static void devide(int[] arr){
        arr[0]=arr[0]>>1; //右移1位, 除2
        arr[1]=arr[1]<<1; //坐移1位, 乘2

    }
    public static void main(String[] args) {
        int[] arr={20,30};
        devide(arr);
        for (int a:arr
             ) {
            System.out.println(a);
        }

    }
}
