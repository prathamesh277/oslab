#include<stdio.h>
#include<string.h>
int main()
{
	int i=0,count =0;
	char data[100];
	printf("Enter the input value:\t");
	scanf("%s",data);
    printf("original data is :\t %s \n",data);
	printf("\n Receiver Data is:\t");
	for(i=0;i<strlen(data);i++)
	{
	 if(data[i]=='1')
	 {
	 	count++;
	 }	
	 else
	 {
	 	count=0;
	 }
	 printf("%c",data[i]);
	 if(count==5){
	 	printf("0");
	 	count=0;
	 }
	}
	return 0;
}
