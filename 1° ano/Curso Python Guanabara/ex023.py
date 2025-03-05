numero = int(input("Escolha um número entre 0 e 9999: "))

milhar = numero // 1000
sobraMilhar = numero % 1000
centena = sobraMilhar // 100
sobraCentena = sobraMilhar % 100
dezena = sobraCentena // 10
sobraDezena = sobraCentena % 10
unidade = sobraDezena // 1

print(f"Seu número escolhido foi: {numero} \n Você tem: {milhar} milhar(es) \n Você tem: {centena} centena(s) \n Você tem: {dezena} dezena(s) \n Você tem: {unidade} unidade(s)")


