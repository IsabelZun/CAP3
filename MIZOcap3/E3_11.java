#include <iostream>
using namespace std;
 


struct List
{
    int data;
    struct List *next;
    struct List *prev;
};
 
void push(struct List** head, int data)
{
    struct List* node = new List;
    node->data  = data;
    node->next = (*head);
    node->prev = NULL;
    if ((*head) !=  NULL)
      (*head)->prev = node ;
    (*head)    = node;
}
 
//Answer to the question
int Size(struct List *node)
{
   int res = 0;
   while (node != NULL)
   {
       res++;
       node = node->next;
   }
   return res;
}
 


int main()
{
    struct List* node = NULL;
    push(&node, 4);
    push(&node, 3);
    push(&node, 2);
    push(&node, 1);
    cout << Size(node);
    return 0;
}