public abstract class AST {}


class start extends AST{}

/*--------------------------------------------------*/

abstract class Commands extends AST{
    abstract public boolean eval();
}

class Sequence extends Commands{

    @Override
    public boolean eval() {
        return false;
    }
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

    Expr c1;
    Expr c2;

    public And(Expr c1, Expr c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public boolean eval(){return c1.eval() && c2.eval();}
}
    class Or extends Expr{

        Expr c1;
        Expr c2;

        public Or(Expr c1, Expr c2){
            this.c1 = c1;
            this.c2 = c2;
        }
        public boolean eval(){return c1.eval() || c2.eval();}
    }
    class Negation extends Expr {

        Expr c1;

        public Negation(Expr c1){
            this.c1 = c1;
        }
        public boolean eval(){return !c1.eval();}
    }
    class Identifier {

        public String id;

        public Identifier(String id) {
            this.id = id;
        }

        public String eval() {return id;}
    }
    class Const {

        public Integer c;

        public Const(Integer c) {this.c = c;}

        public Integer eval() {return c;}
    }
/*--------------------------------------------------*/