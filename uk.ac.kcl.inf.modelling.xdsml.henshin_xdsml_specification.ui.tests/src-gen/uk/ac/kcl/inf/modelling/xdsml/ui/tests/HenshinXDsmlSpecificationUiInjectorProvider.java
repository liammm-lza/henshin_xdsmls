/*
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.modelling.xdsml.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.inf.modelling.xdsml.henshin_xdsml_specification.ui.internal.Henshin_xdsml_specificationActivator;

public class HenshinXDsmlSpecificationUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Henshin_xdsml_specificationActivator.getInstance().getInjector("uk.ac.kcl.inf.modelling.xdsml.HenshinXDsmlSpecification");
	}

}