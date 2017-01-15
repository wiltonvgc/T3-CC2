# -*- coding: utf-8 -*-
#!/usr/bin/env python


#Geraçao de codigo LGraph


import networkx as nx

import matplotlib.pyplot as plt

#Configuracoes default para plotagem de grafos

plt.figure(1, figsize=(12, 8))

plt.axis('off')

#Declaracao de inteiros e floats

var_1 = 0

#Declaracao de inteiros e floats

var2 = 0

#Declaracao de inteiros e floats

var3 = 0

#Declaracao de inteiros e floats

var1 = 0

#Declaracao de inteiros e floats

a = 0

#Declaracao de inteiros e floats

b = 0

#Declaracao de inteiros e floats

c = 0

#Declaracao de inteiros e floats

j = 0

#Declaracao de grafos

grafo2 = nx.Graph()

#Declaracao de grafos

grafo1 = nx.Graph()

#Declaracao de grafos

grafo3 = nx.Graph()

#Declaracao de grafos

grafo4 = nx.Graph()

#Declaracao de edges e nodes e grafos

nos = []

#Declaracao de edges e nodes e grafos

g = []

#Declaracao de edges e nodes e grafos

aresta = []

#Declaracao de edges e nodes e grafos

aresta2 = []

#Declaracao de edges e nodes e grafos

n = []

#Declaracao de string

path = " "

aresta = [(1,"A",0),("U",1,0)]
nos = [1,"A","U"]
g = ["g","w",7]
aresta2 = [("g","w",0)]
#Adicao de nos e arestas nos grafos

grafo2.add_nodes_from(nos)

grafo2.add_weighted_edges_from(aresta)

#Adicao de nos e arestas nos grafos

grafo1.add_nodes_from(nos)

grafo1.add_weighted_edges_from(aresta)

#Adicao de nos e arestas nos grafos

grafo3.add_nodes_from(nos)

grafo3.add_weighted_edges_from(aresta)

#Atualizacao de nos e arestas nos grafos

grafo1.add_nodes_from(g)

grafo1.add_weighted_edges_from(aresta2)

#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo1)

nx.draw(grafo1)
plt.title("grafo1", size=16)

plt.savefig("grafo1")

plt.close()

var1 = 9
a = 3.4

