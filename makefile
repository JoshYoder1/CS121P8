run: Main.class
	java Main

test: Test.class
	java Test

Main.class: Main.java
	javac Main.java

Test.class: Test.java
	javac Test.java

clean:
	*.class

save:
	git add *
	git commit *
	git push origin main
