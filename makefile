run: Main.class
	java Main.class

Main.class: Main.java
	javac Main.java

clean:
	*.class

save:
	git add *
	git commit *
	git push origin main
