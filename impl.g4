grammar impl;

start :  '.hardware'id= IDENTIFIER
         '.inputs' id1 += IDENTIFIER+
         '.outputs' id2 += IDENTIFIER+
          latch+=latchDec+
         '.update'update+= updateDecl+
         '.simulate'simulate+=simlnp+
         EOF
        ;

latchDec :'.latch' id1 = expr '->' id2 = expr  #Latch;
updateDecl: x1 = IDENTIFIER '=' e1 = expr      #Update;
simlnp: id=IDENTIFIER '=' c=SIGNALS            #Simulate;

expr : '(' e1 = expr ')'      #Parantheses
     | c=SIGNALS              #SIGNALS
     | id = IDENTIFIER        #Variable
     | '!' e1 = expr          #Negation
     | e1=expr '&&'  e2=expr  #AND
     | e1=expr '||' e2=expr   #OR
     ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]+;
SIGNALS : ('0'|'1')+;
HVIDRUM : [ \t\n]+ -> skip;
KOMMENTAR : '//' ~[\n]* -> skip;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

