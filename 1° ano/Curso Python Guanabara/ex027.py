nomeCompleto = input("Escreva seu nome completo: ")

ultimoNome = nomeCompleto.split()[-1]
primeiroNome = nomeCompleto.split()[0]

print(f"Seu nome completo é: {nomeCompleto} \n O seu primeiro nome é: {primeiroNome} \n E seu último nome é: {ultimoNome}")