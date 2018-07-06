package uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.ui.launcher

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.ui.launcher.tabs.LaunchConfigurationMainTab

class LauncherTabGroup extends AbstractLaunchConfigurationTabGroup {

	override createTabs(ILaunchConfigurationDialog dialog, String mode) {
		tabs = #{
			new LaunchConfigurationMainTab,
//			new LaunchConfigurationBackendsTab,
			new CommonTab
		}
	}

}