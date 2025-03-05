largura = float(input("Qual a largura da sua parede: "))
altura = float(input("Qual a altura da sua parede: "))
area = largura*altura
rendTinta = 2
quantTintaNecessaria = area/rendTinta

print(f"A área da sua parede é {area}m², e você precisa de: {quantTintaNecessaria} litros para pintar sua parede")