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

#Declaracao de grafos

grafo = nx.Graph()

#Declaracao de grafos

grafo1 = nx.Graph()

#Declaracao de string

path = " "

#Declaracao de edges e nodes e grafos

arestas = []

#Declaracao de inteiros e floats

maior = 0

path = "/home/wilton/Documents/CC2/T3/G19-LGraph/DataSetsPaj/teste.paj"
#Leitura de grafo a partir de arquivo GML

grafo = nx.read_pajek(path)

#Criacao de arquivo metrica
grafoMetricas = open('/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafoMetricas.txt', 'w')

graus = nx.degree(grafo)

#Impressao de graus de vertices de grafo

grafoMetricas.write("\n\n*** Métrica : DEGREE ***")
for chave in graus:
	grafoMetricas.write("\nNó: " + str(chave)  + " Grau => " + str(graus[chave]))
con = nx.edge_connectivity(grafo)

#Impressao de edge_connectivity de grafo

grafoMetricas.write("\n\n*** Métrica : EDGE_CONNECTIVITY ***")
grafoMetricas.write("\nGrafo grafo Edge_connectivity => " + str(con))
#Laco FOREACH
for v in grafo.nodes():
	if(1==1):
		arq_print.write("\n")
		arq_print.write(str(v))
#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo)

nx.draw(grafo)
plt.title("grafo", size=16)

plt.savefig("/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo")

plt.close()

nos = []
arestas = [("A","B",0),("C","D",1)]

#Insercao de atributos de nodes em grafo
grafo1.add_node("A", peso = 1)
grafo1.add_node("A", cor = "vermelho")
grafo1.add_node("B", peso = 9)
grafo1.add_node("B", cor = "roxo")
grafo1.add_node("C", peso = 10)
grafo1.add_node("C", cor = "azul")
grafo1.add_node("D", peso = 3)
grafo1.add_node("D", cor = "amarelo")
grafo1.add_node("U", peso = 2)
grafo1.add_node("U", cor = "rosa")
grafo1.add_weighted_edges_from(arestas)

#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo1)

nx.draw(grafo1)
plt.title("grafo1", size=16)

plt.savefig("/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo1")

plt.close()

maior = 0
#Laco FOREACH
for j in grafo1.nodes():
	if(grafo1.node[j]['cor']=="azul"):
		arq_print.write("\n")
		arq_print.write("Vertice com cor azul:")
		arq_print.write("\n")
		arq_print.write(str(j))
	if(grafo1.node[j]['peso']>=maior):
		maior = grafo1.node[j]['peso']
arq_print.write("\n")
arq_print.write("O maior peso é:")
arq_print.write("\n")
arq_print.write(str(maior))
nosUP = []
arestas = [("E","A",0),("H","C",9)]

#Insercao de atributos de nodes em grafo por UPDATE
grafo1.add_node("E", peso = 90)
grafo1.add_node("E", cor = "purpura")
grafo1.add_node("H", peso = 2)
grafo1.add_node("H", cor = "marrom")
grafo1.add_weighted_edges_from(arestas)

#Plotagem de grafo

pos=nx.fruchterman_reingold_layout(grafo1)

nx.draw(grafo1)
plt.title("grafo1", size=16)

plt.savefig("/home/wilton/Projetos-Eclipse/T3-CC2-V1/LGraph/grafo1")

plt.close()

maior = 0
#Laco FOREACH
for k in grafo1.nodes():
	if(grafo1.node[k]['cor']=="azul"):
		arq_print.write("\n")
		arq_print.write("Vertice com cor azul:")
		arq_print.write("\n")
		arq_print.write(str(k))
	if(grafo1.node[k]['peso']>=maior):
		maior = grafo1.node[k]['peso']
arq_print.write("\n")
arq_print.write("O maior peso apos update é:")
arq_print.write("\n")
arq_print.write(str(maior))

