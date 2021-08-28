#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int max(int arr[], int s, int b){
    int max = 0;
    for(int q = 0; q<s; q++){
        if(arr[q] > max & arr[q] < b){
            max = arr[q];
        }
    }
    return max;
}

void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int size = 0;
  for(int p = 1; p<n; p++){
      size+=p;
  }
  int andarr[size];
  int orarr[size];
  int xorarr[size];
  int index = 0;
  for(int i = 1; i<=n; i++){
      for(int j = i+1; j<=n; j++){
          andarr[index] = i & j;
          orarr[index] = i | j;
          xorarr[index] = i ^ j;
          index++;
      }
  }
  int andmax = max(andarr, size, k);
  int ormax = max(orarr, size, k);
  int xormax = max(xorarr, size, k);
  printf("%d\n", andmax);
  printf("%d\n", ormax);
  printf("%d\n", xormax);
}

int main() {
    int n, k;

    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);

    return 0;
}
