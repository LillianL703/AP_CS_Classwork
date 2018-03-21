package IntegerSet;
/*
 * This program is to merge integersets together. 
 * (Version 2)
 * Editor: Lillian Luo from S3C7.
 * Instructor: Daniel Gunn
 */

/**
 *
 * @author Lillian
 */

public class IntegerSet implements merge{
    public int[] IntegerSet;
    public IntegerSet(int[] a){
        IntegerSet = a;
    } 
    void print(){
        for(int i = 0 ; i < IntegerSet.length; i++){
            System.out.print(IntegerSet[i]);
                if(i + 1 != IntegerSet.length){
                    System.out.print(" ");
                }
        }  
    }
    boolean output(int x){
        for(int i = 0; i < IntegerSet.length; i++){
            if(IntegerSet[i] == x){
                return true;
            }
        }
        return false;
    }
    public Object merge(Object j) {
        int[] x = (int[]) j;
        int length = IntegerSet.length + x.length;
        int[] r = new int[length];
        for(int i = 0 ; i < IntegerSet.length ; i++){
            r[i] = IntegerSet[i];
        }
        for(int i = 0; i < x.length; i++){
            r[IntegerSet.length + i] = x[i];
        }
        IntegerSet = r;
        return r; 
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 16, 32};
        IntegerSet i = new IntegerSet(a);
        int j[] = {8, 16, 32};
        i.merge(j);
        i.print();
    }    
}