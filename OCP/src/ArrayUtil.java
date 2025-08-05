interface ValueComparator{
    int compare(int val1 , int val2);
}

class AscendingComparator implements ValueComparator {
    public int compare(int a, int b) {
        return a - b;  // ascending order
    }
}

class DescendingComparator implements ValueComparator {
    public int compare(int a, int b) {
        return b - a;  // descending order
    }
}


public class ArrayUtil {
    public void sort(int arr[] , ValueComparator  valueComparator){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(valueComparator.compare(arr[i] , arr[j]) > 0){
                    swap(arr , i , j);
                }
            }
        }
    }


    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(int ar[] , String prompt){
        System.out.println(prompt);
        for(int i : ar){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
