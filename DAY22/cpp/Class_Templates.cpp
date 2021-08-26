#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;

//must add this line
#define cin ios_base::sync_with_stdio(false);cin.tie(NULL); cin

/*Write the class AddElements here*/
template <class T>
class AddElements{
    T element;
    public:
        AddElements(T m1){
            element = m1;
        }
        T add(T n1){
            return n1 + element;
        }
};

//AddElements template specialization
template <>
class AddElements <string>{
    string element;
    public:
        AddElements(string arg){
            element = arg;
        }
        string concatenate(string s2){
            string ans = element+s2;
            return ans;
        }
};

int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);
  int n,i;
  cin >> n;
  for(i=0;i<n;i++) {
    string type;
    cin >> type;
    if(type=="float") {
        double element1,element2;
        cin >> element1 >> element2;
        AddElements<double> myfloat (element1);
        cout << myfloat.add(element2) << endl;
    }
    else if(type == "int") {
        int element1, element2;
        cin >> element1 >> element2;
        AddElements<int> myint (element1);
        cout << myint.add(element2) << endl;
    }
    else if(type == "string") {
        string element1, element2;
        cin >> element1 >> element2;
        AddElements<string> mystring (element1);
        cout << mystring.concatenate(element2) << endl;
    }
  }
  return 0;
}
