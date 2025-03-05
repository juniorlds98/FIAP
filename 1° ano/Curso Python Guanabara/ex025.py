nomeCompleto = input("Qual o seu nome completo: ").strip().upper()

if nomeCompleto.find("SILVA") > 0:
    print("Um dos seus sobrenomes é Silva")
else:
    print("Você não tem o sobrenome Silva") 