/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gov.nist.csrc.ns.oscal.OSCALPackage
 * @generated
 */
@ProviderType
public interface OSCALFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OSCALFactory eINSTANCE = gov.nist.csrc.ns.oscal.impl.OSCALFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Alter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alter</em>'.
	 * @generated
	 */
	Alter createAlter();

	/**
	 * Returns a new object of class '<em>Assessment Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Log</em>'.
	 * @generated
	 */
	AssessmentLog createAssessmentLog();

	/**
	 * Returns a new object of class '<em>Assessment Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Platform</em>'.
	 * @generated
	 */
	AssessmentPlatform createAssessmentPlatform();

	/**
	 * Returns a new object of class '<em>Associated Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associated Activity</em>'.
	 * @generated
	 */
	AssociatedActivity createAssociatedActivity();

	/**
	 * Returns a new object of class '<em>At Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Frequency</em>'.
	 * @generated
	 */
	AtFrequency createAtFrequency();

	/**
	 * Returns a new object of class '<em>Attestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attestation</em>'.
	 * @generated
	 */
	Attestation createAttestation();

	/**
	 * Returns a new object of class '<em>Base64</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base64</em>'.
	 * @generated
	 */
	Base64 createBase64();

	/**
	 * Returns a new object of class '<em>Categorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorization</em>'.
	 * @generated
	 */
	Categorization createCategorization();

	/**
	 * Returns a new object of class '<em>Citation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citation</em>'.
	 * @generated
	 */
	Citation createCitation();

	/**
	 * Returns a new object of class '<em>Combine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combine</em>'.
	 * @generated
	 */
	Combine createCombine();

	/**
	 * Returns a new object of class '<em>Control Objective Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Objective Selection</em>'.
	 * @generated
	 */
	ControlObjectiveSelection createControlObjectiveSelection();

	/**
	 * Returns a new object of class '<em>Control Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Selection</em>'.
	 * @generated
	 */
	ControlSelection createControlSelection();

	/**
	 * Returns a new object of class '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom</em>'.
	 * @generated
	 */
	Custom createCustom();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Risk Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Log Entry</em>'.
	 * @generated
	 */
	RiskLogEntry createRiskLogEntry();

	/**
	 * Returns a new object of class '<em>Assessment Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Log Entry</em>'.
	 * @generated
	 */
	AssessmentLogEntry createAssessmentLogEntry();

	/**
	 * Returns a new object of class '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export</em>'.
	 * @generated
	 */
	Export createExport();

	/**
	 * Returns a new object of class '<em>External Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Id</em>'.
	 * @generated
	 */
	ExternalId createExternalId();

	/**
	 * Returns a new object of class '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet</em>'.
	 * @generated
	 */
	Facet createFacet();

	/**
	 * Returns a new object of class '<em>Flat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat</em>'.
	 * @generated
	 */
	Flat createFlat();

	/**
	 * Returns a new object of class '<em>Identified Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identified Subject</em>'.
	 * @generated
	 */
	IdentifiedSubject createIdentifiedSubject();

	/**
	 * Returns a new object of class '<em>Implemented Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implemented Component</em>'.
	 * @generated
	 */
	ImplementedComponent createImplementedComponent();

	/**
	 * Returns a new object of class '<em>Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Type</em>'.
	 * @generated
	 */
	InformationType createInformationType();

	/**
	 * Returns a new object of class '<em>Inherited</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherited</em>'.
	 * @generated
	 */
	Inherited createInherited();

	/**
	 * Returns a new object of class '<em>Leveraged Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leveraged Authorization</em>'.
	 * @generated
	 */
	LeveragedAuthorization createLeveragedAuthorization();

	/**
	 * Returns a new object of class '<em>Result Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Local Definitions</em>'.
	 * @generated
	 */
	ResultLocalDefinitions createResultLocalDefinitions();

	/**
	 * Returns a new object of class '<em>Assessment Results Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Results Local Definitions</em>'.
	 * @generated
	 */
	AssessmentResultsLocalDefinitions createAssessmentResultsLocalDefinitions();

	/**
	 * Returns a new object of class '<em>Assessment Plan Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Plan Local Definitions</em>'.
	 * @generated
	 */
	AssessmentPlanLocalDefinitions createAssessmentPlanLocalDefinitions();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Mitigating Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mitigating Factor</em>'.
	 * @generated
	 */
	MitigatingFactor createMitigatingFactor();

	/**
	 * Returns a new object of class '<em>On Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Date</em>'.
	 * @generated
	 */
	OnDate createOnDate();

	/**
	 * Returns a new object of class '<em>Poam Item Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poam Item Origin</em>'.
	 * @generated
	 */
	PoamItemOrigin createPoamItemOrigin();

	/**
	 * Returns a new object of class '<em>Assessment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Plan</em>'.
	 * @generated
	 */
	AssessmentPlan createAssessmentPlan();

	/**
	 * Returns a new object of class '<em>Assessment Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Results</em>'.
	 * @generated
	 */
	AssessmentResults createAssessmentResults();

	/**
	 * Returns a new object of class '<em>Import Ap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Ap</em>'.
	 * @generated
	 */
	ImportAp createImportAp();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Assessment Assets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Assets</em>'.
	 * @generated
	 */
	AssessmentAssets createAssessmentAssets();

	/**
	 * Returns a new object of class '<em>Assessment Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Method</em>'.
	 * @generated
	 */
	AssessmentMethod createAssessmentMethod();

	/**
	 * Returns a new object of class '<em>Assessment Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Part</em>'.
	 * @generated
	 */
	AssessmentPart createAssessmentPart();

	/**
	 * Returns a new object of class '<em>Assessment Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Subject</em>'.
	 * @generated
	 */
	AssessmentSubject createAssessmentSubject();

	/**
	 * Returns a new object of class '<em>Assessment Subject Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Subject Placeholder</em>'.
	 * @generated
	 */
	AssessmentSubjectPlaceholder createAssessmentSubjectPlaceholder();

	/**
	 * Returns a new object of class '<em>Associated Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associated Risk</em>'.
	 * @generated
	 */
	AssociatedRisk createAssociatedRisk();

	/**
	 * Returns a new object of class '<em>Characterization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characterization</em>'.
	 * @generated
	 */
	Characterization createCharacterization();

	/**
	 * Returns a new object of class '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding</em>'.
	 * @generated
	 */
	Finding createFinding();

	/**
	 * Returns a new object of class '<em>Finding Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding Target</em>'.
	 * @generated
	 */
	FindingTarget createFindingTarget();

	/**
	 * Returns a new object of class '<em>Import Ssp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Ssp</em>'.
	 * @generated
	 */
	ImportSsp createImportSsp();

	/**
	 * Returns a new object of class '<em>Local Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Objective</em>'.
	 * @generated
	 */
	LocalObjective createLocalObjective();

	/**
	 * Returns a new object of class '<em>Logged By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logged By</em>'.
	 * @generated
	 */
	LoggedBy createLoggedBy();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Origin Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Origin Actor</em>'.
	 * @generated
	 */
	OriginActor createOriginActor();

	/**
	 * Returns a new object of class '<em>Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Origin</em>'.
	 * @generated
	 */
	Origin createOrigin();

	/**
	 * Returns a new object of class '<em>Related Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Observation</em>'.
	 * @generated
	 */
	RelatedObservation createRelatedObservation();

	/**
	 * Returns a new object of class '<em>Related Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Task</em>'.
	 * @generated
	 */
	RelatedTask createRelatedTask();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Reviewed Controls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reviewed Controls</em>'.
	 * @generated
	 */
	ReviewedControls createReviewedControls();

	/**
	 * Returns a new object of class '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk</em>'.
	 * @generated
	 */
	Risk createRisk();

	/**
	 * Returns a new object of class '<em>Assessment Select Control By Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Select Control By Id</em>'.
	 * @generated
	 */
	AssessmentSelectControlById createAssessmentSelectControlById();

	/**
	 * Returns a new object of class '<em>Select Objective By Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Objective By Id</em>'.
	 * @generated
	 */
	SelectObjectiveById createSelectObjectiveById();

	/**
	 * Returns a new object of class '<em>Select Subject By Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Subject By Id</em>'.
	 * @generated
	 */
	SelectSubjectById createSelectSubjectById();

	/**
	 * Returns a new object of class '<em>Subject Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject Reference</em>'.
	 * @generated
	 */
	SubjectReference createSubjectReference();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Threat Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Id</em>'.
	 * @generated
	 */
	ThreatId createThreatId();

	/**
	 * Returns a new object of class '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	Control createControl();

	/**
	 * Returns a new object of class '<em>Catalog Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Group</em>'.
	 * @generated
	 */
	CatalogGroup createCatalogGroup();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition</em>'.
	 * @generated
	 */
	ComponentDefinition createComponentDefinition();

	/**
	 * Returns a new object of class '<em>Component Control Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Control Implementation</em>'.
	 * @generated
	 */
	ComponentControlImplementation createComponentControlImplementation();

	/**
	 * Returns a new object of class '<em>Defined Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defined Component</em>'.
	 * @generated
	 */
	DefinedComponent createDefinedComponent();

	/**
	 * Returns a new object of class '<em>Component Implemented Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implemented Requirement</em>'.
	 * @generated
	 */
	ComponentImplementedRequirement createComponentImplementedRequirement();

	/**
	 * Returns a new object of class '<em>Import Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Component Definition</em>'.
	 * @generated
	 */
	ImportComponentDefinition createImportComponentDefinition();

	/**
	 * Returns a new object of class '<em>Incorporates Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incorporates Component</em>'.
	 * @generated
	 */
	IncorporatesComponent createIncorporatesComponent();

	/**
	 * Returns a new object of class '<em>Component Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Statement</em>'.
	 * @generated
	 */
	ComponentStatement createComponentStatement();

	/**
	 * Returns a new object of class '<em>Include All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include All</em>'.
	 * @generated
	 */
	IncludeAll createIncludeAll();

	/**
	 * Returns a new object of class '<em>Matching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching</em>'.
	 * @generated
	 */
	Matching createMatching();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Parameter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Constraint</em>'.
	 * @generated
	 */
	ParameterConstraint createParameterConstraint();

	/**
	 * Returns a new object of class '<em>Parameter Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Guideline</em>'.
	 * @generated
	 */
	ParameterGuideline createParameterGuideline();

	/**
	 * Returns a new object of class '<em>Parameter Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Selection</em>'.
	 * @generated
	 */
	ParameterSelection createParameterSelection();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Control Select Control By Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Select Control By Id</em>'.
	 * @generated
	 */
	ControlSelectControlById createControlSelectControlById();

	/**
	 * Returns a new object of class '<em>Authorized Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorized Privilege</em>'.
	 * @generated
	 */
	AuthorizedPrivilege createAuthorizedPrivilege();

	/**
	 * Returns a new object of class '<em>Implementation Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Status</em>'.
	 * @generated
	 */
	ImplementationStatus createImplementationStatus();

	/**
	 * Returns a new object of class '<em>Inventory Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory Item</em>'.
	 * @generated
	 */
	InventoryItem createInventoryItem();

	/**
	 * Returns a new object of class '<em>Port Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Range</em>'.
	 * @generated
	 */
	PortRange createPortRange();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Parameter</em>'.
	 * @generated
	 */
	SetParameter createSetParameter();

	/**
	 * Returns a new object of class '<em>System Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Component</em>'.
	 * @generated
	 */
	SystemComponent createSystemComponent();

	/**
	 * Returns a new object of class '<em>System Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Id</em>'.
	 * @generated
	 */
	SystemId createSystemId();

	/**
	 * Returns a new object of class '<em>System User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System User</em>'.
	 * @generated
	 */
	SystemUser createSystemUser();

	/**
	 * Returns a new object of class '<em>Confidence Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidence Score</em>'.
	 * @generated
	 */
	ConfidenceScore createConfidenceScore();

	/**
	 * Returns a new object of class '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage</em>'.
	 * @generated
	 */
	Coverage createCoverage();

	/**
	 * Returns a new object of class '<em>Gap Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gap Summary</em>'.
	 * @generated
	 */
	GapSummary createGapSummary();

	/**
	 * Returns a new object of class '<em>Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Entry</em>'.
	 * @generated
	 */
	MapEntry createMapEntry();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Mapping Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Item</em>'.
	 * @generated
	 */
	MappingItem createMappingItem();

	/**
	 * Returns a new object of class '<em>Mapping Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Provenance</em>'.
	 * @generated
	 */
	MappingProvenance createMappingProvenance();

	/**
	 * Returns a new object of class '<em>Mapping Resource Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Resource Reference</em>'.
	 * @generated
	 */
	MappingResourceReference createMappingResourceReference();

	/**
	 * Returns a new object of class '<em>Qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier Item</em>'.
	 * @generated
	 */
	QualifierItem createQualifierItem();

	/**
	 * Returns a new object of class '<em>Mapping Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Collection</em>'.
	 * @generated
	 */
	MappingCollection createMappingCollection();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Back Matter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Back Matter</em>'.
	 * @generated
	 */
	BackMatter createBackMatter();

	/**
	 * Returns a new object of class '<em>Document Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Id</em>'.
	 * @generated
	 */
	DocumentId createDocumentId();

	/**
	 * Returns a new object of class '<em>Hash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash</em>'.
	 * @generated
	 */
	Hash createHash();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsible Party</em>'.
	 * @generated
	 */
	ResponsibleParty createResponsibleParty();

	/**
	 * Returns a new object of class '<em>Responsible Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsible Role</em>'.
	 * @generated
	 */
	ResponsibleRole createResponsibleRole();

	/**
	 * Returns a new object of class '<em>Telephone Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telephone Number</em>'.
	 * @generated
	 */
	TelephoneNumber createTelephoneNumber();

	/**
	 * Returns a new object of class '<em>Poam Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poam Local Definitions</em>'.
	 * @generated
	 */
	PoamLocalDefinitions createPoamLocalDefinitions();

	/**
	 * Returns a new object of class '<em>Plan Of Action And Milestones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Action And Milestones</em>'.
	 * @generated
	 */
	PlanOfActionAndMilestones createPlanOfActionAndMilestones();

	/**
	 * Returns a new object of class '<em>Poam Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poam Item</em>'.
	 * @generated
	 */
	PoamItem createPoamItem();

	/**
	 * Returns a new object of class '<em>Profile Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Group</em>'.
	 * @generated
	 */
	ProfileGroup createProfileGroup();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Insert Controls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Controls</em>'.
	 * @generated
	 */
	InsertControls createInsertControls();

	/**
	 * Returns a new object of class '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge</em>'.
	 * @generated
	 */
	Merge createMerge();

	/**
	 * Returns a new object of class '<em>Modify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify</em>'.
	 * @generated
	 */
	Modify createModify();

	/**
	 * Returns a new object of class '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile</em>'.
	 * @generated
	 */
	Profile createProfile();

	/**
	 * Returns a new object of class '<em>Authorization Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Boundary</em>'.
	 * @generated
	 */
	AuthorizationBoundary createAuthorizationBoundary();

	/**
	 * Returns a new object of class '<em>By Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>By Component</em>'.
	 * @generated
	 */
	ByComponent createByComponent();

	/**
	 * Returns a new object of class '<em>Ssp Control Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssp Control Implementation</em>'.
	 * @generated
	 */
	SspControlImplementation createSspControlImplementation();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact</em>'.
	 * @generated
	 */
	Impact createImpact();

	/**
	 * Returns a new object of class '<em>Ssp Implemented Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssp Implemented Requirement</em>'.
	 * @generated
	 */
	SspImplementedRequirement createSspImplementedRequirement();

	/**
	 * Returns a new object of class '<em>Import Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Profile</em>'.
	 * @generated
	 */
	ImportProfile createImportProfile();

	/**
	 * Returns a new object of class '<em>Network Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Architecture</em>'.
	 * @generated
	 */
	NetworkArchitecture createNetworkArchitecture();

	/**
	 * Returns a new object of class '<em>Security Impact Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Impact Level</em>'.
	 * @generated
	 */
	SecurityImpactLevel createSecurityImpactLevel();

	/**
	 * Returns a new object of class '<em>Ssp Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssp Statement</em>'.
	 * @generated
	 */
	SspStatement createSspStatement();

	/**
	 * Returns a new object of class '<em>System Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Status</em>'.
	 * @generated
	 */
	SystemStatus createSystemStatus();

	/**
	 * Returns a new object of class '<em>System Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Characteristics</em>'.
	 * @generated
	 */
	SystemCharacteristics createSystemCharacteristics();

	/**
	 * Returns a new object of class '<em>System Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Implementation</em>'.
	 * @generated
	 */
	SystemImplementation createSystemImplementation();

	/**
	 * Returns a new object of class '<em>System Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Information</em>'.
	 * @generated
	 */
	SystemInformation createSystemInformation();

	/**
	 * Returns a new object of class '<em>System Security Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Security Plan</em>'.
	 * @generated
	 */
	SystemSecurityPlan createSystemSecurityPlan();

	/**
	 * Returns a new object of class '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party</em>'.
	 * @generated
	 */
	Party createParty();

	/**
	 * Returns a new object of class '<em>Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided</em>'.
	 * @generated
	 */
	Provided createProvided();

	/**
	 * Returns a new object of class '<em>Related Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Finding</em>'.
	 * @generated
	 */
	RelatedFinding createRelatedFinding();

	/**
	 * Returns a new object of class '<em>Related Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Response</em>'.
	 * @generated
	 */
	RelatedResponse createRelatedResponse();

	/**
	 * Returns a new object of class '<em>Relevant Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relevant Evidence</em>'.
	 * @generated
	 */
	RelevantEvidence createRelevantEvidence();

	/**
	 * Returns a new object of class '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove</em>'.
	 * @generated
	 */
	Remove createRemove();

	/**
	 * Returns a new object of class '<em>Required Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Asset</em>'.
	 * @generated
	 */
	RequiredAsset createRequiredAsset();

	/**
	 * Returns a new object of class '<em>Back Matter Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Back Matter Resource</em>'.
	 * @generated
	 */
	BackMatterResource createBackMatterResource();

	/**
	 * Returns a new object of class '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsibility</em>'.
	 * @generated
	 */
	Responsibility createResponsibility();

	/**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
	Revision createRevision();

	/**
	 * Returns a new object of class '<em>Risk Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Log</em>'.
	 * @generated
	 */
	RiskLog createRiskLog();

	/**
	 * Returns a new object of class '<em>Rlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rlink</em>'.
	 * @generated
	 */
	Rlink createRlink();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Satisfied</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfied</em>'.
	 * @generated
	 */
	Satisfied createSatisfied();

	/**
	 * Returns a new object of class '<em>Profile Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Set Parameter</em>'.
	 * @generated
	 */
	ProfileSetParameter createProfileSetParameter();

	/**
	 * Returns a new object of class '<em>Placeholder Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placeholder Source</em>'.
	 * @generated
	 */
	PlaceholderSource createPlaceholderSource();

	/**
	 * Returns a new object of class '<em>Finding Target Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding Target Status</em>'.
	 * @generated
	 */
	FindingTargetStatus createFindingTargetStatus();

	/**
	 * Returns a new object of class '<em>System Component Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Component Status</em>'.
	 * @generated
	 */
	SystemComponentStatus createSystemComponentStatus();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Terms And Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terms And Conditions</em>'.
	 * @generated
	 */
	TermsAndConditions createTermsAndConditions();

	/**
	 * Returns a new object of class '<em>Constraint Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Test</em>'.
	 * @generated
	 */
	ConstraintTest createConstraintTest();

	/**
	 * Returns a new object of class '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing</em>'.
	 * @generated
	 */
	Timing createTiming();

	/**
	 * Returns a new object of class '<em>Uses Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Component</em>'.
	 * @generated
	 */
	UsesComponent createUsesComponent();

	/**
	 * Returns a new object of class '<em>Within Date Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Within Date Range</em>'.
	 * @generated
	 */
	WithinDateRange createWithinDateRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OSCALPackage getOSCALPackage();

} //OSCALFactory
