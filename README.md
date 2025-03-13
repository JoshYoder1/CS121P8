# CS121P8
## Main
```
main():
	keepGoing is True
	while keepGoing:
		output 0) "Exit"
		output 1) "Human Guesser"
		output 2) "Computer Guesser"
		choice is input "Please enter 0-2: "
		if choice is "0":
			keepGoing is False
		else if choice is "1":
			humanGusser()
		else if choice is "2":
			computerGuesser()
```
## humanGuesser()
```
output "human guesser"
answer is random number 1-100
keepGoing is True
guess is 12

while keepGoing:
	counter is 1
	output {counter} + ") Please enter a number: "
	guess is input
	if guess is answer:
		output "got it!"
		keepGoing is false
	else if guess is less than answer:
		output "too low"
	else if guess if greater than answer:
		output "too high"
	counter is counter plus 1
```
## computerGuesser()
```
output "computer guesser"
guess is 50
keepGoing is True
upper is 100
lower is 1
counter = 1

while keepGoing:
	guess = getMedian(upper, lower)
	output {counter} + ") I guess " + {guess}
	output "Too (H)igh, Too (L)ow, (C)orrect"
	result = input
	if result is "H":
		upper is guess
	else if result is "L":
		lower is guess
	else if result is "C":
		keepGoing is False
	counter is counter + 1
```
### getMedian(int upper, int lower)
```
guess is upper plus lower
guess is guess divided by 2
guess is guess rounded
return guess
```
