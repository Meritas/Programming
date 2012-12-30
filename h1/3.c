/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намерят и изведат всички прости числа завършващи на 3 в интервал [x,y].
*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int x,y,i,sum=0;
    div_t divresult;
    scanf("%d", &x);
    for(y=0;y<=x;) scanf("%d", &y);
    for(i=x;i<=y;i++)
    {
          divresult = div(i,10);
          if(divresult.rem == 3) sum+=i;
    }
    printf("%d", sum);
    system("pause");
    return 0;
}
