

/**
 * 	The definition of pointcuts and around advices for performance 
 * 	measuring purposes
 * 
 * 	@author Erik Suta
 * */
public aspect AspectCoarse {
	
	/**
	 * 	Execution pointcuts definition
	 * */
	pointcut ackerman(): execution(* AspectJBenchmark.ackermann(..));
	
	pointcut fibonacci(): execution(* AspectJBenchmark.fibonacci(..));
	
	pointcut matrix(): execution(* AspectJBenchmark.matrixMultiplication(..));
	
	pointcut matrixCreation(): execution(* AspectJBenchmark.createMatrix(..));
	
	pointcut matrixMultiplication(): execution(* AspectJBenchmark.matrixMultiplication(..));
	
	pointcut nestedLoop(): execution(* AspectJBenchmark.nestedLoopCalculation(..));
	
	pointcut random(): execution(* AspectJBenchmark.random(..));
	
	pointcut primeNumber(): execution(* AspectJBenchmark.calculatePrimeNumbers(..));
	
	pointcut stringConcat(): execution(* AspectJBenchmark.stringAppending(..));
	
	pointcut longRead(): execution(* AspectJBenchmark.readFromLongFile(..));
	
	pointcut sort(): execution(* AspectJBenchmark.sort(..));
	
	pointcut instantiation(): execution(* AspectJBenchmark.objectInstantiation(..));

	/**
	 * 	Around advices definition
	 * */
	Object around(): ackerman(){
		return proceed();
	}
	
	Object around(): fibonacci(){
		return proceed();
	}
	
	void around(): matrix(){
		proceed();
	}
	
	int[][] around(): matrixCreation(){
		return proceed();
	}
	
	void around(): matrixMultiplication(){
		proceed();
	}
	
	void around(): nestedLoop(){
		proceed();
	}
	
	void around(): random(){
		proceed();
	}
	
	void around(): primeNumber(){
		proceed();
	}
	
	void around(): stringConcat(){
		proceed();
	}
	
	void around(): longRead(){
		proceed();
	}
	
	void around(): sort(){
		proceed();
	}
	
	void around(): instantiation(){
		proceed();
	}
}
