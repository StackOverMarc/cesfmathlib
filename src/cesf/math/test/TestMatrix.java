package cesf.math.test;

import cesf.math.Matrix;

public class TestMatrix {

    /** 
     * programa de prova per a matrius
     */
    public static void main(String[] args) {
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix D = new Matrix(d);
        System.out.println(D);        
        System.out.println();

        Matrix A = Matrix.random(5, 5);
        System.out.println(A); 
        System.out.println();

        A.swapRows(1, 2);
        System.out.println(A); 
        System.out.println();

        Matrix B = A.transpose();
        System.out.println(B); 
        System.out.println();

        Matrix C = Matrix.identity(5);
        System.out.println(C); 
        System.out.println();

        System.out.println(A.add(B));
        System.out.println();

        System.out.println(B.multiply(A));
        System.out.println();

        /** hauria de ser fals: A*B != B*A en general */    
        System.out.println(A.multiply(B).equals(B.multiply(A)));
        System.out.println();

        /**  x +  y +  z = -2 */
        /** 2x +  y -  z =  1 */
        /**  x + 2y + 3z = -6 */
        double[][] e = { {1, 1, 1}, {2, 1, -1}, {1, 2, 3} }; 
        Matrix E = new Matrix(e);
        double[][] f = { {-2}, {1}, {-6} };
        Matrix F = new Matrix(f);
        Matrix X = E.solve(F);
        System.out.println(X);
        System.out.println();
    }
}
