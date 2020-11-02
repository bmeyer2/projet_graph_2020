# # # # # # # # # # # # # # # # # # # # # # # # # # # 
#                                                   #
# Fichier : Makefile                                #
#                                                   #
# Auteurs : DENISET Nicolas & MEYER Bastien         #
#                                                   #
# # # # # # # # # # # # # # # # # # # # # # # # # # #


JC = javac
JFLAG= -g
SRC=m1graf2020
CLASSES = \
		$(SRC)/Node.java \
		$(SRC)/Graf.java \
		$(SRC)/Edge.java \
        TestGrafPW2.java \
		$(SRC)/Main.java

all: main

main: $(CLASSES)
	@echo "~~~ Building ~~~"
	$(JC) $(JFLAGS) $(SRC)/*.java TestGrafPW2.java

exec: 
	@echo "~~~ Starting ~~~"
	java $(SRC).Main
    
test: 
	@echo "~~~ Testing ~~~"
	java TestGrafPW2
    
clean:
	@echo "~~~ Cleaning ~~~" 
	rm -f $(SRC)/*.class
	rm -f *.class
	rm -rf Javadoc

mrproper: clean
	rm -f img/*.png
	
javadoc: 
	@echo "~~~ Javadoc ~~~"
	javadoc m1graf2020 -d Javadoc