cidade = input("Qual o nome da sua cidade: ").strip().upper()

if cidade.find("SANTO") == 0:
    print("O nome da sua Cidade começa com Santo")
elif cidade.find("SANTO") > 0:
    print("O nome da sua Cidade contém a palavra Santo")
else:
    print("Em sua Cidade não contém a palavra Santo") 
