#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main(){
	int a,i,x,y;
	clrscr();
	for(i=1;i>0;i++){
		printf("Operations:-\n\t\t1 - Sum\n\t\t2 - Substraction\n\t\t3 - Product\n\t\t4 - Division\n\t\t5 - Exit\nEnter the operation: ");
		scanf("%d",&a);
		if(a>5){
		printf("Invalid operation\n");
		}
		if(a<6 && a>0){
		switch(a){
		case 5:
		exit(0);
		}
		printf("Enter a number: ");
		scanf("%d",&x);
		printf("Enter another number: ");
		scanf("%d",&y);
	switch(a){
	case 1:
	printf("%d\n\t\t",x+y);
	break;
	case 2:
	printf("%d\n\t\t",x-y);
	break;
	case 3:
	printf("%d\n\t\t",x*y);
	break;
	case 4:
	printf("%d\n\t\t",x/y);
	break;
	case 5:
	exit(0);
	}
	}
	}
	getch();
	}