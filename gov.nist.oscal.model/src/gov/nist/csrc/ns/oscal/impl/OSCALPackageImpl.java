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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.OSCALFactory;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import gov.nist.csrc.ns.oscal.util.OSCALValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCALPackageImpl extends EPackageImpl implements OSCALPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "oscal.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associatedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atFrequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlObjectiveSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementedComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leveragedAuthorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultLocalDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentResultsLocalDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentPlanLocalDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigatingFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poamItemOriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importApEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAssetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSubjectPlaceholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associatedRiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importSspEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewedControlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSelectControlByIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectObjectiveByIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectSubjectByIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentControlImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importComponentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incorporatesComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterGuidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlSelectControlByIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizedPrivilegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidenceScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingProvenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingResourceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backMatterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsiblePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibleRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poamLocalDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfActionAndMilestonesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poamItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertControlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sspControlImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sspImplementedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityImpactLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sspStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSecurityPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedFindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relevantEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backMatterResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileSetParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingTargetStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termsAndConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withinDateRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType asIsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType asIsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType base64DatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanDatatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType categoryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectedTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeWithTimezoneDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deadlineTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emailAddressDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expiresTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType implementationStatementUuidTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType informationTypeIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markupLineDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markupMultilineDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType memberOfOrganizationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntegerDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalAssessmentCommonRiskStatusFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalControlCommonParameterValueFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalControlCommonWithIdFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalImplementationCommonFunctionPerformedFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMappingCommonPercentageFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataAddrLineFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataEmailAddressFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataLastModifiedFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataLocationUuidFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataOscalVersionFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataPartyUuidFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataPublishedFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataRoleIdFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalMetadataVersionFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalSspBaseFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalSspDateAuthorizedFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscalSspSelectedFIELDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partyUuidTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType postalCodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securityObjectiveAvailabilityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securityObjectiveConfidentialityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securityObjectiveIntegrityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securitySensitivityLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortNameType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortNameType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType startTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType startType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType startType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statementIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemNameShortTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriReferenceDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidDatatypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeEDataType = null;

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OSCALPackageImpl() {
		super(eNS_URI, OSCALFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OSCALPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static OSCALPackage init() {
		if (isInited) return (OSCALPackage)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOSCALPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OSCALPackageImpl theOSCALPackage = registeredOSCALPackage instanceof OSCALPackageImpl ? (OSCALPackageImpl)registeredOSCALPackage : new OSCALPackageImpl();

		isInited = true;

		// Load packages
		theOSCALPackage.loadPackage();

		// Fix loaded packages
		theOSCALPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOSCALPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OSCALValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOSCALPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OSCALPackage.eNS_URI, theOSCALPackage);
		return theOSCALPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdd() {
		if (addEClass == null) {
			addEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(0);
		}
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdd_Title() {
        return (EAttribute)getAdd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdd_Param() {
        return (EReference)getAdd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdd_Prop() {
        return (EReference)getAdd().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdd_Link() {
        return (EReference)getAdd().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdd_Part() {
        return (EReference)getAdd().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdd_ById() {
        return (EAttribute)getAdd().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdd_Position() {
        return (EAttribute)getAdd().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlter() {
		if (alterEClass == null) {
			alterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(1);
		}
		return alterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlter_Remove() {
        return (EReference)getAlter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlter_Add() {
        return (EReference)getAlter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlter_ControlId() {
        return (EAttribute)getAlter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentLog() {
		if (assessmentLogEClass == null) {
			assessmentLogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(2);
		}
		return assessmentLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentLog_Entry() {
        return (EReference)getAssessmentLog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentPlatform() {
		if (assessmentPlatformEClass == null) {
			assessmentPlatformEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(3);
		}
		return assessmentPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPlatform_Title() {
        return (EAttribute)getAssessmentPlatform().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlatform_Prop() {
        return (EReference)getAssessmentPlatform().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlatform_Link() {
        return (EReference)getAssessmentPlatform().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlatform_UsesComponent() {
        return (EReference)getAssessmentPlatform().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPlatform_Remarks() {
        return (EAttribute)getAssessmentPlatform().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPlatform_Uuid() {
        return (EAttribute)getAssessmentPlatform().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociatedActivity() {
		if (associatedActivityEClass == null) {
			associatedActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(4);
		}
		return associatedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociatedActivity_Prop() {
        return (EReference)getAssociatedActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociatedActivity_Link() {
        return (EReference)getAssociatedActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociatedActivity_ResponsibleRole() {
        return (EReference)getAssociatedActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociatedActivity_Subject() {
        return (EReference)getAssociatedActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociatedActivity_Remarks() {
        return (EAttribute)getAssociatedActivity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociatedActivity_ActivityUuid() {
        return (EAttribute)getAssociatedActivity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtFrequency() {
		if (atFrequencyEClass == null) {
			atFrequencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(5);
		}
		return atFrequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtFrequency_Remarks() {
        return (EAttribute)getAtFrequency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtFrequency_Period() {
        return (EAttribute)getAtFrequency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtFrequency_Unit() {
        return (EAttribute)getAtFrequency().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttestation() {
		if (attestationEClass == null) {
			attestationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(6);
		}
		return attestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttestation_ResponsibleParty() {
        return (EReference)getAttestation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttestation_Part() {
        return (EReference)getAttestation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64() {
		if (base64EClass == null) {
			base64EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(7);
		}
		return base64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64_Value() {
        return (EAttribute)getBase64().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64_Filename() {
        return (EAttribute)getBase64().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64_MediaType() {
        return (EAttribute)getBase64().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategorization() {
		if (categorizationEClass == null) {
			categorizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(8);
		}
		return categorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategorization_InformationTypeId() {
        return (EAttribute)getCategorization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategorization_System() {
        return (EAttribute)getCategorization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCitation() {
		if (citationEClass == null) {
			citationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(9);
		}
		return citationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitation_Text() {
        return (EAttribute)getCitation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitation_Prop() {
        return (EReference)getCitation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitation_Link() {
        return (EReference)getCitation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCombine() {
		if (combineEClass == null) {
			combineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(10);
		}
		return combineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCombine_Method() {
        return (EAttribute)getCombine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlObjectiveSelection() {
		if (controlObjectiveSelectionEClass == null) {
			controlObjectiveSelectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(11);
		}
		return controlObjectiveSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlObjectiveSelection_Description() {
        return (EAttribute)getControlObjectiveSelection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlObjectiveSelection_Prop() {
        return (EReference)getControlObjectiveSelection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlObjectiveSelection_Link() {
        return (EReference)getControlObjectiveSelection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlObjectiveSelection_IncludeAll() {
        return (EReference)getControlObjectiveSelection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlObjectiveSelection_IncludeObjective() {
        return (EReference)getControlObjectiveSelection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlObjectiveSelection_ExcludeObjective() {
        return (EReference)getControlObjectiveSelection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlObjectiveSelection_Remarks() {
        return (EAttribute)getControlObjectiveSelection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlSelection() {
		if (controlSelectionEClass == null) {
			controlSelectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(12);
		}
		return controlSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSelection_Description() {
        return (EAttribute)getControlSelection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSelection_Prop() {
        return (EReference)getControlSelection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSelection_Link() {
        return (EReference)getControlSelection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSelection_IncludeAll() {
        return (EReference)getControlSelection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSelection_IncludeControl() {
        return (EReference)getControlSelection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSelection_ExcludeControl() {
        return (EReference)getControlSelection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSelection_Remarks() {
        return (EAttribute)getControlSelection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustom() {
		if (customEClass == null) {
			customEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(13);
		}
		return customEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustom_Group() {
        return (EReference)getCustom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustom_InsertControls() {
        return (EReference)getCustom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		if (dependencyEClass == null) {
			dependencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(14);
		}
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_Remarks() {
        return (EAttribute)getDependency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependency_TaskUuid() {
        return (EAttribute)getDependency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(15);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AssessmentPlan() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AssessmentResults() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Catalog() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ComponentDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MappingCollection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PlanOfActionAndMilestones() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Profile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SystemSecurityPlan() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Schema() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskLogEntry() {
		if (riskLogEntryEClass == null) {
			riskLogEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(16);
		}
		return riskLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_Title() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_Description() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_Start() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_End() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskLogEntry_Prop() {
        return (EReference)getRiskLogEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskLogEntry_Link() {
        return (EReference)getRiskLogEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskLogEntry_LoggedBy() {
        return (EReference)getRiskLogEntry().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_StatusChange() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskLogEntry_RelatedResponse() {
        return (EReference)getRiskLogEntry().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_Remarks() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLogEntry_Uuid() {
        return (EAttribute)getRiskLogEntry().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentLogEntry() {
		if (assessmentLogEntryEClass == null) {
			assessmentLogEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(17);
		}
		return assessmentLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentLogEntry_Title() {
        return (EAttribute)getAssessmentLogEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentLogEntry_Description() {
        return (EAttribute)getAssessmentLogEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentLogEntry_Start() {
        return (EAttribute)getAssessmentLogEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentLogEntry_End() {
        return (EAttribute)getAssessmentLogEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentLogEntry_Prop() {
        return (EReference)getAssessmentLogEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentLogEntry_Link() {
        return (EReference)getAssessmentLogEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentLogEntry_LoggedBy() {
        return (EReference)getAssessmentLogEntry().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentLogEntry_RelatedTask() {
        return (EReference)getAssessmentLogEntry().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentLogEntry_Remarks() {
        return (EAttribute)getAssessmentLogEntry().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentLogEntry_Uuid() {
        return (EAttribute)getAssessmentLogEntry().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExport() {
		if (exportEClass == null) {
			exportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(18);
		}
		return exportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_Description() {
        return (EAttribute)getExport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExport_Prop() {
        return (EReference)getExport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExport_Link() {
        return (EReference)getExport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExport_Provided() {
        return (EReference)getExport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExport_Responsibility() {
        return (EReference)getExport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExport_Remarks() {
        return (EAttribute)getExport().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalId() {
		if (externalIdEClass == null) {
			externalIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(19);
		}
		return externalIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalId_Value() {
        return (EAttribute)getExternalId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalId_Scheme() {
        return (EAttribute)getExternalId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacet() {
		if (facetEClass == null) {
			facetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(20);
		}
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacet_Prop() {
        return (EReference)getFacet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacet_Link() {
        return (EReference)getFacet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacet_Remarks() {
        return (EAttribute)getFacet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacet_Name() {
        return (EAttribute)getFacet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacet_System() {
        return (EAttribute)getFacet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacet_Value() {
        return (EAttribute)getFacet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlat() {
		if (flatEClass == null) {
			flatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(21);
		}
		return flatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiedSubject() {
		if (identifiedSubjectEClass == null) {
			identifiedSubjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(22);
		}
		return identifiedSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedSubject_Subject() {
        return (EReference)getIdentifiedSubject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedSubject_SubjectPlaceholderUuid() {
        return (EAttribute)getIdentifiedSubject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementedComponent() {
		if (implementedComponentEClass == null) {
			implementedComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(23);
		}
		return implementedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementedComponent_Prop() {
        return (EReference)getImplementedComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementedComponent_Link() {
        return (EReference)getImplementedComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementedComponent_ResponsibleParty() {
        return (EReference)getImplementedComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplementedComponent_Remarks() {
        return (EAttribute)getImplementedComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplementedComponent_ComponentUuid() {
        return (EAttribute)getImplementedComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationType() {
		if (informationTypeEClass == null) {
			informationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(24);
		}
		return informationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationType_Title() {
        return (EAttribute)getInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationType_Description() {
        return (EAttribute)getInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationType_Categorization() {
        return (EReference)getInformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationType_Prop() {
        return (EReference)getInformationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationType_Link() {
        return (EReference)getInformationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationType_ConfidentialityImpact() {
        return (EReference)getInformationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationType_IntegrityImpact() {
        return (EReference)getInformationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationType_AvailabilityImpact() {
        return (EReference)getInformationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationType_Uuid() {
        return (EAttribute)getInformationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInherited() {
		if (inheritedEClass == null) {
			inheritedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(25);
		}
		return inheritedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInherited_Description() {
        return (EAttribute)getInherited().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInherited_Prop() {
        return (EReference)getInherited().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInherited_Link() {
        return (EReference)getInherited().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInherited_ResponsibleRole() {
        return (EReference)getInherited().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInherited_ProvidedUuid() {
        return (EAttribute)getInherited().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInherited_Uuid() {
        return (EAttribute)getInherited().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeveragedAuthorization() {
		if (leveragedAuthorizationEClass == null) {
			leveragedAuthorizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(26);
		}
		return leveragedAuthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeveragedAuthorization_Title() {
        return (EAttribute)getLeveragedAuthorization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeveragedAuthorization_Prop() {
        return (EReference)getLeveragedAuthorization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeveragedAuthorization_Link() {
        return (EReference)getLeveragedAuthorization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeveragedAuthorization_PartyUuid() {
        return (EAttribute)getLeveragedAuthorization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeveragedAuthorization_DateAuthorized() {
        return (EAttribute)getLeveragedAuthorization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeveragedAuthorization_Remarks() {
        return (EAttribute)getLeveragedAuthorization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeveragedAuthorization_Uuid() {
        return (EAttribute)getLeveragedAuthorization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultLocalDefinitions() {
		if (resultLocalDefinitionsEClass == null) {
			resultLocalDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(27);
		}
		return resultLocalDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultLocalDefinitions_Component() {
        return (EReference)getResultLocalDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultLocalDefinitions_InventoryItem() {
        return (EReference)getResultLocalDefinitions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultLocalDefinitions_User() {
        return (EReference)getResultLocalDefinitions().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultLocalDefinitions_AssessmentAssets() {
        return (EReference)getResultLocalDefinitions().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultLocalDefinitions_AssessmentTask() {
        return (EReference)getResultLocalDefinitions().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentResultsLocalDefinitions() {
		if (assessmentResultsLocalDefinitionsEClass == null) {
			assessmentResultsLocalDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(28);
		}
		return assessmentResultsLocalDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResultsLocalDefinitions_ObjectivesAndMethods() {
        return (EReference)getAssessmentResultsLocalDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResultsLocalDefinitions_Activity() {
        return (EReference)getAssessmentResultsLocalDefinitions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentResultsLocalDefinitions_Remarks() {
        return (EAttribute)getAssessmentResultsLocalDefinitions().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentPlanLocalDefinitions() {
		if (assessmentPlanLocalDefinitionsEClass == null) {
			assessmentPlanLocalDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(29);
		}
		return assessmentPlanLocalDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlanLocalDefinitions_Component() {
        return (EReference)getAssessmentPlanLocalDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlanLocalDefinitions_InventoryItem() {
        return (EReference)getAssessmentPlanLocalDefinitions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlanLocalDefinitions_User() {
        return (EReference)getAssessmentPlanLocalDefinitions().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlanLocalDefinitions_ObjectivesAndMethods() {
        return (EReference)getAssessmentPlanLocalDefinitions().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlanLocalDefinitions_Activity() {
        return (EReference)getAssessmentPlanLocalDefinitions().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPlanLocalDefinitions_Remarks() {
        return (EAttribute)getAssessmentPlanLocalDefinitions().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(30);
		}
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Title() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Address() {
        return (EReference)getLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_EmailAddress() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_TelephoneNumber() {
        return (EReference)getLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Url() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Prop() {
        return (EReference)getLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Link() {
        return (EReference)getLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Remarks() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Uuid() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMitigatingFactor() {
		if (mitigatingFactorEClass == null) {
			mitigatingFactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(31);
		}
		return mitigatingFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMitigatingFactor_Description() {
        return (EAttribute)getMitigatingFactor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMitigatingFactor_Prop() {
        return (EReference)getMitigatingFactor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMitigatingFactor_Link() {
        return (EReference)getMitigatingFactor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMitigatingFactor_Subject() {
        return (EReference)getMitigatingFactor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMitigatingFactor_ImplementationUuid() {
        return (EAttribute)getMitigatingFactor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMitigatingFactor_Uuid() {
        return (EAttribute)getMitigatingFactor().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnDate() {
		if (onDateEClass == null) {
			onDateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(32);
		}
		return onDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnDate_Remarks() {
        return (EAttribute)getOnDate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOnDate_Date() {
        return (EAttribute)getOnDate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoamItemOrigin() {
		if (poamItemOriginEClass == null) {
			poamItemOriginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(33);
		}
		return poamItemOriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItemOrigin_Actor() {
        return (EReference)getPoamItemOrigin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentPlan() {
		if (assessmentPlanEClass == null) {
			assessmentPlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(34);
		}
		return assessmentPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_Metadata() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_ImportSsp() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_LocalDefinitions() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_TermsAndConditions() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_ReviewedControls() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_AssessmentSubject() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_AssessmentAssets() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_Task() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPlan_BackMatter() {
        return (EReference)getAssessmentPlan().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPlan_Uuid() {
        return (EAttribute)getAssessmentPlan().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentResults() {
		if (assessmentResultsEClass == null) {
			assessmentResultsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(35);
		}
		return assessmentResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResults_Metadata() {
        return (EReference)getAssessmentResults().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResults_ImportAp() {
        return (EReference)getAssessmentResults().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResults_LocalDefinitions() {
        return (EReference)getAssessmentResults().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResults_Result() {
        return (EReference)getAssessmentResults().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentResults_BackMatter() {
        return (EReference)getAssessmentResults().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentResults_Uuid() {
        return (EAttribute)getAssessmentResults().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportAp() {
		if (importApEClass == null) {
			importApEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(36);
		}
		return importApEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportAp_Remarks() {
        return (EAttribute)getImportAp().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportAp_Href() {
        return (EAttribute)getImportAp().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResult() {
		if (resultEClass == null) {
			resultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(37);
		}
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Title() {
        return (EAttribute)getResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Description() {
        return (EAttribute)getResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Start() {
        return (EAttribute)getResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_End() {
        return (EAttribute)getResult().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Prop() {
        return (EReference)getResult().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Link() {
        return (EReference)getResult().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_LocalDefinitions() {
        return (EReference)getResult().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_ReviewedControls() {
        return (EReference)getResult().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Attestation() {
        return (EReference)getResult().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_AssessmentLog() {
        return (EReference)getResult().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Observation() {
        return (EReference)getResult().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Risk() {
        return (EReference)getResult().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Finding() {
        return (EReference)getResult().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Remarks() {
        return (EAttribute)getResult().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Uuid() {
        return (EAttribute)getResult().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		if (activityEClass == null) {
			activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(38);
		}
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Title() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Description() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Prop() {
        return (EReference)getActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Link() {
        return (EReference)getActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Step() {
        return (EReference)getActivity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_RelatedControls() {
        return (EReference)getActivity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_ResponsibleRole() {
        return (EReference)getActivity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Remarks() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Uuid() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentAssets() {
		if (assessmentAssetsEClass == null) {
			assessmentAssetsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(39);
		}
		return assessmentAssetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentAssets_Component() {
        return (EReference)getAssessmentAssets().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentAssets_AssessmentPlatform() {
        return (EReference)getAssessmentAssets().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentMethod() {
		if (assessmentMethodEClass == null) {
			assessmentMethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(40);
		}
		return assessmentMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentMethod_Description() {
        return (EAttribute)getAssessmentMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentMethod_Prop() {
        return (EReference)getAssessmentMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentMethod_Link() {
        return (EReference)getAssessmentMethod().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentMethod_Part() {
        return (EReference)getAssessmentMethod().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentMethod_Remarks() {
        return (EAttribute)getAssessmentMethod().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentMethod_Uuid() {
        return (EAttribute)getAssessmentMethod().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentPart() {
		if (assessmentPartEClass == null) {
			assessmentPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(41);
		}
		return assessmentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPart_Title() {
        return (EAttribute)getAssessmentPart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPart_Prop() {
        return (EReference)getAssessmentPart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPart_Prose() {
        return (EAttribute)getAssessmentPart().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPart_Part() {
        return (EReference)getAssessmentPart().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentPart_Link() {
        return (EReference)getAssessmentPart().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPart_Class() {
        return (EAttribute)getAssessmentPart().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPart_Name() {
        return (EAttribute)getAssessmentPart().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPart_Ns() {
        return (EAttribute)getAssessmentPart().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentPart_Uuid() {
        return (EAttribute)getAssessmentPart().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentSubject() {
		if (assessmentSubjectEClass == null) {
			assessmentSubjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(42);
		}
		return assessmentSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSubject_Description() {
        return (EAttribute)getAssessmentSubject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubject_Prop() {
        return (EReference)getAssessmentSubject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubject_Link() {
        return (EReference)getAssessmentSubject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubject_IncludeAll() {
        return (EReference)getAssessmentSubject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubject_IncludeSubject() {
        return (EReference)getAssessmentSubject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubject_ExcludeSubject() {
        return (EReference)getAssessmentSubject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSubject_Remarks() {
        return (EAttribute)getAssessmentSubject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSubject_Type() {
        return (EAttribute)getAssessmentSubject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentSubjectPlaceholder() {
		if (assessmentSubjectPlaceholderEClass == null) {
			assessmentSubjectPlaceholderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(43);
		}
		return assessmentSubjectPlaceholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSubjectPlaceholder_Description() {
        return (EAttribute)getAssessmentSubjectPlaceholder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubjectPlaceholder_Source() {
        return (EReference)getAssessmentSubjectPlaceholder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubjectPlaceholder_Prop() {
        return (EReference)getAssessmentSubjectPlaceholder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessmentSubjectPlaceholder_Link() {
        return (EReference)getAssessmentSubjectPlaceholder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSubjectPlaceholder_Remarks() {
        return (EAttribute)getAssessmentSubjectPlaceholder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSubjectPlaceholder_Uuid() {
        return (EAttribute)getAssessmentSubjectPlaceholder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociatedRisk() {
		if (associatedRiskEClass == null) {
			associatedRiskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(44);
		}
		return associatedRiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociatedRisk_Remarks() {
        return (EAttribute)getAssociatedRisk().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociatedRisk_RiskUuid() {
        return (EAttribute)getAssociatedRisk().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterization() {
		if (characterizationEClass == null) {
			characterizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(45);
		}
		return characterizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacterization_Prop() {
        return (EReference)getCharacterization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacterization_Link() {
        return (EReference)getCharacterization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacterization_Origin() {
        return (EReference)getCharacterization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacterization_Facet() {
        return (EReference)getCharacterization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinding() {
		if (findingEClass == null) {
			findingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(46);
		}
		return findingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Title() {
        return (EAttribute)getFinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Description() {
        return (EAttribute)getFinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Prop() {
        return (EReference)getFinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Link() {
        return (EReference)getFinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Origin() {
        return (EReference)getFinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Target() {
        return (EReference)getFinding().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_ImplementationStatementUuid() {
        return (EAttribute)getFinding().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_RelatedObservation() {
        return (EReference)getFinding().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_AssociatedRisk() {
        return (EReference)getFinding().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Remarks() {
        return (EAttribute)getFinding().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Uuid() {
        return (EAttribute)getFinding().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFindingTarget() {
		if (findingTargetEClass == null) {
			findingTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(47);
		}
		return findingTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTarget_Title() {
        return (EAttribute)getFindingTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTarget_Description() {
        return (EAttribute)getFindingTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFindingTarget_Prop() {
        return (EReference)getFindingTarget().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFindingTarget_Link() {
        return (EReference)getFindingTarget().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFindingTarget_Status() {
        return (EReference)getFindingTarget().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFindingTarget_ImplementationStatus() {
        return (EReference)getFindingTarget().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTarget_Remarks() {
        return (EAttribute)getFindingTarget().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTarget_TargetId() {
        return (EAttribute)getFindingTarget().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTarget_Type() {
        return (EAttribute)getFindingTarget().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportSsp() {
		if (importSspEClass == null) {
			importSspEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(48);
		}
		return importSspEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportSsp_Remarks() {
        return (EAttribute)getImportSsp().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportSsp_Href() {
        return (EAttribute)getImportSsp().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalObjective() {
		if (localObjectiveEClass == null) {
			localObjectiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(49);
		}
		return localObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalObjective_Description() {
        return (EAttribute)getLocalObjective().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalObjective_Prop() {
        return (EReference)getLocalObjective().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalObjective_Link() {
        return (EReference)getLocalObjective().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalObjective_Part() {
        return (EReference)getLocalObjective().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalObjective_Remarks() {
        return (EAttribute)getLocalObjective().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalObjective_ControlId() {
        return (EAttribute)getLocalObjective().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoggedBy() {
		if (loggedByEClass == null) {
			loggedByEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(50);
		}
		return loggedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoggedBy_Remarks() {
        return (EAttribute)getLoggedBy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoggedBy_PartyUuid() {
        return (EAttribute)getLoggedBy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoggedBy_RoleId() {
        return (EAttribute)getLoggedBy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObservation() {
		if (observationEClass == null) {
			observationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(51);
		}
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Title() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Description() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObservation_Prop() {
        return (EReference)getObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObservation_Link() {
        return (EReference)getObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Method() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Type() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObservation_Origin() {
        return (EReference)getObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObservation_Subject() {
        return (EReference)getObservation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObservation_RelevantEvidence() {
        return (EReference)getObservation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Collected() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Expires() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Remarks() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Uuid() {
        return (EAttribute)getObservation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOriginActor() {
		if (originActorEClass == null) {
			originActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(52);
		}
		return originActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginActor_Prop() {
        return (EReference)getOriginActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginActor_Link() {
        return (EReference)getOriginActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOriginActor_ActorUuid() {
        return (EAttribute)getOriginActor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOriginActor_RoleId() {
        return (EAttribute)getOriginActor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOriginActor_Type() {
        return (EAttribute)getOriginActor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrigin() {
		if (originEClass == null) {
			originEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(53);
		}
		return originEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrigin_Actor() {
        return (EReference)getOrigin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrigin_RelatedTask() {
        return (EReference)getOrigin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedObservation() {
		if (relatedObservationEClass == null) {
			relatedObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(54);
		}
		return relatedObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedObservation_Remarks() {
        return (EAttribute)getRelatedObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedObservation_ObservationUuid() {
        return (EAttribute)getRelatedObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedTask() {
		if (relatedTaskEClass == null) {
			relatedTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(55);
		}
		return relatedTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTask_Prop() {
        return (EReference)getRelatedTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTask_Link() {
        return (EReference)getRelatedTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTask_ResponsibleParty() {
        return (EReference)getRelatedTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTask_Subject() {
        return (EReference)getRelatedTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTask_IdentifiedSubject() {
        return (EReference)getRelatedTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedTask_Remarks() {
        return (EAttribute)getRelatedTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedTask_TaskUuid() {
        return (EAttribute)getRelatedTask().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		if (responseEClass == null) {
			responseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(56);
		}
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Title() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Description() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Prop() {
        return (EReference)getResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Link() {
        return (EReference)getResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Origin() {
        return (EReference)getResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_RequiredAsset() {
        return (EReference)getResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Task() {
        return (EReference)getResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Remarks() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Lifecycle() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Uuid() {
        return (EAttribute)getResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReviewedControls() {
		if (reviewedControlsEClass == null) {
			reviewedControlsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(57);
		}
		return reviewedControlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReviewedControls_Description() {
        return (EAttribute)getReviewedControls().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReviewedControls_Prop() {
        return (EReference)getReviewedControls().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReviewedControls_Link() {
        return (EReference)getReviewedControls().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReviewedControls_ControlSelection() {
        return (EReference)getReviewedControls().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReviewedControls_ControlObjectiveSelection() {
        return (EReference)getReviewedControls().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReviewedControls_Remarks() {
        return (EAttribute)getReviewedControls().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRisk() {
		if (riskEClass == null) {
			riskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(58);
		}
		return riskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Title() {
        return (EAttribute)getRisk().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Description() {
        return (EAttribute)getRisk().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Statement() {
        return (EAttribute)getRisk().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Prop() {
        return (EReference)getRisk().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Link() {
        return (EReference)getRisk().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Status() {
        return (EAttribute)getRisk().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Origin() {
        return (EReference)getRisk().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_ThreatId() {
        return (EReference)getRisk().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Characterization() {
        return (EReference)getRisk().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_MitigatingFactor() {
        return (EReference)getRisk().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Deadline() {
        return (EAttribute)getRisk().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_Response() {
        return (EReference)getRisk().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_RiskLog() {
        return (EReference)getRisk().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_RelatedObservation() {
        return (EReference)getRisk().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Uuid() {
        return (EAttribute)getRisk().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentSelectControlById() {
		if (assessmentSelectControlByIdEClass == null) {
			assessmentSelectControlByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(59);
		}
		return assessmentSelectControlByIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSelectControlById_StatementId() {
        return (EAttribute)getAssessmentSelectControlById().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessmentSelectControlById_ControlId() {
        return (EAttribute)getAssessmentSelectControlById().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectObjectiveById() {
		if (selectObjectiveByIdEClass == null) {
			selectObjectiveByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(60);
		}
		return selectObjectiveByIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectObjectiveById_Remarks() {
        return (EAttribute)getSelectObjectiveById().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectObjectiveById_ObjectiveId() {
        return (EAttribute)getSelectObjectiveById().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectSubjectById() {
		if (selectSubjectByIdEClass == null) {
			selectSubjectByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(61);
		}
		return selectSubjectByIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectSubjectById_Prop() {
        return (EReference)getSelectSubjectById().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectSubjectById_Link() {
        return (EReference)getSelectSubjectById().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectSubjectById_Remarks() {
        return (EAttribute)getSelectSubjectById().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectSubjectById_SubjectUuid() {
        return (EAttribute)getSelectSubjectById().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectSubjectById_Type() {
        return (EAttribute)getSelectSubjectById().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectReference() {
		if (subjectReferenceEClass == null) {
			subjectReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(62);
		}
		return subjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectReference_Title() {
        return (EAttribute)getSubjectReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjectReference_Prop() {
        return (EReference)getSubjectReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjectReference_Link() {
        return (EReference)getSubjectReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectReference_Remarks() {
        return (EAttribute)getSubjectReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectReference_SubjectUuid() {
        return (EAttribute)getSubjectReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectReference_Type() {
        return (EAttribute)getSubjectReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		if (taskEClass == null) {
			taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(63);
		}
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Title() {
        return (EAttribute)getTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Description() {
        return (EAttribute)getTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Prop() {
        return (EReference)getTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Link() {
        return (EReference)getTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Timing() {
        return (EReference)getTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Dependency() {
        return (EReference)getTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Task() {
        return (EReference)getTask().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_AssociatedActivity() {
        return (EReference)getTask().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Subject() {
        return (EReference)getTask().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_ResponsibleRole() {
        return (EReference)getTask().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Remarks() {
        return (EAttribute)getTask().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Type() {
        return (EAttribute)getTask().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Uuid() {
        return (EAttribute)getTask().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatId() {
		if (threatIdEClass == null) {
			threatIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(64);
		}
		return threatIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatId_Value() {
        return (EAttribute)getThreatId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatId_Href() {
        return (EAttribute)getThreatId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatId_System() {
        return (EAttribute)getThreatId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		if (catalogEClass == null) {
			catalogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(65);
		}
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Metadata() {
        return (EReference)getCatalog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Param() {
        return (EReference)getCatalog().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Control() {
        return (EReference)getCatalog().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Group() {
        return (EReference)getCatalog().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_BackMatter() {
        return (EReference)getCatalog().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalog_Uuid() {
        return (EAttribute)getCatalog().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		if (controlEClass == null) {
			controlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(66);
		}
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Title() {
        return (EAttribute)getControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Param() {
        return (EReference)getControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Prop() {
        return (EReference)getControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Link() {
        return (EReference)getControl().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Part() {
        return (EReference)getControl().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Control() {
        return (EReference)getControl().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Class() {
        return (EAttribute)getControl().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Id() {
        return (EAttribute)getControl().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogGroup() {
		if (catalogGroupEClass == null) {
			catalogGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(67);
		}
		return catalogGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogGroup_Title() {
        return (EAttribute)getCatalogGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogGroup_Param() {
        return (EReference)getCatalogGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogGroup_Prop() {
        return (EReference)getCatalogGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogGroup_Link() {
        return (EReference)getCatalogGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogGroup_Part() {
        return (EReference)getCatalogGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogGroup_Group() {
        return (EReference)getCatalogGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogGroup_Control() {
        return (EReference)getCatalogGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogGroup_Class() {
        return (EAttribute)getCatalogGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogGroup_Id() {
        return (EAttribute)getCatalogGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		if (capabilityEClass == null) {
			capabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(68);
		}
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Description() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Prop() {
        return (EReference)getCapability().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Link() {
        return (EReference)getCapability().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_IncorporatesComponent() {
        return (EReference)getCapability().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_ControlImplementation() {
        return (EReference)getCapability().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Remarks() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Name() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Uuid() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDefinition() {
		if (componentDefinitionEClass == null) {
			componentDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(69);
		}
		return componentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_Metadata() {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_ImportComponentDefinition() {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_Component() {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_Capability() {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_BackMatter() {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDefinition_Uuid() {
        return (EAttribute)getComponentDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentControlImplementation() {
		if (componentControlImplementationEClass == null) {
			componentControlImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(70);
		}
		return componentControlImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentControlImplementation_Description() {
        return (EAttribute)getComponentControlImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentControlImplementation_Prop() {
        return (EReference)getComponentControlImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentControlImplementation_Link() {
        return (EReference)getComponentControlImplementation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentControlImplementation_SetParameter() {
        return (EReference)getComponentControlImplementation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentControlImplementation_ImplementedRequirement() {
        return (EReference)getComponentControlImplementation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentControlImplementation_Source() {
        return (EAttribute)getComponentControlImplementation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentControlImplementation_Uuid() {
        return (EAttribute)getComponentControlImplementation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinedComponent() {
		if (definedComponentEClass == null) {
			definedComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(71);
		}
		return definedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinedComponent_Title() {
        return (EAttribute)getDefinedComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinedComponent_Description() {
        return (EAttribute)getDefinedComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinedComponent_Purpose() {
        return (EAttribute)getDefinedComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinedComponent_Prop() {
        return (EReference)getDefinedComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinedComponent_Link() {
        return (EReference)getDefinedComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinedComponent_ResponsibleRole() {
        return (EReference)getDefinedComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinedComponent_Protocol() {
        return (EReference)getDefinedComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinedComponent_ControlImplementation() {
        return (EReference)getDefinedComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinedComponent_Remarks() {
        return (EAttribute)getDefinedComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinedComponent_Type() {
        return (EAttribute)getDefinedComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinedComponent_Uuid() {
        return (EAttribute)getDefinedComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementedRequirement() {
		if (componentImplementedRequirementEClass == null) {
			componentImplementedRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(72);
		}
		return componentImplementedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementedRequirement_Description() {
        return (EAttribute)getComponentImplementedRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementedRequirement_Prop() {
        return (EReference)getComponentImplementedRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementedRequirement_Link() {
        return (EReference)getComponentImplementedRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementedRequirement_SetParameter() {
        return (EReference)getComponentImplementedRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementedRequirement_ResponsibleRole() {
        return (EReference)getComponentImplementedRequirement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementedRequirement_Statement() {
        return (EReference)getComponentImplementedRequirement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementedRequirement_Remarks() {
        return (EAttribute)getComponentImplementedRequirement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementedRequirement_ControlId() {
        return (EAttribute)getComponentImplementedRequirement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementedRequirement_Uuid() {
        return (EAttribute)getComponentImplementedRequirement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportComponentDefinition() {
		if (importComponentDefinitionEClass == null) {
			importComponentDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(73);
		}
		return importComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportComponentDefinition_Remarks() {
        return (EAttribute)getImportComponentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportComponentDefinition_Href() {
        return (EAttribute)getImportComponentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncorporatesComponent() {
		if (incorporatesComponentEClass == null) {
			incorporatesComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(74);
		}
		return incorporatesComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncorporatesComponent_Description() {
        return (EAttribute)getIncorporatesComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncorporatesComponent_ComponentUuid() {
        return (EAttribute)getIncorporatesComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentStatement() {
		if (componentStatementEClass == null) {
			componentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(75);
		}
		return componentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentStatement_Description() {
        return (EAttribute)getComponentStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentStatement_Prop() {
        return (EReference)getComponentStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentStatement_Link() {
        return (EReference)getComponentStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentStatement_ResponsibleRole() {
        return (EReference)getComponentStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentStatement_Remarks() {
        return (EAttribute)getComponentStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentStatement_StatementId() {
        return (EAttribute)getComponentStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentStatement_Uuid() {
        return (EAttribute)getComponentStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncludeAll() {
		if (includeAllEClass == null) {
			includeAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(76);
		}
		return includeAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatching() {
		if (matchingEClass == null) {
			matchingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(77);
		}
		return matchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatching_Remarks() {
        return (EAttribute)getMatching().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatching_Pattern() {
        return (EAttribute)getMatching().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		if (parameterEClass == null) {
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(78);
		}
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Prop() {
        return (EReference)getParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Link() {
        return (EReference)getParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Label() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Usage() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Constraint() {
        return (EReference)getParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Guideline() {
        return (EReference)getParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Value() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Select() {
        return (EReference)getParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Remarks() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Class() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_DependsOn() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Id() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterConstraint() {
		if (parameterConstraintEClass == null) {
			parameterConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(79);
		}
		return parameterConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterConstraint_Description() {
        return (EAttribute)getParameterConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterConstraint_Test() {
        return (EReference)getParameterConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterGuideline() {
		if (parameterGuidelineEClass == null) {
			parameterGuidelineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(80);
		}
		return parameterGuidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterGuideline_Prose() {
        return (EAttribute)getParameterGuideline().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterSelection() {
		if (parameterSelectionEClass == null) {
			parameterSelectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(81);
		}
		return parameterSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterSelection_Choice() {
        return (EAttribute)getParameterSelection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterSelection_HowMany() {
        return (EAttribute)getParameterSelection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPart() {
		if (partEClass == null) {
			partEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(82);
		}
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Title() {
        return (EAttribute)getPart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPart_Prop() {
        return (EReference)getPart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Prose() {
        return (EAttribute)getPart().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPart_Part() {
        return (EReference)getPart().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPart_Link() {
        return (EReference)getPart().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Class() {
        return (EAttribute)getPart().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Id() {
        return (EAttribute)getPart().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Name() {
        return (EAttribute)getPart().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Ns() {
        return (EAttribute)getPart().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlSelectControlById() {
		if (controlSelectControlByIdEClass == null) {
			controlSelectControlByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(83);
		}
		return controlSelectControlByIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSelectControlById_WithId() {
        return (EAttribute)getControlSelectControlById().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSelectControlById_Matching() {
        return (EReference)getControlSelectControlById().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSelectControlById_WithChildControls() {
        return (EAttribute)getControlSelectControlById().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizedPrivilege() {
		if (authorizedPrivilegeEClass == null) {
			authorizedPrivilegeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(84);
		}
		return authorizedPrivilegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizedPrivilege_Title() {
        return (EAttribute)getAuthorizedPrivilege().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizedPrivilege_Description() {
        return (EAttribute)getAuthorizedPrivilege().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizedPrivilege_FunctionPerformed() {
        return (EAttribute)getAuthorizedPrivilege().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementationStatus() {
		if (implementationStatusEClass == null) {
			implementationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(85);
		}
		return implementationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplementationStatus_Remarks() {
        return (EAttribute)getImplementationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplementationStatus_State() {
        return (EAttribute)getImplementationStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventoryItem() {
		if (inventoryItemEClass == null) {
			inventoryItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(86);
		}
		return inventoryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_Description() {
        return (EAttribute)getInventoryItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Prop() {
        return (EReference)getInventoryItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_Link() {
        return (EReference)getInventoryItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_ResponsibleParty() {
        return (EReference)getInventoryItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventoryItem_ImplementedComponent() {
        return (EReference)getInventoryItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_Remarks() {
        return (EAttribute)getInventoryItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventoryItem_Uuid() {
        return (EAttribute)getInventoryItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortRange() {
		if (portRangeEClass == null) {
			portRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(87);
		}
		return portRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortRange_Remarks() {
        return (EAttribute)getPortRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortRange_End() {
        return (EAttribute)getPortRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortRange_Start() {
        return (EAttribute)getPortRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortRange_Transport() {
        return (EAttribute)getPortRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProtocol() {
		if (protocolEClass == null) {
			protocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(88);
		}
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtocol_Title() {
        return (EAttribute)getProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtocol_PortRange() {
        return (EReference)getProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtocol_Name() {
        return (EAttribute)getProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtocol_Uuid() {
        return (EAttribute)getProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetParameter() {
		if (setParameterEClass == null) {
			setParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(89);
		}
		return setParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetParameter_Value() {
        return (EAttribute)getSetParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetParameter_Remarks() {
        return (EAttribute)getSetParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetParameter_ParamId() {
        return (EAttribute)getSetParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemComponent() {
		if (systemComponentEClass == null) {
			systemComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(90);
		}
		return systemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Title() {
        return (EAttribute)getSystemComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Description() {
        return (EAttribute)getSystemComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Purpose() {
        return (EAttribute)getSystemComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponent_Prop() {
        return (EReference)getSystemComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponent_Link() {
        return (EReference)getSystemComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponent_Status() {
        return (EReference)getSystemComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponent_ResponsibleRole() {
        return (EReference)getSystemComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponent_Protocol() {
        return (EReference)getSystemComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Remarks() {
        return (EAttribute)getSystemComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Type() {
        return (EAttribute)getSystemComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Uuid() {
        return (EAttribute)getSystemComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemId() {
		if (systemIdEClass == null) {
			systemIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(91);
		}
		return systemIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemId_Value() {
        return (EAttribute)getSystemId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemId_IdentifierType() {
        return (EAttribute)getSystemId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemUser() {
		if (systemUserEClass == null) {
			systemUserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(92);
		}
		return systemUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUser_Title() {
        return (EAttribute)getSystemUser().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUser_ShortName() {
        return (EAttribute)getSystemUser().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUser_Description() {
        return (EAttribute)getSystemUser().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUser_Prop() {
        return (EReference)getSystemUser().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUser_Link() {
        return (EReference)getSystemUser().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUser_RoleId() {
        return (EAttribute)getSystemUser().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUser_AuthorizedPrivilege() {
        return (EReference)getSystemUser().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUser_Remarks() {
        return (EAttribute)getSystemUser().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUser_Uuid() {
        return (EAttribute)getSystemUser().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidenceScore() {
		if (confidenceScoreEClass == null) {
			confidenceScoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(93);
		}
		return confidenceScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfidenceScore_Category() {
        return (EAttribute)getConfidenceScore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfidenceScore_Percentage() {
        return (EAttribute)getConfidenceScore().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoverage() {
		if (coverageEClass == null) {
			coverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(94);
		}
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoverage_Value() {
        return (EAttribute)getCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoverage_GenerationMethod() {
        return (EAttribute)getCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGapSummary() {
		if (gapSummaryEClass == null) {
			gapSummaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(95);
		}
		return gapSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGapSummary_UnmappedControls() {
        return (EReference)getGapSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapSummary_Uuid() {
        return (EAttribute)getGapSummary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapEntry() {
		if (mapEntryEClass == null) {
			mapEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(96);
		}
		return mapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_Relationship() {
        return (EAttribute)getMapEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_Source() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_Target() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_Qualifier() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_ConfidenceScore() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_Coverage() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_Prop() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapEntry_Link() {
        return (EReference)getMapEntry().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_Remarks() {
        return (EAttribute)getMapEntry().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_MatchingRationale() {
        return (EAttribute)getMapEntry().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_Ns() {
        return (EAttribute)getMapEntry().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapEntry_Uuid() {
        return (EAttribute)getMapEntry().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapping() {
		if (mappingEClass == null) {
			mappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(97);
		}
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_SourceResource() {
        return (EReference)getMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_TargetResource() {
        return (EReference)getMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_Map() {
        return (EReference)getMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_Prop() {
        return (EReference)getMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_Link() {
        return (EReference)getMapping().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_Remarks() {
        return (EAttribute)getMapping().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_MappingDescription() {
        return (EAttribute)getMapping().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_SourceGapSummary() {
        return (EReference)getMapping().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_TargetGapSummary() {
        return (EReference)getMapping().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_ConfidenceScore() {
        return (EReference)getMapping().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_Coverage() {
        return (EReference)getMapping().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_MatchingRationale() {
        return (EAttribute)getMapping().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_Method() {
        return (EAttribute)getMapping().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_Status() {
        return (EAttribute)getMapping().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_Uuid() {
        return (EAttribute)getMapping().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingItem() {
		if (mappingItemEClass == null) {
			mappingItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(98);
		}
		return mappingItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingItem_Prop() {
        return (EReference)getMappingItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingItem_Link() {
        return (EReference)getMappingItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingItem_Remarks() {
        return (EAttribute)getMappingItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingItem_IdRef() {
        return (EAttribute)getMappingItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingItem_Type() {
        return (EAttribute)getMappingItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingProvenance() {
		if (mappingProvenanceEClass == null) {
			mappingProvenanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(99);
		}
		return mappingProvenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingProvenance_ConfidenceScore() {
        return (EReference)getMappingProvenance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingProvenance_Coverage() {
        return (EReference)getMappingProvenance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingProvenance_MappingDescription() {
        return (EAttribute)getMappingProvenance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingProvenance_ResponsibleParty() {
        return (EReference)getMappingProvenance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingProvenance_Prop() {
        return (EReference)getMappingProvenance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingProvenance_Link() {
        return (EReference)getMappingProvenance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingProvenance_Remarks() {
        return (EAttribute)getMappingProvenance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingProvenance_MatchingRationale() {
        return (EAttribute)getMappingProvenance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingProvenance_Method() {
        return (EAttribute)getMappingProvenance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingProvenance_Status() {
        return (EAttribute)getMappingProvenance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingResourceReference() {
		if (mappingResourceReferenceEClass == null) {
			mappingResourceReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(100);
		}
		return mappingResourceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingResourceReference_Prop() {
        return (EReference)getMappingResourceReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingResourceReference_Link() {
        return (EReference)getMappingResourceReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingResourceReference_Remarks() {
        return (EAttribute)getMappingResourceReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingResourceReference_Href() {
        return (EAttribute)getMappingResourceReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingResourceReference_Ns() {
        return (EAttribute)getMappingResourceReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingResourceReference_Type() {
        return (EAttribute)getMappingResourceReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifierItem() {
		if (qualifierItemEClass == null) {
			qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(101);
		}
		return qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifierItem_Description() {
        return (EAttribute)getQualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifierItem_Remarks() {
        return (EAttribute)getQualifierItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifierItem_Category() {
        return (EAttribute)getQualifierItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifierItem_Predicate() {
        return (EAttribute)getQualifierItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifierItem_Subject() {
        return (EAttribute)getQualifierItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingCollection() {
		if (mappingCollectionEClass == null) {
			mappingCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(102);
		}
		return mappingCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingCollection_Metadata() {
        return (EReference)getMappingCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingCollection_Provenance() {
        return (EReference)getMappingCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingCollection_Mapping() {
        return (EReference)getMappingCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingCollection_BackMatter() {
        return (EReference)getMappingCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingCollection_Uuid() {
        return (EAttribute)getMappingCollection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		if (actionEClass == null) {
			actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(103);
		}
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Prop() {
        return (EReference)getAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Link() {
        return (EReference)getAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_ResponsibleParty() {
        return (EReference)getAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Remarks() {
        return (EAttribute)getAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Date() {
        return (EAttribute)getAction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_System() {
        return (EAttribute)getAction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Type() {
        return (EAttribute)getAction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Uuid() {
        return (EAttribute)getAction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddress() {
		if (addressEClass == null) {
			addressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(104);
		}
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_AddrLine() {
        return (EAttribute)getAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_City() {
        return (EAttribute)getAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_State() {
        return (EAttribute)getAddress().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_PostalCode() {
        return (EAttribute)getAddress().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Country() {
        return (EAttribute)getAddress().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Type() {
        return (EAttribute)getAddress().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackMatter() {
		if (backMatterEClass == null) {
			backMatterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(105);
		}
		return backMatterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatter_Resource() {
        return (EReference)getBackMatter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentId() {
		if (documentIdEClass == null) {
			documentIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(106);
		}
		return documentIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentId_Value() {
        return (EAttribute)getDocumentId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentId_Scheme() {
        return (EAttribute)getDocumentId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHash() {
		if (hashEClass == null) {
			hashEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(107);
		}
		return hashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHash_Value() {
        return (EAttribute)getHash().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHash_Algorithm() {
        return (EAttribute)getHash().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		if (linkEClass == null) {
			linkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(108);
		}
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Text() {
        return (EAttribute)getLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Href() {
        return (EAttribute)getLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_MediaType() {
        return (EAttribute)getLink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Rel() {
        return (EAttribute)getLink().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_ResourceFragment() {
        return (EAttribute)getLink().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadata() {
		if (metadataEClass == null) {
			metadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(109);
		}
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Title() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Published() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_LastModified() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Version() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_OscalVersion() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Revision() {
        return (EReference)getMetadata().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_DocumentId() {
        return (EReference)getMetadata().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Prop() {
        return (EReference)getMetadata().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Link() {
        return (EReference)getMetadata().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Role() {
        return (EReference)getMetadata().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Location() {
        return (EReference)getMetadata().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Party() {
        return (EReference)getMetadata().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_ResponsibleParty() {
        return (EReference)getMetadata().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Action() {
        return (EReference)getMetadata().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Remarks() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		if (propertyEClass == null) {
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(110);
		}
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Remarks() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Class() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Group() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Ns() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Uuid() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsibleParty() {
		if (responsiblePartyEClass == null) {
			responsiblePartyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(111);
		}
		return responsiblePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleParty_PartyUuid() {
        return (EAttribute)getResponsibleParty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleParty_Prop() {
        return (EReference)getResponsibleParty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleParty_Link() {
        return (EReference)getResponsibleParty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleParty_Remarks() {
        return (EAttribute)getResponsibleParty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleParty_RoleId() {
        return (EAttribute)getResponsibleParty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsibleRole() {
		if (responsibleRoleEClass == null) {
			responsibleRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(112);
		}
		return responsibleRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleRole_Prop() {
        return (EReference)getResponsibleRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleRole_Link() {
        return (EReference)getResponsibleRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleRole_PartyUuid() {
        return (EAttribute)getResponsibleRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleRole_Remarks() {
        return (EAttribute)getResponsibleRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleRole_RoleId() {
        return (EAttribute)getResponsibleRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelephoneNumber() {
		if (telephoneNumberEClass == null) {
			telephoneNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(113);
		}
		return telephoneNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelephoneNumber_Value() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelephoneNumber_Type() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoamLocalDefinitions() {
		if (poamLocalDefinitionsEClass == null) {
			poamLocalDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(114);
		}
		return poamLocalDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamLocalDefinitions_Component() {
        return (EReference)getPoamLocalDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamLocalDefinitions_InventoryItem() {
        return (EReference)getPoamLocalDefinitions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamLocalDefinitions_AssessmentAssets() {
        return (EReference)getPoamLocalDefinitions().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoamLocalDefinitions_Remarks() {
        return (EAttribute)getPoamLocalDefinitions().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfActionAndMilestones() {
		if (planOfActionAndMilestonesEClass == null) {
			planOfActionAndMilestonesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(115);
		}
		return planOfActionAndMilestonesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_Metadata() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_ImportSsp() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_SystemId() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_LocalDefinitions() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_Observation() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_Risk() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_Finding() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_PoamItem() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanOfActionAndMilestones_BackMatter() {
        return (EReference)getPlanOfActionAndMilestones().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanOfActionAndMilestones_Uuid() {
        return (EAttribute)getPlanOfActionAndMilestones().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoamItem() {
		if (poamItemEClass == null) {
			poamItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(116);
		}
		return poamItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoamItem_Title() {
        return (EAttribute)getPoamItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoamItem_Description() {
        return (EAttribute)getPoamItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItem_Prop() {
        return (EReference)getPoamItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItem_Link() {
        return (EReference)getPoamItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItem_Origin() {
        return (EReference)getPoamItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItem_RelatedFinding() {
        return (EReference)getPoamItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItem_RelatedObservation() {
        return (EReference)getPoamItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPoamItem_AssociatedRisk() {
        return (EReference)getPoamItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoamItem_Remarks() {
        return (EAttribute)getPoamItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoamItem_Uuid() {
        return (EAttribute)getPoamItem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfileGroup() {
		if (profileGroupEClass == null) {
			profileGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(117);
		}
		return profileGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileGroup_Title() {
        return (EAttribute)getProfileGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileGroup_Param() {
        return (EReference)getProfileGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileGroup_Prop() {
        return (EReference)getProfileGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileGroup_Link() {
        return (EReference)getProfileGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileGroup_Part() {
        return (EReference)getProfileGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileGroup_Group() {
        return (EReference)getProfileGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileGroup_InsertControls() {
        return (EReference)getProfileGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileGroup_Class() {
        return (EAttribute)getProfileGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileGroup_Id() {
        return (EAttribute)getProfileGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		if (importEClass == null) {
			importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(118);
		}
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_IncludeAll() {
        return (EReference)getImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_IncludeControls() {
        return (EReference)getImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ExcludeControls() {
        return (EReference)getImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_Href() {
        return (EAttribute)getImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsertControls() {
		if (insertControlsEClass == null) {
			insertControlsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(119);
		}
		return insertControlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertControls_IncludeAll() {
        return (EReference)getInsertControls().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertControls_IncludeControls() {
        return (EReference)getInsertControls().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsertControls_ExcludeControls() {
        return (EReference)getInsertControls().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertControls_Order() {
        return (EAttribute)getInsertControls().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMerge() {
		if (mergeEClass == null) {
			mergeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(120);
		}
		return mergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMerge_Combine() {
        return (EReference)getMerge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMerge_Flat() {
        return (EReference)getMerge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMerge_AsIs() {
        return (EAttribute)getMerge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMerge_Custom() {
        return (EReference)getMerge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModify() {
		if (modifyEClass == null) {
			modifyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(121);
		}
		return modifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModify_SetParameter() {
        return (EReference)getModify().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModify_Alter() {
        return (EReference)getModify().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfile() {
		if (profileEClass == null) {
			profileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(122);
		}
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfile_Metadata() {
        return (EReference)getProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfile_Import() {
        return (EReference)getProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfile_Merge() {
        return (EReference)getProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfile_Modify() {
        return (EReference)getProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfile_BackMatter() {
        return (EReference)getProfile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfile_Uuid() {
        return (EAttribute)getProfile().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizationBoundary() {
		if (authorizationBoundaryEClass == null) {
			authorizationBoundaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(123);
		}
		return authorizationBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizationBoundary_Description() {
        return (EAttribute)getAuthorizationBoundary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationBoundary_Prop() {
        return (EReference)getAuthorizationBoundary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationBoundary_Link() {
        return (EReference)getAuthorizationBoundary().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationBoundary_Diagram() {
        return (EReference)getAuthorizationBoundary().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizationBoundary_Remarks() {
        return (EAttribute)getAuthorizationBoundary().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getByComponent() {
		if (byComponentEClass == null) {
			byComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(124);
		}
		return byComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getByComponent_Description() {
        return (EAttribute)getByComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_Prop() {
        return (EReference)getByComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_Link() {
        return (EReference)getByComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_SetParameter() {
        return (EReference)getByComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_ImplementationStatus() {
        return (EReference)getByComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_Export() {
        return (EReference)getByComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_Inherited() {
        return (EReference)getByComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_Satisfied() {
        return (EReference)getByComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getByComponent_ResponsibleRole() {
        return (EReference)getByComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getByComponent_Remarks() {
        return (EAttribute)getByComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getByComponent_ComponentUuid() {
        return (EAttribute)getByComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getByComponent_Uuid() {
        return (EAttribute)getByComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSspControlImplementation() {
		if (sspControlImplementationEClass == null) {
			sspControlImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(125);
		}
		return sspControlImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspControlImplementation_Description() {
        return (EAttribute)getSspControlImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspControlImplementation_SetParameter() {
        return (EReference)getSspControlImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspControlImplementation_ImplementedRequirement() {
        return (EReference)getSspControlImplementation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFlow() {
		if (dataFlowEClass == null) {
			dataFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(126);
		}
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataFlow_Description() {
        return (EAttribute)getDataFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataFlow_Prop() {
        return (EReference)getDataFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataFlow_Link() {
        return (EReference)getDataFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataFlow_Diagram() {
        return (EReference)getDataFlow().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataFlow_Remarks() {
        return (EAttribute)getDataFlow().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagram() {
		if (diagramEClass == null) {
			diagramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(127);
		}
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Description() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagram_Prop() {
        return (EReference)getDiagram().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagram_Link() {
        return (EReference)getDiagram().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Caption() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Remarks() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Uuid() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpact() {
		if (impactEClass == null) {
			impactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(128);
		}
		return impactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpact_Prop() {
        return (EReference)getImpact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpact_Link() {
        return (EReference)getImpact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpact_Base() {
        return (EAttribute)getImpact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpact_Selected() {
        return (EAttribute)getImpact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpact_AdjustmentJustification() {
        return (EAttribute)getImpact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSspImplementedRequirement() {
		if (sspImplementedRequirementEClass == null) {
			sspImplementedRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(129);
		}
		return sspImplementedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspImplementedRequirement_Prop() {
        return (EReference)getSspImplementedRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspImplementedRequirement_Link() {
        return (EReference)getSspImplementedRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspImplementedRequirement_SetParameter() {
        return (EReference)getSspImplementedRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspImplementedRequirement_ResponsibleRole() {
        return (EReference)getSspImplementedRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspImplementedRequirement_Statement() {
        return (EReference)getSspImplementedRequirement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspImplementedRequirement_ByComponent() {
        return (EReference)getSspImplementedRequirement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspImplementedRequirement_Remarks() {
        return (EAttribute)getSspImplementedRequirement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspImplementedRequirement_ControlId() {
        return (EAttribute)getSspImplementedRequirement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspImplementedRequirement_Uuid() {
        return (EAttribute)getSspImplementedRequirement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportProfile() {
		if (importProfileEClass == null) {
			importProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(130);
		}
		return importProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportProfile_Remarks() {
        return (EAttribute)getImportProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportProfile_Href() {
        return (EAttribute)getImportProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkArchitecture() {
		if (networkArchitectureEClass == null) {
			networkArchitectureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(131);
		}
		return networkArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkArchitecture_Description() {
        return (EAttribute)getNetworkArchitecture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkArchitecture_Prop() {
        return (EReference)getNetworkArchitecture().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkArchitecture_Link() {
        return (EReference)getNetworkArchitecture().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkArchitecture_Diagram() {
        return (EReference)getNetworkArchitecture().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkArchitecture_Remarks() {
        return (EAttribute)getNetworkArchitecture().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityImpactLevel() {
		if (securityImpactLevelEClass == null) {
			securityImpactLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(132);
		}
		return securityImpactLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityImpactLevel_SecurityObjectiveConfidentiality() {
        return (EAttribute)getSecurityImpactLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityImpactLevel_SecurityObjectiveIntegrity() {
        return (EAttribute)getSecurityImpactLevel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityImpactLevel_SecurityObjectiveAvailability() {
        return (EAttribute)getSecurityImpactLevel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSspStatement() {
		if (sspStatementEClass == null) {
			sspStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(133);
		}
		return sspStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspStatement_Prop() {
        return (EReference)getSspStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspStatement_Link() {
        return (EReference)getSspStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspStatement_ResponsibleRole() {
        return (EReference)getSspStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSspStatement_ByComponent() {
        return (EReference)getSspStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspStatement_Remarks() {
        return (EAttribute)getSspStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspStatement_StatementId() {
        return (EAttribute)getSspStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSspStatement_Uuid() {
        return (EAttribute)getSspStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemStatus() {
		if (systemStatusEClass == null) {
			systemStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(134);
		}
		return systemStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemStatus_Remarks() {
        return (EAttribute)getSystemStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemStatus_State() {
        return (EAttribute)getSystemStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemCharacteristics() {
		if (systemCharacteristicsEClass == null) {
			systemCharacteristicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(135);
		}
		return systemCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_SystemId() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemCharacteristics_SystemName() {
        return (EAttribute)getSystemCharacteristics().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemCharacteristics_SystemNameShort() {
        return (EAttribute)getSystemCharacteristics().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemCharacteristics_Description() {
        return (EAttribute)getSystemCharacteristics().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_Prop() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_Link() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemCharacteristics_DateAuthorized() {
        return (EAttribute)getSystemCharacteristics().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemCharacteristics_SecuritySensitivityLevel() {
        return (EAttribute)getSystemCharacteristics().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_SystemInformation() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_SecurityImpactLevel() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_Status() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_AuthorizationBoundary() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_NetworkArchitecture() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_DataFlow() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemCharacteristics_ResponsibleParty() {
        return (EReference)getSystemCharacteristics().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemCharacteristics_Remarks() {
        return (EAttribute)getSystemCharacteristics().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemImplementation() {
		if (systemImplementationEClass == null) {
			systemImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(136);
		}
		return systemImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_Prop() {
        return (EReference)getSystemImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_Link() {
        return (EReference)getSystemImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_LeveragedAuthorization() {
        return (EReference)getSystemImplementation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_User() {
        return (EReference)getSystemImplementation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_Component() {
        return (EReference)getSystemImplementation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_InventoryItem() {
        return (EReference)getSystemImplementation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemImplementation_Remarks() {
        return (EAttribute)getSystemImplementation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemInformation() {
		if (systemInformationEClass == null) {
			systemInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(137);
		}
		return systemInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemInformation_Prop() {
        return (EReference)getSystemInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemInformation_Link() {
        return (EReference)getSystemInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemInformation_InformationType() {
        return (EReference)getSystemInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemSecurityPlan() {
		if (systemSecurityPlanEClass == null) {
			systemSecurityPlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(138);
		}
		return systemSecurityPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSecurityPlan_Metadata() {
        return (EReference)getSystemSecurityPlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSecurityPlan_ImportProfile() {
        return (EReference)getSystemSecurityPlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSecurityPlan_SystemCharacteristics() {
        return (EReference)getSystemSecurityPlan().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSecurityPlan_SystemImplementation() {
        return (EReference)getSystemSecurityPlan().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSecurityPlan_ControlImplementation() {
        return (EReference)getSystemSecurityPlan().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSecurityPlan_BackMatter() {
        return (EReference)getSystemSecurityPlan().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemSecurityPlan_Uuid() {
        return (EAttribute)getSystemSecurityPlan().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParty() {
		if (partyEClass == null) {
			partyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(139);
		}
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Name() {
        return (EAttribute)getParty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_ShortName() {
        return (EAttribute)getParty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_ExternalId() {
        return (EReference)getParty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Prop() {
        return (EReference)getParty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Link() {
        return (EReference)getParty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_EmailAddress() {
        return (EAttribute)getParty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_TelephoneNumber() {
        return (EReference)getParty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Address() {
        return (EReference)getParty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_LocationUuid() {
        return (EAttribute)getParty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_MemberOfOrganization() {
        return (EAttribute)getParty().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Remarks() {
        return (EAttribute)getParty().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Type() {
        return (EAttribute)getParty().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Uuid() {
        return (EAttribute)getParty().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvided() {
		if (providedEClass == null) {
			providedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(140);
		}
		return providedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvided_Description() {
        return (EAttribute)getProvided().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvided_Prop() {
        return (EReference)getProvided().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvided_Link() {
        return (EReference)getProvided().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvided_ResponsibleRole() {
        return (EReference)getProvided().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvided_Remarks() {
        return (EAttribute)getProvided().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvided_Uuid() {
        return (EAttribute)getProvided().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedFinding() {
		if (relatedFindingEClass == null) {
			relatedFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(141);
		}
		return relatedFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedFinding_Remarks() {
        return (EAttribute)getRelatedFinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedFinding_FindingUuid() {
        return (EAttribute)getRelatedFinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedResponse() {
		if (relatedResponseEClass == null) {
			relatedResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(142);
		}
		return relatedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedResponse_Prop() {
        return (EReference)getRelatedResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedResponse_Link() {
        return (EReference)getRelatedResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedResponse_RelatedTask() {
        return (EReference)getRelatedResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedResponse_Remarks() {
        return (EAttribute)getRelatedResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedResponse_ResponseUuid() {
        return (EAttribute)getRelatedResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelevantEvidence() {
		if (relevantEvidenceEClass == null) {
			relevantEvidenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(143);
		}
		return relevantEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelevantEvidence_Description() {
        return (EAttribute)getRelevantEvidence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelevantEvidence_Prop() {
        return (EReference)getRelevantEvidence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelevantEvidence_Link() {
        return (EReference)getRelevantEvidence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelevantEvidence_Remarks() {
        return (EAttribute)getRelevantEvidence().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelevantEvidence_Href() {
        return (EAttribute)getRelevantEvidence().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemove() {
		if (removeEClass == null) {
			removeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(144);
		}
		return removeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemove_Remarks() {
        return (EAttribute)getRemove().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemove_ByClass() {
        return (EAttribute)getRemove().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemove_ById() {
        return (EAttribute)getRemove().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemove_ByItemName() {
        return (EAttribute)getRemove().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemove_ByName() {
        return (EAttribute)getRemove().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemove_ByNs() {
        return (EAttribute)getRemove().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredAsset() {
		if (requiredAssetEClass == null) {
			requiredAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(145);
		}
		return requiredAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredAsset_Subject() {
        return (EReference)getRequiredAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredAsset_Title() {
        return (EAttribute)getRequiredAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredAsset_Description() {
        return (EAttribute)getRequiredAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredAsset_Prop() {
        return (EReference)getRequiredAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredAsset_Link() {
        return (EReference)getRequiredAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredAsset_Remarks() {
        return (EAttribute)getRequiredAsset().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredAsset_Uuid() {
        return (EAttribute)getRequiredAsset().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackMatterResource() {
		if (backMatterResourceEClass == null) {
			backMatterResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(146);
		}
		return backMatterResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Title() {
        return (EAttribute)getBackMatterResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Description() {
        return (EAttribute)getBackMatterResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Prop() {
        return (EReference)getBackMatterResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_DocumentId() {
        return (EReference)getBackMatterResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Citation() {
        return (EReference)getBackMatterResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Rlink() {
        return (EReference)getBackMatterResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Base64() {
        return (EReference)getBackMatterResource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Remarks() {
        return (EAttribute)getBackMatterResource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Uuid() {
        return (EAttribute)getBackMatterResource().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsibility() {
		if (responsibilityEClass == null) {
			responsibilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(147);
		}
		return responsibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibility_Description() {
        return (EAttribute)getResponsibility().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibility_Prop() {
        return (EReference)getResponsibility().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibility_Link() {
        return (EReference)getResponsibility().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibility_ResponsibleRole() {
        return (EReference)getResponsibility().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibility_Remarks() {
        return (EAttribute)getResponsibility().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibility_ProvidedUuid() {
        return (EAttribute)getResponsibility().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibility_Uuid() {
        return (EAttribute)getResponsibility().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevision() {
		if (revisionEClass == null) {
			revisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(148);
		}
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Title() {
        return (EAttribute)getRevision().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Published() {
        return (EAttribute)getRevision().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_LastModified() {
        return (EAttribute)getRevision().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Version() {
        return (EAttribute)getRevision().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_OscalVersion() {
        return (EAttribute)getRevision().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Prop() {
        return (EReference)getRevision().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Link() {
        return (EReference)getRevision().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Remarks() {
        return (EAttribute)getRevision().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskLog() {
		if (riskLogEClass == null) {
			riskLogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(149);
		}
		return riskLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskLog_Entry() {
        return (EReference)getRiskLog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRlink() {
		if (rlinkEClass == null) {
			rlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(150);
		}
		return rlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRlink_Hash() {
        return (EReference)getRlink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRlink_Href() {
        return (EAttribute)getRlink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRlink_MediaType() {
        return (EAttribute)getRlink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		if (roleEClass == null) {
			roleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(151);
		}
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Title() {
        return (EAttribute)getRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_ShortName() {
        return (EAttribute)getRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Description() {
        return (EAttribute)getRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Prop() {
        return (EReference)getRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Link() {
        return (EReference)getRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Remarks() {
        return (EAttribute)getRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Id() {
        return (EAttribute)getRole().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfied() {
		if (satisfiedEClass == null) {
			satisfiedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(152);
		}
		return satisfiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfied_Description() {
        return (EAttribute)getSatisfied().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfied_Prop() {
        return (EReference)getSatisfied().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfied_Link() {
        return (EReference)getSatisfied().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfied_ResponsibleRole() {
        return (EReference)getSatisfied().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfied_Remarks() {
        return (EAttribute)getSatisfied().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfied_ResponsibilityUuid() {
        return (EAttribute)getSatisfied().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfied_Uuid() {
        return (EAttribute)getSatisfied().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfileSetParameter() {
		if (profileSetParameterEClass == null) {
			profileSetParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(153);
		}
		return profileSetParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileSetParameter_Prop() {
        return (EReference)getProfileSetParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileSetParameter_Link() {
        return (EReference)getProfileSetParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileSetParameter_Label() {
        return (EAttribute)getProfileSetParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileSetParameter_Usage() {
        return (EAttribute)getProfileSetParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileSetParameter_Constraint() {
        return (EReference)getProfileSetParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileSetParameter_Guideline() {
        return (EReference)getProfileSetParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileSetParameter_Value() {
        return (EAttribute)getProfileSetParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfileSetParameter_Select() {
        return (EReference)getProfileSetParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileSetParameter_Class() {
        return (EAttribute)getProfileSetParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileSetParameter_DependsOn() {
        return (EAttribute)getProfileSetParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileSetParameter_ParamId() {
        return (EAttribute)getProfileSetParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaceholderSource() {
		if (placeholderSourceEClass == null) {
			placeholderSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(154);
		}
		return placeholderSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceholderSource_Remarks() {
        return (EAttribute)getPlaceholderSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaceholderSource_TaskUuid() {
        return (EAttribute)getPlaceholderSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFindingTargetStatus() {
		if (findingTargetStatusEClass == null) {
			findingTargetStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(155);
		}
		return findingTargetStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTargetStatus_Remarks() {
        return (EAttribute)getFindingTargetStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTargetStatus_Reason() {
        return (EAttribute)getFindingTargetStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFindingTargetStatus_State() {
        return (EAttribute)getFindingTargetStatus().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemComponentStatus() {
		if (systemComponentStatusEClass == null) {
			systemComponentStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(156);
		}
		return systemComponentStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponentStatus_Remarks() {
        return (EAttribute)getSystemComponentStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponentStatus_State() {
        return (EAttribute)getSystemComponentStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		if (stepEClass == null) {
			stepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(157);
		}
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Title() {
        return (EAttribute)getStep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Description() {
        return (EAttribute)getStep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Prop() {
        return (EReference)getStep().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Link() {
        return (EReference)getStep().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_ReviewedControls() {
        return (EReference)getStep().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_ResponsibleRole() {
        return (EReference)getStep().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Remarks() {
        return (EAttribute)getStep().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Uuid() {
        return (EAttribute)getStep().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTermsAndConditions() {
		if (termsAndConditionsEClass == null) {
			termsAndConditionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(158);
		}
		return termsAndConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTermsAndConditions_Part() {
        return (EReference)getTermsAndConditions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintTest() {
		if (constraintTestEClass == null) {
			constraintTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(159);
		}
		return constraintTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraintTest_Expression() {
        return (EAttribute)getConstraintTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraintTest_Remarks() {
        return (EAttribute)getConstraintTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTiming() {
		if (timingEClass == null) {
			timingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(160);
		}
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_OnDate() {
        return (EReference)getTiming().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_WithinDateRange() {
        return (EReference)getTiming().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_AtFrequency() {
        return (EReference)getTiming().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsesComponent() {
		if (usesComponentEClass == null) {
			usesComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(161);
		}
		return usesComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsesComponent_Prop() {
        return (EReference)getUsesComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsesComponent_Link() {
        return (EReference)getUsesComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsesComponent_ResponsibleParty() {
        return (EReference)getUsesComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsesComponent_Remarks() {
        return (EAttribute)getUsesComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsesComponent_ComponentUuid() {
        return (EAttribute)getUsesComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWithinDateRange() {
		if (withinDateRangeEClass == null) {
			withinDateRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(162);
		}
		return withinDateRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWithinDateRange_Remarks() {
        return (EAttribute)getWithinDateRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWithinDateRange_End() {
        return (EAttribute)getWithinDateRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWithinDateRange_Start() {
        return (EAttribute)getWithinDateRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAsIsType() {
		if (asIsTypeEDataType == null) {
			asIsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(163);
		}
		return asIsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAsIsTypeObject() {
		if (asIsTypeObjectEDataType == null) {
			asIsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(164);
		}
		return asIsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBase64Datatype() {
		if (base64DatatypeEDataType == null) {
			base64DatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(165);
		}
		return base64DatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBooleanDatatype() {
		if (booleanDatatypeEDataType == null) {
			booleanDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(166);
		}
		return booleanDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBooleanDatatypeObject() {
		if (booleanDatatypeObjectEDataType == null) {
			booleanDatatypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(167);
		}
		return booleanDatatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCategoryType() {
		if (categoryTypeEDataType == null) {
			categoryTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(168);
		}
		return categoryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCityType() {
		if (cityTypeEDataType == null) {
			cityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(169);
		}
		return cityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCollectedType() {
		if (collectedTypeEDataType == null) {
			collectedTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(170);
		}
		return collectedTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCountryType() {
		if (countryTypeEDataType == null) {
			countryTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(171);
		}
		return countryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateDatatype() {
		if (dateDatatypeEDataType == null) {
			dateDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(172);
		}
		return dateDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimeDatatype() {
		if (dateTimeDatatypeEDataType == null) {
			dateTimeDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(173);
		}
		return dateTimeDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimeWithTimezoneDatatype() {
		if (dateTimeWithTimezoneDatatypeEDataType == null) {
			dateTimeWithTimezoneDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(174);
		}
		return dateTimeWithTimezoneDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDeadlineType() {
		if (deadlineTypeEDataType == null) {
			deadlineTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(175);
		}
		return deadlineTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecimalDatatype() {
		if (decimalDatatypeEDataType == null) {
			decimalDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(176);
		}
		return decimalDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEmailAddressDatatype() {
		if (emailAddressDatatypeEDataType == null) {
			emailAddressDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(177);
		}
		return emailAddressDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEndType() {
		if (endTypeEDataType == null) {
			endTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(178);
		}
		return endTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEndType1() {
		if (endType1EDataType == null) {
			endType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(179);
		}
		return endType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEndType2() {
		if (endType2EDataType == null) {
			endType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(180);
		}
		return endType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExpiresType() {
		if (expiresTypeEDataType == null) {
			expiresTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(181);
		}
		return expiresTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExpressionType() {
		if (expressionTypeEDataType == null) {
			expressionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(182);
		}
		return expressionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImplementationStatementUuidType() {
		if (implementationStatementUuidTypeEDataType == null) {
			implementationStatementUuidTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(183);
		}
		return implementationStatementUuidTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInformationTypeIdType() {
		if (informationTypeIdTypeEDataType == null) {
			informationTypeIdTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(184);
		}
		return informationTypeIdTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMarkupLineDatatype() {
		if (markupLineDatatypeEDataType == null) {
			markupLineDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(185);
		}
		return markupLineDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMarkupMultilineDatatype() {
		if (markupMultilineDatatypeEDataType == null) {
			markupMultilineDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(186);
		}
		return markupMultilineDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMemberOfOrganizationType() {
		if (memberOfOrganizationTypeEDataType == null) {
			memberOfOrganizationTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(187);
		}
		return memberOfOrganizationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMethodType() {
		if (methodTypeEDataType == null) {
			methodTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(188);
		}
		return methodTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameType() {
		if (nameTypeEDataType == null) {
			nameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(189);
		}
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeIntegerDatatype() {
		if (nonNegativeIntegerDatatypeEDataType == null) {
			nonNegativeIntegerDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(190);
		}
		return nonNegativeIntegerDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalAssessmentCommonRiskStatusFIELD() {
		if (oscalAssessmentCommonRiskStatusFIELDEDataType == null) {
			oscalAssessmentCommonRiskStatusFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(191);
		}
		return oscalAssessmentCommonRiskStatusFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalControlCommonParameterValueFIELD() {
		if (oscalControlCommonParameterValueFIELDEDataType == null) {
			oscalControlCommonParameterValueFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(192);
		}
		return oscalControlCommonParameterValueFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalControlCommonWithIdFIELD() {
		if (oscalControlCommonWithIdFIELDEDataType == null) {
			oscalControlCommonWithIdFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(193);
		}
		return oscalControlCommonWithIdFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalImplementationCommonFunctionPerformedFIELD() {
		if (oscalImplementationCommonFunctionPerformedFIELDEDataType == null) {
			oscalImplementationCommonFunctionPerformedFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(194);
		}
		return oscalImplementationCommonFunctionPerformedFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMappingCommonPercentageFIELD() {
		if (oscalMappingCommonPercentageFIELDEDataType == null) {
			oscalMappingCommonPercentageFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(195);
		}
		return oscalMappingCommonPercentageFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataAddrLineFIELD() {
		if (oscalMetadataAddrLineFIELDEDataType == null) {
			oscalMetadataAddrLineFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(196);
		}
		return oscalMetadataAddrLineFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataEmailAddressFIELD() {
		if (oscalMetadataEmailAddressFIELDEDataType == null) {
			oscalMetadataEmailAddressFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(197);
		}
		return oscalMetadataEmailAddressFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataLastModifiedFIELD() {
		if (oscalMetadataLastModifiedFIELDEDataType == null) {
			oscalMetadataLastModifiedFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(198);
		}
		return oscalMetadataLastModifiedFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataLocationUuidFIELD() {
		if (oscalMetadataLocationUuidFIELDEDataType == null) {
			oscalMetadataLocationUuidFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(199);
		}
		return oscalMetadataLocationUuidFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataOscalVersionFIELD() {
		if (oscalMetadataOscalVersionFIELDEDataType == null) {
			oscalMetadataOscalVersionFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(200);
		}
		return oscalMetadataOscalVersionFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataPartyUuidFIELD() {
		if (oscalMetadataPartyUuidFIELDEDataType == null) {
			oscalMetadataPartyUuidFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(201);
		}
		return oscalMetadataPartyUuidFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataPublishedFIELD() {
		if (oscalMetadataPublishedFIELDEDataType == null) {
			oscalMetadataPublishedFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(202);
		}
		return oscalMetadataPublishedFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataRoleIdFIELD() {
		if (oscalMetadataRoleIdFIELDEDataType == null) {
			oscalMetadataRoleIdFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(203);
		}
		return oscalMetadataRoleIdFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalMetadataVersionFIELD() {
		if (oscalMetadataVersionFIELDEDataType == null) {
			oscalMetadataVersionFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(204);
		}
		return oscalMetadataVersionFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalSspBaseFIELD() {
		if (oscalSspBaseFIELDEDataType == null) {
			oscalSspBaseFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(205);
		}
		return oscalSspBaseFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalSspDateAuthorizedFIELD() {
		if (oscalSspDateAuthorizedFIELDEDataType == null) {
			oscalSspDateAuthorizedFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(206);
		}
		return oscalSspDateAuthorizedFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOscalSspSelectedFIELD() {
		if (oscalSspSelectedFIELDEDataType == null) {
			oscalSspSelectedFIELDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(207);
		}
		return oscalSspSelectedFIELDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPartyUuidType() {
		if (partyUuidTypeEDataType == null) {
			partyUuidTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(208);
		}
		return partyUuidTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveIntegerDatatype() {
		if (positiveIntegerDatatypeEDataType == null) {
			positiveIntegerDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(209);
		}
		return positiveIntegerDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPostalCodeType() {
		if (postalCodeTypeEDataType == null) {
			postalCodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(210);
		}
		return postalCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRelationshipType() {
		if (relationshipTypeEDataType == null) {
			relationshipTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(211);
		}
		return relationshipTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSecurityObjectiveAvailabilityType() {
		if (securityObjectiveAvailabilityTypeEDataType == null) {
			securityObjectiveAvailabilityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(212);
		}
		return securityObjectiveAvailabilityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSecurityObjectiveConfidentialityType() {
		if (securityObjectiveConfidentialityTypeEDataType == null) {
			securityObjectiveConfidentialityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(213);
		}
		return securityObjectiveConfidentialityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSecurityObjectiveIntegrityType() {
		if (securityObjectiveIntegrityTypeEDataType == null) {
			securityObjectiveIntegrityTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(214);
		}
		return securityObjectiveIntegrityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSecuritySensitivityLevelType() {
		if (securitySensitivityLevelTypeEDataType == null) {
			securitySensitivityLevelTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(215);
		}
		return securitySensitivityLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getShortNameType() {
		if (shortNameTypeEDataType == null) {
			shortNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(216);
		}
		return shortNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getShortNameType1() {
		if (shortNameType1EDataType == null) {
			shortNameType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(217);
		}
		return shortNameType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getShortNameType2() {
		if (shortNameType2EDataType == null) {
			shortNameType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(218);
		}
		return shortNameType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStartType() {
		if (startTypeEDataType == null) {
			startTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(219);
		}
		return startTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStartType1() {
		if (startType1EDataType == null) {
			startType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(220);
		}
		return startType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStartType2() {
		if (startType2EDataType == null) {
			startType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(221);
		}
		return startType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStatementIdType() {
		if (statementIdTypeEDataType == null) {
			statementIdTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(222);
		}
		return statementIdTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStateType() {
		if (stateTypeEDataType == null) {
			stateTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(223);
		}
		return stateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringDatatype() {
		if (stringDatatypeEDataType == null) {
			stringDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(224);
		}
		return stringDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSystemNameShortType() {
		if (systemNameShortTypeEDataType == null) {
			systemNameShortTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(225);
		}
		return systemNameShortTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSystemNameType() {
		if (systemNameTypeEDataType == null) {
			systemNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(226);
		}
		return systemNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTokenDatatype() {
		if (tokenDatatypeEDataType == null) {
			tokenDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(227);
		}
		return tokenDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeType() {
		if (typeTypeEDataType == null) {
			typeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(228);
		}
		return typeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getURIDatatype() {
		if (uriDatatypeEDataType == null) {
			uriDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(229);
		}
		return uriDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getURIReferenceDatatype() {
		if (uriReferenceDatatypeEDataType == null) {
			uriReferenceDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(230);
		}
		return uriReferenceDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrlType() {
		if (urlTypeEDataType == null) {
			urlTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(231);
		}
		return urlTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUUIDDatatype() {
		if (uuidDatatypeEDataType == null) {
			uuidDatatypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(232);
		}
		return uuidDatatypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getValueType() {
		if (valueTypeEDataType == null) {
			valueTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OSCALPackage.eNS_URI).getEClassifiers().get(233);
		}
		return valueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSCALFactory getOSCALFactory() {
		return (OSCALFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("gov.nist.csrc.ns.oscal." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //OSCALPackageImpl
