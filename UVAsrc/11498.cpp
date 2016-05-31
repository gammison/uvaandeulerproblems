#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int x; int y; int cnt; int divx; int divy;
    while(cin>>cnt >> divx >> divy)
    {
        for (int i = 0; i < cnt; ++i) {
            cin >> x;
            cin >>y;
           // cout << x << " "<<y;
            if(y>divy && x > divx)
                cout<<"NE";
            else if(y>divy && x < divx)
                cout<<"NO";
            else if(y<divy && x<divx)
                cout<< "SO";
            else if(y<divy && x>divx)
                cout<<"SE";
            else
                cout<<"divisa";
            cout<<endl;
        }
    }


    return 0;
}
