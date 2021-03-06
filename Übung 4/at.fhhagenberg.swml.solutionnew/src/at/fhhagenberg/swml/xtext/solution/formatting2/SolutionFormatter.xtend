/*
 * generated by Xtext 2.10.0
 */
package at.fhhagenberg.swml.xtext.solution.formatting2

import at.fhhagenberg.swml.xtext.solution.services.SolutionGrammarAccess
import at.fhhagenberg.swml.xtext.solution.solution.Attribute
import at.fhhagenberg.swml.xtext.solution.solution.Entity
import at.fhhagenberg.swml.xtext.solution.solution.Relationship
import at.fhhagenberg.swml.xtext.solution.solution.WebApplication
import at.fhhagenberg.swml.xtext.solution.solution.WebPage
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import at.fhhagenberg.swml.xtext.solution.solution.Link

class SolutionFormatter extends AbstractFormatter2 {

	@Inject extension SolutionGrammarAccess

	def dispatch void format(WebApplication webApplication, extension IFormattableDocument document) {
		webApplication.interior[indent]
		webApplication.regionFor.keyword("{").prepend[noSpace]
		webApplication.regionFor.keyword("{").append[newLine]
		webApplication.regionFor.keyword("}").prepend[newLine]
		for (Entity e : webApplication.getEntities()) {
			e.format
		}
		for (Relationship relationships : webApplication.getRelationships()) {
			relationships.format;
		}
		for (WebPage webPages : webApplication.getWebPages()) {
			webPages.format;
		}
		webApplication.regionFor.keyword("homePage").prepend[newLine]
		webApplication.regionFor.keyword(";").prepend[noSpace]
		webApplication.regionFor.keyword(";").append[newLine]
	}

	def dispatch void format(Entity e, extension IFormattableDocument document) {
		e.interior[indent]
		e.regionFor.keyword("entity").prepend[newLine]
		e.regionFor.keyword("{").prepend[noSpace]
		e.regionFor.keyword("{").append[newLine]
		e.regionFor.keyword("}").prepend[newLine]
		e.regionFor.keyword("}").append[newLine]

		for (Attribute a : e.attributes) {
			a.format
		}
		e.id.format
	}

	def dispatch void format(Attribute a, extension IFormattableDocument document) {
		a.interior[indent]
		a.regionFor.keyword(";").prepend[noSpace]
		a.regionFor.keyword(";").append[newLine]

	}
	
	def dispatch void format(Relationship r, extension IFormattableDocument document) {
		r.regionFor.keyword("{").prepend[noSpace]
		r.regionFor.keyword("{").append[newLine]
		r.regionFor.keyword("}").prepend[newLine]
		r.interior[indent]
		r.regionFor.keyword(";").prepend[noSpace]
		r.regionFor.keyword(";").append[newLine]
		r.regionFor.keyword("source").prepend[newLine]
		r.regionFor.keyword("target").prepend[newLine]
		r.regionFor.keyword("}").append[newLine]
	}


	def dispatch void format(WebPage page, extension IFormattableDocument document) {
		page.regionFor.keyword("{").prepend[noSpace]
		page.regionFor.keyword("{").append[newLine]
		page.regionFor.keyword("}").prepend[newLine]
		page.interior[indent]
		page.regionFor.keyword(";").prepend[noSpace]
		page.regionFor.keyword(";").append[newLine]
		for (Link source : page.getSource()) {
 			source.format;
		 }
		page.regionFor.keyword("home").prepend[newLine]
		page.regionFor.keyword("}").prepend[newLine]
	}
	
	def dispatch void format(Link link, extension IFormattableDocument document) {
		link.regionFor.keyword("contextualLink").prepend[newLine]
		link.regionFor.keyword("link").prepend[newLine]
		
	}
	
	
	
		
	
// def dispatch void format(StaticPage staticPage, extension IFormattableDocument document) {
// // TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
// for (Link source : staticPage.getSource()) {
// source.format;
// }
// }
// TODO: implement for EntityPage, CreatePage, UpdatePage, DeletePage, IndexPage, Entity
}
