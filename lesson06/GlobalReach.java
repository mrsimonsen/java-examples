/*Global Reach
Domstrates global variables*/

public class GlobalReach{
	//value is a global variable because we're in the global scope
	static int value = 10;

	public static void readGlobal(){
		System.out.println("From inside the local scope of readGlobal(), value is: "+value);
	}

	public static void shadowGlobal(){
		int value = -10;
		System.out.println("From inside the local scope of shadowGlobal(), value is: "+value);
	}

	public static void changeGlobal(){
		value = -10;
		System.out.println("From inside the local scope of changeGlobal(), value is: "+value);
	}

	public static void main(String[] args){
		System.out.println("In the global scope, value has been set to: "+value);

		readGlobal();
		System.out.println("Back in the global scope, value is still: "+value);

		shadowGlobal();
		System.out.println("Back in the global scope, value is still: "+value);

		changeGlobal();
		System.out.println("Back in the global scpe, value has now changed to: "+value);
	}
}

