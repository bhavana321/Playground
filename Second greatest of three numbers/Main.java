#include<stdio.h>
int find_second_greatest(int n1, int n2,int n3);
int main()
{
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  printf("second greatest = %d",find_second_greatest(n1,n2,n3));;
  return 0;
}
int find_second_greatest(n1,n2,n3)
{
  if(n1>n2&&n1>n3)
  {
    return n2>n3 ? n2 : n3;
  }
  else if(n2>n3)
  {
    return n1>n3 ?n1:n3;
  }
  else
  {
    return n1>n2 ? n1:n2;
  }
}