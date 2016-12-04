/**
 * generated by Xtext 2.10.0
 */
package at.fhhagenberg.swml.xtext.solution.solution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.fhhagenberg.swml.xtext.solution.solution.IndexPage#getBack <em>Back</em>}</li>
 * </ul>
 *
 * @see at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage#getIndexPage()
 * @model
 * @generated
 */
public interface IndexPage extends DynamicPage
{
  /**
   * Returns the value of the '<em><b>Back</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Back</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Back</em>' containment reference.
   * @see #setBack(ContextualLink)
   * @see at.fhhagenberg.swml.xtext.solution.solution.SolutionPackage#getIndexPage_Back()
   * @model containment="true"
   * @generated
   */
  ContextualLink getBack();

  /**
   * Sets the value of the '{@link at.fhhagenberg.swml.xtext.solution.solution.IndexPage#getBack <em>Back</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Back</em>' containment reference.
   * @see #getBack()
   * @generated
   */
  void setBack(ContextualLink value);

} // IndexPage
