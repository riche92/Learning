public class ForEachLoops {
    public static void main(String[] args) {
        //For each loop has no access to the index. So you can not go through the array
        //For each loops are not right choice when you want to modify elements in an array
        //For each loops cannot go through arrays in reverse order
       /* for (data_type item: collections ){
            // statements*/
        int a[] = {10,20,30,40,50};
        for (int x: a){
            System.out.println("Value: " + x);
        }


    }
}
