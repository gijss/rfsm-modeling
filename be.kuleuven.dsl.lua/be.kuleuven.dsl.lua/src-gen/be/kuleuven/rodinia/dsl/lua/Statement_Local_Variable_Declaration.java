/**
 */
package be.kuleuven.rodinia.dsl.lua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Local Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.Statement_Local_Variable_Declaration#getVariableNames <em>Variable Names</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.Statement_Local_Variable_Declaration#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getStatement_Local_Variable_Declaration()
 * @model
 * @generated
 */
public interface Statement_Local_Variable_Declaration extends Statement
{
  /**
   * Returns the value of the '<em><b>Variable Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Names</em>' attribute list.
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getStatement_Local_Variable_Declaration_VariableNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariableNames();

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.dsl.lua.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference list.
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getStatement_Local_Variable_Declaration_InitialValue()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getInitialValue();

} // Statement_Local_Variable_Declaration
