#include<stdio.h>
#include<conio.h>
int main()
{       int i,f;
	int* a[5];
	clrscr();
	for(i=0;i<5;i++)
	{
		f=i+1;
		printf("Enter the %d values: ",f);
		scanf("%d",&a[i]);
	}
	printf("Outputs: \t");
	for(i=0;i<5;i++)
	{
		printf("%d\n\t\t",a[i]);
	}
	getch();
	}
