km = float(input("Qual foi a distância percorrida em sua viagem: "))
precoViagemCurta = 0.50
precoViagemLonga = 0.45

if km >= 200.0:
    print(f"Sua viagem foi longa, o preço cobrado por quilômetro é de R$:{precoViagemLonga}, o valor total de sua viagem é R$: {precoViagemLonga * km:.2f}")
else:
    print(f"Sua viagem foi curta, o preço cobrado por quilômetro é de R$:{precoViagemCurta}, o valor total de sua viagem é R$: {precoViagemCurta * km:.2f}")