package expressionsandstatements;

//public class SimpleCalculator {
//
//	public static void main(String[] args) {
//	}
//
//}


public class SimpleCalculator {


    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return this.firstNumber;
    }
    
    public double getSecondNumber(){
        return this.secondNumber;
    }
    
    
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
        
    }
    
    
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    
    
    public double getSubtractionResult(){
        double subtraction = this.firstNumber - this.secondNumber;
        return subtraction;
    }
    
    
    public double getAdditionResult(){
        double addition = this.firstNumber + this.secondNumber;
        return addition;
    }
    
    
    public double getMultiplicationResult(){
        double multiplication = this.firstNumber * this.secondNumber;
        return multiplication;
    }
    
    
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        }
        else{
        double division = this.firstNumber/this.secondNumber;
        
        return division;
        }
        
    }
    
    
    public static void main(String args[]){
        
        SimpleCalculator sc = new SimpleCalculator();
        
        sc.setFirstNumber(5.0);
        sc.setSecondNumber(4);
        
        System.out.println("add= "+ sc.getAdditionResult());
        System.out.println("subtract= "+sc.getSubtractionResult());
        
        
        
        
        System.out.println("multiply= " + sc.getMultiplicationResult() );
        System.out.println("divide=  "  + sc.getDivisionResult());
    }
    
    
    
    
}