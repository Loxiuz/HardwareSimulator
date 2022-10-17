import org.antlr.v4.runtime.Token;

import java.util.List;

public abstract class AST {}


class Start extends AST{
    //List<String> inputs;
}
class Hardware extends AST {
    public Hardware(String id) {
        this.id = id;
    }
    String id;
}

class Inputs extends AST {
    List<String> id;

    public Inputs(List<String> id) {
        this.id = id;
    }
}
class Outputs extends AST {
    List<String> id;

    public Outputs(List<String> id) {
        this.id = id;
    }
}
class LatchDec extends AST {
    String id1;
    String id2;

    public LatchDec(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

}
class Update extends AST { }
class UpdateDec extends AST { }
class Simulate extends AST { }
class Simlnp extends AST{
    List<String>id;
    public Simlnp(List<String>id) {
        this.id = id;
    }

}


/*--------------------------------------------------*/
abstract class Expr extends AST {
    abstract public boolean eval();
}


class Const extends Expr{
    public String id;
    public Const (String id) {this.id = id;}
    public String eval() {return id;}
}
    class Signal extends Expr {

    public Expr b1;

    public Signal(Expr b1){this.b1 = b1;}

    public boolean eval(){return b1.eval();}

    }
    //true
    class Variable {

        public String id;

        public Variable(String id) {this.id = id;}

        public Boolean eval(Environment env){return env.getVariable(id);}

class Negation extends Expr {

    Expr e1;

    public Negation(Expr e1){
        this.e1 = e1;
    }
    public boolean eval(Environment env){return env.getVariable(e1);}

}

class Condition extends Expr {

    Expr e1;

    public Condition (Expr e1){
        this.e1 = e1;
    }
    public boolean eval(){return !e1.eval();}
}
/*--------------------------------------------------*/