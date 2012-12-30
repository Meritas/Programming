/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички числа на Фибоначи в интервала [x, y].
*/



#include<stdio.h>
int fib(int x, int y, int sumz);
int main()
{
    int x,y,i,sum=0;
    scanf("%d", &x);
    for(y=0; y<=x;) scanf("%d", &y);
    printf("%d", fib(x,y,0));
    system("pause");
    return 0;
}

int fib(int x, int y, int sumz)
{
    if(y==x) return(sumz+y);
    else
    return(fib(x, y-1, sumz+y));
}
