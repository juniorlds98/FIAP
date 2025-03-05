from time import sleep
from random import choice

print("-=-"*25)
print('''Bem vindo ao jogo do Jokempô!!! ''')
print("-=-"*25)
sleep(2)
print('''Você terá 3 opções:
0 - Pedra
1 - Papel
2 - Tesoura''')
sleep(2)
escolha = int(input("Escolha uma das opções: "))
ppt = [0, 1, 2]
escolhido = choice(ppt)
sleep(3)
print("JO")
sleep(1)
print("KEN")
sleep(1)
print("PO!!!")
sleep(1)
if escolha == 0 and escolhido == 0:
    print("""Computador jogou pedra
Jogador jogou pedra
-------------------
O jogo empatou""")
elif escolha == 0 and escolhido == 1:
    print("""Computador jogou papel
Jogador jogou pedra
-------------------
O computador vence""")
elif escolha == 0 and escolhido == 2:
    print("""Computador jogou tesoura
Jogador jogou pedra
-------------------
O jogador vence""")
elif escolha == 1 and escolhido == 1:
    print("""Computador jogou papel
Jogador jogou papel
-------------------
O jogo empatou""")
elif escolha == 1 and escolhido == 2:
    print("""Computador jogou tesoura
Jogador jogou papel
-------------------
O computador vence""")
elif escolha == 2 and escolhido == 2:
    print("""Computador jogou tesoura
Jogador jogou tesoura
-------------------
O jogo empatou""")
elif escolha == 1 and escolhido == 0:
    print("""Computador jogou pedra
Jogador jogou papel
--------------------
O jogador vence""")
elif escolha == 2 and escolhido == 1:
    print("""O computador escolheu pedra
O jogador escolheu tesoura
---------------------------
O computador vence""")
elif escolha == 2 and escolhido == 1:
    print("""O computador escolheu papel
O jogador escolheu tesoura
---------------------------
O jogador vence""")
else:
    print("Escolha um número válido!")