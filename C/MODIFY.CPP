 #include<stdio.h>
 #include<conio.h>
 void display(int);
 void main()
 {
	int a=3;
	clrscr();
	printf("Before modify:\t");
	printf("%d\n",a);
	display(a);
	printf("After modify:\t");
	printf("%d",a);
 getch();
 }
 void display(int a)
 {
	a=a+1;
 }
