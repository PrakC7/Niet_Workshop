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
		printf("Enter Your Sirname: ");
		gets(str2);
		strcat(str1,str2);
		n =strlen(str1);
		printf("Your name: %s and it's length: %i",str1,n);
		getch();
}