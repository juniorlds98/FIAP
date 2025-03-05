import random

alunos = []
qtdAlunos = 4


while len(alunos) < qtdAlunos:
    aluno = input(f"Informe o nome do aluno {len(alunos)+1}: ")
    alunos.append(aluno)

print ("Sorteio do apagador")
print("")
print(f"O ganhador foi {random.choice(alunos)}")