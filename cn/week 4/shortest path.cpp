#include<stdio.h>
int main()
{
int path[20][20],i,j,min,a[20][20],p,st=1,ed=5,stp,edp,t[5],index,n;
printf("enter the n value\n");
scanf("%d",&n);
printf("enter the cost matrix\n");
for(i=1;i<=n;i++)
{
	for(j=1;j<=n;j++)
	{
		scanf("%d",&a[i][j]);	
	}
}
printf("enter the paths\n");
scanf("%d",&p);
printf("enter possible paths\n");
for(i=1;i<=p;i++)
{
	for(j=1;j<=n;j++)
	{
		scanf("%d",&path[i][j]);
	}
}
for(i=1;i<=p;i++)
{
t[i]=0;
stp=st;
for(j=1;j<=5;j++)
{
edp=path[i][j+1];
t[i]=t[i]+a[stp][edp];
if(edp==ed)
break;
else
stp=edp;
}
}
min=t[st];index=st;
for(i=1;i<=p;i++)
{
if(min>t[i])
{
min=t[i];
index=i;
}
}
printf("minimum cost %d",min);
printf("\n minimum cost path ");
for(i=1;i<=5;i++)
{
printf("--> %d",path[index][i]);
if(path[index][i]==ed)
break;
}
return 0;
}

