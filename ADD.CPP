#include<stdio.h>
#include<conio.h>
int add(int a,int b);
void main()
{
	int a,b,x;
	printf("Enter a,b: ");
	scanf("%d %d",&a,&b);
	add(a,b);
getch();
}
int add(int a,int b)
{
	printf("Result: %d",a+b);
}