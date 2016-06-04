#include<stdio.h>
#include<math.h>
#include<iostream>
int main()
{
    double n,p;double s;
    while(std::cin>>n>>p)
    {
        s=pow(p,1/n);
        printf("%.0lf\n",s);
    }
    return 0;
}
