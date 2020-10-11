#include <iostream>
#include <priority_queue>
using namespace std;

solve(vector<int> &A, int B) {
    priority_queue<int> Q;
    for (auto i : A) {
        Q.push(i);
    }
    vector<int> res;
    for (int i = 0; i < B; i++) {
        res.push_back(Q.top());
        Q.pop();
    }
    return res;
}