import java.util.Arrays;

public class Assignment01Q04 {

    /* @pre: (direction.equals("L")|direction.equals("R"))
    @Post: shifted Array move to direction */
    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {

        int[] array2 = array.clone(); 

        int Move = 0; 
        if (direction=='R')
            Move = -1*move; 
        if (direction=='L') 
            Move= move;
        if (!(direction=='R')&&!(direction=='L'))
            Move = 0;

        int i = 0; 

        /* L or R */
        if (!(Move==0)&&(int)Move/move==-1) {
            i = i +array.length-1; 
        }

        int index = 0; 

        while (i>=0&&i<array.length&&!(Move==0)) {

            index = i+Move;
            if (index<0) {
                index = index + array.length; 
            }

            System.out.println(String.format("%s %s %s %s", array[i], array2[index%array.length], i, index%array.length));

            array[i] = array2[index%array.length];
            i = i + (int)Move/move; 

        }
        
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}