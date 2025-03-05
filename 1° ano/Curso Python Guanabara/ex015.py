diasAlugado = int(input("Quantos dias você ficou com o carro alugado: "))
precoDiaria = 150
kmRodado = float(input("Quantos km rodados: "))
valorkm = 5.50

totalDiaria = (diasAlugado * precoDiaria)
totalKm = (kmRodado * valorkm)
total = (diasAlugado * precoDiaria) + (kmRodado * valorkm)


print(f"O total a pagar pelo aluguel é {total:.2f} sendo {totalDiaria:.2f} em diárias e {totalKm:.2f} em quilômetros.")