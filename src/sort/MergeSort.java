package sort;

public class MergeSort {
    static void mergeSort(int[] arr, int left, int right){
        if(left==right){
            return;
        }
        int mid=left+((right-left)>>1); //防止int溢出, 右移动除2
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);


    }
    static void merge(int[] arr,int left,int mid, int right){
        int[] help=new int[right-left+1];
        int index=0; //帮助数组指针
        int p1=left;  //第一块指针
        int p2=mid+1;//第二块指针
        //遍历判断大小合并到help数组中
        while(p1<=mid&&p2<=right){
            if(arr[p1]<=arr[p2]){
                help[index++]=arr[p1++];
            }
            else{
                help[index++]=arr[p2++];
            }
        }
        //左块剩余
        while(p1<=mid){
            help[index++]=arr[p1++];
        }
        //右块剩余
        while (p2<=right){
            help[index++]=arr[p2++];
        }
        //help移动回原数组
        for(int i=0;i<help.length;i++){
            arr[left+i]=help[i];
        }
        for (int i: arr
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={18,5,85,98,48,33,64,48,88,9,4,6,9,6,796,44};
        mergeSort(arr,0,arr.length-1);
//        for (int i:arr
//             ) {
//            System.out.print(i+" ");
//        }

    }
}
