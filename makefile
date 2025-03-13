run: Guesser.class
	java Guesser

test: Test.class
	java Test

Guesser.class: Guesser.java
	javac Guesser.java

Test.class: Test.java
	javac Test.java

clean:
	*.class

save:
	git add *
	git commit *
	git push origin main
