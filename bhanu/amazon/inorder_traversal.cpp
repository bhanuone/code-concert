/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
 
void inorder(TreeNode* A, vector<int>& arr) {
    if (A == nullptr) return;
    inorder(A->left, arr);
    arr.push_back(A->val);
    inorder(A->right, arr);
}

vector<int> inorderTraversal(TreeNode* A) {
    vector<int> inorderList;
    inorder(A, inorderList);
    return inorderList;
}