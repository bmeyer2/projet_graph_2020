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
		$(SRC)/Main.java

all: main exec

main: $(CLASSES)
	@echo "~~~ Building ~~~"
	$(JC) $(JFLAGS) $(SRC)/*.java

exec: 
	java $(SRC).Main

clean:
	@echo "~~~ Cleaning ~~~" 
	rm -f $(SRC)/*.class

mrproper: clean
	rm -f main
	rm -f img/*.png