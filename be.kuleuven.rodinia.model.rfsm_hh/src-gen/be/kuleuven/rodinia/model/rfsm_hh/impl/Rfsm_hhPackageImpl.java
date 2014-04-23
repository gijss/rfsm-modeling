/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.impl;

import be.kuleuven.rodinia.model.rfsm_hh.Connector;
import be.kuleuven.rodinia.model.rfsm_hh.Event;
import be.kuleuven.rodinia.model.rfsm_hh.Function;
import be.kuleuven.rodinia.model.rfsm_hh.HyperEdge;
import be.kuleuven.rodinia.model.rfsm_hh.HyperGraph;
import be.kuleuven.rodinia.model.rfsm_hh.HyperVertex;
import be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhFactory;
import be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage;
import be.kuleuven.rodinia.model.rfsm_hh.State;
import be.kuleuven.rodinia.model.rfsm_hh.Transition;

import be.kuleuven.rodinia.model.rfsm_hh.util.Rfsm_hhValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rfsm_hhPackageImpl extends EPackageImpl implements Rfsm_hhPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hyperGraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hyperEdgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hyperVertexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Rfsm_hhPackageImpl()
  {
    super(eNS_URI, Rfsm_hhFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Rfsm_hhPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Rfsm_hhPackage init()
  {
    if (isInited) return (Rfsm_hhPackage)EPackage.Registry.INSTANCE.getEPackage(Rfsm_hhPackage.eNS_URI);

    // Obtain or create and register package
    Rfsm_hhPackageImpl theRfsm_hhPackage = (Rfsm_hhPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Rfsm_hhPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Rfsm_hhPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theRfsm_hhPackage.createPackageContents();

    // Initialize created meta-data
    theRfsm_hhPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theRfsm_hhPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return Rfsm_hhValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theRfsm_hhPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Rfsm_hhPackage.eNS_URI, theRfsm_hhPackage);
    return theRfsm_hhPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHyperGraph()
  {
    return hyperGraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHyperGraph_Name()
  {
    return (EAttribute)hyperGraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperGraph_HyperVertices()
  {
    return (EReference)hyperGraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperGraph_HyperEdges()
  {
    return (EReference)hyperGraphEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperGraph_HyperGraphs()
  {
    return (EReference)hyperGraphEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHyperEdge()
  {
    return hyperEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHyperEdge_Name()
  {
    return (EAttribute)hyperEdgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperEdge_Source()
  {
    return (EReference)hyperEdgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperEdge_Target()
  {
    return (EReference)hyperEdgeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHyperVertex()
  {
    return hyperVertexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHyperVertex_Name()
  {
    return (EAttribute)hyperVertexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperVertex_Vertices()
  {
    return (EReference)hyperVertexEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHyperVertex_Parent()
  {
    return (EReference)hyperVertexEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHyperVertex__IsAncestor__HyperVertex_HyperVertex()
  {
    return hyperVertexEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHyperVertex__LCA__HyperVertex_HyperVertex()
  {
    return hyperVertexEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Entry()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Doo()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Exit()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnector()
  {
    return connectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_Priority_number()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Events()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Guard()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Effect()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Eventliteral()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Owner()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Sourcecode()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rfsm_hhFactory getRfsm_hhFactory()
  {
    return (Rfsm_hhFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    hyperGraphEClass = createEClass(HYPER_GRAPH);
    createEAttribute(hyperGraphEClass, HYPER_GRAPH__NAME);
    createEReference(hyperGraphEClass, HYPER_GRAPH__HYPER_VERTICES);
    createEReference(hyperGraphEClass, HYPER_GRAPH__HYPER_EDGES);
    createEReference(hyperGraphEClass, HYPER_GRAPH__HYPER_GRAPHS);

    hyperEdgeEClass = createEClass(HYPER_EDGE);
    createEAttribute(hyperEdgeEClass, HYPER_EDGE__NAME);
    createEReference(hyperEdgeEClass, HYPER_EDGE__SOURCE);
    createEReference(hyperEdgeEClass, HYPER_EDGE__TARGET);

    hyperVertexEClass = createEClass(HYPER_VERTEX);
    createEAttribute(hyperVertexEClass, HYPER_VERTEX__NAME);
    createEReference(hyperVertexEClass, HYPER_VERTEX__VERTICES);
    createEReference(hyperVertexEClass, HYPER_VERTEX__PARENT);
    createEOperation(hyperVertexEClass, HYPER_VERTEX___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX);
    createEOperation(hyperVertexEClass, HYPER_VERTEX___LCA__HYPERVERTEX_HYPERVERTEX);

    stateEClass = createEClass(STATE);
    createEReference(stateEClass, STATE__ENTRY);
    createEReference(stateEClass, STATE__DOO);
    createEReference(stateEClass, STATE__EXIT);

    connectorEClass = createEClass(CONNECTOR);

    transitionEClass = createEClass(TRANSITION);
    createEAttribute(transitionEClass, TRANSITION__PRIORITY_NUMBER);
    createEReference(transitionEClass, TRANSITION__EVENTS);
    createEReference(transitionEClass, TRANSITION__GUARD);
    createEReference(transitionEClass, TRANSITION__EFFECT);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__EVENTLITERAL);
    createEReference(eventEClass, EVENT__OWNER);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__SOURCECODE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateEClass.getESuperTypes().add(this.getHyperVertex());
    connectorEClass.getESuperTypes().add(this.getHyperEdge());
    transitionEClass.getESuperTypes().add(this.getHyperEdge());

    // Initialize classes, features, and operations; add parameters
    initEClass(hyperGraphEClass, HyperGraph.class, "HyperGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHyperGraph_Name(), theEcorePackage.getEString(), "name", null, 0, 1, HyperGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperGraph_HyperVertices(), this.getHyperVertex(), null, "hyperVertices", null, 0, -1, HyperGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperGraph_HyperEdges(), this.getHyperEdge(), null, "hyperEdges", null, 0, -1, HyperGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperGraph_HyperGraphs(), this.getHyperGraph(), null, "hyperGraphs", null, 0, -1, HyperGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperEdgeEClass, HyperEdge.class, "HyperEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHyperEdge_Name(), theEcorePackage.getEString(), "name", null, 0, 1, HyperEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperEdge_Source(), this.getHyperVertex(), null, "source", null, 0, -1, HyperEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperEdge_Target(), this.getHyperVertex(), null, "target", null, 0, -1, HyperEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperVertexEClass, HyperVertex.class, "HyperVertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHyperVertex_Name(), theEcorePackage.getEString(), "name", null, 0, 1, HyperVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperVertex_Vertices(), this.getHyperVertex(), this.getHyperVertex_Parent(), "vertices", null, 0, -1, HyperVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHyperVertex_Parent(), this.getHyperVertex(), this.getHyperVertex_Vertices(), "parent", null, 0, 1, HyperVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getHyperVertex__IsAncestor__HyperVertex_HyperVertex(), theEcorePackage.getEBooleanObject(), "isAncestor", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHyperVertex(), "one", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHyperVertex(), "two", 0, 1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHyperVertex__LCA__HyperVertex_HyperVertex(), this.getHyperVertex(), "LCA", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHyperVertex(), "one", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getHyperVertex(), "two", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getState_Entry(), this.getFunction(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Doo(), this.getFunction(), null, "doo", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Exit(), this.getFunction(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransition_Priority_number(), theEcorePackage.getEInt(), "priority_number", "0", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Events(), this.getEvent(), this.getEvent_Owner(), "events", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Guard(), this.getFunction(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Effect(), this.getFunction(), null, "effect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Eventliteral(), theEcorePackage.getEString(), "eventliteral", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Owner(), this.getTransition(), this.getTransition_Events(), "owner", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Sourcecode(), theEcorePackage.getEString(), "sourcecode", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/emf/2011/Xcore
    createXcoreAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
    createPivotAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });					
    addAnnotation
      (hyperEdgeEClass, 
       source, 
       new String[] 
       {
       "constraints", "legalBoundaryCrossing"
       });			
    addAnnotation
      (hyperVertexEClass, 
       source, 
       new String[] 
       {
       "constraints", "defineOnlyOneRootHyperVertex"
       });					
    addAnnotation
      (stateEClass, 
       source, 
       new String[] 
       {
       "constraints", "defineInitialConnectorWhenComposite defineMaxOneInitialConnector onlyLeafStatesHaveDoo"
       });			
    addAnnotation
      (transitionEClass, 
       source, 
       new String[] 
       {
       "constraints", "maxOneTransitionFromInitialConnector noGuardFromInitialConnector"
       });	
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createXcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2011/Xcore";				
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "Pivot", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });											
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createPivotAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";							
    addAnnotation
      (hyperEdgeEClass, 
       source, 
       new String[] 
       {
       "legalBoundaryCrossing", "(self.target.parent <> self.source) and isAncestor(self.target.parent, self.source)"
       });			
    addAnnotation
      (hyperVertexEClass, 
       source, 
       new String[] 
       {
       "defineOnlyOneRootHyperVertex", "(HyperVertex.allInstances()->select(n | n.parent.oclIsUndefined ()))->size() = 1"
       });		
    addAnnotation
      (getHyperVertex__IsAncestor__HyperVertex_HyperVertex(), 
       source, 
       new String[] 
       {
       "body", "if (one = two) \n\t\t\t\t\tthen true\n\t\t\t\telse\n\t\t\t\t\tif (two.parent.oclIsUndefined ())\n\t\t\t\t\t\tthen false\n\t\t\t\t\telse \n\t\t\t\t\t\tif (two.parent = one)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\telse \n\t\t\t\t\t\t\tisAncestor(one, two.parent)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif"
       });		
    addAnnotation
      (getHyperVertex__LCA__HyperVertex_HyperVertex(), 
       source, 
       new String[] 
       {
       "body", "if isAncestor(one, two)\n\t\t\t\t\tthen one\n\t\t\t\telse \n\t\t\t\t\tif isAncestor(two, one)\n\t\t\t\t\t\tthen two\n\t\t\t\t\telse\n\t\t\t\t\t\tLCA(one.parent,two.parent)\n\t\t\t\t\tendif\n\t\t\t\tendif"
       });			
    addAnnotation
      (stateEClass, 
       source, 
       new String[] 
       {
       "defineInitialConnectorWhenComposite", "self.subHyperVertices->size() > 0 and Transition.allInstances()->exists(t | t.target=self) implies self.subHyperVertexs->select(c | c.oclIsTypeOf(Connector) and c.name=\'initial\')->size() = 1",
       "defineMaxOneInitialConnector", "(self.subHyperVertices->size() > 0) implies (self.subHyperVertices->select(c | c.oclIsTypeOf(Connector) and c.name=\'initial\')->size() <= 1)",
       "onlyLeafStatesHaveDoo", "(not self.doo.oclIsUndefined()) implies (self.subHyperVertices->size() = 0)"
       });			
    addAnnotation
      (transitionEClass, 
       source, 
       new String[] 
       {
       "maxOneTransitionFromInitialConnector", "(self.source.oclIsTypeOf(Connector) and self.source.name=\'initial\') implies (Transition.allInstances()->select(t | t.source = self.source)->size()) <= 1",
       "noGuardFromInitialConnector", "(self.source.oclIsTypeOf(Connector) and self.source.name=\'initial\') implies guard.oclIsUndefined()"
       });
  }

} //Rfsm_hhPackageImpl
