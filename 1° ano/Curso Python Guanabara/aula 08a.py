#Import é a palavra para adicionar listas import bebidas
# O import pode ser específico from bebida import cafe

#math é uma biblioteca do python ele trás algumas possibilidades de fazer exercícios com matematica
#math ceil arredonda valores para cima
#math floor arredonda valores para baixo
#math trunc vai eliminar da virgula para frente sem arredondar
#math pow vai ajudar em potência
#math sqrt calcular raiz quadrada
#math factorial ajuda a fazer o calculo fatorial
# para importar a biblioteca inteira pode importar da seguinte forma import match
# para usar bibliotecas específicas é só eu colocar no começo from math import sqrt

#import math
from math import sqrt, ceil
num = int(input("Digite um número: "))
raiz = sqrt(num)
print(f"A raiz de {num} é igual a {ceil(raiz)}")

import random

num = random.randint(1, 10)
print(num)