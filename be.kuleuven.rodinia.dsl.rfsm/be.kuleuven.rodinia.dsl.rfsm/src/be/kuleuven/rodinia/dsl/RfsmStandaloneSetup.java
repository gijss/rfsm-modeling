/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RfsmStandaloneSetup extends RfsmStandaloneSetupGenerated{

	public static void doSetup() {
		new RfsmStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

