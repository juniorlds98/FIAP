frase = input("Escreva uma frase aleatória: ").strip().upper()
contagem = frase.count("A")
primeiraPosicao = frase.find("A")+1
ultimaPosicao = frase.rfind("A")+1

print(f"A letra 'A' aparece {contagem} vezes na frase. A primeira letra 'A' apareceu na posição {primeiraPosicao} e sua última aparição foi na posição {ultimaPosicao}")



