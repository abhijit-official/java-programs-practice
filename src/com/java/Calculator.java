

package com.java;

public class Calculator {
    public double a;
    public double b;

    public void setAddition(){
        double add = this.a + this.b;
        System.out.println("addition is = " + add);

    }
    public void setSubtraction(){
        double sub = this.a - this.b;
        System.out.println("subtraction is = " + sub);
    }

    public void setMultiplication() {
        double sub = this.a * this.b;
        System.out.println("multiplication is = " + sub);
    }
    public void setDivision(){
        double div = this.a / this.b;
        System.out.println("division is = " + div );
    }
}
