/*
#school - ����
#class - 11�
#num - 19
#name - ���� �������� ������
#task - �� �� ��������� ��������, ����� ������� �� ����������� �� ������ ��� ����������� �����, x � y, ������ x < y. �� �� ������ � ������ ������ �� ������� ������ �� �� 17 � �������� [x, y].
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
