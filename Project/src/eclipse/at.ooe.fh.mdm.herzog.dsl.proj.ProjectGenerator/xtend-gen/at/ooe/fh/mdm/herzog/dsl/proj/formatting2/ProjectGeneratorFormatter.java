/**
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.formatting2;

import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.JpaConfig;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedValue;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Module;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ServiceConfig;
import at.ooe.fh.mdm.herzog.dsl.proj.services.ProjectGeneratorGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ProjectGeneratorFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ProjectGeneratorGrammarAccess _projectGeneratorGrammarAccess;
  
  protected void _format(final Module module, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion open = document.append(_prepend, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion close = document.prepend(_keyword_1, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword("key");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_2, _function_4);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword_3 = _regionFor_3.keyword("cdiEnabled");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_3, _function_5);
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword_4 = _regionFor_4.keyword("messageBundles");
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_4, _function_6);
    ISemanticRegionsFinder _regionFor_5 = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword_5 = _regionFor_5.keyword("observers");
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_5, _function_7);
    ISemanticRegionsFinder _regionFor_6 = this.textRegionExtensions.regionFor(module);
    final ISemanticRegion openObs = _regionFor_6.keyword("observers {");
    ISemanticRegionsFinder _regionFor_7 = this.textRegionExtensions.regionFor(module);
    final ISemanticRegion closeObs = _regionFor_7.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(openObs, closeObs, _function_8);
    ISemanticRegionsFinder _regionFor_8 = this.textRegionExtensions.regionFor(module);
    ISemanticRegion _keyword_6 = _regionFor_8.keyword(";");
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(_keyword_6, _function_9);
    EList<Localized> _messageBundles = module.getMessageBundles();
    final Consumer<Localized> _function_10 = (Localized it) -> {
      document.<Localized>format(it);
    };
    _messageBundles.forEach(_function_10);
    EList<Observer> _observers = module.getObservers();
    final Consumer<Observer> _function_11 = (Observer it) -> {
      document.<Observer>format(it);
    };
    _observers.forEach(_function_11);
    JpaConfig _jpaConfig = module.getJpaConfig();
    document.<JpaConfig>format(_jpaConfig);
    ServiceConfig _serviceConfig = module.getServiceConfig();
    document.<ServiceConfig>format(_serviceConfig);
  }
  
  protected void _format(final Localized localized, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(localized);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion open = document.append(_prepend, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(localized);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion close = document.prepend(_keyword_1, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(localized);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword("values");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_2, _function_4);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(localized);
    ISemanticRegion _keyword_3 = _regionFor_3.keyword(";");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend_1 = document.prepend(_keyword_3, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_prepend_1, _function_6);
    EList<LocalizedEntry> _values = localized.getValues();
    final Consumer<LocalizedEntry> _function_7 = (LocalizedEntry it) -> {
      document.<LocalizedEntry>format(it);
    };
    _values.forEach(_function_7);
  }
  
  protected void _format(final LocalizedEntry localizedEntry, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(localizedEntry);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion open = document.append(_prepend, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(localizedEntry);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion close = document.prepend(_keyword_1, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(localizedEntry);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword("key");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_2, _function_4);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(localizedEntry);
    ISemanticRegion _keyword_3 = _regionFor_3.keyword("values");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_3, _function_5);
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(localizedEntry);
    ISemanticRegion _keyword_4 = _regionFor_4.keyword(";");
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(_keyword_4, _function_6);
    EList<LocalizedValue> _values = localizedEntry.getValues();
    final Consumer<LocalizedValue> _function_7 = (LocalizedValue it) -> {
      document.<LocalizedValue>format(it);
    };
    _values.forEach(_function_7);
  }
  
  protected void _format(final LocalizedValue localizedValue, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(localizedValue);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion open = document.append(_prepend, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(localizedValue);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion close = document.prepend(_keyword_1, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(localizedValue);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword("locale");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_2, _function_4);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(localizedValue);
    ISemanticRegion _keyword_3 = _regionFor_3.keyword("value");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_3, _function_5);
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(localizedValue);
    ISemanticRegion _keyword_4 = _regionFor_4.keyword(";");
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(_keyword_4, _function_6);
  }
  
  protected void _format(final ServiceConfig serviceConfig, @Extension final IFormattableDocument document) {
    EList<Observer> _observers = serviceConfig.getObservers();
    final Consumer<Observer> _function = (Observer it) -> {
      document.<Observer>format(it);
    };
    _observers.forEach(_function);
  }
  
  protected void _format(final Observer observer, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend = document.prepend(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion open = document.append(_prepend, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final ISemanticRegion close = document.prepend(_keyword_1, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
      it.indent();
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_3);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword_2 = _regionFor_2.keyword("type");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_2, _function_4);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword_3 = _regionFor_3.keyword("during");
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_3, _function_5);
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword_4 = _regionFor_4.keyword("notify");
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_4, _function_6);
    ISemanticRegionsFinder _regionFor_5 = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword_5 = _regionFor_5.keyword("delegate");
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(_keyword_5, _function_7);
    ISemanticRegionsFinder _regionFor_6 = this.textRegionExtensions.regionFor(observer);
    ISemanticRegion _keyword_6 = _regionFor_6.keyword(";");
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    ISemanticRegion _prepend_1 = document.prepend(_keyword_6, _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_prepend_1, _function_9);
  }
  
  public void format(final Object localized, final IFormattableDocument document) {
    if (localized instanceof XtextResource) {
      _format((XtextResource)localized, document);
      return;
    } else if (localized instanceof Localized) {
      _format((Localized)localized, document);
      return;
    } else if (localized instanceof LocalizedEntry) {
      _format((LocalizedEntry)localized, document);
      return;
    } else if (localized instanceof LocalizedValue) {
      _format((LocalizedValue)localized, document);
      return;
    } else if (localized instanceof Module) {
      _format((Module)localized, document);
      return;
    } else if (localized instanceof Observer) {
      _format((Observer)localized, document);
      return;
    } else if (localized instanceof ServiceConfig) {
      _format((ServiceConfig)localized, document);
      return;
    } else if (localized instanceof EObject) {
      _format((EObject)localized, document);
      return;
    } else if (localized == null) {
      _format((Void)null, document);
      return;
    } else if (localized != null) {
      _format(localized, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(localized, document).toString());
    }
  }
}
