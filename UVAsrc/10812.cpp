nclude <iostream>
#include <string>
using namespace std;

int main()
{
    int n; int sum; int dif; int one; int two;
        cin>>n;
	    for(int i = 0; i<n; ++i)
	        {
		        cin>>sum; cin>>dif;
			        one = abs(sum-dif)/2;
				        two = sum - one;
					        if(one+two == sum && abs(one-two)== dif){
						         cout<< max(one,two)<<" "<<min(one,two)<<endl;   
							         }
								         else
									             cout<<"impossible"<<endl;
										         }
											 }

