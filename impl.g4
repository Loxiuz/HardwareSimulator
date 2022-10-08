grammar impl;

start   : hardware inputs outputs latchDec update updateDec  simulate simlnp  EOF;



hardware: '.hardware' IDENTIFIER ;
inputs : '.inputs' IDENTIFIER  ;
outputs: '.outputs' IDENTIFIER* ;
latchDec : ('.latch' IDENTIFIER '->' IDENTIFIER)*;
update:  '.update' ;
updateDec: (IDENTIFIER '=' expr)*  ;
simulate:'.simulate';
simlnp: IDENTIFIER '=' CONST;

expr : '(' expr ')'
     | CONST
     | IDENTIFIER
     | '!' expr
     | expr ('&&' | '||') expr
     ;

//signal : ('0'|'1');

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

