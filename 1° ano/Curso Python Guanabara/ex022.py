nome = input("Escreva seu nome completo: ")
nomeInteiro = nome.split()
nomeInteiro2 = "".join(nomeInteiro)

print(f"O seu nome é: {nome}\n Seu nome com as letras maiúscula: {nome.upper()} \n Seu nome com as letras minúsculas: {nome.lower()} \n Ele tem {len(nomeInteiro2)} letras \n E seu primeiro nome é: {nomeInteiro [0]} e tem {len(nomeInteiro[0])} letras")