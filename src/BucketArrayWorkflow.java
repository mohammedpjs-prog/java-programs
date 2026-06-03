public class BucketArrayWorkflow {
    public static void main(String[] args){
        int capacity = 16;
        int [] keys = {1,2,17,33};
        for (int key : keys ){
            int bucket = key % capacity;
            System.out.println(" key " + key +
                    " -> " + bucket);

        }

    }
}
