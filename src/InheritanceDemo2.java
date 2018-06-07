class Harry {
    public void method1() {
        System.out.println("harry 1");
    }

    public void method2() {
        method1();
        System.out.println("harry 2");
    }
}

class Larry extends Harry {
    public void method1() {
        System.out.println("larry 1");
        super.method1();
    }
}

class Mary extends Larry {
    public void method2() {
        System.out.println("mary 2");
    }

    public void method3() {
        super.method1();
        System.out.println("mary 3");
    }
}

class Jerry extends Mary {
    public void method2() {
        super.method2();
        System.out.println("jerry 2");
    }
}

public class InheritanceDemo2{
	
	public static void main(String[] args){
		
		Harry var1 = new Harry();
		Harry var2 = new Larry();
		Larry var3 = new Jerry();
		Mary var4 = new Mary();
		Mary var5 = new Jerry();
		Object var6 = new Larry();
		
		var1.method1(); 	
		var2.method1(); 	
		var3.method1(); 	
		var4.method1(); 	
		var5.method1(); 	
		//var6.method1(); 	
		var1.method2(); 	
		var2.method2(); 	
		var3.method2(); 	
		var4.method2(); 	
		var5.method2(); 	
		//var6.method2(); 	
		//var3.method3(); 	
//		var5.method3(); 	
//		((Larry) var1).method1(); 	
//		((Mary) var2).method2(); 	
//		((Jerry) var5).method1(); 	
//		((Mary) var5).method3(); 	
//		((Jerry) var4).method3(); 	
//		((Mary) var6).method3();
		
	}
	
}
