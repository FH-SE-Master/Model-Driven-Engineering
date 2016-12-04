/**
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.web;

import at.ooe.fh.mdm.herzog.dsl.proj.ProjectGeneratorRuntimeModule;
import at.ooe.fh.mdm.herzog.dsl.proj.ProjectGeneratorStandaloneSetup;
import at.ooe.fh.mdm.herzog.dsl.proj.web.ProjectGeneratorWebModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class ProjectGeneratorWebSetup extends ProjectGeneratorStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    final ProjectGeneratorRuntimeModule runtimeModule = new ProjectGeneratorRuntimeModule();
    final ProjectGeneratorWebModule webModule = new ProjectGeneratorWebModule(this.executorServiceProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public ProjectGeneratorWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
