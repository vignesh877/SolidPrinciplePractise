public class Main {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int ar[]= {1,4,7,5,2,4,80};

        ValueComparator valueComparator = new AscendingComparator();
        arrayUtil.sort(ar , new DescendingComparator());
        arrayUtil.print(ar , "Descending Ordered Array : ");
        arrayUtil.sort(ar , new AscendingComparator());
        arrayUtil.print(ar , "Ascending Ordered Array : ");

    }
}