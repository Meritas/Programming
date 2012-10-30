#include <stdio.h>

int isPrime( int isP );

int main() {
	

float x, sum;
int i;

for ( x = 999; ( x<=0 )||( x>=1 ); ) {
	scanf("%f", &x);
	}

for ( i = 3;;i++) {
	if ( isPrime(i) == 0 ) {
		continue;
		}
	if ( isPrime(i+2) == 0 ) {
		continue;
		} else {
		sum = 0;
		sum = (float)1/i + (float)1/(i+2);
		if ( sum < x ) {
			break;
			}
		}
	}

printf("%f", sum);
	
return 0;
}


int isPrime ( int isP ) {
	int k;
	for ( k = 2; k < isP; k++ ) {
		if ( isP % k == 0 ) {
			return 0;
			}
		}
	return 1;
	}
