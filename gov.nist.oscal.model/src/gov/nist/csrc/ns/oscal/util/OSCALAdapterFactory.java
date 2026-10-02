/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package gov.nist.csrc.ns.oscal.util;

import gov.nist.csrc.ns.oscal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.nist.csrc.ns.oscal.OSCALPackage
 * @generated
 */
public class OSCALAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OSCALPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCALAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OSCALPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCALSwitch<Adapter> modelSwitch =
		new OSCALSwitch<Adapter>() {
			@Override
			public Adapter caseAdd(Add object) {
				return createAddAdapter();
			}
			@Override
			public Adapter caseAlter(Alter object) {
				return createAlterAdapter();
			}
			@Override
			public Adapter caseAssessmentLog(AssessmentLog object) {
				return createAssessmentLogAdapter();
			}
			@Override
			public Adapter caseAssessmentPlatform(AssessmentPlatform object) {
				return createAssessmentPlatformAdapter();
			}
			@Override
			public Adapter caseAssociatedActivity(AssociatedActivity object) {
				return createAssociatedActivityAdapter();
			}
			@Override
			public Adapter caseAtFrequency(AtFrequency object) {
				return createAtFrequencyAdapter();
			}
			@Override
			public Adapter caseAttestation(Attestation object) {
				return createAttestationAdapter();
			}
			@Override
			public Adapter caseBase64(Base64 object) {
				return createBase64Adapter();
			}
			@Override
			public Adapter caseCategorization(Categorization object) {
				return createCategorizationAdapter();
			}
			@Override
			public Adapter caseCitation(Citation object) {
				return createCitationAdapter();
			}
			@Override
			public Adapter caseCombine(Combine object) {
				return createCombineAdapter();
			}
			@Override
			public Adapter caseControlObjectiveSelection(ControlObjectiveSelection object) {
				return createControlObjectiveSelectionAdapter();
			}
			@Override
			public Adapter caseControlSelection(ControlSelection object) {
				return createControlSelectionAdapter();
			}
			@Override
			public Adapter caseCustom(Custom object) {
				return createCustomAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseRiskLogEntry(RiskLogEntry object) {
				return createRiskLogEntryAdapter();
			}
			@Override
			public Adapter caseAssessmentLogEntry(AssessmentLogEntry object) {
				return createAssessmentLogEntryAdapter();
			}
			@Override
			public Adapter caseExport(Export object) {
				return createExportAdapter();
			}
			@Override
			public Adapter caseExternalId(ExternalId object) {
				return createExternalIdAdapter();
			}
			@Override
			public Adapter caseFacet(Facet object) {
				return createFacetAdapter();
			}
			@Override
			public Adapter caseFlat(Flat object) {
				return createFlatAdapter();
			}
			@Override
			public Adapter caseIdentifiedSubject(IdentifiedSubject object) {
				return createIdentifiedSubjectAdapter();
			}
			@Override
			public Adapter caseImplementedComponent(ImplementedComponent object) {
				return createImplementedComponentAdapter();
			}
			@Override
			public Adapter caseInformationType(InformationType object) {
				return createInformationTypeAdapter();
			}
			@Override
			public Adapter caseInherited(Inherited object) {
				return createInheritedAdapter();
			}
			@Override
			public Adapter caseLeveragedAuthorization(LeveragedAuthorization object) {
				return createLeveragedAuthorizationAdapter();
			}
			@Override
			public Adapter caseResultLocalDefinitions(ResultLocalDefinitions object) {
				return createResultLocalDefinitionsAdapter();
			}
			@Override
			public Adapter caseAssessmentResultsLocalDefinitions(AssessmentResultsLocalDefinitions object) {
				return createAssessmentResultsLocalDefinitionsAdapter();
			}
			@Override
			public Adapter caseAssessmentPlanLocalDefinitions(AssessmentPlanLocalDefinitions object) {
				return createAssessmentPlanLocalDefinitionsAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseMitigatingFactor(MitigatingFactor object) {
				return createMitigatingFactorAdapter();
			}
			@Override
			public Adapter caseOnDate(OnDate object) {
				return createOnDateAdapter();
			}
			@Override
			public Adapter casePoamItemOrigin(PoamItemOrigin object) {
				return createPoamItemOriginAdapter();
			}
			@Override
			public Adapter caseAssessmentPlan(AssessmentPlan object) {
				return createAssessmentPlanAdapter();
			}
			@Override
			public Adapter caseAssessmentResults(AssessmentResults object) {
				return createAssessmentResultsAdapter();
			}
			@Override
			public Adapter caseImportAp(ImportAp object) {
				return createImportApAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAssessmentAssets(AssessmentAssets object) {
				return createAssessmentAssetsAdapter();
			}
			@Override
			public Adapter caseAssessmentMethod(AssessmentMethod object) {
				return createAssessmentMethodAdapter();
			}
			@Override
			public Adapter caseAssessmentPart(AssessmentPart object) {
				return createAssessmentPartAdapter();
			}
			@Override
			public Adapter caseAssessmentSubject(AssessmentSubject object) {
				return createAssessmentSubjectAdapter();
			}
			@Override
			public Adapter caseAssessmentSubjectPlaceholder(AssessmentSubjectPlaceholder object) {
				return createAssessmentSubjectPlaceholderAdapter();
			}
			@Override
			public Adapter caseAssociatedRisk(AssociatedRisk object) {
				return createAssociatedRiskAdapter();
			}
			@Override
			public Adapter caseCharacterization(Characterization object) {
				return createCharacterizationAdapter();
			}
			@Override
			public Adapter caseFinding(Finding object) {
				return createFindingAdapter();
			}
			@Override
			public Adapter caseFindingTarget(FindingTarget object) {
				return createFindingTargetAdapter();
			}
			@Override
			public Adapter caseImportSsp(ImportSsp object) {
				return createImportSspAdapter();
			}
			@Override
			public Adapter caseLocalObjective(LocalObjective object) {
				return createLocalObjectiveAdapter();
			}
			@Override
			public Adapter caseLoggedBy(LoggedBy object) {
				return createLoggedByAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseOriginActor(OriginActor object) {
				return createOriginActorAdapter();
			}
			@Override
			public Adapter caseOrigin(Origin object) {
				return createOriginAdapter();
			}
			@Override
			public Adapter caseRelatedObservation(RelatedObservation object) {
				return createRelatedObservationAdapter();
			}
			@Override
			public Adapter caseRelatedTask(RelatedTask object) {
				return createRelatedTaskAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseReviewedControls(ReviewedControls object) {
				return createReviewedControlsAdapter();
			}
			@Override
			public Adapter caseRisk(Risk object) {
				return createRiskAdapter();
			}
			@Override
			public Adapter caseAssessmentSelectControlById(AssessmentSelectControlById object) {
				return createAssessmentSelectControlByIdAdapter();
			}
			@Override
			public Adapter caseSelectObjectiveById(SelectObjectiveById object) {
				return createSelectObjectiveByIdAdapter();
			}
			@Override
			public Adapter caseSelectSubjectById(SelectSubjectById object) {
				return createSelectSubjectByIdAdapter();
			}
			@Override
			public Adapter caseSubjectReference(SubjectReference object) {
				return createSubjectReferenceAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseThreatId(ThreatId object) {
				return createThreatIdAdapter();
			}
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseCatalogGroup(CatalogGroup object) {
				return createCatalogGroupAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseComponentDefinition(ComponentDefinition object) {
				return createComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseComponentControlImplementation(ComponentControlImplementation object) {
				return createComponentControlImplementationAdapter();
			}
			@Override
			public Adapter caseDefinedComponent(DefinedComponent object) {
				return createDefinedComponentAdapter();
			}
			@Override
			public Adapter caseComponentImplementedRequirement(ComponentImplementedRequirement object) {
				return createComponentImplementedRequirementAdapter();
			}
			@Override
			public Adapter caseImportComponentDefinition(ImportComponentDefinition object) {
				return createImportComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseIncorporatesComponent(IncorporatesComponent object) {
				return createIncorporatesComponentAdapter();
			}
			@Override
			public Adapter caseComponentStatement(ComponentStatement object) {
				return createComponentStatementAdapter();
			}
			@Override
			public Adapter caseIncludeAll(IncludeAll object) {
				return createIncludeAllAdapter();
			}
			@Override
			public Adapter caseMatching(Matching object) {
				return createMatchingAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterConstraint(ParameterConstraint object) {
				return createParameterConstraintAdapter();
			}
			@Override
			public Adapter caseParameterGuideline(ParameterGuideline object) {
				return createParameterGuidelineAdapter();
			}
			@Override
			public Adapter caseParameterSelection(ParameterSelection object) {
				return createParameterSelectionAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseControlSelectControlById(ControlSelectControlById object) {
				return createControlSelectControlByIdAdapter();
			}
			@Override
			public Adapter caseAuthorizedPrivilege(AuthorizedPrivilege object) {
				return createAuthorizedPrivilegeAdapter();
			}
			@Override
			public Adapter caseImplementationStatus(ImplementationStatus object) {
				return createImplementationStatusAdapter();
			}
			@Override
			public Adapter caseInventoryItem(InventoryItem object) {
				return createInventoryItemAdapter();
			}
			@Override
			public Adapter casePortRange(PortRange object) {
				return createPortRangeAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseSetParameter(SetParameter object) {
				return createSetParameterAdapter();
			}
			@Override
			public Adapter caseSystemComponent(SystemComponent object) {
				return createSystemComponentAdapter();
			}
			@Override
			public Adapter caseSystemId(SystemId object) {
				return createSystemIdAdapter();
			}
			@Override
			public Adapter caseSystemUser(SystemUser object) {
				return createSystemUserAdapter();
			}
			@Override
			public Adapter caseConfidenceScore(ConfidenceScore object) {
				return createConfidenceScoreAdapter();
			}
			@Override
			public Adapter caseCoverage(Coverage object) {
				return createCoverageAdapter();
			}
			@Override
			public Adapter caseGapSummary(GapSummary object) {
				return createGapSummaryAdapter();
			}
			@Override
			public Adapter caseMapEntry(MapEntry object) {
				return createMapEntryAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseMappingItem(MappingItem object) {
				return createMappingItemAdapter();
			}
			@Override
			public Adapter caseMappingProvenance(MappingProvenance object) {
				return createMappingProvenanceAdapter();
			}
			@Override
			public Adapter caseMappingResourceReference(MappingResourceReference object) {
				return createMappingResourceReferenceAdapter();
			}
			@Override
			public Adapter caseQualifierItem(QualifierItem object) {
				return createQualifierItemAdapter();
			}
			@Override
			public Adapter caseMappingCollection(MappingCollection object) {
				return createMappingCollectionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseBackMatter(BackMatter object) {
				return createBackMatterAdapter();
			}
			@Override
			public Adapter caseDocumentId(DocumentId object) {
				return createDocumentIdAdapter();
			}
			@Override
			public Adapter caseHash(Hash object) {
				return createHashAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseResponsibleParty(ResponsibleParty object) {
				return createResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseResponsibleRole(ResponsibleRole object) {
				return createResponsibleRoleAdapter();
			}
			@Override
			public Adapter caseTelephoneNumber(TelephoneNumber object) {
				return createTelephoneNumberAdapter();
			}
			@Override
			public Adapter casePoamLocalDefinitions(PoamLocalDefinitions object) {
				return createPoamLocalDefinitionsAdapter();
			}
			@Override
			public Adapter casePlanOfActionAndMilestones(PlanOfActionAndMilestones object) {
				return createPlanOfActionAndMilestonesAdapter();
			}
			@Override
			public Adapter casePoamItem(PoamItem object) {
				return createPoamItemAdapter();
			}
			@Override
			public Adapter caseProfileGroup(ProfileGroup object) {
				return createProfileGroupAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseInsertControls(InsertControls object) {
				return createInsertControlsAdapter();
			}
			@Override
			public Adapter caseMerge(Merge object) {
				return createMergeAdapter();
			}
			@Override
			public Adapter caseModify(Modify object) {
				return createModifyAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object) {
				return createProfileAdapter();
			}
			@Override
			public Adapter caseAuthorizationBoundary(AuthorizationBoundary object) {
				return createAuthorizationBoundaryAdapter();
			}
			@Override
			public Adapter caseByComponent(ByComponent object) {
				return createByComponentAdapter();
			}
			@Override
			public Adapter caseSspControlImplementation(SspControlImplementation object) {
				return createSspControlImplementationAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseImpact(Impact object) {
				return createImpactAdapter();
			}
			@Override
			public Adapter caseSspImplementedRequirement(SspImplementedRequirement object) {
				return createSspImplementedRequirementAdapter();
			}
			@Override
			public Adapter caseImportProfile(ImportProfile object) {
				return createImportProfileAdapter();
			}
			@Override
			public Adapter caseNetworkArchitecture(NetworkArchitecture object) {
				return createNetworkArchitectureAdapter();
			}
			@Override
			public Adapter caseSecurityImpactLevel(SecurityImpactLevel object) {
				return createSecurityImpactLevelAdapter();
			}
			@Override
			public Adapter caseSspStatement(SspStatement object) {
				return createSspStatementAdapter();
			}
			@Override
			public Adapter caseSystemStatus(SystemStatus object) {
				return createSystemStatusAdapter();
			}
			@Override
			public Adapter caseSystemCharacteristics(SystemCharacteristics object) {
				return createSystemCharacteristicsAdapter();
			}
			@Override
			public Adapter caseSystemImplementation(SystemImplementation object) {
				return createSystemImplementationAdapter();
			}
			@Override
			public Adapter caseSystemInformation(SystemInformation object) {
				return createSystemInformationAdapter();
			}
			@Override
			public Adapter caseSystemSecurityPlan(SystemSecurityPlan object) {
				return createSystemSecurityPlanAdapter();
			}
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter caseProvided(Provided object) {
				return createProvidedAdapter();
			}
			@Override
			public Adapter caseRelatedFinding(RelatedFinding object) {
				return createRelatedFindingAdapter();
			}
			@Override
			public Adapter caseRelatedResponse(RelatedResponse object) {
				return createRelatedResponseAdapter();
			}
			@Override
			public Adapter caseRelevantEvidence(RelevantEvidence object) {
				return createRelevantEvidenceAdapter();
			}
			@Override
			public Adapter caseRemove(Remove object) {
				return createRemoveAdapter();
			}
			@Override
			public Adapter caseRequiredAsset(RequiredAsset object) {
				return createRequiredAssetAdapter();
			}
			@Override
			public Adapter caseBackMatterResource(BackMatterResource object) {
				return createBackMatterResourceAdapter();
			}
			@Override
			public Adapter caseResponsibility(Responsibility object) {
				return createResponsibilityAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseRiskLog(RiskLog object) {
				return createRiskLogAdapter();
			}
			@Override
			public Adapter caseRlink(Rlink object) {
				return createRlinkAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseSatisfied(Satisfied object) {
				return createSatisfiedAdapter();
			}
			@Override
			public Adapter caseProfileSetParameter(ProfileSetParameter object) {
				return createProfileSetParameterAdapter();
			}
			@Override
			public Adapter casePlaceholderSource(PlaceholderSource object) {
				return createPlaceholderSourceAdapter();
			}
			@Override
			public Adapter caseFindingTargetStatus(FindingTargetStatus object) {
				return createFindingTargetStatusAdapter();
			}
			@Override
			public Adapter caseSystemComponentStatus(SystemComponentStatus object) {
				return createSystemComponentStatusAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseTermsAndConditions(TermsAndConditions object) {
				return createTermsAndConditionsAdapter();
			}
			@Override
			public Adapter caseConstraintTest(ConstraintTest object) {
				return createConstraintTestAdapter();
			}
			@Override
			public Adapter caseTiming(Timing object) {
				return createTimingAdapter();
			}
			@Override
			public Adapter caseUsesComponent(UsesComponent object) {
				return createUsesComponentAdapter();
			}
			@Override
			public Adapter caseWithinDateRange(WithinDateRange object) {
				return createWithinDateRangeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Alter
	 * @generated
	 */
	public Adapter createAlterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentLog <em>Assessment Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLog
	 * @generated
	 */
	public Adapter createAssessmentLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform <em>Assessment Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform
	 * @generated
	 */
	public Adapter createAssessmentPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssociatedActivity <em>Associated Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity
	 * @generated
	 */
	public Adapter createAssociatedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AtFrequency <em>At Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AtFrequency
	 * @generated
	 */
	public Adapter createAtFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Attestation <em>Attestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Attestation
	 * @generated
	 */
	public Adapter createAttestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Base64
	 * @generated
	 */
	public Adapter createBase64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Categorization <em>Categorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Categorization
	 * @generated
	 */
	public Adapter createCategorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Citation
	 * @generated
	 */
	public Adapter createCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Combine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Combine
	 * @generated
	 */
	public Adapter createCombineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection <em>Control Objective Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection
	 * @generated
	 */
	public Adapter createControlObjectiveSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ControlSelection <em>Control Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection
	 * @generated
	 */
	public Adapter createControlSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Custom
	 * @generated
	 */
	public Adapter createCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RiskLogEntry <em>Risk Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry
	 * @generated
	 */
	public Adapter createRiskLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry <em>Assessment Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry
	 * @generated
	 */
	public Adapter createAssessmentLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ExternalId
	 * @generated
	 */
	public Adapter createExternalIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Facet
	 * @generated
	 */
	public Adapter createFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Flat <em>Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Flat
	 * @generated
	 */
	public Adapter createFlatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.IdentifiedSubject <em>Identified Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.IdentifiedSubject
	 * @generated
	 */
	public Adapter createIdentifiedSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ImplementedComponent <em>Implemented Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent
	 * @generated
	 */
	public Adapter createImplementedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.InformationType
	 * @generated
	 */
	public Adapter createInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Inherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Inherited
	 * @generated
	 */
	public Adapter createInheritedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization <em>Leveraged Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization
	 * @generated
	 */
	public Adapter createLeveragedAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions <em>Result Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions
	 * @generated
	 */
	public Adapter createResultLocalDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions <em>Assessment Results Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions
	 * @generated
	 */
	public Adapter createAssessmentResultsLocalDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions <em>Assessment Plan Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions
	 * @generated
	 */
	public Adapter createAssessmentPlanLocalDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.MitigatingFactor <em>Mitigating Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor
	 * @generated
	 */
	public Adapter createMitigatingFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.OnDate <em>On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.OnDate
	 * @generated
	 */
	public Adapter createOnDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.PoamItemOrigin <em>Poam Item Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.PoamItemOrigin
	 * @generated
	 */
	public Adapter createPoamItemOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentPlan <em>Assessment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan
	 * @generated
	 */
	public Adapter createAssessmentPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentResults <em>Assessment Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults
	 * @generated
	 */
	public Adapter createAssessmentResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ImportAp <em>Import Ap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ImportAp
	 * @generated
	 */
	public Adapter createImportApAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentAssets <em>Assessment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentAssets
	 * @generated
	 */
	public Adapter createAssessmentAssetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentMethod <em>Assessment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod
	 * @generated
	 */
	public Adapter createAssessmentMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentPart <em>Assessment Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart
	 * @generated
	 */
	public Adapter createAssessmentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentSubject <em>Assessment Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject
	 * @generated
	 */
	public Adapter createAssessmentSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder <em>Assessment Subject Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder
	 * @generated
	 */
	public Adapter createAssessmentSubjectPlaceholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssociatedRisk <em>Associated Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssociatedRisk
	 * @generated
	 */
	public Adapter createAssociatedRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Characterization
	 * @generated
	 */
	public Adapter createCharacterizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Finding
	 * @generated
	 */
	public Adapter createFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.FindingTarget <em>Finding Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget
	 * @generated
	 */
	public Adapter createFindingTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ImportSsp <em>Import Ssp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ImportSsp
	 * @generated
	 */
	public Adapter createImportSspAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.LocalObjective <em>Local Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective
	 * @generated
	 */
	public Adapter createLocalObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.LoggedBy <em>Logged By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.LoggedBy
	 * @generated
	 */
	public Adapter createLoggedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.OriginActor <em>Origin Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.OriginActor
	 * @generated
	 */
	public Adapter createOriginActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Origin
	 * @generated
	 */
	public Adapter createOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RelatedObservation <em>Related Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RelatedObservation
	 * @generated
	 */
	public Adapter createRelatedObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask
	 * @generated
	 */
	public Adapter createRelatedTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ReviewedControls <em>Reviewed Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls
	 * @generated
	 */
	public Adapter createReviewedControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Risk
	 * @generated
	 */
	public Adapter createRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById <em>Assessment Select Control By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSelectControlById
	 * @generated
	 */
	public Adapter createAssessmentSelectControlByIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SelectObjectiveById <em>Select Objective By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SelectObjectiveById
	 * @generated
	 */
	public Adapter createSelectObjectiveByIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SelectSubjectById <em>Select Subject By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById
	 * @generated
	 */
	public Adapter createSelectSubjectByIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SubjectReference <em>Subject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference
	 * @generated
	 */
	public Adapter createSubjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ThreatId <em>Threat Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ThreatId
	 * @generated
	 */
	public Adapter createThreatIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.CatalogGroup <em>Catalog Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup
	 * @generated
	 */
	public Adapter createCatalogGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition
	 * @generated
	 */
	public Adapter createComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation <em>Component Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation
	 * @generated
	 */
	public Adapter createComponentControlImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.DefinedComponent <em>Defined Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent
	 * @generated
	 */
	public Adapter createDefinedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement <em>Component Implemented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement
	 * @generated
	 */
	public Adapter createComponentImplementedRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ImportComponentDefinition <em>Import Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ImportComponentDefinition
	 * @generated
	 */
	public Adapter createImportComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.IncorporatesComponent <em>Incorporates Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.IncorporatesComponent
	 * @generated
	 */
	public Adapter createIncorporatesComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ComponentStatement <em>Component Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement
	 * @generated
	 */
	public Adapter createComponentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.IncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.IncludeAll
	 * @generated
	 */
	public Adapter createIncludeAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Matching <em>Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Matching
	 * @generated
	 */
	public Adapter createMatchingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ParameterConstraint <em>Parameter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ParameterConstraint
	 * @generated
	 */
	public Adapter createParameterConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ParameterGuideline <em>Parameter Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline
	 * @generated
	 */
	public Adapter createParameterGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ParameterSelection <em>Parameter Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ParameterSelection
	 * @generated
	 */
	public Adapter createParameterSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ControlSelectControlById <em>Control Select Control By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ControlSelectControlById
	 * @generated
	 */
	public Adapter createControlSelectControlByIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AuthorizedPrivilege <em>Authorized Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AuthorizedPrivilege
	 * @generated
	 */
	public Adapter createAuthorizedPrivilegeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ImplementationStatus
	 * @generated
	 */
	public Adapter createImplementationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.InventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem
	 * @generated
	 */
	public Adapter createInventoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.PortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.PortRange
	 * @generated
	 */
	public Adapter createPortRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SetParameter
	 * @generated
	 */
	public Adapter createSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent
	 * @generated
	 */
	public Adapter createSystemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemId
	 * @generated
	 */
	public Adapter createSystemIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemUser
	 * @generated
	 */
	public Adapter createSystemUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ConfidenceScore <em>Confidence Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ConfidenceScore
	 * @generated
	 */
	public Adapter createConfidenceScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Coverage
	 * @generated
	 */
	public Adapter createCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.GapSummary <em>Gap Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.GapSummary
	 * @generated
	 */
	public Adapter createGapSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.MapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.MapEntry
	 * @generated
	 */
	public Adapter createMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.MappingItem <em>Mapping Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.MappingItem
	 * @generated
	 */
	public Adapter createMappingItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.MappingProvenance <em>Mapping Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance
	 * @generated
	 */
	public Adapter createMappingProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.MappingResourceReference <em>Mapping Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference
	 * @generated
	 */
	public Adapter createMappingResourceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.QualifierItem <em>Qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem
	 * @generated
	 */
	public Adapter createQualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.MappingCollection <em>Mapping Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection
	 * @generated
	 */
	public Adapter createMappingCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.BackMatter
	 * @generated
	 */
	public Adapter createBackMatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.DocumentId
	 * @generated
	 */
	public Adapter createDocumentIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Hash
	 * @generated
	 */
	public Adapter createHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty
	 * @generated
	 */
	public Adapter createResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole
	 * @generated
	 */
	public Adapter createResponsibleRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.TelephoneNumber
	 * @generated
	 */
	public Adapter createTelephoneNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.PoamLocalDefinitions <em>Poam Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.PoamLocalDefinitions
	 * @generated
	 */
	public Adapter createPoamLocalDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones <em>Plan Of Action And Milestones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones
	 * @generated
	 */
	public Adapter createPlanOfActionAndMilestonesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.PoamItem <em>Poam Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.PoamItem
	 * @generated
	 */
	public Adapter createPoamItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ProfileGroup <em>Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup
	 * @generated
	 */
	public Adapter createProfileGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.InsertControls <em>Insert Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.InsertControls
	 * @generated
	 */
	public Adapter createInsertControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Merge
	 * @generated
	 */
	public Adapter createMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Modify
	 * @generated
	 */
	public Adapter createModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary <em>Authorization Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary
	 * @generated
	 */
	public Adapter createAuthorizationBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ByComponent <em>By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ByComponent
	 * @generated
	 */
	public Adapter createByComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SspControlImplementation <em>Ssp Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SspControlImplementation
	 * @generated
	 */
	public Adapter createSspControlImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Impact
	 * @generated
	 */
	public Adapter createImpactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement <em>Ssp Implemented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement
	 * @generated
	 */
	public Adapter createSspImplementedRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ImportProfile <em>Import Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ImportProfile
	 * @generated
	 */
	public Adapter createImportProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture <em>Network Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture
	 * @generated
	 */
	public Adapter createNetworkArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel <em>Security Impact Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SecurityImpactLevel
	 * @generated
	 */
	public Adapter createSecurityImpactLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SspStatement <em>Ssp Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SspStatement
	 * @generated
	 */
	public Adapter createSspStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemStatus
	 * @generated
	 */
	public Adapter createSystemStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics <em>System Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics
	 * @generated
	 */
	public Adapter createSystemCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemImplementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation
	 * @generated
	 */
	public Adapter createSystemImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemInformation <em>System Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemInformation
	 * @generated
	 */
	public Adapter createSystemInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan <em>System Security Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan
	 * @generated
	 */
	public Adapter createSystemSecurityPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Provided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Provided
	 * @generated
	 */
	public Adapter createProvidedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RelatedFinding <em>Related Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RelatedFinding
	 * @generated
	 */
	public Adapter createRelatedFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RelatedResponse <em>Related Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse
	 * @generated
	 */
	public Adapter createRelatedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RelevantEvidence <em>Relevant Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence
	 * @generated
	 */
	public Adapter createRelevantEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Remove
	 * @generated
	 */
	public Adapter createRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RequiredAsset <em>Required Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset
	 * @generated
	 */
	public Adapter createRequiredAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.BackMatterResource <em>Back Matter Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource
	 * @generated
	 */
	public Adapter createBackMatterResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Responsibility
	 * @generated
	 */
	public Adapter createResponsibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.RiskLog <em>Risk Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.RiskLog
	 * @generated
	 */
	public Adapter createRiskLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Rlink <em>Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Rlink
	 * @generated
	 */
	public Adapter createRlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Satisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Satisfied
	 * @generated
	 */
	public Adapter createSatisfiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter <em>Profile Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter
	 * @generated
	 */
	public Adapter createProfileSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.PlaceholderSource <em>Placeholder Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.PlaceholderSource
	 * @generated
	 */
	public Adapter createPlaceholderSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.FindingTargetStatus <em>Finding Target Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.FindingTargetStatus
	 * @generated
	 */
	public Adapter createFindingTargetStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.SystemComponentStatus <em>System Component Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.SystemComponentStatus
	 * @generated
	 */
	public Adapter createSystemComponentStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.TermsAndConditions <em>Terms And Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.TermsAndConditions
	 * @generated
	 */
	public Adapter createTermsAndConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.ConstraintTest <em>Constraint Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.ConstraintTest
	 * @generated
	 */
	public Adapter createConstraintTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.Timing
	 * @generated
	 */
	public Adapter createTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.UsesComponent <em>Uses Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent
	 * @generated
	 */
	public Adapter createUsesComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.csrc.ns.oscal.WithinDateRange <em>Within Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.csrc.ns.oscal.WithinDateRange
	 * @generated
	 */
	public Adapter createWithinDateRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OSCALAdapterFactory
