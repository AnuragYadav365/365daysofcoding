#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

//formula to calculate square footage
//((1/4) x √ [ (a+b+c) x (b+c-a) x (c+a-b) x (a+b-c) ])
int square(struct triangle t){
	int a = t.a, b = t.b, c = t.c;
    int area = (a+b+c) * (b+c-a) * (c+a-b) * (a+b-c);
	return area;
}
void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
	for(int g = 0; g<n; g++){
		for (int j = g + 1; j < n; j++)
            if (square(tr[g]) > square(tr[j]))
            {
                struct triangle temp = tr[g];
                tr[g] = tr[j];
                tr[j] = temp;
            }
			else{
				continue;
			}
	}
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
	    printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}