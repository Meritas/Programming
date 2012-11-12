/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе целочислено число x, където 0<=x<10. Да се инициализира масив от 10 елемента. Да се намерят първите 10 числа на Фибоначи в [0; +?), които се делят на x без остатък. Намерените стойности да се зададат като стойности на елементите в масива. Елементите на масива да се изведат на стандартния изход.
*/

#include<stdio.h>

int a[10];

int fib(int x, int inp, int p_inp, int count);

int main()
{
    int x;
    int i;
    
    for(x=999;(x<0)||(x>=10);) scanf("%d", &x);
    fib(x, 1, 0, 0);
    for(i=0;i<=9;i++) printf("%d\n", a[i]);
    
    system("pause");
    return 0;
}
    
    
int fib(int x, int inp, int p_inp, int count)
{
    if(inp%x==0)
    {
                 a[count]=inp;
                 if(count==9) return 0;
                 count++;
    }
    return(fib(x, inp+p_inp, inp, count));
}
