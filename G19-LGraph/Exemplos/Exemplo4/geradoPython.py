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

#Criacao de arquivo metrica
grafoMetricas = open('/home/wilton/Documents/CC2/T3/Teste/LGraph/grafoMetricas.txt', 'w')

graus = nx.degree(grafo)

#Impressao de graus de vertices de grafo

grafoMetricas.write("\n\n*** Métrica : DEGREE ***")
for chave in graus:
	grafoMetricas.write("\nNó: " + str(chave)  + " Grau => " + str(graus[chave]))
con = nx.edge_connectivity(grafo)

#Impressao de edge_connectivity de grafo

grafoMetricas.write("\n\n*** Métrica : EDGE_CONNECTIVITY ***")
grafoMetricas.write("\nGrafo grafo Edge_connectivity => " + str(con))

