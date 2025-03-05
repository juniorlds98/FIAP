idade = float(input("Qual é a sua idade:"))
alistamento = 17.0
tempo = idade - alistamento

if idade > alistamento:
    if tempo >= 1:
        print(f"Você já passou do tempo de se alistar! Corra, já se passou {int(tempo)} ano(s)!")
    else:
        print(f"Você já passou do tempo de se alistar! Corra, já se passou {int(tempo)} mes(es)!")
elif idade == alistamento:
    print(f"Você está com {int(idade)} anos! O momento para se alistar é agora!")
else:
    if tempo <= -1:
        print(f"Ainda tem tempo para você se alistar, daqui {-int(tempo)} ano(s) se aliste!")
    else:
        print(f"Ainda tem tempo para você se alistar, daqui {-int(tempo * 12)} mes(es) se aliste!")