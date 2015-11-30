import java.util.Arrays;

public class mainClass {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(greeting());
		System.out.println("The reverted text of Manuel is: " + revertArrayOfText("StephanieGama"));
		System.out.println(Arrays.toString(fibonacciSequence(15)));
		System.out.println("The value of the fibonnaci number is " + getFibonnacciNumber(9));
		numberIsPrime(53);
	};
	
	public static String greeting(){
		String text = "Greetings";
		return text;
	};
	
	//This method reverses a string
	public static String revertArrayOfText(String textToRevert){
		String revertedText = "";
		char [] charArray = textToRevert.toCharArray();
		for(int i = textToRevert.length() - 1; i > -1; i--){
//			System.out.println(charArray[i]);
			revertedText = revertedText + String.valueOf(charArray[i]);
		};
		return revertedText;
	};
	
	//This method prints out the fibonnaci numbers sequence until the specified number 
	public static int[] fibonacciSequence(int sequenceNumber){
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//		String fibonnacciSeq = "";
		int[]sequence = new int[sequenceNumber];
		sequence[0] = 0;
		sequence[1] = 1;
		for(int i = 2; i < sequenceNumber; i++){
			sequence[i] = sequence[i-1] + sequence[i-2];
//			System.out.println("the sequence number " + i + " has a value of " + sequence[i]);
		};
//		fibonnacciSeq = Arrays.toString(sequence);
//		System.out.println(fibonnacciSeq);
		return sequence;
	};
	
	//This method returns the value of the fibonnaci number specified
	public static int getFibonnacciNumber(int number){
		int[]fibonnaciSeq = fibonacciSequence(number);
		return fibonnaciSeq[number-1];
	};

	//this method returns either a number is prime or not 
	public static boolean numberIsPrime(int number){
		boolean isPrime = false;
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				isPrime = false;
				System.out.println("The number " + number + " is divisible with " + i);
				break;
			}
			else{
				isPrime = true;
			};
		};
		System.out.println("The number " + number + " is prime? " + isPrime);
		return isPrime;
	};
}

