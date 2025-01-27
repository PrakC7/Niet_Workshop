#include<stdio.h>
#include<conio.h>
void main()
{
	char s[50],r[50];
	int i,j;
	clrscr();
	printf("Enter a string: ");
	scanf("%s",s);

	for(i=0;s[i]!='\0';i++);
	for(i=i-1,j=0;i>=0;i--,j++)
	{
		r[j]=s[i];
	}
r[j]='\0';
printf("Reversed: ");
puts(r);
getch();
}

