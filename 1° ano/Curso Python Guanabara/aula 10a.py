# Condições simples e composta

# As condições em python funcionam como verdadeiro e falso if (verdadeiro) else (falso)

if carro.esquerda():
    bloco True
else:
    bloco False

tempo = int(input("Quantos anos tem seu carro? "))
if tempo <= 3:
    print("Carro novo") #Todo comando que está alinhado à direita irá acontecer em situações específicas
else:
    print("Carro velho")
print("Fim") #Todo comando que está alinhado à esquerda sempre irá acontecer


nome = input("Qual é o seu nome: ")

if nome == "Gustavo":
    print("Que nome lindo você tem!")
else:
    print("Seu nome é tão normal")
print(f"Bom dia, {nome}")

n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))

n = (n1 + n2)/2


if n >= 6.0:
    print("Sua média foi boa, parabens!")
else:
    print("Sua média foi ruim! Estude mais!")