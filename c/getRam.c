#include "stdio.h"
int main(){
	int Mb = 0;
	while ( malloc(1<<20)) ++Mb;
	printf("Allocated %d Mb total\n", Mb);
}
