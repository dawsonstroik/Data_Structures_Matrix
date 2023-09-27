import java.util.Scanner;
public class Matrix {
    private String name;
 private static int column;
private static int row;
/* constructs the new object array/matrix */
private static int[][] matrix;

    public Matrix(int columns, int rows) {
        column = columns;
        row = rows;
        matrix = new int[columns][rows];
    }
    /* this shows how many columns are in the matrix */
    int getcolumn(){
return column;
    }
    /* This returns how many rows are in the matrix */
    int getrow(){
        return row;
    }
    /* set values allows users to changes the values in the array creating the matrix. I coded it so the scanner takes in values
    * until the array is full of numbers. It could have been coded that the user could change a specific value, but that would
    * take much longer to code and then to use the cod it would take longer to change each value. */
    static void setvalues(int column, int row,int value){
        matrix[column][row]=value;
    }
    /* Printmatrix takes the given array and prints out its values.*/
    void printmatrix(){
            for(int i=0; i< matrix.length; i++) {
                for(int j=0; j< matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
