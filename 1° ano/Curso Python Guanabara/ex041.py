from datetime import date
dAtual = date.today().year
nascimento = int(input("Digite o seu ano de nascimento: "))

idade = dAtual - nascimento

if idade <= 9:
    print(f"Você tem {idade} anos e está em uma categoria MIRIM")
elif idade <= 14:
    print(f"Você tem {idade} anos e está em uma categoria INFANTIL")
elif idade <= 19:
    print(f"Você tem {idade} anos e está em uma categoria JUNIOR")
elif idade <= 20:
    print(f"Você tem {idade} anos e está em uma categoria SÊNIOR")
else:
    print(f"Você tem {idade} anos e está em uma categoria MASTER")