def is_prime(n):
    if n == 2:
        return True
    if n % 2 == 0 or n <= 1:
        return False

    sqr = int(n**0.5) + 1

    for divisor in range(3, sqr, 2):
        if n % divisor == 0:
            return False
    return True

def sum_primes(n):
    sum = 0
    for i in range(2, n):
        if is_prime(i):
            sum += i
    return sum

while True:
	end = int(input("Find sum of all primes up to: "))
	if end!=0:
		print(sum_primes(end))
	else:
		print(0)
		break