/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.xtext.example.services.TutorialGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument

class TutorialFormatter extends AbstractFormatter2 {
	
	@Inject extension TutorialGrammarAccess
	
	override format(Object obj, IFormattableDocument document) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	// TODO: implement for 
}
