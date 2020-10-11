package AMZ;

public class GasStation {
    public int canCompleteCircuit(final int[] Gas, final int[] Distance) {
        int start = 0, balance = 0, total_fuel=0;
        for ( int i=0; i<Gas.length; i++){
            balance+= Gas[i] - Distance[i];
            total_fuel+= Gas[i] - Distance[i];
            if ( balance < 0){
                balance = 0;
                start = i+1;
            }
        }
        return total_fuel >=0 ? start: -1;
    }
}
