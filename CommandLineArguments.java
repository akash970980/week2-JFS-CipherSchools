package Week2;
class Test1{
	int arg=5;
	
	Test1(){
		System.out.println("I am Default constructor !");
	}
	
	Test1(int arg){
		this();
		this.arg=arg;
	}
	void myTest(int arg) {
//		arg=arg;
		this.arg=arg;
	}
}



class App{
	App(){
		System.out.println("Constructor of App");
	}
	App(int num){
		System.out.println(num);
	}
}

class Test2 extends App{
	Test2(){
//		super();
		super(50);
		System.out.println("Constructor of test2");
	}
}

public class CommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arg=10;
		Test1 onj= new Test1(arg);
//		onj.myTest(arg);
		System.out.println(onj.arg);
		
		
		
		new Test2();
	}

}
