#Exercício 6
x = 0
y = 1
limite = 10
pares = 0
impares = 0
while x < 10:
    if x % 2 == 0:
        pares += 1
    else:
        impares += 1
    x = x + y
print(pares)
print(impares)

