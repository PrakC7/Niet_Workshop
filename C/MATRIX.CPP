#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,M[2][3];
	clrscr();
	for(i=0;i<=1;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("Enter the value at %d,%d: ",i,j);
			scanf("%d\n",&M[i][j]);
		}
	}
	for(i=0;i<=1;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("%d\n",M[i][j]);
		}
	}
	getch();
}