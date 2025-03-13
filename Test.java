//Test.Java
public class Test{
	public static void main(String[] args){
		String test = "1";
		if(test.equals("1")){
			System.out.println("----------Success----------");
		}//end if
		else{
			System.out.println("----------Fail----------");
		}//end else
		long number = Math.round(0.5);
		number = (int) number;
		if (number == 1){
			System.out.println("----------Success----------");
		}//end if
		else{
			System.out.println("----------Fail----------");
		}//edn else
	}// end main
}//end Test
