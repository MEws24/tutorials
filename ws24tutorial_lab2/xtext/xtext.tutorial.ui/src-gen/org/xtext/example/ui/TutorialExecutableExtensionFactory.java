/*
 * generated by Xtext 2.35.0
 */
package org.xtext.example.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import xtext.tutorial.ui.internal.TutorialActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TutorialExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(TutorialActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		TutorialActivator activator = TutorialActivator.getInstance();
		return activator != null ? activator.getInjector(TutorialActivator.ORG_XTEXT_EXAMPLE_TUTORIAL) : null;
	}

}
