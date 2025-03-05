#Cores no terminal

#Ansi é o código para representar cores ele sempre começa com \033[mcódigodacor]

#\033[style,text,background m]
#\033[0;33;44m]

#Style: 0 (Nenhum estilo), 1(Negrito), 4(Sublinhado), 7(Negativo)
#Cor de texto: 30(Branco), 31(vermelho), 32(Verde), 33(Amarelo), 34(Azul), 35(Roxo), 36(Azul claro), 37(Cinza)
#Background: 40(Branco), 41(vermelho), 42(Verde), 43(Amarelo), 44(Azul), 45(Roxo), 46(Azul claro), 47(Cinza)

a = 3
b = 5
print(f"Os valores são \033[32;44m{a} e \033[31;44m{b}")

nome = "Guanabara"
cores = {"limpa": '\033[m',
        'azul': '\033[34m',
        'amarelo': '\033[33m',
        'pretoebranco': '\033[7:30m'}
print(f"{cores['pretoebranco']}Ola! Muito prazer em te conhecer,{nome}")