public class Variable extends Node{
    String name;
    double value;
    Variable(String name){
        this.name = name;
    }
    void setValue(double d){
        value = d;
    }

    @Override
    double evaluate() {
        return sign*value;
    }

    @Override
    Node diff(Variable var) {
        if(var.name.equals(name))return new Constant(1);
        else return new Constant(0);
    }

    @Override
    boolean isZero() {
        if (value == 0)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        String sgn = sign<0?"-":"";
        return sgn+name;
    }
}