
def check(n1, n2, n3):
    if n1 < n2 and n1 <n3:
        return n2 + n3
    elif n2 < n1 and n2 < n3:
        return n1 + n3
    else:
        return n1 + n2


def notaSem(cf, sp1, sp2, gs):
    return check(n1,n2,n3) + sp1 + sp2 + gs*0.6

def nf(sem1, sem2):
    return 0.4*sem1 + 0.6*sem2

nf(notaSem(n1,n2,n3,sp1,sp2,gs), notaSem(n1_2,n2_2,n3_3,sp1_2,sp2_2,gs_2))

notaFinal = (notaSem(10,9.5,0,9,9,60), notaSem(10,10,10,8,10,40))

print(notaFinal/10)