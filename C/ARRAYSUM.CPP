#include<stdio.h>
#include<conio.h>
int main()
{       int i,f,Sum;
	int a[5];
	clrscr();
	printf("Five Input Values: \n");
	for(i=0;i<5;i++)
	{
		f=i+1;
		printf("\t\t%d value: ",f);
		scanf("%d",&a[i]);
	}
	printf("\nOutputs: \t");
	for(i=0;i<5;i++)
	{
		printf("%d\n\t\t",a[i]);
	}
	printf("\n");
	Sum = a[0] + a[1] + a[2] + a[3] + a[4];
	printf("Sum: %d",Sum);
	getch();
	}