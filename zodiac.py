print("Enter your birthday: ")
month = int(input("Month (as a number): "))
day = int(input("Day: "))
year = int(input("Year: "))

facts="You "

if((month == 3 and day>=21) or (month == 4 and day<=19)):
	sign = "Aries"
	facts+="are competitive and often make rash decisions"
elif((month == 4 and day>=20) or (month == 5 and day<=20)):
	sign = "Taurus"
	facts+="like to relax but aren't afraid to work hard"
elif((month == 5 and day>=21) or (month == 6 and day<=20)):
	sign = "Gemini"
	facts+="are spontaneous and driven by curiosity"
elif((month == 6 and day>=21) or (month == 7 and day<=22)):
	sign = "Cancer"
	facts+="hide your emotions and make an excellent party host"
elif((month == 7 and day>=23) or (month == 8 and day<=22)):
	sign = "Leo"
	facts+="are passionate and infamously dramatic"
elif((month == 8 and day>=23) or (month == 9 and day<=22)):
	sign = "Virgo"
	facts+="are always busy, but systematic in your approach to life"
elif((month == 9 and day>=23) or (month == 10 and day<=22)):
	sign = "Libra"
	facts+="are fixated on maintaining equilibrium and struggle with decisions"
elif((month == 10 and day>=23) or (month == 11 and day<=21)):
	sign = "Scorpio"
	facts+="are often misunderstood and use emotional energy to fuel your life"
elif((month == 11 and day>=22) or (month == 12 and day<=21)):
	sign = "Sagittarius"
	facts+="are always on a quest for knowledge and are unafraid of change"
elif((month == 12 and day>=22) or (month == 1 and day<=19)):
	sign = "Capricorn"
	facts+="know time is a valuable resource and believe in the power of perseverance"
elif((month == 1 and day>=20) or (month == 2 and day<=18)):
	sign = "Aquarius"
	facts+="are dedicated to making the world a better place but tend to lose focus on personal relationships"
elif((month == 2 and day>=19) or (month == 3 and day<=20)):
	sign = "Pisces"
	facts+="are empathetic and emotionally mature"
else:
	sign = "[undefined]"

facts+="."

animal_list = ["Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"]
animal = animal_list[year%12]

article = "a"
if (sign[0].upper() == "A"):
	article+="n"

print("Since you were born on ",month,"/",day,"/",year,","," you're ",article," ",sign," born in the Year of the ",animal,".",sep="")
print(facts)

#fact & date source: https://www.allure.com/story/zodiac-sign-personality-traits-dates
#animal source: https://www.travelchinaguide.com/intro/social_customs/zodiac/calculator.htm