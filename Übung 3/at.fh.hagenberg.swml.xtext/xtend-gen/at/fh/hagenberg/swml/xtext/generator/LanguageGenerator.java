/**
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext.generator;

import at.fh.hagenberg.swml.xtext.language.Entity;
import at.fh.hagenberg.swml.xtext.language.WebApplication;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Here I would say that we have a generator class per type.
 * 
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<WebApplication> _filter = Iterables.<WebApplication>filter(_iterable, WebApplication.class);
    for (final WebApplication element : _filter) {
      CharSequence _hibernateXML = this.hibernateXML(element);
      fsa.generateFile("hibernate.cfg.xml", _hibernateXML);
    }
  }
  
  public CharSequence hibernateXML(final WebApplication app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<hibernate-configuration>");
    _builder.newLine();
    {
      EList<Entity> _entities = app.getEntities();
      for(final Entity entity : _entities) {
        _builder.append("\t\t");
        _builder.append("<mapping resource=\"beans/");
        String _name = entity.getName();
        _builder.append(_name, "\t\t");
        _builder.append(".hbm.xml\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</hibernate-configuration>");
    _builder.newLine();
    _builder.append("</xml>");
    _builder.newLine();
    return _builder;
  }
}
