
package org.javaturk.oopj.ch02;

/**
 * An example to show how code conventions are applied when naming in a Java class.
 * 
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class Naming {
	private int integerVariable; 
	private double doubleVariable;

	public static void main(String[] args) {
		Naming namingDemo = new Naming();
		namingDemo.integerVariable = 95;
		namingDemo.doubleVariable = 0.33;
		namingDemo.simpleMethod(2, 5);
		namingDemo.simpleMethod(8, 4, false);
	}
	
	public void simpleMethod(int parameter1, int parameter2){
		System.out.println("in aSimpleMethod(int parameter1, int parameter2)");
	}
	
	public void simpleMethod(int parameter1, long parameter2, boolean parameter3){
		System.out.println("in anotherSimpleMethod(int parameter1, long parameter2, boolean parameter3)");
	}
}
