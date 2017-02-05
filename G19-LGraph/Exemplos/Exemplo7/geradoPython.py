# -*- coding: utf-8 -*-
#!/usr/bin/env python


#Geraçao de codigo LGraph


import networkx as nx

import matplotlib.pyplot as plt

#Configuracoes default para plotagem de grafos

plt.figure(1, figsize=(12, 8))

plt.axis('off')

#Criacao de aarquivo print
arq_print = open('/home/wilton/Documents/CC2/T3/Teste/LGraph/print.txt','w')

#Declaracao de inteiros e floats

inteiro = 0

#Declaracao de inteiros e floats

inteiro2 = 0

#Declaracao de inteiros e floats

real = 0

#Declaracao de string

cadeia = " "

inteiro = 2
real = 3.45
cadeia = "ola mundo"
inteiro2 = inteiro
arq_print.write("\n")
arq_print.write(str(inteiro))
arq_print.write("\n")
arq_print.write(str(real))
arq_print.write("\n")
arq_print.write(str(cadeia))
arq_print.write("\n")
arq_print.write(str(inteiro2))

