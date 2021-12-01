#include<stdio.h>
#include<string.h>
int main()
{
int i=0,j=0,len;
char a[20],b[20];
printf("enter the string :\n");
scanf("%s",a);
len =strlen(a);
b[0]='d';
b[1]='l';
b[2]='e';
b[3]='s';
b[4]='t';
b[5]='x';
j=6;
while(i<len)
{
if(a[i]=='d' && a[i+1]=='l' && a[i+2]=='e')
{
b[j]='d';
b[j+1]='l';
b[j+2]='e';
j=j+3;
}
b[j]=a[i];
i++;
j++;
}
b[j]='d';
b[j+1]='l';
b[j+2]='e';
b[j+3]='e';
b[j+4]='t';
b[j+5]='x';
b[j+6]='\0';
printf("\n original data is : \t %s\n",a);
printf("Receiver data is :\t %s \n",b);
return 0;
}
