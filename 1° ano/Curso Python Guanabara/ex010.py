real = float(input("Quantos reais você tem na carteira"))
dolar = 6.08
euro = 6.42
conversaoDolar = real/dolar
conversaoEuro = real/euro

print(f"Com a sua quantidade de reais {real}, você poderá comprar ${conversaoDolar:.2f} dolares")
print(f"Com a sua quantidade de reais {real}, você poderá comprar ${conversaoEuro:.2f} euros")