Howto add OCL constraints to rfsm.xcore
===

Install
---
To use the OCL editor, "OCL Examples and Editors" should be installed from the Eclipe repository.

Configure Xcore model to use OCL annotations
---
add to the Xcore definition:

'''
@Ecore(invocationDelegates="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
settingDelegates="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", validationDelegates="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot")

package be.kuleuven.rodinia.model.rfsm

annotation "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" as Pivot
'''

Add constraints
---
Place constraint rule above context class:

'''
@Ecore(constraints="test") @Pivot(test="priority_numbers <> 0")
'''

View and test constraints
---
* Generate Ecore model
* Open model with OCLinEcore Editor
