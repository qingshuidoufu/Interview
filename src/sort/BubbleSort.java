package sort;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        for (int e = array.length; e >0; e--) {
            for (int j = 0; j < e-1; j++) {
                if (array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }

        }

    }
    public static void swap(int[] array,int a, int b){
        int tem=array[a];
        array[a]=array[b];
        array[b]=tem;
    }
    public static void main(String[]args){
        int[] array={12,23,45,2,54,7,43,77,43,2,1,6,244};
        bubbleSort(array);
        for (int a:array
        ) {
            System.out.print(a+" ");
        }
    }
}
