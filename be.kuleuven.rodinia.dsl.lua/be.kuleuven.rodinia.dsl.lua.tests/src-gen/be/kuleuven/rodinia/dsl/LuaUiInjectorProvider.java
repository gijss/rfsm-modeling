/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LuaUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return be.kuleuven.rodinia.dsl.ui.internal.LuaActivator.getInstance().getInjector("be.kuleuven.rodinia.dsl.Lua");
	}
	
}
