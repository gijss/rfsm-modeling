/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LuaAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.tokens");
	}
}
