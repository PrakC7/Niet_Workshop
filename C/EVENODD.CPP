#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int a;
printf("Input a");
scanf("%d",&a);
if(a%2==0){
printf("Entered number is even");
}
else{
printf("Entered number is odd");
}
getch();
}