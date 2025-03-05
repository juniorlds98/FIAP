from time import sleep

print("-=-"* 20)
print("Olá, seja bem-vindo à lojinha")
print("-=-"* 20)
sleep(2)
print("Formas de pagamento:")
print("À vista (dinheiro/cheque): 10% de desconto")
print("À vista (cartão): 5% de desconto")
print("Em até 2x no cartão: Preço normal")
print("Em 3x ou mais no cartão: 20% de juros")
sleep(3)
print("Pensando...")
sleep(3)
precoProduto = float(input("Qual o valor do produto escolhido: "))

print("Pensando...")
sleep(2)
print("Escolha a sua opção a seguir! ->")
print("""1 - A vista (dinheiro ou cheque)
2 - A vista (cartão)
3 - Em até 2x no cartão
4 - Em até 3x ou mais no cartão""")
sleep(2)
pagamento = int(input("Como você irá pagar: "))

if pagamento == 1:
      print(f"O valor do seu produto é R$:{precoProduto:.2f} e com 10% de desconto você irá pagar a vista R$:{(precoProduto/100) * 90:.2f}")
elif pagamento == 2:
      print(f"O valor do seu produto é R$:{precoProduto:.2f} e com 5% de desconto você irá pagar a vista no cartão R$:{(precoProduto/100) * 95:.2f}")      
elif pagamento == 3:
      print(f"O valor do seu produto é R$:{precoProduto:.2f} e esse é o preço final pagando com cartão de crédito")
elif pagamento == 4:
      print(f"O valor do seu produto é R$:{precoProduto:.2f}, inicialmente pagando em 3x o valor ficará R$:{(precoProduto/100) * 120 / 3} com 20% de juros")
else:
      print("Escolha uma forma de pagamento válido!") 