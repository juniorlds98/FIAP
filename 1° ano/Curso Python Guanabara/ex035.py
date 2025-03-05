r1 = float(input("Escolha o valor da primeira reta: "))
r2 = float(input("Escolha o valor da segunda reta: "))
r3 = float(input("Escolha o valor da terceira reta: "))

if r1 + r2 > r3 and r2 + r3 > r1 and r1 + r3 > r2:
    print("As retas poderão formar um triangulo")
else:
    print("As retas não poderão formar um triangulo")