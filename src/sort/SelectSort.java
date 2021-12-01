package sort;
public class SelectSort{
    public static void  selectSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[i]) {
                    swap(array, i, j);
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
            selectSort(array);
        for (int a:array
             ) {
            System.out.print(a+" ");
        }
        }
}
