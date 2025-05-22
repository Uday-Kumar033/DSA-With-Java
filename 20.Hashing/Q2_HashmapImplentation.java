import java.util.LinkedList;

public class Q2_HashmapImplentation {
    public class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value) {
                this.value = value;
                this.key = key;
            }
        }
        private int size;
        private LinkedList<Node> buckets[];
        private int N;
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        public void reshape(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
            //nodes -> add in bucket
            for(int i = 0; i<oldBuck.length; i++){
                LinkedList<Node> ll= oldBuck[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);// bucketindex
            int di = SearchInLL(key,bi);
        }
        public int hashFunction(K key){
            return -1;
        }
    }
    public static void main(String[] args) {
        
    }
}
