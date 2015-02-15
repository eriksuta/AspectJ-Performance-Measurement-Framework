
/**
 * 	The definition of pointcuts and around advices for performance 
 * 	measuring purposes
 * 
 * 	@author Erik Suta
 * */
public aspect AspectFine {
	
	/**
	 * 	Execution pointcuts definition
	 * */
	pointcut ackerman(): execution(* AspectJBenchmark.ackermann(..));
	
	pointcut ackermanFunction(): execution(* AspectJBenchmark.ackermannFunction(..));
	
	pointcut fibonacci(): execution(* AspectJBenchmark.fibonacci(..));
	
	pointcut fibonacciFunction(): execution(* AspectJBenchmark.fibonacciFunction(..));
	
	pointcut matrixCreation(): execution(* AspectJBenchmark.createMatrix(..));
	
	pointcut matrixMultiplication(): execution(* AspectJBenchmark.matrixMultiplication(..));
	
	pointcut matrixOperation(): execution(* AspectJBenchmark.matrixMultiplicationOperation(..));
	
	pointcut nestedLoop(): execution(* AspectJBenchmark.nestedLoopCalculation(..));
	
	pointcut nestedLoopOperation(): execution(* AspectJBenchmark.nestedLoopOperation(..));
	
	pointcut random(): execution(* AspectJBenchmark.random(..));
	
	pointcut randomFunction(): execution(* AspectJBenchmark.generateRandomDouble(..));
	
	pointcut primeNumber(): execution(* AspectJBenchmark.calculatePrimeNumbers(..));
	
	pointcut primeNumberOperation(): execution(* AspectJBenchmark.primeNumberFlagOperation(..));
	
	pointcut stringConcat(): execution(* AspectJBenchmark.stringAppending(..));
	
	pointcut appendOperation(): execution(* AspectJBenchmark.appendOperation(..));
	
	pointcut longRead(): execution(* AspectJBenchmark.readFromLongFile(..));
	
	pointcut readLine(): execution(* AspectJBenchmark.readLine(..));
	
	pointcut sort(): execution(* AspectJBenchmark.sort(..));
	
	pointcut sortOperation(): execution(* AspectJBenchmark.sortOperation(..));
	
	pointcut instantiation(): execution(* AspectJBenchmark.objectInstantiation(..));
	
	pointcut createObject(): execution(* AspectJBenchmark.createObject(..));

	/**
	 * 	Around advises definition
	 * */
	void around(): ackerman(){
		proceed();
	}
	
	Object around(): ackermanFunction(){
		return proceed();
	}
	
	void around(): fibonacci(){
		proceed();
	}
	
	Object around(): fibonacciFunction(){
		return proceed();
	}
	
	int[][] around(): matrixCreation(){
		return proceed();
	}
	
	void around(): matrixMultiplication(){
		proceed();
	}
	
	int around(): matrixOperation(){
		return proceed();
	}
	
	void around(): nestedLoop(){
		proceed();
	}
	
	void around(): nestedLoopOperation(){
		proceed();
	}
	
	void around(): random(){
		proceed();
	}
	
	void around(): randomFunction(){
		proceed();
	}
	
	void around(): primeNumber(){
		proceed();
	}
	
	void around(): primeNumberOperation(){
		proceed();
	}
	
	void around(): stringConcat(){
		proceed();
	}
	
	void around(): appendOperation(){
		proceed();
	}
	
	void around(): longRead(){
		proceed();
	}
	
	String around(): readLine(){
		return proceed();
	} 
	
	void around(): sort(){
		proceed();
	}
	
	void around(): sortOperation(){
		proceed();
	}
	
	void around(): instantiation(){
		proceed();
	}
	
	void around(): createObject(){
		proceed();
	}
	
	/**
	 * 	Before advises definition
	 * */
	/*
	before(): ackerman() {}

	before(): ackermanFunction() {}	
	
	before(): fibonacci() {}

	before(): fibonacciFunction() {}	
	
	before(): matrix() {}	
	
	before(): matrixCreation() {}	
	
	before(): matrixMultiplication() {}	
	
	before(): matrixOperation() {}	
	
	before(): nestedLoop() {}	
	
	before(): nestedLoopOperation() {}	
	
	before(): random() {}

	before(): randomFunction() {}	
	
	before(): primeNumber() {}	
	
	before(): primeNumberOperation() {}	
	
	before(): stringConcat() {}	
	
	before(): appendOperation() {}
	
	before(): longRead() {}	
	
	before(): readLine() {}	
	
	before(): sort() {}

	before(): sortOperation() {}	
	
	before(): instantiation() {}
	
	before(): createObject() {}
	*/
	
	/**
	 * 	After advises definition
	 * */
	/* 
	after(): ackerman() {}	
	
	after(): ackermanFunction() {}
	
	after(): fibonacci() {}	
	
	after(): fibonacciFunction() {}	
	
	after(): matrix() {}	
	
	after(): matrixCreation() {}	
	
	after(): matrixMultiplication() {}	
	
	after(): matrixOperation() {}	
	
	after(): nestedLoop() {}	
	
	after(): nestedLoopOperation() {}	
	
	after(): random() {}	
	
	after(): randomFunction() {}
	
	after(): primeNumber() {}	
	
	after(): primeNumberOperation() {}	
	
	after(): stringConcat() {}	
	
	after(): appendOperation() {}
	
	after(): longRead() {}	
	
	after(): readLine() {}	
	
	after(): sort() {}	
	
	after(): sortOperation() {}	
	
	after(): instantiation() {}
	
	after(): createObject(){}
	*/
}
