nInteiro = int(input("Passe um número inteiro: "))

print(f"""+--------------+
| Tabuada do {nInteiro} |
+--------------+""")
for i in range(0, 11):
    print(f"|{nInteiro} * {i} = {nInteiro*i:6}|") 
print("+--------------+")