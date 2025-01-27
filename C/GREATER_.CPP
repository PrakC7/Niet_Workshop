#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int a,b;
printf("Enter a number: ");
scanf("%d",&a);
printf("Enter another number: ");
scanf("%d",&b);
if (a>b){
printf("a is greater than b");
}
if (a==b){
printf("a and b are equal");
}
else{
printf("b is greater than a");
}
getch();
}