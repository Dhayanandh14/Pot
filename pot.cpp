
#include <iostream>
#include<math.h>
using namespace std;
int main() { 
      int tot=0,calculate=0;
      int n,p;
      cin>>n;
      for(int i=0;i<n;i++){
        cin>>p;
        int last = p%10;
        int remind = p/10;
        int calculate = pow(remind,last);
        tot =tot+calculate;
        
      } 
      cout<<tot<<endl;

}