/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе целочислено число x, където 0<x<10. Да се инициализира масив от 100 целочислени елемента. Стойностите на елементите да са случайни числа в интервала [0, 100). Елементите на масива да се подредят така, че числата завършващи на x да са в началото.
*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int x, temp, a[100];
    div_t divresult;
    int i, c=0;
    
    srand((unsigned)time(NULL));
    for(x=0; (x<=0)||(x>=10);) scanf("%d", &x);
    for(i=0; i<=99; i++) a[i] = rand()%99;
    for(i=0; i<=99; i++){
             divresult=div(a[i],10);
             if(divresult.rem==x)
             {                 
                             if(c==i) continue;
                             temp=a[c];
                             a[c]=a[i];
                             a[i]=temp;
                             c++;
             }
                             }
    for(i=0; i<=99; i++) printf("%d\n", a[i]);
    
    system("pause");
    return 0;
}
