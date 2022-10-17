grammar impl;

start   : //hardware inputs outputs latchDec* update updateDec* simulate* simlnp EOF;

'.hardware'id= IDENTIFIER
'.inputs' id1 += IDENTIFIER+
'.outputs' id2 += IDENTIFIER+
latchDec+
'.update'
updateDecl+
'.simulate'
 simlnp+
;

/*hardware: '.hardware'id= IDENTIFIER;
  inputs : '.inputs' id += IDENTIFIER+;
  outputs: '.outputs' id += IDENTIFIER+;
  latchDec :'.latch' id1 = IDENTIFIER '->' id2 = IDENTIFIER;
  update:  '.update';
  updateDec: x1 = IDENTIFIER '=' e1 = expr;
  simulate:'.simulate';
  simlnp: x1 = IDENTIFIER '=' c=CONST;
  */

latchDec :'.latch' id1 = IDENTIFIER '->' id2 = IDENTIFIER  ;
updateDecl: x1 = IDENTIFIER '=' e1 = expr                   ;
simlnp: id=IDENTIFIER '=' c=CONST                             ;


expr : '(' e1 = expr ')'                    #Parantheses
     | b1 = ('0'|'1')                       #Signal
     | c=CONST                              #Const
     | x1 = IDENTIFIER                      #Variable
     | '!' e1 = expr                        #Negation
     | e1=expr con=('&&' | '||') e2=expr    #Condition
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;
CONST : [0-9]*;
HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

