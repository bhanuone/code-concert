#include <iostream>
#include <priority_queue>
using namespace std;

vector<int> solve(vector<int> &A, int B) {
    // priority_queue<int> Q;
    priority_queue <int, vector<int>, greater<int> > Q;
    for (int i = 0; i < B; i++) {
        Q.push(A[i]);
    }
    
    for (int i = B; i < A.size(); i++) {
        if (Q.top() < A[i]) {
            Q.pop();
            Q.push(A[i]);
        }
    }
    vector<int> res;
    while(!Q.empty()) {
        res.push_back(Q.top());
        Q.pop();
    }
    return res;
}
