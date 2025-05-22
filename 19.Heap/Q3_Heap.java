import java.util.ArrayList;

public class Q3_Heap {

    public  static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data) {  //Time Compleixity = O(logn)
            arr.add(data);

            //size of child
            int x = arr.size() - 1;
            //size of parent
            int par = (x - 1)/2;
            //Condition for minimum heap
            while(arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);
                x = par;
                par = (x - 1)/2;
            }
        }
    
        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);

            //swap step 1
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1 , temp);

            //remove step 2
            arr.remove(arr.size() - 1);

            //heapify step 3
            heapify(0);
            return data;
        }

        public void heapify(int i) {
            int left = 2*i + 1;//left child Node
            int right = 2 *i + 2;// right child node
            int minIdx = i;
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if(minIdx !=  i) {
                //swap 
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public  boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(8);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
