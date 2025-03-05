n1 = int(input("Escreva um número inteiro aleatório: "))
n2 = int(input("Escreva outro número inteiro aleatório: "))

if n1 > n2:
    print(f"O número {n1} é maior que o segundo número {n2}")
elif n2 > n1:
    print(f"O número {n2} é maior que o primeiro número {n1}")
else:
    print(f"Os dois números são {n1} e {n2} e eles são iguais")