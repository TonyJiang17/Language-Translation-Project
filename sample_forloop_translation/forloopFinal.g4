grammar forloopFinal;		
prog:	doexpr 'end' ';' ;

doexpr:	('do') asgnexpr ('to') I1 bodyexpr ';' ;
asgnexpr:  Var ('=') I1
        ;
bodyexpr: ('put') Var 
    ;

Var: [a-z]+; 
I1: [0-9]+;
WS : [ \t\r\n]+ -> skip;

