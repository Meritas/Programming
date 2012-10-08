/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се разработи програма, която изисква от потребителя да въведе число x, където x e интервала (0;1). Да се намери сумата от сбора на реципрочните стойности за всеки две twin primes. Развитието да продължи докато отношението не стане по-малко то x.
*/

#include<stdio.h>

int prime();

int main()
{
   int bool;
   float x, var=1;
   int i,k;
   
   for(x=999; (x<=0)||(x>=1);) scanf("%f", &x);
   
   for(i=3; var>=x; i++)
   {
            bool=0;
            bool=prime(i,bool);
            if( bool==1 ) continue;
            bool=prime(i+2,bool);
            if( bool==1 ) continue;
            var=((float)1/i)+((float)1/(i+2));
            printf("\n#%f", var);
   }
   
   system("pause");
   return 0;
}
            
            
int prime(int input, int inp_bool)
{
     int k;
                 for(k=2; k<7; k++)
            {
                     if( (k==4)||(k==6) ) continue;
                     if( input%k==0 ) inp_bool=1;
            }
     return inp_bool;
}
