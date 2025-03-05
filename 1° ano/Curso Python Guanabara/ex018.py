from math import sin, cos, tan, radians

angulo = int(input("Escolha um ângulo: "))
radiano = radians(angulo)

seno = sin(radiano)
cosseno = cos(radiano)
tangente = tan(radiano)

print(f"O seu ãngulo escolhido foi: {angulo} e ao calcular ele deu os seguintes resultados: \n Seno: {seno:.2f} \n Cosseno: {cosseno:.2f} \n Tangente: {tangente:.2f}")