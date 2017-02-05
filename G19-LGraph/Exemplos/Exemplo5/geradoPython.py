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

nos = ["A","B","C","D","E","F"]
arestas = [("A","B",0),("C","F",1),("D","E",8),("A","F",0)]
#Adicao de nos e arestas nos grafos

grafo.add_nodes_from(nos)

grafo.add_weighted_edges_from(arestas)

#Criacao de arquivo metrica
grafoMetricas = open('/home/wilton/Documents/CC2/T3/Teste/LGraph/grafoMetricas.txt', 'w')

ngraus = grafo.degree("A")

grafoMetricas.write("\n\n*** Métrica : DEGREE ***")
grafoMetricas.write("\nNó: " + str("A")+ " Grau => " + str(ngraus))

