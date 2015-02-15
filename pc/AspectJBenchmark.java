import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *	@author Erik Suta
 * */
public class AspectJBenchmark {

    public static final int TEST_RUNS = 100000;

    public static void main(String[] args){
    	test_01_ackerman();
    	test_02_fibonacci();
    	test_03_matrix();
    	test_04_nestedLoop();
    	test_05_randomGenerator();
    	test_06_primeNumbers();
    	test_07_stringConcat();
    	test_08_readLongFile();
    	test_09_sort();
    	test_10_instantiation();
    }
    
    public static void test_01_ackerman(){
        printTestName("test_01_ackerman");
        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            ackermann(3,8);
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(1)Time (ns): " + avg);
        System.out.println("(1)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_02_fibonacci(){
        printTestName("test_02_fibonacci");
        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            fibonacci(35);
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(2)Time (ns): " + avg);
        System.out.println("(2)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_03_matrix(){
        printTestName("test_03_matrix");
        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            matrix();
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(3)Time (ns): " + avg);
        System.out.println("(3)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_04_nestedLoop(){
        printTestName("test_04_nestedLoop");
        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            nestedLoopCalculation();
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(4)Time (ns): " + avg);
        System.out.println("(4)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_05_randomGenerator(){
        printTestName("test_05_randomGenerator");

        long[] times = new long[TEST_RUNS*1000];

		Random random = new Random();
        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            random(random);
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(5)Time (ns): " + avg);
        System.out.println("(5)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_06_primeNumbers(){
        printTestName("test_06_primeNumbers");

        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            calculatePrimeNumbers();
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(6)Time (ns): " + avg);
        System.out.println("(6)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_07_stringConcat(){
        printTestName("test_07_stringConcat");

        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            stringAppending(100000);
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(7)Time (ns): " + avg);
        System.out.println("(7)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_08_readLongFile(){
        printTestName("test_08_readLongFile");
        generateLongFile();

        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            readFromLongFile();
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(8)Time (ns): " + avg);
        System.out.println("(8)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_09_sort(){
        printTestName("test_09_sort");

        long[] times = new long[TEST_RUNS];

        int arrayLength = 1000000;
        int[] array = new int[arrayLength];
        Random random = new Random();
        
		for(int i = 0; i < arrayLength; i++){
            array[i] = random.nextInt();
        }

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            sort(array);
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
			
			//Create new array, so we are not sorting already sorted array
			for(int j = 0; j < arrayLength; j++){
				array[j] = random.nextInt();
			}
        }

        long avg = computeAvg(times);

        System.out.println("(9)Time (ns): " + avg);
        System.out.println("(9)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    public static void test_10_instantiation(){
        printTestName("test_10_instantiation");

        long[] times = new long[TEST_RUNS];

        for(int i = 0; i < TEST_RUNS; i++){
            long startTime = System.nanoTime();
            objectInstantiation();
            long endTime = System.nanoTime() - startTime;
            times[i] = endTime;
        }

        long avg = computeAvg(times);

        System.out.println("(10)Time (ns): " + avg);
        System.out.println("(10)Time (ms): " + TimeUnit.MILLISECONDS.convert(avg, TimeUnit.NANOSECONDS));
        sleep();
    }

    private static void sleep(){
        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printTestName(String testName){
        System.out.println(testName + ":");
    }

    private static long computeAvg(long[] times){
        long sum = 0;

        for(int i = 0; i < times.length; i++){
            sum += times[i];
        }

        return sum/TEST_RUNS;
    }

    /**
     *  Ackermann function
     * */
    public static void ackermann(int m, int n){
		ackermannFunction(m, n);
	}
	
	public static int ackermannFunction(int m, int n){
        return (m == 0) ? (n + 1) : ((n == 0) ? ackermannFunction(m - 1, 1) :ackermannFunction(m - 1, ackermannFunction(m, n - 1)));
    }

    /**
     *  Fibonacci sequence
     * */
    public static void fibonacci(int n) {
        fibonacciFunction(n);
    }
	
	public static int fibonacciFunction(int n){
		if(n < 2)
            return 1;

        return(fibonacciFunction(n - 2) + fibonacciFunction(n - 1));
	}
	
    /**
     *  Matrix calculation
     * */
    public static void matrix(){
        int SIZE = 250;

        int m1[][] = createMatrix(SIZE, SIZE);
        int m2[][] = createMatrix(SIZE, SIZE);
        int mm[][] = new int[SIZE][SIZE];

        matrixMultiplication(SIZE, SIZE, m1, m2, mm);
    }

    public static int[][] createMatrix(int rows, int columns) {
        int count = 1;
        int matrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = count++;
            }
        }
        return(matrix);
    }

    public static void matrixMultiplication(int rows, int columns, int[][] matrix_1, int[][] matrix_2, int[][] matrix_3) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int val = 0;

                for (int k = 0; k < columns; k++) {
                    val += matrixMultiplicationOperation(matrix_1[i][k], matrix_2[k][j]);
                }
                matrix_3[i][j] = val;
            }
        }
    }
    
    public static int matrixMultiplicationOperation(int a, int b){
    	return a*b;
    }

    /**
     *  Nested loop calculation
     * */
    public static void nestedLoopCalculation(){
        long number = 0;
        int numberOfRuns = 50;

        for (int i = 0; i < numberOfRuns; i++){
            for (int j = 0; j < numberOfRuns; j++){
                for (int k = 0; k < numberOfRuns; k++){
                    for (int l = 0; l < numberOfRuns; l++){
                        for (int m = 0; m < numberOfRuns; m++){
                            for (int n = 0; n < numberOfRuns; n++){
                            	nestedLoopOperation(number);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void nestedLoopOperation(long number){
    	number++;
    }

    /**
     *  Random Generator
     * */
	public static void random(Random random){
		for(int i = 0; i < 1000; i++){
			generateRandomDouble(random);
		}
	} 
	 
    public static void generateRandomDouble(Random random){
        random.nextDouble();
    }

    /**
     *  Sieve algorithm - calculating prime numbers
     * */
    public static void calculatePrimeNumbers(){
        int NUM = 5000000;

        boolean[] flags = new boolean[NUM + 1];

        int count = 0;

        for(int i = 2; i <= NUM; i++) {
            primeNumberFlagOperation(flags, i);
        }

        for(int i = 2; i <= NUM; i++) {
            if(flags[i]) {

                // remove all multiples of prime: i
                for(int k = i + i; k <= NUM; k += i) {
                    flags[k] = false;
                }

                count++;
            }
        }
    }
	
	public static void primeNumberFlagOperation(boolean[] flags, int i){
		flags[i] = true;
	}

    /**
     *  StringBuilder construction
     * */
    public static void stringAppending(int number){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= number; i++){
			appendOperation(sb, i);	
        }
    }
	
	public static void appendOperation(StringBuilder sb, int i){
		sb.append("Hello").append(i).append("\n");
	}

    /**
     *  Reading from a long file
     * */
    public static void readFromLongFile(){
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("longFile.txt")));
            while ((line = readLine(br)) != null) {
                //nothing is done here
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String readLine(BufferedReader br) throws IOException{
    	return br.readLine();
    }

    public static void generateLongFile(){

        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(new File("longFile.txt")));

            for(int i = 0; i <= 100000; i++){
                br.write("Just another line.\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *  Sorting test
     * */
    public static void sort(int[] array){
        sortOperation(array);
    }
	
	public static void sortOperation(int[] array){
		Arrays.sort(array);
	}

    /**
     *  Object Instantiation
     * */
    public static void objectInstantiation(){
        int operationCount = TEST_RUNS*1000;
		
		for(int i = 0; i <= operationCount; i++){
			createObject();
		}
    }
	
	public static void createObject(){
		Object object = new Object();
	}
}
