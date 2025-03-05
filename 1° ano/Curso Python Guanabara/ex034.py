salario = float(input("Qual é o valor do seu salário: "))

if salario > 1250.00:
    print(f"Seu salário é muito alto! A aliquota do seu aumento é de 10%, seu novo salário é R$: {(salario*.10)+salario:.2f}")
else:
    print(f"Seu salário é muito baixo! A aliquota do seu aumento é de 15%, seu novo salário é {(salario*.15)+salario:.2f}")