num = int(input("Escreva um número inteiro aleatório: "))
conversao = int(input("Escolha uma das opções para base de conversão(1: Binário, 2: Octal, 3: Hexadecimal):"))
binario = (bin(num)[2:])
Octal = (oct(num)[2:])
Hexadecimal = (hex(num)[2:])

if conversao == 1:
    print(f"O número {num} convertido em binário é {binario}")
elif conversao == 2:
    print(f"O número {num} convertido em Octal é {Octal}")
elif conversao == 3:
    print(f"O número {num} convertido em Hexadecimal é {Hexadecimal}")
else:
    print("Opção errada, escolha uma das unidades de conversão correta!")
