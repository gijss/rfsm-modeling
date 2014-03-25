/**
 */
package be.kuleuven.rodinia.dsl.lua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Table Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.Expression_TableConstructor#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getExpression_TableConstructor()
 * @model
 * @generated
 */
public interface Expression_TableConstructor extends Expression
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.dsl.lua.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getExpression_TableConstructor_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Expression_TableConstructor
