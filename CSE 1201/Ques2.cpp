//The sum of the leaf nodes' data

#include<bits/stdc++.h>
using namespace std;

class Node{
    public :
	int data;
	Node *left, *right;
};

Node *newNode(int data){
	Node *temp = new Node();
	temp->data = data;
	temp->left = temp->right = NULL;
	return temp;
}

void leafSum(Node *h, int& sum){
	if (!h)
		return;

	if (!h->left && !h->right)//checking leaf node or not
		sum += h->data;

	leafSum(h->left, sum);
	leafSum(h->right, sum);
}

int main(){

    Node *h = newNode(2);
    h->left = newNode(7);
    h->left->left = newNode(2);
    h->left->right = newNode(6);
    h->left->right->left = newNode(5);
    h->left->right->right = newNode(11);

    h->right = newNode(5);
	h->right->right = newNode(9);
	h->right->right->left = newNode(4);
	int sum = 0;
	leafSum(h, sum);
	cout << sum << endl;
	return 0;
}
