grammar impl;

start   : commands EOF;

commands: hardware inputs outputs latchDec update updateDec  simulate simlnp;

hardware: '.hardware' IDENTIFIER;
inputs : '.inputs' e1 = expr;
outputs: '.outputs' e1 = expr*;
latchDec : ('.latch' e1 = expr '->' e2 = expr)*;
update:  '.update';
updateDec: (IDENTIFIER '=' e1 = expr)*;
simulate:'.simulate';
simlnp: IDENTIFIER '=' e1 = expr*;

expr : '(' e1 = expr ')'                    #Parantheses
     | b1 = ('0'|'1')                       #Signal
     | x1 = IDENTIFIER                      #Identifier
     | '!' e1 = expr                        #Negation
     | e1=expr con=('&&' | '||') e2=expr    #Condition
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

