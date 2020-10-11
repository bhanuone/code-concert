package AMZ;

import java.util.List;

public class MajorityElement {
    public int majorityElement(final int[] a) {
        if ( a== null || a.length == 0) return -1;
        int candidate = a[0];
        int count = 1;
        for ( int i=1; i<a.length; i++){
            if (candidate == a[i]){
                count++;
            }
            else{
                count--;
            }
            if ( count == 0){
                candidate = a[i];
                count =1;
            }
        }
        if ( isMajorityElement(a,candidate)){
            return candidate;
        }
        else{
            return -1;
        }
    }

    private boolean isMajorityElement(int[] a, int candidate) {
        int count = 0;
        for ( int num: a){
            if ( num == candidate){
                count++;
            }
        }
        return count>= a.length/2;
    }
}
