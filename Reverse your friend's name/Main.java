#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    string str;
  getline(cin,str);
  for(std::string::reverse_iterator
      i=str.rbegin();i<str.rend();i++)
  {
      cout<<*i;
  }
}