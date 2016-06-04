#include<stdio.h>
#include<math.h>
int main()
{
    double n,p;double s;
    while(cin>>n>>p)
    {
        s=pow(p,1/n);
        printf("%.0lf\n",s);
    }
    return 0;
}
