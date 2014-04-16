/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.Connector;
import be.kuleuven.rodinia.model.rfsm.Edge;
import be.kuleuven.rodinia.model.rfsm.Event;
import be.kuleuven.rodinia.model.rfsm.Function;
import be.kuleuven.rodinia.model.rfsm.GraphEdge;
import be.kuleuven.rodinia.model.rfsm.History;
import be.kuleuven.rodinia.model.rfsm.HyperEdge;
import be.kuleuven.rodinia.model.rfsm.HyperGraph;
import be.kuleuven.rodinia.model.rfsm.HyperVertex;
import be.kuleuven.rodinia.model.rfsm.RfsmFactory;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;
import be.kuleuven.rodinia.model.rfsm.State;
import be.kuleuven.rodinia.model.rfsm.Transition;
import be.kuleuven.rodinia.model.rfsm.Vertex;

import be.kuleuven.rodinia.model.rfsm.util.RfsmValidator;

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
public class RfsmPackageImpl extends EPackageImpl implements RfsmPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vertexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeEClass = null;

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
  private EClass graphEdgeEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass historyEClass = null;

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
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RfsmPackageImpl()
  {
    super(eNS_URI, RfsmFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RfsmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RfsmPackage init()
  {
    if (isInited) return (RfsmPackage)EPackage.Registry.INSTANCE.getEPackage(RfsmPackage.eNS_URI);

    // Obtain or create and register package
    RfsmPackageImpl theRfsmPackage = (RfsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RfsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RfsmPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theRfsmPackage.createPackageContents();

    // Initialize created meta-data
    theRfsmPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theRfsmPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return RfsmValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theRfsmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RfsmPackage.eNS_URI, theRfsmPackage);
    return theRfsmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVertex()
  {
    return vertexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVertex_Name()
  {
    return (EAttribute)vertexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVertex_Parent()
  {
    return (EReference)vertexEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdge()
  {
    return edgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdge_Source()
  {
    return (EReference)edgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdge_Target()
  {
    return (EReference)edgeEClass.getEStructuralFeatures().get(1);
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
  public EReference getHyperEdge_Vertices()
  {
    return (EReference)hyperEdgeEClass.getEStructuralFeatures().get(0);
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
  public EReference getHyperVertex_SubVertices()
  {
    return (EReference)hyperVertexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHyperVertex__IsAncestor__Vertex_Vertex()
  {
    return hyperVertexEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getHyperVertex__LCA__Vertex_Vertex()
  {
    return hyperVertexEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraphEdge()
  {
    return graphEdgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraphEdge_Owner()
  {
    return (EReference)graphEdgeEClass.getEStructuralFeatures().get(0);
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
  public EReference getHyperGraph_Edges()
  {
    return (EReference)hyperGraphEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getConnector_Public()
  {
    return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_History()
  {
    return (EReference)connectorEClass.getEStructuralFeatures().get(1);
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
  public EClass getHistory()
  {
    return historyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHistory_Depth()
  {
    return (EAttribute)historyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHistory_Hot()
  {
    return (EAttribute)historyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RfsmFactory getRfsmFactory()
  {
    return (RfsmFactory)getEFactoryInstance();
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
    vertexEClass = createEClass(VERTEX);
    createEAttribute(vertexEClass, VERTEX__NAME);
    createEReference(vertexEClass, VERTEX__PARENT);

    edgeEClass = createEClass(EDGE);
    createEReference(edgeEClass, EDGE__SOURCE);
    createEReference(edgeEClass, EDGE__TARGET);

    hyperEdgeEClass = createEClass(HYPER_EDGE);
    createEReference(hyperEdgeEClass, HYPER_EDGE__VERTICES);

    hyperVertexEClass = createEClass(HYPER_VERTEX);
    createEReference(hyperVertexEClass, HYPER_VERTEX__SUB_VERTICES);
    createEOperation(hyperVertexEClass, HYPER_VERTEX___IS_ANCESTOR__VERTEX_VERTEX);
    createEOperation(hyperVertexEClass, HYPER_VERTEX___LCA__VERTEX_VERTEX);

    graphEdgeEClass = createEClass(GRAPH_EDGE);
    createEReference(graphEdgeEClass, GRAPH_EDGE__OWNER);

    hyperGraphEClass = createEClass(HYPER_GRAPH);
    createEReference(hyperGraphEClass, HYPER_GRAPH__EDGES);

    stateEClass = createEClass(STATE);
    createEReference(stateEClass, STATE__ENTRY);
    createEReference(stateEClass, STATE__DOO);
    createEReference(stateEClass, STATE__EXIT);

    connectorEClass = createEClass(CONNECTOR);
    createEAttribute(connectorEClass, CONNECTOR__PUBLIC);
    createEReference(connectorEClass, CONNECTOR__HISTORY);

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

    historyEClass = createEClass(HISTORY);
    createEAttribute(historyEClass, HISTORY__DEPTH);
    createEAttribute(historyEClass, HISTORY__HOT);
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
    hyperVertexEClass.getESuperTypes().add(this.getVertex());
    graphEdgeEClass.getESuperTypes().add(this.getEdge());
    hyperGraphEClass.getESuperTypes().add(this.getHyperVertex());
    stateEClass.getESuperTypes().add(this.getHyperGraph());
    connectorEClass.getESuperTypes().add(this.getVertex());
    transitionEClass.getESuperTypes().add(this.getGraphEdge());

    // Initialize classes, features, and operations; add parameters
    initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVertex_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVertex_Parent(), this.getHyperVertex(), this.getHyperVertex_SubVertices(), "parent", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdge_Source(), this.getVertex(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdge_Target(), this.getVertex(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperEdgeEClass, HyperEdge.class, "HyperEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHyperEdge_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, HyperEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperVertexEClass, HyperVertex.class, "HyperVertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHyperVertex_SubVertices(), this.getVertex(), this.getVertex_Parent(), "subVertices", null, 0, -1, HyperVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getHyperVertex__IsAncestor__Vertex_Vertex(), theEcorePackage.getEBooleanObject(), "isAncestor", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getVertex(), "one", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getVertex(), "two", 0, 1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getHyperVertex__LCA__Vertex_Vertex(), this.getHyperVertex(), "LCA", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getVertex(), "one", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getVertex(), "two", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(graphEdgeEClass, GraphEdge.class, "GraphEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraphEdge_Owner(), this.getHyperGraph(), this.getHyperGraph_Edges(), "owner", null, 1, 1, GraphEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperGraphEClass, HyperGraph.class, "HyperGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHyperGraph_Edges(), this.getGraphEdge(), this.getGraphEdge_Owner(), "edges", null, 0, -1, HyperGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getState_Entry(), this.getFunction(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Doo(), this.getFunction(), null, "doo", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Exit(), this.getFunction(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnector_Public(), theEcorePackage.getEBoolean(), "public", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnector_History(), this.getHistory(), null, "history", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHistory_Depth(), theEcorePackage.getEInt(), "depth", null, 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHistory_Hot(), theEcorePackage.getEBoolean(), "hot", null, 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (hyperVertexEClass, 
       source, 
       new String[] 
       {
       "constraints", "defineOnlyOneRootHyperVertex"
       });					
    addAnnotation
      (graphEdgeEClass, 
       source, 
       new String[] 
       {
       "constraints", "transitionOwner legalBoundaryCrossing"
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
      (hyperVertexEClass, 
       source, 
       new String[] 
       {
       "defineOnlyOneRootHyperVertex", "(HyperVertex.allInstances()->select(n | n.parent.oclIsUndefined ()))->size() = 1"
       });		
    addAnnotation
      (getHyperVertex__IsAncestor__Vertex_Vertex(), 
       source, 
       new String[] 
       {
       "body", "if (one = two) \n\t\t\t\t\tthen true\n\t\t\t\telse\n\t\t\t\t\tif (two.parent.oclIsUndefined ())\n\t\t\t\t\t\tthen false\n\t\t\t\t\telse \n\t\t\t\t\t\tif (two.parent = one)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\telse \n\t\t\t\t\t\t\tisAncestor(one, two.parent)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif"
       });		
    addAnnotation
      (getHyperVertex__LCA__Vertex_Vertex(), 
       source, 
       new String[] 
       {
       "body", "if isAncestor(one, two) and one.oclIsTypeOf(HyperVertex)\n\t\t\t\t\tthen one.oclAsType(HyperVertex)\n\t\t\t\telse \n\t\t\t\t\tif isAncestor(two, one) and two.oclIsTypeOf(HyperVertex)\n\t\t\t\t\t\tthen two.oclAsType(HyperVertex)\n\t\t\t\t\telse\n\t\t\t\t\t\tLCA(one.parent,two.parent)\n\t\t\t\t\tendif\n\t\t\t\tendif"
       });			
    addAnnotation
      (graphEdgeEClass, 
       source, 
       new String[] 
       {
       "transitionOwner", "let lca : State = LCA(self.source, self.target) in self.owner = lca or isAncestor(self.owner, lca)",
       "legalBoundaryCrossing", "(self.target.parent <> self.source) and isAncestor(self.target.parent, self.source)"
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

} //RfsmPackageImpl
