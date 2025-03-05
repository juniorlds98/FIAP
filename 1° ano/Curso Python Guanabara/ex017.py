catetoOposto = float(input("Qual com comprimento do cateto oposto: "))
catetoAdjacente = float(input("Qual com comprimento do cateto adjacente: "))
hipotenusa = ((catetoOposto ** 2) + (catetoAdjacente ** 2)) ** (1/2)

print(f"O valor do cateto oposto {catetoOposto} + o cateto adjacente {catetoAdjacente} é igual a hipotenusa {hipotenusa:.2f}")