velocidade = float(input("Qual a velocidade que o carro está: "))
limite = 80.0
valorKM = 7.00
if velocidade > limite:
    print(f"Você foi multado, o valor da sua multa é R$:{(velocidade - limite) * valorKM :.2f}")
else:
    print(f"Parabens sua velocidade era de {velocidade}, você está dentro do limite permitido")