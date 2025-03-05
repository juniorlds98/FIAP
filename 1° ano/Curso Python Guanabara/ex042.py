r1 = float(input("Escolha o valor da primeira reta: "))
r2 = float(input("Escolha o valor da segunda reta: "))
r3 = float(input("Escolha o valor da terceira reta: "))

if r1 + r2 > r3 and r2 + r3 > r1 and r1 + r3 > r2:
    print("As retas poderão formar um triangulo")
    if r1 == r2 == r3:
        print("Esse é um triângulo Equilátero")
    elif r1 == r2 or r2 == r3 or r1 == r3:
        print("Esse é um triângulo Isósceles")
    else:
        print("Esse é um triângulo Escaleno")
else:
    print("As retas não poderão formar um triangulo")