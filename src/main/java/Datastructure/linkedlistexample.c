#include <stdio.h>
#include <stdlib.h>




int main() {

    struct node
{
    int data;
    struct node *next;
};
	// your code goes here
	struct node *newnode,*head,*temp;
	newnode=NULL;
	head=NULL;
	temp=NULL;
	int choice=1;
	while(choice)
	{
	    newnode=(struct node*)malloc(sizeof(struct node));
	    printf("Enter the data");
	    scanf("%d",&newnode->data);
	    newnode->next=NULL;

	     if(head==NULL)
	    {
	        head=newnode;
	        temp=newnode;
	    }
	    else
	    {
	        temp->next=newnode;
	        temp=newnode;
	    }
	    printf("Do you want to continue");
	    scanf("%d",&choice);
	}
	temp=head;
	while(temp!=NULL)
	{
	    printf("\n%d\n",temp->data);
	    temp=temp->next;

	}


	return 0;
}

