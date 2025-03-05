import random

alunos = []
qtdAlunos = 4


while len(alunos) < qtdAlunos:
    aluno = input(f"Informe o nome do aluno {len(alunos)+1}: ")
    alunos.append(aluno)

print ("Sorteio da apresentação")
print("")
print(f"A ordem para apresentação será: {random.sample(alunos, k = 4)}")