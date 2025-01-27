#include<stdio.h>
#include<conio.h>
int main()
{       int i,f,n;
	int a[5];
	clrscr();
	printf("Five Input Values: \n");
	for(i=0;i<5;i++)
	{
		f=i+1;
		printf("\t\t%d value: ",f);
		scanf("%d",&a[i]);
	}
	printf("Search for the Number: ");
	scanf("%d",&n);
	printf("\n");
	for(i=0;i<5;i++)
	{
		if(n==a[i])
		{
			printf("Found");
			break;
		}
		else
		{
			printf("Not Found");
			break;
		}
		}
	getch();
	}