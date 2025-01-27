#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void sum(int a,int b);
void substract(int a,int b);
void main()
{       int a,b,i,o;
	clrscr();
	for(i=1;i>=1;i++)
	{
	printf("Operations:-\n\t\t1 - Sum\n\t\t2 - Substract\n\t\t");
		if(o==5)
		{
			exit(0);
		}
		if(o==1 || o==2)
		{
			printf("Enter a number: ");
			scanf("%d",&a);
			printf("Enter another number: ");
			scanf("%d",&b);
		}
		else
		{
			printf("Invalid Operation");
		}
		if(o==1)
		{
			sum(a,b);
		}
		if(o==2)
		{
			substract(a,b);
		}
	}
getch();
}
void sum(int a,int b)
{
	printf("Sum of %d and %d : %d", a,b,a+b);
}
void substract(int a,int b)
{
	printf("Substraction on %d from %d : %d",b,a,a-b);
}
