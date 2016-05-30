#include <iostream>

using namespace std;

int main() {
    string sentence;
    bool alt = true;
    while(std::getline(std::cin, sentence))
    {
        for (int i = 0; i < sentence.length(); ++i) {
            if(sentence[i] == '"')
            {
                if(alt){
                    sentence = sentence.substr(0,i) +(char)96+(char)96+sentence.substr(i+1);
                }
                else
                {
                    sentence = sentence.substr(0,i) +"''"+sentence.substr(i+1);
                }
                alt = !alt;
            }
        }
        std::cout << sentence << std::endl;
    }
    return 0;
}
