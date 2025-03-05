#Exercício 7
#x = 8
#y = 9
#z = 10

#soma = x + y + z
#media = soma/3
#print(media)
notas = 0
media = 0
while True:
    nota = input("Qual sua nota: ")
    if nota == "sair":
        break
    elif int(nota) > 0:
        notas = notas + 1
        print(notas)