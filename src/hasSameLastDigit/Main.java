package hasSameLastDigit;

public class Main {

	public static void main(String[] args) {
		hasSameLastDigit(13, 14, 16);

	}
	
	
	public static boolean hasSameLastDigit(int x,int y,int z){
        if(x<=9||x>=1001||y<=9||y>=1001||z<=9||z>=1001){
        	System.out.println("false again!");
        	return false;
        }else{
            //if(x<)
            int rem1=x%10;
            int rem2=y%10;
            int rem3=z%10;
            
            if(((rem1==rem2) && (rem2==rem3)) || ((rem2==rem3) && (rem3==rem1)) || ((rem3==rem1) && (rem3==rem1))){
                
                System.out.println("true");
                return true;
            }else{
                System.out.println("false");
                return false;
            }
        }
        
    }

}
