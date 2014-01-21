package three.controller;

import three.view.StringView;

/**
 * 
 * @author dkra2151
 *
 */

public class StringController
{
	private StringView myView;
	
	/**
	 * Creates a StringController object, initializing all values as needed.
	 */
	public StringController()
	{
		myView = new StringView();
		
	}
	/**
	 *  Starts the code stating with the displayRuntimeError method.
	 */
	public void start()
	{
//		//myView.displayRunTimeError();
//		//String temp = myView.sendParameterMethod();
//		myView.usePassedValue(temp);
//		
//		myview.usePassedValue(myView.sendParameterMethod());
//		
//		myView.moreInteractive("Devvin", temp );
//		
	myView.testStringMethods();
		
	}
}
