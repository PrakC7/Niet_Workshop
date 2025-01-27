#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
		char str1[20], str2[20],str3[30];
		int n;
		clrscr();
		printf("Enter Your Name: ");
		gets(str1);
		printf("Enter Your Friend: ");
		gets(str2);
		strcpy(str2,str1);
		n =strlen(str1);
		printf("Your only friend: %s and it's length: %i",str2,n);
		getch();
}