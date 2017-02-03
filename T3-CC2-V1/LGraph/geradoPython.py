# -*- coding: utf-8 -*-
#!/usr/bin/env python


#Geraçao de codigo LGraph


import networkx as nx

import matplotlib.pyplot as plt

#Configuracoes default para plotagem de grafos

plt.figure(1, figsize=(12, 8))

plt.axis('off')

#Criacao de aarquivo print
arq_print = open('/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/print.txt','w')

#Declaracao de edges e nodes e grafos

nos = []

#Declaracao de edges e nodes e grafos

arestas = []

#Declaracao de grafos

grafo1 = nx.Graph()

#Declaracao de grafos

grafo2 = nx.Graph()

#Declaracao de inteiros e floats

i = 0

#Declaracao de inteiros e floats

maior = 0

#Declaracao de string

s = " "

arq_print.write("\n")
arq_print.write("este e o primeiro print")
nos2 = []
nos = ["A","B",1,2]
#Adicao de nos e arestas nos grafos

grafo1.add_nodes_from(nos)

grafo1.add_weighted_edges_from(arestas)

#Adicao de nos e arestas nos grafos

grafo2.add_nodes_from(nos)

grafo2.add_weighted_edges_from(arestas)

s = "wilton"
arq_print.write("\n")
arq_print.write("este e o segundo print")
maior = 123
#Laco FOREACH
for v in grafo1.nodes():
	if(4>=grafo1.node[v]['peso'] and 4<=7 or "o"=="o"):
		arq_print.write("\n")
		arq_print.write("OK")
		maior = grafo1.node[v]['peso']
		maior = -5
		arq_print.write("\n")
		arq_print.write(str(maior))
	else:
		arq_print.write("\n")
		arq_print.write(str(s))
	if("ola"=="ol" and 1==grafo1.node[v]['peso']):
		arq_print.write("\n")
		arq_print.write("meio")
	else:
		arq_print.write("\n")
		arq_print.write("lucredio")

