/**
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.idea;

import at.ooe.fh.mdm.herzog.dsl.proj.ProjectGeneratorRuntimeModule;
import at.ooe.fh.mdm.herzog.dsl.proj.ProjectGeneratorStandaloneSetupGenerated;
import at.ooe.fh.mdm.herzog.dsl.proj.idea.ProjectGeneratorIdeaModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import org.eclipse.xtext.util.Modules2;

@SuppressWarnings("all")
public class ProjectGeneratorStandaloneSetupIdea extends ProjectGeneratorStandaloneSetupGenerated {
  public Injector createInjector() {
    final ProjectGeneratorRuntimeModule runtimeModule = new ProjectGeneratorRuntimeModule();
    final ProjectGeneratorIdeaModule ideaModule = new ProjectGeneratorIdeaModule();
    final Module mergedModule = Modules2.mixin(runtimeModule, ideaModule);
    return Guice.createInjector(mergedModule);
  }
}
