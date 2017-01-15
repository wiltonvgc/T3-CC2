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

nos3 = []

#Declaracao de edges e nodes e grafos

aresta = []

#Declaracao de edges e nodes e grafos

aresta2 = []

#Declaracao de edges e nodes e grafos

arestas3 = []

#Declaracao de edges e nodes e grafos

n = []

#Declaracao de string

path = " "

aresta = [(1,"A",0),("U",1,0)]
nos = [1,"A","U","t"]
g = ["g","w",7]
aresta2 = [("g","w",0)]
arestas3 = [("a","b",0),("b",1,0)]
#Adicao de nos e arestas nos grafos

grafo1.add_nodes_from(nos)

grafo1.add_weighted_edges_from(aresta)

#Adicao de nos e arestas nos grafos

grafo3.add_nodes_from(nos3)

grafo3.add_weighted_edges_from(arestas3)

#Leitura de grafo a partir de arquivo GML

grafo2 = nx.read_pajek("/home/wilton/teste.paj")

#Atualizacao de nos e arestas nos grafos

grafo1.add_nodes_from(g)

grafo1.add_weighted_edges_from(aresta2)

#Criacao de arquivo metrica
grafo1Metricas = open('/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo1Metricas.txt', 'w')

grafo1Metricas.write("========== MÉTRICAS DE GRAFO grafo1 ==========")
graus = nx.degree(grafo1)

#Impressao de graus de vertices de grafo

grafo1Metricas.write("\n\n*** Métrica : DEGREE ***")
for chave in graus:
	grafo1Metricas.write("\nNó: " + str(chave)  + " Grau => " + str(graus[chave]))
#Criacao de arquivo metrica
grafo2Metricas = open('/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo2Metricas.txt', 'w')

grafo2Metricas.write("========== MÉTRICAS DE GRAFO grafo2 ==========")
graus = nx.degree(grafo2)

#Impressao de graus de vertices de grafo

grafo2Metricas.write("\n\n*** Métrica : DEGREE ***")
for chave in graus:
	grafo2Metricas.write("\nNó: " + str(chave)  + " Grau => " + str(graus[chave]))
#Criacao de arquivo metrica
grafo1Metricas = open('/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo1Metricas.txt', 'w')

grafo1Metricas.write("========== MÉTRICAS DE GRAFO grafo1 ==========")
graus = grafo1.degree("t")

grafo1Metricas.write("\n\n*** Métrica : DEGREE ***")
grafo1Metricas.write("\nNó: " + str("t")+ " Grau => " + str(graus))
centralidades = nx.degree_centrality(grafo1)

#Impressao de centralidade de vertices de grafo

grafo1Metricas.write("\n\n*** Métrica : DEGREE CENTRALITY ***")
for chave in centralidades:
	grafo1Metricas.write("\nNó: " + str(chave)  + " Centralidade => " + str(centralidades[chave]))
centralidades = nx.degree_centrality(grafo2)

#Impressao de centralidade de vertices de grafo

grafo2Metricas.write("\n\n*** Métrica : DEGREE CENTRALITY ***")
for chave in centralidades:
	grafo2Metricas.write("\nNó: " + str(chave)  + " Centralidade => " + str(centralidades[chave]))
con = nx.average_node_connectivity(grafo1)

#Impressao de average_node_connectivity de vertices de grafo

grafo1Metricas.write("\n\n*** Métrica : AVERAGE_NODE_CONNECTIVITY ***")
grafo1Metricas.write("\nGrafo grafo1 Average_node_connectivity => " + str(con))
#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo2)

nx.draw(grafo2)
plt.title("grafo2", size=16)

plt.savefig("/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo2")

plt.close()

#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo1)

nx.draw(grafo1)
plt.title("grafo1", size=16)

plt.savefig("/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo1")

plt.close()

var1 = 9
a = 3.4

