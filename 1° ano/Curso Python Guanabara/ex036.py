valorCasa = float(input("Qual o valor da casa que você deseja comprar?"))
salario = float(input("Qual o valor do seu salário?"))
anos = int(input("Em quantos anos você pretende pagar a casa?")) 
aliquotaSalario = (salario / 100) * 30
prestacaoMensal = valorCasa / (anos * 12)

if prestacaoMensal >= aliquotaSalario:
    print(f"Seu empréstimo foi negado, a mensalidade da casa (R$:{prestacaoMensal:.2f}) é maior que 30% de seu salário (R${aliquotaSalario:.2f})")
else:
    print(f"O seu emprestimo foi aceito, sua parcela será no valor de R${prestacaoMensal:.2f}")
