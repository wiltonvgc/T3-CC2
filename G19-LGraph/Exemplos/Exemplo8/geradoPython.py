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

#Declaracao de grafos

grafo = nx.Graph()

#Declaracao de edges e nodes e grafos

arestas = []

#Declaracao de inteiros e floats

maior = 0

nos = []
arestas = [("A","B",0),("C","F",1),("D","E",8),("A","F",0)]

#Insercao de atributos de nodes em grafo
grafo.add_node("A", peso = 1.3)
grafo.add_node("B", peso = 4.5)
grafo.add_node("C", peso = 6.9)
grafo.add_node("D", peso = 7.5)
grafo.add_node("E", peso = 1.7)
grafo.add_node("F", peso = 7.9)
grafo.add_weighted_edges_from(arestas)

maior = 0.0
#Laco FOREACH
for v in grafo.nodes():
	if(grafo.node[v]['peso']>=maior):
		maior = grafo.node[v]['peso']
arq_print.write("\n")
arq_print.write(str(maior))

