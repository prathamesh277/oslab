#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n,r,j,i,k;
	printf("\n Enter the no of processes and resources: ");
	scanf("%d%d",&n,&r);
	int alloc[n][r],max[n][r],avail[r],ans[n],f[n],ind=0,need[n][r],y=0;
	printf("\n Enter the allocationn of processes: ");
	for(i=0;i<n;i++)
	{
		for(j=0;j<r;j++)
		{
			scanf("%d",&alloc[i][j]);
		}
	}
	printf("\n Enter the max need of processes:\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<r;j++)
		{
			scanf("%d",&max[i][j]);
		}
	}
	printf("\n Enter the available resources: ");
	for(i=0;i<r;i++)
	{
		scanf("%d",&avail[i]);
	}
	for(i=0;i<n;i++)
	{
		f[i]=0;
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<r;j++)
		{
			need[i][j]=max[i][j]-alloc[i][j];
		}
	}
	for(k=0;k<n;k++)
	{
		for(i=0;i<n;i++)
		{
			if(f[i]==0)
			{
				int flag=0;
				for(j=0;j<r;j++)
				{
					if(need[i][j]>avail[j])
					{
						flag=1;
						break;
					}	
				}
			if(flag==0)
			{
				ans[ind++]=i+1;
				for(y=0;y<r;y++)
					avail[y]+=alloc[i][y];
				f[i]=1;
			}
			
			}
		}
	}
	printf("\n The safe sequence is:\n");
	for(i=0;i<(n-1);i++)
	{
		printf("p%d->",ans[i]);
	}	
	printf("p%d",ans[n-1]);
	return 0;
		
}
