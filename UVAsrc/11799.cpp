
#include <iostream>
#include <string>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int terms;
  int temp;
  for(int i = 0; i<n; ++i){
      cin>>terms;
      int max = -1;
      for(int a = 0; a<terms; ++a){
          cin>>temp;
          if(temp>max)
            max=temp;
      }
      cout<<"Case " << i+1 << ": "<<max<<endl;
  }
}
