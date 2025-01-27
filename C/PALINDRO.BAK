#include <stdio.h>
#include<conio.h>

int isPalindrome(int num) {
    int original = num;
    int reversed = 0;
    int remainder;

    while (num != 0) {
	remainder = num % 10;
	reversed = reversed * 10 + remainder;
	num /= 10;
    }

    return original == reversed;
}

int main() {
    int num;
    clrscr();
    printf("Enter an integer: ");
    scanf("%d", &num);
    if (isPalindrome(num)) {
	printf("The number is a palindrome.\n");
    } else {
	printf("The number is not a palindrome.\n");
    }
getch();
}

