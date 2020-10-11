majorityElement(const vector<int> &A) {
    int count = 0;
    int majority;
    for (int i = 0; i < A.size(); i++) {
        if (count == 0) {
            majority = A[i];
            count++;
        } else {
            if (A[i] != majority) {
                count--;
            } else {
                count++;
            }
        }
        
    }
    return majority;
}