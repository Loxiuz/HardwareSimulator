import java.util.List;

public abstract class AST {
    abstract void eval(Environment env);
}


abstract class Start extends AST{

        String hardware;
        List<String> inputs;
        List<String> outputs;
        Latch latch;
        List<String> simlulate;

     public Start(String hardware, List<String> inputs, List<String> outputs, Latch latch, List<String> simlulate) {
                this.hardware = hardware;
                this.inputs = inputs;
                this.outputs = outputs;
                this.latch = latch;
                this.simlulate = simlulate;
     }

     public void eval(Environment env){

     }
}
                class Latch extends Start {
                String id1;
                String id2;

                public Latch(String id1, String id2) {
                    this.id1 = id1;this.id2 = id2;}
                public void eval(Environment env){

                }
            }
            class Update extends AST {
                String x1;
                Expr e1;
                public Update(String x1, Expr e1) {
                    this.x1 = x1;
                    this.e1 = e1;
                }

                public void eval(Environment env){
                    env.setVariable(x1,e1.eval(env));
                }
            }

            class Simulate extends AST{
                List<String>id;
                List<String>c;

                public Simulate(List<String> id, List<String> c) {
                    this.id = id;
                    this.c = c;
                }

                @Override
                void eval(Environment env) {

                }
            }


            /*------------------------------------------------EXPR */
            abstract class Expr extends AST {
                abstract public boolean eval(Environment env);
            }
            class Parantheses extends Expr{
                Expr e1;
                public Parantheses(Expr e1) {this.e1 = e1;}

                public boolean eval(Environment env){return env.getVariable(e1.toString());} //Probably not correct

            }
            class Signal extends Expr {
                public Boolean c;

                public Signal(Boolean c) {
                    this.c = c;
                }

                public boolean eval(Environment env) {
                    return c;
                }

            }
                class Variable extends Expr {
                    public String id;

                    public Variable(String id) {this.id = id;}

                    public boolean eval(Environment env) {
                        return env.getVariable(id);
                    }
                }
                class Negation extends Expr {
                    Expr e1;
                    public Negation(Expr e1){
                        this.e1 = e1;
                    }
                    public boolean eval(Environment env){return !e1.eval(env);}
                }


                class AND extends Expr {
                    Expr e1, e2;
                    public AND (Expr e1, Expr e2) {this.e1 = e1; this.e2 = e2;}
                    public boolean eval (Environment env)
                    {return e1.eval(env)  && (e2.eval(env));}
                }

                class OR extends Expr {
                    Expr e1, e2;
                    public OR (Expr e1, Expr e2) {this.e1 = e1; this.e2 = e2;}
                    public boolean eval (Environment env)
                    {return e1.eval(env)  || (e2.eval(env));}
                }



