public abstract class AST {}


/*--------------------------------------------------*/
abstract class Command extends AST{

}
class Hardware extends Command {

    String id;

    public Hardware(String id){
        this.id = id;
    }
}

class Inputs extends Command {

    Expr e;

    public Inputs(Expr e){
        this.e = e;
    }
}

class Outputs extends Command {

    String id;

    public Outputs(String id){
        this.id = id;
    }
}

class LatchDec extends Command {
    String id1, id2;

    public LatchDec(String id1, String id2){
        this.id1 = id1; this.id2 = id2;
    }
}

class Update extends Command {

}

class UpdateDec extends Command {

    String id;
    Expr e;

    public UpdateDec(String id, Expr e){this.id = id; this.e = e;}
}

class Simulate extends Command {

}

class Simlnp extends Command {

    String id;
    Expr e;

    public Simlnp(String id, Expr e){this.id = id; this.e = e;}

}

/*--------------------------------------------------*/
abstract class Expr extends AST {
    abstract public boolean eval(Environment env);
}

class And extends Expr {

    Expr e1;
    Expr e2;

    public And(Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    public boolean eval(Environment env){return e1.eval(env) && e2.eval(env);}
}
    class Or extends Expr{

        Expr e1;
        Expr e2;

        public Or(Expr e1, Expr e2){
            this.e1 = e1;
            this.e2 = e2;
        }
        public boolean eval(Environment env){return e1.eval(env) || e2.eval(env);}
    }

    class Negation extends Expr {

        Expr e1;

        public Negation(Expr e1){
            this.e1 = e1;
        }
        public boolean eval(Environment env){return !e1.eval(env);}
    }
    class Signal extends Expr {

    public Expr b1;

    public Signal(Expr b1){this.b1 = b1;}

    public boolean eval(Environment env){return b1.eval(env);}

    }
    class Identifier {

        public String id;

        public Identifier(String id) {this.id = id;}

        public boolean eval(Environment env) {return env.getVariable(id);}
    }

/*--------------------------------------------------*/