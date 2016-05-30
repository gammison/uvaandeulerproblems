#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int times;
    std::cin >> times;
    for (int i = 0; i < times ; ++i) {
        int nums[3] ={};
        for (int j = 0; j < 3; ++j) {
            cin >> nums[j];
        }
        std::sort(nums,nums+3);
        cout << "Case "<<(i+1)<<": "<<nums[1]<<endl;

    }
    return 0;
}
