from random import randint
from time import sleep
numAleatorio = randint(0, 5)
print("-=-" * 25)
print("Vou pensar em um número entre 0 e 5. Tente adivinhar...")
print("-=-" * 25)
numEscolhido = int(input("Escolha um número aleatório de 0 a 5: "))
print("Precessando...")
sleep(3)

if numEscolhido == numAleatorio:
    print(f"Parabens você acertou o número aleatório {numAleatorio}")
else:
    print(f"Infelizmente você errou, o número aleatório era {numAleatorio}")