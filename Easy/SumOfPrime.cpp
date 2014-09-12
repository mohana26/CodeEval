#include <iostream> 
using namespace std; 

bool isPrime(int n);

int main() {
    int count = 0; 
    int sum = 1; //1 is a prime 
    int i = 0;
    while(count < 1000) {
        if(isPrime(i)) {
           count++;
           sum += i;
        }
        i++;
    }
}

bool isPrime(int n) {
    if (n % 2 == 0)
		return false;
	// if not, then just check the odds
	for (int i = 3; i * i <= n; i += 2) {
		if (n % i == 0)
			return false;
	}
	return true;
}
