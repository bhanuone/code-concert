package AMZ;

import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int res = 0;
        for ( int num: A){
            res ^= num;
        }
        return res;
    }
}
