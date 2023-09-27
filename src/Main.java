import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* this is the driver portion of the code. I tried to make it as clear as possible for the user. */
        System.out.println("How many columns are in the matrix?");
        Scanner one = new Scanner(System.in);
        int columns = one.nextInt();
        System.out.println("How many rows are in the matrix?");
        Scanner two = new Scanner(System.in);
        int rows = one.nextInt();
Matrix matrix1 = new Matrix(columns,rows);
/* I wouldn't usually show the rows and columns right after the user typed them in, but it shows the code is working properly.*/
System.out.println(matrix1.getcolumn()+" columns");
System.out.println(matrix1.getrow()+" rows");
        System.out.println("type in values from left to right and top to bottom.");
        /* I could have done this differently so individual values could be selected but this was easiest to
        see if the code was working properly*/
for(int i=0; i<columns;i++){
    for(int j=0; j<rows; j++){
        Scanner setter = new Scanner(System.in);
        int value = one.nextInt();
        matrix1.setvalues(i,j,value);
    }
}
        System.out.println();
matrix1.printmatrix();
    }
}