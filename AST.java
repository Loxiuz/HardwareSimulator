public abstract class AST {}


class start extends AST{}

/*--------------------------------------------------*/

abstract class Commands extends AST{
    abstract public boolean eval();
}

class Hardware extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class Inputs extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class Outputs extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class LatchDec extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class Update extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class UpdateDec extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class Simulate extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

class Simlnp extends Commands {

    @Override
    public boolean eval() {
        return false;
    }
}

/*--------------------------------------------------*/
abstract class Expr extends AST {
    abstract public boolean eval();
}

class And extends Expr {

    Expr e1;
    Expr e2;

    public And(Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    public boolean eval(){return e1.eval() && e2.eval();}
}
    class Or extends Expr{

        Expr e1;
        Expr e2;

        public Or(Expr e1, Expr e2){
            this.e1 = e1;
            this.e2 = e2;
        }
        public boolean eval(){return e1.eval() || e2.eval();}
    }
    class Negation extends Expr {

        Expr e1;

        public Negation(Expr e1){
            this.e1 = e1;
        }
        public boolean eval(){return !e1.eval();}
    }
    class Signal extends Expr {

    public Expr b1;

    public Signal(Expr b1){this.b1 = b1;}

    public boolean eval(){return b1.eval();}

    }
    class Identifier {

        public String id;

        public Identifier(String id) {
            this.id = id;
        }

        public String eval() {return id;}
    }

/*--------------------------------------------------*/