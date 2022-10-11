grammar impl;

start   : hardware inputs outputs latchDec update updateDec simulate simlnp EOF;

hardware: '.hardware' id = IDENTIFIER;
inputs : '.inputs' id = IDENTIFIER;
outputs: '.outputs' id = IDENTIFIER*;
latchDec : ('.latch' id1 = IDENTIFIER '->' id2 = IDENTIFIER)*;
update:  '.update';
updateDec: (id = IDENTIFIER '=' e = expr)*;
simulate:'.simulate';
simlnp: id = IDENTIFIER '=' e = expr;

expr : '(' e = expr ')'                    #Parantheses
     | (b = ('0'|'1'))+                    #Signal
     | id = IDENTIFIER                      #Variable
     | '!' e = expr                        #Negation
     | e1=expr con=('&&' | '||') e2=expr    #Condition
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

