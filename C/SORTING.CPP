#include<stdio.h>
#include<conio.h>
int main()
{       int i,f,n,t;
	int a[5];
	clrscr();
	printf("Five Input Values: \n");
	for(i=0;i<5;i++)
	{
		f=i+1;
		printf("\t\t%d value: ",f);
		scanf("%d",&a[i]);
	}
	printf("\n");
	for(i=0;i<4;i++)
	{
		for(i=0;i<4;i++)
		{
			if(a[i]>a[i+1])
			{
				t=a[i];
				a[i] = a[i+(4-(i+1))];
				a[i] = t;
				break;
			}
			else
			{
				break;
			}
		}
	}
	getch();
	}