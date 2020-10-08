import java.util.Scanner;
/**
 * asks user for 10 numbers, sorts those numbers from lowest to highest
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get the user's input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int temp; //the temporary variable to store the number in
    
    //create the array
    int[] numbers = new int[10];

    //ask the user for the numbers
    System.out.println("Please enter in 10 integers to put into the array");
    for(int i = 0; i < numbers.length; i++){
      //store the user's numbers in the array
      numbers[i] = input.nextInt();
    }

    //sort the numbers
    for(int i = 0; i < (numbers.length - 1); i++){ //start a loop that goes from the first index to the second last
      for(int j = (i+1); j < numbers.length; j++){ //start a loop that begins at one more than "i" and compares "i" with every other number in the array
        //if i is more than j, swap the numbers
        if (numbers[i] > numbers[j]){
          //set the temporary variable to the current "i" value
          temp = numbers[i];
          //set "i" to "j"
          numbers[i] = numbers[j];
          //set "j" to the temporary variable (which is the original value of "i")
          numbers[j] = temp;
        }
      }
    }

    //tell the user their number
    System.out.println("The array sorted in ascending order");
    //ascending number loop
    for(int i = 0; i < numbers.length; i++){
      //print the number
      System.out.print(numbers[i]);
      //if it is not the last number
      if(i != (numbers.length - 1)){
        //add a comma
        System.out.print(", ");
      }
    }
  }
}
