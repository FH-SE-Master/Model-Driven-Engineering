/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj;

import at.ooe.fh.mdm.herzog.dsl.proj.ProjectGeneratorStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ProjectGeneratorStandaloneSetup extends ProjectGeneratorStandaloneSetupGenerated {
  public static void doSetup() {
    ProjectGeneratorStandaloneSetup _projectGeneratorStandaloneSetup = new ProjectGeneratorStandaloneSetup();
    _projectGeneratorStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
