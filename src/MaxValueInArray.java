import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter size of Array: ");
            size = sc.nextInt();
            if(size>20){
                System.out.print("Size should not exceed over 20");
            }
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element" + (i+1)+ ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for ( int j=0; j<array.length; j++){
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for(int j=0; j<array.length; j++){
            if(max<array[j]){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is: " + max + "  at position: " + index);
    }
}
