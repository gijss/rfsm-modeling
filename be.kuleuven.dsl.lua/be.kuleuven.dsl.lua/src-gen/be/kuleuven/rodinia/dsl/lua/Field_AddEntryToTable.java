/**
 */
package be.kuleuven.rodinia.dsl.lua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Add Entry To Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.dsl.lua.Field_AddEntryToTable#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getField_AddEntryToTable()
 * @model
 * @generated
 */
public interface Field_AddEntryToTable extends Field
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see be.kuleuven.rodinia.dsl.lua.LuaPackage#getField_AddEntryToTable_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.dsl.lua.Field_AddEntryToTable#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

} // Field_AddEntryToTable
