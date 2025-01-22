#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int a;
printf("Enter age: ");
scanf("%d",&a);
if(a>=18){
printf("Eligible to vote");
}
else{
printf("Not Eligible to vote");
}
getch();
}