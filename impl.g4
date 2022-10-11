grammar impl;

start: command* EOF;

  command : '.hardware' id = IDENTIFIER                         #Hardware
          | '.inputs' id = IDENTIFIER                           #Inputs
          | '.outputs' id = IDENTIFIER*                         #Outputs
          | '.update'                                           #Update
          | '.simulate'                                         #Simulate
          | '.simapl' id = IDENTIFIER '=' e = expr              #Simapl
          | '.latch' id1 = IDENTIFIER '->' id2 = IDENTIFIER     #Latch
          | id = IDENTIFIER '=' e = expr                        #Assigment
          ;

expr : '(' e = expr ')'                    #Parantheses
     | (b = ('0'|'1'))+                    #Signal
     | c = CONST                           #Constant
     | id = IDENTIFIER                     #Variable
     | '!' e = expr                        #Negation
     | e1=expr con=('&&' | '||') e2=expr   #Condition
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;
CONST: [0-9]+;
HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

