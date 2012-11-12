/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y.
Да се намери сумата на всички нечетни числа в интервала [x,y].
*/

#include<stdio.h>
int main()
{
    int x, y, i, sum;
    scanf("%d", &x);
    for(y = 0; y <= x;) scanf("%d", &y);
    sum=0;
    for(i=x; i<=y; i++)
    if(i%2!=0) sum+=i;
    printf("%d\n", sum);
    system("pause");
    return 0;
}
