/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе целочислено число, x, където 0 < x < 10. Да се инициализират масива от 10 елемента. Стойностите на елементите на масива да са равни на косинус от индекса на елемента. Да се изведе масивът, след което да се сортира в низходящ ред и отново да се изведе.
*/

#include<stdio.h>
#include<math.h>

#define PI 3.14159265

int main()
{
    int x=0,temp;
    double a[10], f_i;
    int i,k;
    while((x>9)||(x<=0)) scanf("%d", &x);
    printf(" check\n ");
    for(i=0;i<=9;i++)
    {
          f_i = (double)i;
          a[i]=cos(f_i*PI/180); 
    }          
    for(i=0;i<=9;i++) printf("%f\n", a[i]);
    for(i=0;i<=9;i++)
    {
                     for(k=i+1; k<=i; k++)
                     {
                              if(a[i]<a[k])
                              {
                                           temp=a[i];
                                           a[i]=a[k];
                                           a[k]=temp;
                              }
                     }
    }
    for(i=0;i<=9;i++) printf("%f\n", a[i]);
    system("pause");
    return 0;
}
