import random
from time import sleep

MAX_NUMERI = 10
MIN_NUMERI = 2
MAX_NUMERO_SUPER = 90
MIN_NUMERO_SUPER = 1
MAX_NUMERI_PESCATI = 20


# CONTROLLO NUMERI DA GIOCARE
def dashboard():
    print("Quanti numeri vuoi giocarti?")
    numeri_giocati = input()

    if (int(numeri_giocati) > MAX_NUMERI):
        print("Impossibile giocare più di " + str(MAX_NUMERI) + " numeri")

    elif (int(numeri_giocati) <= MIN_NUMERI):
        print("Impossibile giocare meno di " + str(MIN_NUMERI) + " numeri")

    return int(numeri_giocati)


# INSERIMENTO DI N NUMERI DA SCEGLIERE
def inserireNumero(lista_numeri):
    test = True

    while test:
        check = True

        print("Inserisci numero:\t")
        num = input()

        if int(num) > MAX_NUMERO_SUPER:
            print("Il numero più grande che si può inserire è " + str(MAX_NUMERO_SUPER))
        elif int(num) < MIN_NUMERO_SUPER:
            print("Il numero meno minore possibile è " + str(MIN_NUMERO_SUPER))

        for n in lista_numeri:
            # print("N : " + str(n))
            # print("num : " + str(num))
            if int(num) == n:
                print("Numero inserito non valido, già è stato scelto.\n")
                check = False
                break

        if check:
            test = False

    return int(num)


# GENERARE NUMERI RANDOM
def generatore():
    list = []
    i = 0
    while i < MAX_NUMERI_PESCATI:
        numero = random.randint(MIN_NUMERO_SUPER, MAX_NUMERO_SUPER)

        if i > 0:
            if isEqual(list, numero):
                continue

        list.append(numero)
        i += 1

    return list


def isEqual(list, value):
    for j, k in enumerate(list):
        if (value == k):
            return True

    return False;


# TESTING
def outNum(list):
    for n in list:
        print(n)


# CONFRONTO NUMERI SCELTI - NUMERI GENERATI
def confronto(list_scelti, list_generati):
    list_indovinati = []

    for i in list_scelti:
        for j in list_generati:
            if i == j:
                list_indovinati.append(i)
                break

    return list_indovinati


# OUT NUMERI
def outputNumeri(text, list, delay):
    print(text)
    for numeri in list:
        sleep(delay)
        print(str(numeri))


def vincita(list):
    pass


if __name__ == "__main__":
    numero_accettabile = True
    numeri_giocati = 0
    list_numeri_scelti = []
    list_numeri_generati = []
    list_numeri_indovinati = []

    while numero_accettabile:
        numeri_giocati = dashboard()
        if numeri_giocati <= MAX_NUMERI and numeri_giocati >= MIN_NUMERI:
            numero_accettabile = False

    for numeri in range(numeri_giocati):
        num = inserireNumero(list_numeri_scelti)
        list_numeri_scelti.append(num)

    list_numeri_generati = generatore()
    # outNum(list_numeri_generati)
    list_numeri_indovinati = confronto(list_numeri_scelti, list_numeri_generati)

    print("...ESTRAZIONE DEI NUMERI...!")
    outputNumeri("numeri generati sono : ", list_numeri_generati, 1)
    outputNumeri("Numeri utilizzati sono : ", list_numeri_scelti, 0.75)
    outputNumeri("Numeri indovinati sono : ", list_numeri_indovinati, 1)
