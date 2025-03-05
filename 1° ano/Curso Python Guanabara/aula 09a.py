# String
frase = "Curso em Video Python"
#Cada caracter recebe um índice

# 01. Fatiamento

print(frase[9])

#O python sempre exclui o último item, no caso ele está indo até 12 é sempre 1 a menos, sempre.
print(frase[9:13])

print(frase[9:21])
#Essa não é a melhor forma de fatiar

print(frase[9:21:2])
#saltar intervalos

print(frase[:5])
#Omitir o começo para começar do caracter 0

print(frase[15:])
#Omitir o final para terminar no caracter final

print(frase[9::3])
#Omitir o número final e pulando intervalo de 3

# 02. Análise

print(len(frase))
#Comprimento

frase.count("o", 0, 13)
#Quantas vezes tem uma letra "o" minúscula dentro de um intervalo

frase.find("deo")
#Quantas vezes foi encontrada a palavra "deo"
#Se ele te retornar -1 ele não existe na string indicada

"Curso" in frase
# O operador vai indicar se tem ou não e devolver um boolean

# 03. Transformação

frase = frase.replace("Python", "Android")
#Substituir palavras
# Para que a mudança aconteça é necessário atribuir à uma instância

frase.upper()
#Manter letras em maíusculo

frase.lower()
#Manter letras em minúsculo

frase.capitalize()
#Vai jogar todos os caracteres em minúsculos e manter o primeiro em maiusculo

frase.title()
#Vai transformar todas os primeiros caracteres após espaços

frase.strip()
#irá remover todos os espaços inuteis no começo e no fim da frase

frase.rstrip()
#irá remover todos os espaços inuteis no fim da frase começando a tratar da direita

frase.lstrip()
#irá remover todos os espaços inuteis no começo da frase começando a tratar da esquerda

# 04. Divisão

frase.split()
#Ele cria uma divisão, cria várias listas dentro da lista que já existia

"-".join(frase)
#Ele junta todas as divisões e coloca o que quiser entre os espaços anteriormente existentes