def is_prime(num):
	prime = True #assuming it's prime
	for i in range(2,int(num/2+1)): 
		if (num%i==0):#here it proves if it's composite
			prime = False
			break
	return prime


# finds list of primes from 0 up to final
final = 100
output = list()
for i in range(1,final+1):
	if (is_prime(i)):
		output.append(i)

print(output)