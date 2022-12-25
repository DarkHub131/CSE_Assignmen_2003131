#include<bits/stdc++.h>
using namespace std;
class Node{
     public:
          int coeff;
            int pow;
            Node *next;
};
void create_node(int x, int y,  Node **temp){
   Node *r, *z;
   z = *temp;
   if(z == NULL){
      r = new Node();
      r->coeff = x;
      r->pow = y;
      *temp = r;
      r->next =  new Node();;
      r = r->next;
      r->next = NULL;
   } else {
      r->coeff = x;
      r->pow = y;
      r->next = new Node();;
      r = r->next;
      r->next = NULL;
   }
}
void polyadd(Node *p1, Node *p2, Node *result){
   while(p1->next && p2->next){
      if(p1->pow > p2->pow){
         result->pow = p1->pow;
         result->coeff = p1->coeff;
         p1 = p1->next;
      }
      else if(p1->pow < p2->pow){
         result->pow = p2->pow;
         result->coeff = p2->coeff;
         p2 = p2->next;
      } else {
         result->pow = p1->pow;
         result->coeff = p1->coeff+p2->coeff;
         p1 = p1->next;
         p2 = p2->next;
      }
      result->next =  new Node();;
      result = result->next;
      result->next = NULL;
   }
   while(p1->next || p2->next){
      if(p1->next){
         result->pow = p1->pow;
         result->coeff = p1->coeff;
         p1 = p1->next;
      }
      if(p2->next){
         result->pow = p2->pow;
         result->coeff = p2->coeff;
         p2 = p2->next;
      }
      result->next = new Node();
      result = result->next;
      result->next = NULL;
   }
}
void printpoly(Node *node){
   while(node->next != NULL){
      if(node->pow!=0)
      {
      printf("%dx^%d", node->coeff, node->pow);
      }
      else
       printf("%d", node->coeff);
      node = node->next;
      if(node->next != NULL)
         printf(" + ");
   }
}
int main(){
    Node *h1 = NULL, *h2 = NULL, *result = NULL;
   create_node(13,8,&h1);
   create_node(7,5,&h1);
   create_node(32,2,&h1);
   create_node(54,0,&h1);
   create_node(3,12,&h2);
   create_node(17,5,&h2);
   create_node(3,3,&h2);
   create_node(98,0,&h2);
   printf("polynomial 1: ");
   printpoly(h1);
   printf("\npolynomial 2: ");
   printpoly(h2);
   result =new Node();
   polyadd(h1, h2, result);
   printf("\nOutput P1 :  ");
   printpoly(result);
   return 0;
}
