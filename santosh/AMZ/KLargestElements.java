package AMZ;

import java.util.PriorityQueue;

public class KLargestElements {
    public int[] solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(B);
        for (int i=0; i<B; i++){
            pq.add(A[i]);
        }
        for(int i=B;i<A.length; i++){
           if (pq.peek() < A[i]){
               pq.poll();
               pq.add(A[i]);
           }
        }
        int[] res = new int[B];
        for (int i=0; i<B;i++){
            res[i] = pq.poll();
        }
        return res;
    }
}
