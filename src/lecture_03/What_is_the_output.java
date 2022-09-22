package lecture_03;

public class What_is_the_output {
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);// due to the function have decrement (n--), then every time the value will be passing is "n" , 
	    // hence the recursion will call again and again;
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
	    int num = 3;
	    print(num);
	}
}
