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
	( '0'..'9')+

	;
NUM_REAL : 
	('0'..'9')+('.'('0'..'9')+)?
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
	    'data' dec1=variavel (',' outrasDecs+=variavel)* 
	    ;

variavel : 
	   var1=IDENT (',' outrasVars+=IDENT)* ':' t=tipo
	   ;




comandos : (cmds+=cmd)*
	;

objeto_metrica :
		'vertex' IDENT 'in' 'graph' IDENT | 'graph' IDENT
		;

salvar_opcional :
		'save'?
		;

arquivo_grafo :
		'from' 'file' IDENT
	      ;

metrica : 'degree' | 'clustering'

	;

cmd :	salvar_opcional 'create' 'graph' IDENT '(' parametros_create ')'
	| salvar_opcional 'read' 'graph' IDENT arquivo_grafo
	| 'update' 'graph' IDENT 'with' '(' parametros_update ')'
	| 'delete' 'graph' IDENT
	| salvar_opcional 'find' metrica 'of' objeto_metrica
	| 'plot' 'graph' IDENT '(' ')'
	| IDENT '=' atribuicao
	;

parametros_create : 
	    'type' '=' valor_parametro ',' 'nodes' '=' valor_parametro ',' 'edges' '=' 
		valor_parametro
	   ;
	

parametros_update : 
	    'edges' '=' valor_parametro ',' 'nodes' '=' valor_parametro 
	   ;


valor_parametro :
		NUM_INT | NUM_REAL | IDENT | STRING  
		;

tipo:
	'nodes' | 'edges' | 'string' | 'int' | 'float' | 'graph'
       ;

atribuicao :
		NUM_INT | NUM_REAL | IDENT | STRING | nodes | edges 
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
		NUM_INT | NUM_REAL | STRING | /* epsilon */
	   ;

parametros_nodes :
		  NUM_INT (',' parametros_nodes )* | NUM_REAL (',' parametros_nodes )* | STRING (',' parametros_nodes )*
		;

nodes : 
	'[' parametros_nodes (',' parametros_nodes )* ']'
      ;

