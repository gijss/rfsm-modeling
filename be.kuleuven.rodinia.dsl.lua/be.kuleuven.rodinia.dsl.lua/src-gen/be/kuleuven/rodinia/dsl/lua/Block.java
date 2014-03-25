/**
 */
package be.kuleuven.rodinia.dsl.lua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.Block#getStatements <em>Statements</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.Block#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Chunk
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.dsl.lua.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(LastStatement)
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getBlock_ReturnValue()
   * @model containment="true"
   * @generated
   */
  LastStatement getReturnValue();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.dsl.lua.Block#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(LastStatement value);

} // Block
