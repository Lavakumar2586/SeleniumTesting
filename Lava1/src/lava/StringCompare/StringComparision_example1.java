package lava.StringCompare;

public class StringComparision_example1 {

	public static void main(String[] args) {
		String a = "Lava Kumar";
		String b ="Lava Kumar";
	if (a.equals(b)) {
		System.out.println("Variable a value is equals to Variable b");
	}
	System.out.println("************************************");
	System.out.println();
	//<<&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&>>
	 String  c ="Lava Kumar";
	 String  d ="Lava kumar";
	if(c.equals(d)) {
		System.out.println("Variable C value is equals to d -given statement is true");
	} 
	else {
		System.out.println("variable c value is not equals to d value - given statement is false");
	}
	System.out.println("***********************************");
	System.out.println();
	//<<%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%>>
	String e = "Lava Kumar";   
	String f = " Lava Kumar ";
	if(e.equals(f)) {
		System.out.println("Variable e value is equals to f -given statement is true");
	} 
	else {
		System.out.println("variable e value is not equals to f value - given statement is false");
	}
	System.out.println("***********************************");
	System.out.println();
	//<<################################################################>>
	String g = "Lava Kumar";   
	String h = " Lava Kumar ";
	if(g.equals(h)) {
		System.out.println("Variable g value is equals to h -given statement is true");
	} 
	else {
		System.out.println("variable g value is not equals to h value - given statement is false");
	}
	System.out.println("***********************************");
	System.out.println();
	//<<################################################################>>
	
		String i = "Lava Kumar";
		String j = i.toLowerCase();
System.out.println("the value of 'Lava Kumar' in i changed to lowercase as stored in j value:- "+j);
System.out.println(j);
System.out.println("***********************************");
System.out.println();
	
String k = i.toUpperCase();
System.out.println("the value of 'Lava Kumar' in i changed to uppercase as stored in k value:- "+k);
System.out.println(k);
System.out.println("***********************************");
System.out.println();
	//<<@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@>>
String l = "lava Kumar";
String m = "lava";
if (l.contains(m)) {
	System.out.println("l value contains m value ");
}
else {
	System.out.println("l value does not contains m value");
	}
System.out.println("***********************************");
System.out.println();
	// <<!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!>>	
if (m.contains(l)) {
	System.out.println("m value contains l value ");
}
else {
	System.out.println("m value does not contains l value");
	}
System.out.println("***********************************");
System.out.println();
//<<&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&>>
int N = l.charAt(6);
System.out.println("the value of CharAt(6) in 'lava kumar' as :-  "+N);
System.out.println();
System.out.println(N+"   "+l.charAt(6));

	}

}
