package bitOperation;

public class ExtractRightMost1 {
    //利用取反和按位与运算提取最右侧的二进制1
    //按位与: 全1则1,其余为0
    public static void extract(int a){
        System.out.println(Integer.toBinaryString(a));
        a=a&(~a+1);
        System.out.println(Integer.toBinaryString(a));
    }
    public static void main(String[] args) {
        int a=254;
        extract(a);
    }
}
