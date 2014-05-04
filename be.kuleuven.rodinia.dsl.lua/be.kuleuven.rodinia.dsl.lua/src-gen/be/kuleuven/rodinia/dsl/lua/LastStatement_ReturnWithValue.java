/**
 */
package be.kuleuven.rodinia.dsl.lua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Last Statement Return With Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.LastStatement_ReturnWithValue#getReturnValues <em>Return Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getLastStatement_ReturnWithValue()
 * @model
 * @generated
 */
public interface LastStatement_ReturnWithValue extends LastStatement_Return
{
  /**
   * Returns the value of the '<em><b>Return Values</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.dsl.lua.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Values</em>' containment reference list.
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getLastStatement_ReturnWithValue_ReturnValues()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getReturnValues();

} // LastStatement_ReturnWithValue
