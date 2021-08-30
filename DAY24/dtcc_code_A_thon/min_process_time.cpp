#include<bits/stdc++.h>
using namespace std;
int minTime(vector<int> processorTime, vector<int> taskTime){
  sort(processorTime.begin(), processorTime.end());
  sort(taskTime.begin(), taskTime.end());
  reverse(taskTime.begin(), taskTime.end());
  int ans = 0;
  int curTask = 0;
  for(int proctime : processorTime){
    for(int i = 0; i <4 ; ++i){
        int completionTime = taskTime[curTask] + proctime;
        curTask++;
        ans = max(ans, completionTime);
    }
  }
  return ans;
}
int main(){
  cout << minTime({10,20},{2,3,1,2,5,8,4,3});
}