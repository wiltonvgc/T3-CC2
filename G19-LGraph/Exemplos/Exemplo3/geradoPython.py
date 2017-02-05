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

#Leitura de grafo a partir de arquivo GML

grafo = nx.read_pajek("/home/wilton/Documents/CC2/T3/DataSetsPaj/futebol.paj")

#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo)

nx.draw(grafo)
plt.title("grafo", size=16)

plt.savefig("/home/wilton/Documents/CC2/T3/Teste/LGraph/grafo")

plt.close()


