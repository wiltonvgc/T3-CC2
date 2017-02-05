//Gramatica para LGraph
//java -jar ~/Projetos-Eclipse/T3-CC2-V1/lib/antlr-4.6-complete.jar -package gramatica LGraph.g4 -visitor


grammar LGraph;

FINAL : 
	       'end'
		;

INICIO :
		'begin'
		;

IDENT :
	('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
	;

NUM_INT : 
	('+' |'-')?( '0'..'9')+

	;
NUM_REAL : 
	('+' | '-')?('0'..'9')+('.'('0'..'9')+)?
	;

STRING : 
	'\"' ~('\n' | '\r' | '"')* '\"'
    	;


WS  :   ( ' ' 
        | '\t' 
        | '\r' 
        | '\n' 
        ) {skip();}
	;

COMENTARIO : 
		('/*'  .*?  '*/') {skip();} 
	;

inicio : 
	programa
	;

programa :
	INICIO corpo FINAL
	;


corpo :
	declaracoes comandos
      ;


declaracoes :
	    'data' dec1=variavel (',' outrasDecs+=variavel)* | 
	    ;

variavel : 
	   var1=IDENT (',' outrasVars+=IDENT)* ':' (t=tipo | nt=nodes_atributos)
	   ;

nodes_atributos : 
                'nodes' '(' at1=IDENT ':' tan1=tipo_atributo_node (',' ats+=IDENT ':' tans+=tipo_atributo_node)* ')'
		;


tipo_atributo_node : 
	       		'float' | 'int' | 'string'
		;

comandos : (cmds+=cmd)*
	;

objeto_metrica :
		'vertex' v=STRING 'in' 'graph' id_vert=IDENT | 'graph' id_graph=IDENT
		;

salvar_opcional :
		'save'?
		;

arquivo_grafo :
		'from' 'file' (id=IDENT | str=STRING)
	      ;

metrica : 'degree' | 'degree_centrality' | 'average_node_connectivity' | 'edge_connectivity' | 'node_connectivity'  

	;

caminho : 
	'MST' | 'CM'
	;	

cmd :	'create' 'graph' id_grafo=IDENT '(' parametros_create ')'
	| 'read' 'graph' id_gf = IDENT arquivo_grafo
	| 'update' 'graph' id_grafo_up=IDENT 'with' '(' parametros_update ')'
	| 'find' metrica 'of' objeto_metrica
	| 'plot' 'graph' id_plot=IDENT
	| 'foreach' 'vertex' id=IDENT 'in' g_id=IDENT cf=corpo_for
	| id1=IDENT '=' atribuicao
	| imprimir
	;

corpo_for : 
	   'begin' comandos_for 'end'
	   ;

comandos_for :
		('if' '(' ctx_if+=expressao_if ')' cif+=corpo_if)*  
		
	     ;

corpo_if :
	  'begin'  coms+=comandos_if* 'end' ('else' celse=corpo_else)?
	  ;

comandos_if : 
		imprimir | at=IDENT '=' atribuicao_for
	   ;

atribuicao_for :
		NUM_INT | NUM_REAL | id=IDENT | STRING | nodes | edges | nodes_atributos_atribuicao | id1=IDENT '.' id2=IDENT
	  ;

imprimir : 
	'print''('(STRING | IDENT)')'

	  ;

corpo_else:
           'begin'  imp+=imprimir* 'end'
          ;



expressao_if :
		exp_relacional | exp_igualdade
	     ;

exp_relacional :
		(op1_int=NUM_INT | op1_real=NUM_REAL | (op1_v=IDENT '.' at1=IDENT) | op1_id=IDENT) op=op_relacional (op2_int=NUM_INT | op2_real=NUM_REAL | op2_v=IDENT '.' at2=IDENT | op2_id=IDENT) (mais+=mais_exp)*
		;


mais_exp :
		op_logico (exp_relacional | exp_igualdade)
	 ;

op_logico : 
	  'AND' | 'OR'
	;

op_relacional : 
		'<' | '>' | '<=' | '>='
	      ;

exp_igualdade :
		(op1_int=NUM_INT | op1_real=NUM_REAL | op1_v=IDENT '.' at1=IDENT | op1_id=IDENT | op1_s=STRING) op=op_igualdade (op2_int=NUM_INT | op2_real=NUM_REAL | op2_id=IDENT | op2_s=STRING | op2_v=IDENT '.' at2=IDENT) (mais+=mais_exp)*
	       ;

op_igualdade :
		'==' | '!='
	     ;


parametros_create : 
	    'nodes' '=' v2=valor_parametro ',' 'edges' '=' 
		v3=valor_parametro
	   ;
	

parametros_update : 
	    'nodes' '=' v1=valor_parametro ',' 'edges' '=' v2=valor_parametro 
	   ;


valor_parametro :
		IDENT 
		;

tipo:
	'nodes' | 'edges' | 'string' | 'int' | 'float' | 'graph'
       ;

atribuicao :
		NUM_INT | NUM_REAL | IDENT | STRING | nodes | edges | nodes_atributos_atribuicao
	  ;

nodes_atributos_atribuicao :
	'[' ('(' (id=NUM_INT | id=NUM_REAL | id=STRING)  (',' ats1+=IDENT '=' (t+=NUM_INT | t+=NUM_REAL | t+=STRING) )+ ')' ) (atrn+=atributos_nodes_v)* ']'

	;

atributos_nodes_v : 
		',' '(' (id=NUM_INT | id=NUM_REAL | id=STRING)  (',' atsn+=IDENT '=' (t+=NUM_INT | t+=NUM_REAL | t+=STRING) )+ ')' 
		;

edges :
	'[' tupla (',' tupla)* ']'
      ;

tupla : 
	'(' tipos_tupla ',' tipos_tupla ',' tipos_tupla_op ')'
	
      ;


tipos_tupla :
		NUM_INT | NUM_REAL | STRING
	   ;

tipos_tupla_op :
		NUM_INT 
	   ;

parametros_nodes :
		  NUM_INT (',' parametros_nodes )* | NUM_REAL (',' parametros_nodes )* | STRING (',' parametros_nodes )*
		;

nodes : 
	'[' parametros_nodes (',' parametros_nodes )* ']'
      ;

