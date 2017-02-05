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

nos = []
arestas = [("A","B",0),("C","F",1),("D","E",8),("A","F",0)]

#Insercao de atributos de nodes em grafo
grafo.add_node("A", cor = "azul")
grafo.add_node("B", cor = "vermelho")
grafo.add_node("C", cor = "roxo")
grafo.add_node("D", cor = "amarelo")
grafo.add_node("E", cor = "cinza")
grafo.add_node("F", cor = "branco")
grafo.add_weighted_edges_from(arestas)

#Laco FOREACH
for v in grafo.nodes():
	if(grafo.node[v]['cor']=="azul"):
		arq_print.write("\n")
		arq_print.write("vertice com cor azul")

