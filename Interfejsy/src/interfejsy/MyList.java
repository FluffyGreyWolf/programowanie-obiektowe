/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfejsy;

/**
 *
 * @author student
 */
public class MyList implements IDataStructure {
    
    private double value;
    private MyList next;

    public void setValue(double value) {
        this.value = value;
    }

    public void setNext(MyList next) {
        this.next = next;
    }

    public double getValue() {
        return value;
    }

    public MyList getNext() {
        return next;
    }

    public MyList(double value) {
        this.value = value;
        this.next = null;
    }
    public void add(double d) {
        if(this.next != null) {
            this.next.add(d);
        } else {
            this.next = new MyList(d);
        }
    }
    public double max() {
        if (this.next == null) {
            return value;
        } else if (this.next.max() > value) {
            return this.next.max();
        } else {
            return value;
        }
    }
    public double min() {
        if (this.next == null) {
            return value;
        } else if (this.next.min() < value) {
            return this.next.min();
        } else {
            return value;
        }
    }
    public boolean contains(double d) {
        if (this.value == d) {
            return true;
        } else {
            if (this.next == null) {
                return false;
            } else {
                return this.next.contains(d);
            }
        }
    }
    public void clear(double d) {
        this.next = null;
        this.value = d;
    }
    public void sort() {
        if (this.next != null) {
            double min = this.min();
            changeat(min, this.value);
            this.next.sort();
        }
        
    }
    public void changeat(double num1, double num2) {
        if (this.value == num1) {
            this.value = num2;
        } else {
            this.next.changeat(num1, num2);
        }
    }
    public String toString() {
        String s = "";
        if (this.next != null) {
            s += 
        }
    }
    
    public static void main(String[] args) {
        MyList list = new MyList(5);
        list.add(45);
        list.add(11);
        System.out.println(list.max());
        System.out.println(list.min());
        System.out.println(list.contains(6));
        System.out.println(list.contains(5));
        list.changeat(45, 100);
        System.out.println(list.max());
        list.clear(10);
        System.out.println(list.max());
        System.out.println(list.min());
    }
    
}
