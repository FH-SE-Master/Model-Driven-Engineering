/*
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.generator

import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Module
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Observer

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ProjectGeneratorGenerator extends AbstractGenerator {

	static val PARENT_ARTIFACT = "parent";
	static val PARENT_GROUP = "com.app";
	static val PACKAGE_PREFIX = "com.app.";

	static val DIR_PACKAGE_PREFIX = "com/app/";
	static val SRC_MAIN_JAVA = "src/main/java/";
	static val SRC_MAIN_RES = "src/main/resources/";

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(typeof(Module))) {
			generateParentProjectModule(e, resource, fsa, context);
			generateParentProjectModel(e, resource, fsa, context);
			generateProjectMessage(e, resource, fsa, context);
			generateProjectJpa(e, resource, fsa, context);
			generateParentProjectService(e, resource, fsa, context);
			generateProjectServiceApi(e, resource, fsa, context);
			generateProjectServiceImpl(e, resource, fsa, context);
		}
	}

	/**
	 * Generate the parent project for the described module 
	 */
	def generateParentProjectModule(Module _module, Resource resource, IFileSystemAccess2 fsa,
		IGeneratorContext context) {
		val projectDir = _module.key.toLowerCase + "/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomParentModule);
	}

	/**
	 * Generate the message project
	 */
	def generateProjectMessage(Module _module, Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (_module.messageBundles.isEmpty) {
			return;
		}
		val projectDir = _module.key.toLowerCase + "/message/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomMessage);
		if (at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean.TRUE.equals(_module.cdiEnabled)) {
			fsa.generateFile(projectDir + SRC_MAIN_RES + "META-INF/beans.xml", beansXml(null));
		}
		for (bundle : _module.messageBundles) {
			val localeToKeyValueMap = newHashMap();
			for (entry : bundle.values) {
				for (value : entry.values) {
					var keyToValueMap = localeToKeyValueMap.get(value.locale);
					if (keyToValueMap == null) {
						localeToKeyValueMap.put(value.locale, newHashMap());
						keyToValueMap = localeToKeyValueMap.get(value.locale);
					}
					keyToValueMap.put(entry.localizedKey, value.value);
				}
			}
			for (entry : localeToKeyValueMap.entrySet) {
				fsa.generateFile(
					projectDir + SRC_MAIN_RES + "META-INF/resource-bundles/" + bundle.name.toLowerCase + "_" +
						entry.key.toString + ".properties", messageBundleProperties(entry.value));
				fsa.generateFile(
					projectDir + SRC_MAIN_JAVA + DIR_PACKAGE_PREFIX + _module.key.toLowerCase + "/message/" +
						bundle.name + ".java",
					messageBundleEnum((PARENT_GROUP + "." + _module.key.toLowerCase + ".message"), bundle.name,
						newArrayList(entry.value.keySet)));
			}
		}
	}

	/**
	 * Generate the parent project for the model projects
	 */
	def generateParentProjectModel(Module _module, Resource resource, IFileSystemAccess2 fsa,
		IGeneratorContext context) {
		val projectDir = _module.key.toLowerCase + "/model/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomParentModel);
	}

	/**
	 * Generate the jpa project
	 */
	def generateProjectJpa(Module _module, Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (_module.jpaConfig == null) {
			return;
		}
		val projectDir = _module.key.toLowerCase + "/model/jpa/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomJpa);
		if (at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean.TRUE.equals(_module.cdiEnabled)) {
			fsa.generateFile(projectDir + SRC_MAIN_RES + "META-INF/beans.xml", beansXml(null));
			fsa.generateFile(projectDir + SRC_MAIN_RES + "META-INF/" + _module.key.toLowerCase + "Orm.xml",
				beansXml(null));
			if (!_module.jpaConfig.observers.isEmpty) {
				fsa.generateFile(projectDir + SRC_MAIN_JAVA + DIR_PACKAGE_PREFIX + _module.key.toLowerCase +
					"/model/jpa/observer/Observer.java",
					observerClass(PACKAGE_PREFIX + _module.key.toLowerCase + ".observer", _module.jpaConfig.observers));
			}
		}
	}

	/**
	 * Generate the parent project for the service projects
	 */
	def generateParentProjectService(Module _module, Resource resource, IFileSystemAccess2 fsa,
		IGeneratorContext context) {
		if (_module.serviceConfig == null) {
			return;
		}
		val projectDir = _module.key.toLowerCase + "/service/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomServiceParent);
	}

	/**
	 * Generate the service api project
	 */
	def generateProjectServiceApi(Module _module, Resource resource, IFileSystemAccess2 fsa,
		IGeneratorContext context) {
		if (_module.serviceConfig == null) {
			return;
		}
		val projectDir = _module.key.toLowerCase + "/service/api/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomServiceApi);
		if (at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean.TRUE.equals(_module.cdiEnabled)) {
			fsa.generateFile(projectDir + SRC_MAIN_RES + "META-INF/beans.xml", beansXml(null));
		}
	}

	/**
	 * Generate the service impl project
	 */
	def generateProjectServiceImpl(Module _module, Resource resource, IFileSystemAccess2 fsa,
		IGeneratorContext context) {
		if (_module.serviceConfig == null) {
			return;
		}
		val projectDir = _module.key.toLowerCase + "/service/impl/";
		fsa.generateFile(projectDir + "/pom.xml", _module.pomServiceImpl);
		// TODO: extract decorators
		if (at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Boolean.TRUE.equals(_module.cdiEnabled)) {
			fsa.generateFile(projectDir + SRC_MAIN_RES + "META-INF/beans.xml", beansXml(null));
			if (!_module.serviceConfig.observers.isEmpty) {
				fsa.generateFile(projectDir + SRC_MAIN_JAVA + DIR_PACKAGE_PREFIX + _module.key.toLowerCase +
					"/service/impl/observer/Observer.java",
					observerClass(PACKAGE_PREFIX + _module.key.toLowerCase + ".observer",
						_module.serviceConfig.observers));
			}
		}
	}

	/**
	 * Template for the beans xml.
	 */
	def beansXml(List<Observer> observers) '''
		<?xml version="1.0" encoding="UTF-8"?>
			<beans xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/beans_1_0.xsd">
		
			
			<!-- Add decorators, interceptors, .. here -->
		</beans>
	'''

	/**
	 * Template for the beans xml.
	 */
	def ormXml() '''
		<entity-mappings xmlns="http://java.sun.com/xml/ns/persistence/orm"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://java.sun.com/xml/ns/persistence/orm http://java.sun.com/xml/ns/persistence/orm_2_0.xsd"
			version="2.0">
			
			<!-- Add your first entity here -->
			</entity-mappings>
	'''

	/**
	 * Template for the observer class.
	 */
	def observerClass(String packageName, List<Observer> observers) '''
		package �packageName�;
		
		import javax.enterprise.event.*;
		
		@Dependent
		public class Observer {
		
		�FOR observer : observers�
			@Inject
			   private Event<�observer.type�> event�observers.indexOf(observer)�;
			   @Inject
			   private �observer.className� delegateEvent�observers.indexOf(observer)�;   				
		�ENDFOR�
		�FOR observer : observers�
			public void observerEvent_�observers.indexOf(observer)�(@Observes(during=TransactionPhase.�observer.during.toString�, notifyObserver = Reception.�observer.getNotify().toString()�) �observer.type� evt) {
				delegateEvent�observers.indexOf(observer)�.observe(evt);
			}
		�ENDFOR�
		}
	'''

	/**
	 * Template for the message bundle properties file.
	 */
	def messageBundleProperties(Map<String, String> _keyTovalueMap) '''
		�FOR entry : _keyTovalueMap.entrySet�
			�entry.key�=�entry.value�
		�ENDFOR�
	'''

	/**
	 * Template for the message bundle enumeration for the keys.
	 */
	def messageBundleEnum(String packageName, String bundleName, List<String> _keys) '''
		package �packageName�.message;
		  
		public enum �bundleName�MessageBundle {
			�_keys.join(',\n,')�;
		}
	'''

	/**
	 * Template for the pom.xml of the module parent project
	 */
	def pomParentModule(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>pom</packaging>
		    <artifactId>module-�_module.key.toLowerCase�</artifactId>
		    <name>module-�_module.key.toLowerCase�-message</name>
		    <description>The parent project holding the module projects</description>
		
				
				  <modules>
				      <module>message</module>
				      <module>model</module>
				      <module>service</module>
				  </modules>
		</project>
	'''

	/**
	 * Template for the pom.xml of the message project
	 */
	def pomMessage(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>pom</packaging>
		    <artifactId>�_module.key.toLowerCase�-message</artifactId>
		    <name>�_module.key.toLowerCase�-message</name>
		    <description>The project holding the localizations</description>
		    
		</project>
	'''

	/**
	 * Template for the pom.xml of the model parent project
	 */
	def pomParentModel(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>pom</packaging>
		    <artifactId>module-�_module.key.toLowerCase�-model</artifactId>
		    <name>�_module.key.toLowerCase�-model</name>
		    <description>The main project for all model projects</description>
		
		    <modules>
		        <module>jpa</module>
		    </modules>
		
		</project>
	'''

	/**
	 * Template for the pom.xml of the model jpa project
	 */
	def pomJpa(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>pom</packaging>
			<artifactId>�_module.key.toLowerCase�-model-jpa</artifactId>
			<name>�_module.key.toLowerCase�-model-jpa</name>
			<description>The jpa model project</description>
						
			<!-- Dependencies Other projects -->
			  <dependency>
			      <groupId>�PARENT_GROUP�</groupId>
			      <artifactId>�_module.key.toLowerCase�-message</artifactId>
			      <version>${project.version}</version>
			  </dependency>
		
		</project>
	'''

	/**
	 * Template for the pom.xml of the service parent project
	 */
	def pomServiceParent(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>pom</packaging>
		
		    <modules>
		        <module>jpa</module>
		    </modules>
		
		    <artifactId>module-�_module.key.toLowerCase�-service</artifactId>
		    <name>�_module.key.toLowerCase�-service</name>
		    <description>The parent project for all service projects</description>
		
			
		    <modules>
		        <module>api</module>
		        <module>impl</module>
		    </modules>
		</project>
	'''

	/**
	 * Template for the pom.xml of the service api project
	 */
	def pomServiceApi(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>jar</packaging>				    
		    <artifactId>�_module.key.toLowerCase�-service-api</artifactId>
		    <name>�_module.key.toLowerCase�-service-api</name>
		    <description>The api for the service logic operations</description>
		
		
		       <!-- Dependencies Other projects -->
		       <dependency>
		           <groupId>�PARENT_GROUP�</groupId>
		           <artifactId>�_module.key.toLowerCase�-model-jpa</artifactId>
		           <version>${project.version}</version>
		       </dependency>
		      
		</project>
	'''

	/**
	 * Template for the pom.xml of the service impl project
	 */
	def pomServiceImpl(Module _module) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<project xmlns="http://maven.apache.org/POM/4.0.0"
		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		    <parent>
		        <artifactId>�PARENT_ARTIFACT�</artifactId>
		        <groupId>�PARENT_GROUP�</groupId>
		        <version>0.0.1-SNAPSHOT</version>
		    </parent>
		    <modelVersion>4.0.0</modelVersion>
		    <packaging>jar</packaging>				    
		    <artifactId>�_module.key.toLowerCase�-service-impl</artifactId>
		    <name>�_module.key.toLowerCase�-service-impl</name>
		    <description>The implementation for the service logic operations</description>
		
				
				    <!-- Dependencies Other projects -->
				    <dependency>
				        <groupId>�PARENT_GROUP�</groupId>
				        <artifactId>�_module.key.toLowerCase�-service-api</artifactId>
				        <version>${project.version}</version>
				    </dependency>
				    
		</project>
	'''
}
