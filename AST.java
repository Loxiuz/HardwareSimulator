import java.util.List;


class Grammar_error{
    public static void error(String msg){
        System.err.println("Hardware error: "+msg);
        System.exit(-1);
    }
}
enum Type{

    IDENTIFIER,BOOLEAN
}

class Boolean{
public Type valueType;
public String identifier;  // only valid if value type is string
public Boolean bool;       // only valid if value type is boolean

    Boolean(String identifier){valueType= Type.IDENTIFIER; this.identifier = identifier;}
    Boolean(Boolean bool){valueType = Type.BOOLEAN; this.bool = bool;}
    public String toString(){
    if(valueType == Type.BOOLEAN){
    return"" + bool;
    }
    return "" + identifier;
    }

}


public abstract class AST {
    abstract Boolean eval(Environment env);
    abstract public Type typecheck(Environment env);
}


 abstract class Start extends AST{

    public String hardware;
    public List<String> inputs;     //function inputs
    public List<String> outputs;    //
    public Latch latch;             // store Oscillator -> OscillatorM
    public Update update;           // update Oscillator = !OscillatorM && !Reset
    public List<String> simlulate;

     public Start(String hardware, List<String> inputs, List<String> outputs, Latch latch, Update update, List<String> simlulate) {
         this.hardware = hardware;
         this.inputs = inputs;
         this.outputs = outputs;
         this.latch = latch;
         this.update = update;
         this.simlulate = simlulate;
     }

     public Boolean eval(Environment env){
        for (String inputs: inputs )
         return null;
     }
     public Type typecheck(Environment env) {return ;}

}


class Latch extends AST {
    String id1;
    String id2;

    public Latch(String id1, String id2) {this.id1 = id1;this.id2 = id2;}



    public Boolean eval(Environment env){env.getVariable(id1);

         return ;
     }
    public Type typecheck(Environment env) {return env.getVariable(id1).valueType;}

     }

class Update extends AST {
    public String x1;
    public Expr e1;

    public Update(String x1, Expr e1) {
        this.x1 = x1;
        this.e1 = e1;
    }

    public Boolean eval(Environment env) {
        Boolean a = env.setVariable(x1,e1.eval(env));
        while
       return a;
    }

    public Type typecheck(Environment env) {
        Type bool = e1.typecheck(env);

        if (bool != Type.BOOLEAN)
            Grammar_error.error("none boolean " + e1);

        return Type.BOOLEAN;
    }
}

    class Simulate extends AST {
        String id;
        String c;

        public Simulate(String id, String c) {
            this.id = id;
            this.c = c;
        }

        public Boolean eval(Environment env) {
            env.getVariable(id);

            return ;
        }
        public Type typecheck(Environment env) {return env.getVariable(c).valueType;}
    }


    /*------------------------------------------------EXPR */
    abstract class Expr extends AST {
        //abstract public Boolean eval(Environment env);
    }

    class Parantheses extends Expr {
        Expr e1;

        public Parantheses(Expr e1) {
            this.e1 = e1;
        }

        public Boolean eval(Environment env) {
            Boolean b = e1.eval(env);
            return new Boolean(b);
        }

        public Type typecheck(Environment env) {
            Type b = e1.typecheck(env);
            if (b != Type.BOOLEAN)
                Grammar_error.error("none boolean " + e1);

            return Type.BOOLEAN;
        }
    }

    class Signal extends Expr {
        public String c;

        public Signal(String c) {
            this.c = c;
        }

        public Boolean eval(Environment env) {
            return env.getVariable(c);
        }
        public String toString(){return ""+c;}

        public Type typecheck(Environment env) {return env.getVariable(c).valueType;}

    }

    class Variable extends Expr {
        public String id;

        Variable(String id) {this.id = id;}

        public Boolean eval(Environment env) {return env.getVariable(id);}
        public Type typecheck(Environment env) {return env.getVariable(id).valueType;}

    }
class Negation extends Expr {
    Expr e1;

    public Negation(Expr e1) {this.e1 = e1;
    }

    public Boolean eval(Environment env) {Boolean b = e1.eval(env);return new Boolean(b.bool);}

    public Type typecheck(Environment env) {Type bool = e1.typecheck(env);
        if (bool != Type.BOOLEAN)
            Grammar_error.error("none negation");
            return Type.BOOLEAN;
    }

}

class AND extends Expr {
    Expr e1, e2;

    public AND(Expr e1, Expr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Boolean eval(Environment env) {
        Boolean b1 = e1.eval(env);
        Boolean b2 = e2.eval(env);
        return new Boolean((b1.bool) && (b2.bool));
    }
    //   return e1.eval(env)  && (e2.eval(env));}
}

    public Type typecheck(Environment env){
        Type bool1 =e1.typecheck(env);
        Type bool2 = e2.typecheck(env);
        if(bool1 != Type.BOOLEAN && bool2 !=Type.BOOLEAN)
            Grammar_error.error("none AND_logic ");
        return Type.BOOLEAN;
    }
    public String toString(){return ""+e1+"&&"+e2; }
    }

    class OR extends Expr {
        Expr e1, e2;

        public OR(Expr e1, Expr e2) {
            this.e1 = e1;
            this.e2 = e2;
        }

        public Boolean eval(Environment env) {
            return e1.eval(env) || e2.eval(env);
        }

        public Type typecheck(Environment env) {
            Type bool1 = e1.typecheck(env);
            Type bool2 = e2.typecheck(env);
            if (bool1 != Type.BOOLEAN || bool2 != Type.BOOLEAN)
                Grammar_error.error("none OR_logic ");
            return Type.BOOLEAN;
        }
        public String toString(){return ""+e1+"||"+e2; }
    }


