n1 = float(input("Digite a sua nota: "))
n2 = float(input("Digite a sua nota: "))

media = (n1 + n2) / 2

if media < 5: 
    print(f"Sua média foi {media:.1f}, infelizmente você foi reprovado")
elif 7 > media >= 5:
    print(f"Sua média foi {media:.1f}, você está de recuperação")
else:
    print(f"Sua média foi {media:.1f}, ela foi bem alta! Parabens, você foi aprovado!")