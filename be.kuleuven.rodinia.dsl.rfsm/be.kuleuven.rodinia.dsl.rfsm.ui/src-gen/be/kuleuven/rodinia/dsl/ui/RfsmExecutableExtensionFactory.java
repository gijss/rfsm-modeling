/*
 * generated by Xtext
 */
package be.kuleuven.rodinia.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import be.kuleuven.rodinia.dsl.ui.internal.RfsmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RfsmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RfsmActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RfsmActivator.getInstance().getInjector(RfsmActivator.BE_KULEUVEN_RODINIA_DSL_RFSM);
	}
	
}
