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
    
     double value;
     MyList next;

    public double getValue() {
        return value;
    }

    public MyList getNext() {
        return next;
    }

    public MyList(double value) {
        this.value = value;
        this.next = next;
    }

    public void add(double d) {
         if(next == null){
             next = new MyList(d);
         }else{
             next.add(d);
         }
    }

    public double max() {
         if(next == null){
             return value;
         } else{
             double max = next.max();
             if(max > value){
                 return max;
             }else{
                 return value;
             }
         }
        
    }

    public double min() {
         if(next == null){
             return value;
         }else{
             double min = next.min();
             if(min < value){
                 return min;
             }else{
                 return value;
             }
         }
         }

    public boolean contains(double d) {
        if(next == null){
             return false;
         }else{
            if(value == d){
                return true;
            }else{
                return next.contains(d);
            }
         }
        
    }
    
    public void changeat(double a, double b){
        if(value == a){
            value = b;
            return;
        }else if(next == null){
        return;
}else{
            next.changeat(a,b);
        }
}

    public void clear(double d) {
        if(next == null){
            next = new MyList(d);
        }else{
            next = null;
            next = new MyList(d);
        }
    }

    public void sort() {
        if(next == null) return Double.toString(value);
        else return Double.toString(value) + ", " + next.toString();
    }
}
