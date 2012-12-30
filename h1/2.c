/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе две целочислени числа, x и y, където x < y. Да се намери и изведе сумата на числата делящи се на 17 в интервал [x, y].
*/

#include<stdio.h>
int main()
{
    int x, y, i, sum=0;
    scanf("%d", &x);
    for(y=0; y<=x;) scanf("%d", &y);
    for(i=x; i<=y; i++) if(i%17==0) sum+=i;
    printf("%d", sum);
    system("pause");
    return 0;
}
