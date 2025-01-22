#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int a,b,c;
printf("Enter a number: ");
scanf("%d",&a);
printf("Enter second number: ");
scanf("%d",&b);
printf("Enter the third number: ");
scanf("%d",&c);
if(a>b){
if(a>c){
printf("a is the greatest");
}
else{
printf("c is the greatest");
}
}
if(b>a){
if(b>c){
printf("b is the greatest");
}
else{
printf("c is the greatest");
}
}
getch();
}
