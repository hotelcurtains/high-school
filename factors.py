try:
	number = int(input("factor this number: "))
except ValueError: 
	print("invalid number, restart")

factors = []
squares = []
sqrt = 1
issquare = False

for i in range(1, number+1):
  if number % i == 0:
    factors.append(i)
    if int(i ** 0.5) == i ** 0.5:
      squares.append(i)

print("\nfactors:", factors)

# normal functionality ends here
# algebra functionality starts here

print("perfect square factors:", squares)

if int(number ** 0.5) == number ** 0.5:
  print(number, "is a prefect square")
  sqrt = int(number ** 0.5)
  issquare = True

if squares[-1] != 1 and issquare != True:
	print("\n√{0} = {1}√{2}".format(number, int(squares[-1]**0.5), int(number/squares[-1])))
elif issquare == True:
	print("\n√{0} = {1}".format(number, sqrt))
else:
	print("\n√{0} cannot be simplified".format(number))