peso = float(input("Qual é o seu peso:"))
altura = float(input("Qual é sua altura:"))

imc = peso / (altura * altura)

if imc < 18.5:
    print(f"O seu imc é: {imc:.2f}, você está a baixo do seu peso ideal")
elif 18.5 <= imc < 25:
    print(f"O seu imc é: {imc:.2f}, você está no peso ideal")
elif 25 <= imc < 30:
    print(f"O seu imc é: {imc:.2f}, você está com sobrepeso")
elif 30 <= imc < 35:
    print(f"O seu imc é: {imc:.2f}, você está com obeidade tipo 1")
elif 35 <= imc < 40:
    print(f"O seu imc é: {imc:.2f}, você está com obeidade tipo 2")
else:
    print(f"O seu imc é: {imc:.2f}, você está com obesidade mórbida")