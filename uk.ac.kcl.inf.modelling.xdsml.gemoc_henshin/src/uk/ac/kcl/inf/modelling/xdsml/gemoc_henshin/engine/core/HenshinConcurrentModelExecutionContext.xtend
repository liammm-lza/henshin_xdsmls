package uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.core;

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.InvalidRegistryObjectException
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.commons.DefaultConcurrentExecutionPlatform
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.LogicalStepDeciderFactory
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionPlatform
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentRunConfiguration
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension
import org.eclipse.gemoc.executionframework.engine.commons.AbstractModelExecutionContext
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException
import org.eclipse.gemoc.executionframework.extensions.sirius.modelloader.DefaultModelLoader
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode
import uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.solvers.HenshinSolver

class HenshinConcurrentModelExecutionContext extends AbstractModelExecutionContext<IConcurrentRunConfiguration,IConcurrentExecutionPlatform,ConcurrentLanguageDefinitionExtension> implements IConcurrentExecutionContext{

	protected ILogicalStepDecider logicalStepDecider
	protected boolean showSequenceRules
	
	new(IConcurrentRunConfiguration runConfiguration, ExecutionMode executionMode, boolean showSequenceRules) throws EngineContextException {
		super(runConfiguration, executionMode)
		logicalStepDecider = LogicalStepDeciderFactory.createDecider(runConfiguration.getDeciderName(), executionMode);	
		this.showSequenceRules = showSequenceRules;
		//logicalStepDecider = LogicalStepDeciderFactory.createDecider("Step by step user decider", executionMode);	
	}
	override protected createExecutionPlatform() throws CoreException {
		return new DefaultConcurrentExecutionPlatform(_languageDefinition as HenshinLanguageDefinitionExtension , _runConfiguration);
	}
	override protected getLanguageDefinition(String languageName) throws EngineContextException {
		new HenshinLanguageDefinitionExtension(this)
	}
	
	override getFeedbackModel() {
	}
	
	private static class HenshinLanguageDefinitionExtension extends ConcurrentLanguageDefinitionExtension {
		new(HenshinConcurrentModelExecutionContext hmec) {
			super()			
			_configurationElement = new IConfigurationElement() {
				
				override createExecutableExtension(String propertyName) throws CoreException {
					switch (propertyName) {
						case Lang.GEMOC_LANGUAGE_EXTENSION_POINT_XDSML_DEF_LOADMODEL_ATT:
							return new DefaultModelLoader()
						case Lang.GEMOC_LANGUAGE_EXTENSION_POINT_XDSML_DEF_CODEEXECUTOR_ATT:
							return new HenshinCodeExecutor()
						case Lang.GEMOC_LANGUAGE_EXTENSION_POINT_XDSML_DEF_SOLVER_ATT:
							return new HenshinSolver(hmec.showSequenceRules)
						default:
							return null
					}
				}

				override getAttribute(String name) throws InvalidRegistryObjectException {
					switch (name) {
						case Lang.GEMOC_LANGUAGE_EXTENSION_POINT_XDSML_DEF_NAME_ATT:
							return hmec.runConfiguration.languageName
						default:
							throw new UnsupportedOperationException("TODO: auto-generated method stub")
					}
				}

				override getAttribute(String attrName, String locale) throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getAttributeAsIs(String name) throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getAttributeNames() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getChildren() throws InvalidRegistryObjectException {
					#[]
				}

				override getChildren(String name) throws InvalidRegistryObjectException {
					#[]
				}

				override getContributor() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getDeclaringExtension() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getName() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getNamespace() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getNamespaceIdentifier() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getParent() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getValue() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getValue(String locale) throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getValueAsIs() throws InvalidRegistryObjectException {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override isValid() {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}
				
				override getHandleId() {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

			}
		}
		
	}
	
	override getMSEModel() { null }
	
	override getLogicalStepDecider() {
		return logicalStepDecider
	}
	
}
