JFLAGS = -g -classpath src
JC = javac
ARG=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		  src/Main.java \
		  src/MenuGUI.java \
		  src/PracticeGUI.java

default: classes

run: classes
	java -classpath src Main

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class src/*.class
