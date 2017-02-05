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

nos = []

#Declaracao de edges e nodes e grafos

arestas = []

nos = ["A","B",1,2,4,5,"C","D",8.9,"O","ex","9"]
arestas = [("A","B",0),("9",5,1),("C",1,0),("ex",8.9,0),(4,2,0)]
#Adicao de nos e arestas nos grafos

grafo.add_nodes_from(nos)

grafo.add_weighted_edges_from(arestas)

#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo)

nx.draw(grafo)
plt.title("grafo", size=16)

plt.savefig("/home/wilton/Documents/CC2/T3/Teste/LGraph/grafo")

plt.close()


