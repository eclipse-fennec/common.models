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

import gov.nist.csrc.ns.oscal.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCALFactoryImpl extends EFactoryImpl implements OSCALFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OSCALFactory init() {
		try {
			OSCALFactory theOSCALFactory = (OSCALFactory)EPackage.Registry.INSTANCE.getEFactory(OSCALPackage.eNS_URI);
			if (theOSCALFactory != null) {
				return theOSCALFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OSCALFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCALFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OSCALPackage.ADD: return createAdd();
			case OSCALPackage.ALTER: return createAlter();
			case OSCALPackage.MARKUP_ANCHOR: return createMarkupAnchor();
			case OSCALPackage.ASSESSMENT_LOG: return createAssessmentLog();
			case OSCALPackage.ASSESSMENT_PLATFORM: return createAssessmentPlatform();
			case OSCALPackage.ASSOCIATED_ACTIVITY: return createAssociatedActivity();
			case OSCALPackage.AT_FREQUENCY: return createAtFrequency();
			case OSCALPackage.ATTESTATION: return createAttestation();
			case OSCALPackage.BASE64: return createBase64();
			case OSCALPackage.MARKUP_BLOCK_QUOTE: return createMarkupBlockQuote();
			case OSCALPackage.CATEGORIZATION: return createCategorization();
			case OSCALPackage.CITATION: return createCitation();
			case OSCALPackage.MARKUP_CODE: return createMarkupCode();
			case OSCALPackage.COMBINE: return createCombine();
			case OSCALPackage.CONTROL_OBJECTIVE_SELECTION: return createControlObjectiveSelection();
			case OSCALPackage.CONTROL_SELECTION: return createControlSelection();
			case OSCALPackage.CUSTOM: return createCustom();
			case OSCALPackage.DEPENDENCY: return createDependency();
			case OSCALPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OSCALPackage.RISK_LOG_ENTRY: return createRiskLogEntry();
			case OSCALPackage.ASSESSMENT_LOG_ENTRY: return createAssessmentLogEntry();
			case OSCALPackage.EXPORT: return createExport();
			case OSCALPackage.EXTERNAL_ID: return createExternalId();
			case OSCALPackage.FACET: return createFacet();
			case OSCALPackage.FLAT: return createFlat();
			case OSCALPackage.IDENTIFIED_SUBJECT: return createIdentifiedSubject();
			case OSCALPackage.MARKUP_IMAGE: return createMarkupImage();
			case OSCALPackage.IMPLEMENTED_COMPONENT: return createImplementedComponent();
			case OSCALPackage.INFORMATION_TYPE: return createInformationType();
			case OSCALPackage.INHERITED: return createInherited();
			case OSCALPackage.INLINE_MARKUP: return createInlineMarkup();
			case OSCALPackage.MARKUP_INSERT: return createMarkupInsert();
			case OSCALPackage.LEVERAGED_AUTHORIZATION: return createLeveragedAuthorization();
			case OSCALPackage.MARKUP_LIST_ITEM: return createMarkupListItem();
			case OSCALPackage.MARKUP_LIST: return createMarkupList();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS: return createResultLocalDefinitions();
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS: return createAssessmentResultsLocalDefinitions();
			case OSCALPackage.ASSESSMENT_PLAN_LOCAL_DEFINITIONS: return createAssessmentPlanLocalDefinitions();
			case OSCALPackage.LOCATION: return createLocation();
			case OSCALPackage.MARKUP_LINE_DATATYPE: return createMarkupLineDatatype();
			case OSCALPackage.MARKUP_MULTILINE_DATATYPE: return createMarkupMultilineDatatype();
			case OSCALPackage.MITIGATING_FACTOR: return createMitigatingFactor();
			case OSCALPackage.ON_DATE: return createOnDate();
			case OSCALPackage.MARKUP_ORDERED_LIST: return createMarkupOrderedList();
			case OSCALPackage.POAM_ITEM_ORIGIN: return createPoamItemOrigin();
			case OSCALPackage.ASSESSMENT_PLAN: return createAssessmentPlan();
			case OSCALPackage.ASSESSMENT_RESULTS: return createAssessmentResults();
			case OSCALPackage.IMPORT_AP: return createImportAp();
			case OSCALPackage.RESULT: return createResult();
			case OSCALPackage.ACTIVITY: return createActivity();
			case OSCALPackage.ASSESSMENT_ASSETS: return createAssessmentAssets();
			case OSCALPackage.ASSESSMENT_METHOD: return createAssessmentMethod();
			case OSCALPackage.ASSESSMENT_PART: return createAssessmentPart();
			case OSCALPackage.ASSESSMENT_SUBJECT: return createAssessmentSubject();
			case OSCALPackage.ASSESSMENT_SUBJECT_PLACEHOLDER: return createAssessmentSubjectPlaceholder();
			case OSCALPackage.ASSOCIATED_RISK: return createAssociatedRisk();
			case OSCALPackage.CHARACTERIZATION: return createCharacterization();
			case OSCALPackage.FINDING: return createFinding();
			case OSCALPackage.FINDING_TARGET: return createFindingTarget();
			case OSCALPackage.IMPORT_SSP: return createImportSsp();
			case OSCALPackage.LOCAL_OBJECTIVE: return createLocalObjective();
			case OSCALPackage.LOGGED_BY: return createLoggedBy();
			case OSCALPackage.OBSERVATION: return createObservation();
			case OSCALPackage.ORIGIN_ACTOR: return createOriginActor();
			case OSCALPackage.ORIGIN: return createOrigin();
			case OSCALPackage.RELATED_OBSERVATION: return createRelatedObservation();
			case OSCALPackage.RELATED_TASK: return createRelatedTask();
			case OSCALPackage.RESPONSE: return createResponse();
			case OSCALPackage.REVIEWED_CONTROLS: return createReviewedControls();
			case OSCALPackage.RISK: return createRisk();
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID: return createAssessmentSelectControlById();
			case OSCALPackage.SELECT_OBJECTIVE_BY_ID: return createSelectObjectiveById();
			case OSCALPackage.SELECT_SUBJECT_BY_ID: return createSelectSubjectById();
			case OSCALPackage.SUBJECT_REFERENCE: return createSubjectReference();
			case OSCALPackage.TASK: return createTask();
			case OSCALPackage.THREAT_ID: return createThreatId();
			case OSCALPackage.CATALOG: return createCatalog();
			case OSCALPackage.CONTROL: return createControl();
			case OSCALPackage.CATALOG_GROUP: return createCatalogGroup();
			case OSCALPackage.CAPABILITY: return createCapability();
			case OSCALPackage.COMPONENT_DEFINITION: return createComponentDefinition();
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION: return createComponentControlImplementation();
			case OSCALPackage.DEFINED_COMPONENT: return createDefinedComponent();
			case OSCALPackage.COMPONENT_IMPLEMENTED_REQUIREMENT: return createComponentImplementedRequirement();
			case OSCALPackage.IMPORT_COMPONENT_DEFINITION: return createImportComponentDefinition();
			case OSCALPackage.INCORPORATES_COMPONENT: return createIncorporatesComponent();
			case OSCALPackage.COMPONENT_STATEMENT: return createComponentStatement();
			case OSCALPackage.INCLUDE_ALL: return createIncludeAll();
			case OSCALPackage.MATCHING: return createMatching();
			case OSCALPackage.PARAMETER: return createParameter();
			case OSCALPackage.PARAMETER_CONSTRAINT: return createParameterConstraint();
			case OSCALPackage.PARAMETER_GUIDELINE: return createParameterGuideline();
			case OSCALPackage.PARAMETER_SELECTION: return createParameterSelection();
			case OSCALPackage.PART: return createPart();
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID: return createControlSelectControlById();
			case OSCALPackage.AUTHORIZED_PRIVILEGE: return createAuthorizedPrivilege();
			case OSCALPackage.IMPLEMENTATION_STATUS: return createImplementationStatus();
			case OSCALPackage.INVENTORY_ITEM: return createInventoryItem();
			case OSCALPackage.PORT_RANGE: return createPortRange();
			case OSCALPackage.PROTOCOL: return createProtocol();
			case OSCALPackage.SET_PARAMETER: return createSetParameter();
			case OSCALPackage.SYSTEM_COMPONENT: return createSystemComponent();
			case OSCALPackage.SYSTEM_ID: return createSystemId();
			case OSCALPackage.SYSTEM_USER: return createSystemUser();
			case OSCALPackage.CONFIDENCE_SCORE: return createConfidenceScore();
			case OSCALPackage.COVERAGE: return createCoverage();
			case OSCALPackage.GAP_SUMMARY: return createGapSummary();
			case OSCALPackage.MAP_ENTRY: return createMapEntry();
			case OSCALPackage.MAPPING: return createMapping();
			case OSCALPackage.MAPPING_ITEM: return createMappingItem();
			case OSCALPackage.MAPPING_PROVENANCE: return createMappingProvenance();
			case OSCALPackage.MAPPING_RESOURCE_REFERENCE: return createMappingResourceReference();
			case OSCALPackage.QUALIFIER_ITEM: return createQualifierItem();
			case OSCALPackage.MAPPING_COLLECTION: return createMappingCollection();
			case OSCALPackage.ACTION: return createAction();
			case OSCALPackage.ADDRESS: return createAddress();
			case OSCALPackage.BACK_MATTER: return createBackMatter();
			case OSCALPackage.DOCUMENT_ID: return createDocumentId();
			case OSCALPackage.HASH: return createHash();
			case OSCALPackage.LINK: return createLink();
			case OSCALPackage.METADATA: return createMetadata();
			case OSCALPackage.PROPERTY: return createProperty();
			case OSCALPackage.RESPONSIBLE_PARTY: return createResponsibleParty();
			case OSCALPackage.RESPONSIBLE_ROLE: return createResponsibleRole();
			case OSCALPackage.TELEPHONE_NUMBER: return createTelephoneNumber();
			case OSCALPackage.POAM_LOCAL_DEFINITIONS: return createPoamLocalDefinitions();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES: return createPlanOfActionAndMilestones();
			case OSCALPackage.POAM_ITEM: return createPoamItem();
			case OSCALPackage.PROFILE_GROUP: return createProfileGroup();
			case OSCALPackage.IMPORT: return createImport();
			case OSCALPackage.INSERT_CONTROLS: return createInsertControls();
			case OSCALPackage.MERGE: return createMerge();
			case OSCALPackage.MODIFY: return createModify();
			case OSCALPackage.PROFILE: return createProfile();
			case OSCALPackage.AUTHORIZATION_BOUNDARY: return createAuthorizationBoundary();
			case OSCALPackage.BY_COMPONENT: return createByComponent();
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION: return createSspControlImplementation();
			case OSCALPackage.DATA_FLOW: return createDataFlow();
			case OSCALPackage.DIAGRAM: return createDiagram();
			case OSCALPackage.IMPACT: return createImpact();
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT: return createSspImplementedRequirement();
			case OSCALPackage.IMPORT_PROFILE: return createImportProfile();
			case OSCALPackage.NETWORK_ARCHITECTURE: return createNetworkArchitecture();
			case OSCALPackage.SECURITY_IMPACT_LEVEL: return createSecurityImpactLevel();
			case OSCALPackage.SSP_STATEMENT: return createSspStatement();
			case OSCALPackage.SYSTEM_STATUS: return createSystemStatus();
			case OSCALPackage.SYSTEM_CHARACTERISTICS: return createSystemCharacteristics();
			case OSCALPackage.SYSTEM_IMPLEMENTATION: return createSystemImplementation();
			case OSCALPackage.SYSTEM_INFORMATION: return createSystemInformation();
			case OSCALPackage.SYSTEM_SECURITY_PLAN: return createSystemSecurityPlan();
			case OSCALPackage.PARTY: return createParty();
			case OSCALPackage.MARKUP_PREFORMATTED: return createMarkupPreformatted();
			case OSCALPackage.PROVIDED: return createProvided();
			case OSCALPackage.RELATED_FINDING: return createRelatedFinding();
			case OSCALPackage.RELATED_RESPONSE: return createRelatedResponse();
			case OSCALPackage.RELEVANT_EVIDENCE: return createRelevantEvidence();
			case OSCALPackage.REMOVE: return createRemove();
			case OSCALPackage.REQUIRED_ASSET: return createRequiredAsset();
			case OSCALPackage.BACK_MATTER_RESOURCE: return createBackMatterResource();
			case OSCALPackage.RESPONSIBILITY: return createResponsibility();
			case OSCALPackage.REVISIONS: return createRevisions();
			case OSCALPackage.REVISION: return createRevision();
			case OSCALPackage.RISK_LOG: return createRiskLog();
			case OSCALPackage.RLINK: return createRlink();
			case OSCALPackage.ROLE: return createRole();
			case OSCALPackage.SATISFIED: return createSatisfied();
			case OSCALPackage.PROFILE_SET_PARAMETER: return createProfileSetParameter();
			case OSCALPackage.PLACEHOLDER_SOURCE: return createPlaceholderSource();
			case OSCALPackage.FINDING_TARGET_STATUS: return createFindingTargetStatus();
			case OSCALPackage.SYSTEM_COMPONENT_STATUS: return createSystemComponentStatus();
			case OSCALPackage.STEP: return createStep();
			case OSCALPackage.MARKUP_TABLE_CELL: return createMarkupTableCell();
			case OSCALPackage.MARKUP_TABLE_ROW: return createMarkupTableRow();
			case OSCALPackage.MARKUP_TABLE: return createMarkupTable();
			case OSCALPackage.TERMS_AND_CONDITIONS: return createTermsAndConditions();
			case OSCALPackage.CONSTRAINT_TEST: return createConstraintTest();
			case OSCALPackage.TIMING: return createTiming();
			case OSCALPackage.USES_COMPONENT: return createUsesComponent();
			case OSCALPackage.WITHIN_DATE_RANGE: return createWithinDateRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OSCALPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case OSCALPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case OSCALPackage.AS_IS_TYPE:
				return createAsIsTypeFromString(eDataType, initialValue);
			case OSCALPackage.AS_IS_TYPE_OBJECT:
				return createAsIsTypeObjectFromString(eDataType, initialValue);
			case OSCALPackage.BASE64_DATATYPE:
				return createBase64DatatypeFromString(eDataType, initialValue);
			case OSCALPackage.BOOLEAN_DATATYPE:
				return createBooleanDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.BOOLEAN_DATATYPE_OBJECT:
				return createBooleanDatatypeObjectFromString(eDataType, initialValue);
			case OSCALPackage.CATEGORY_TYPE:
				return createCategoryTypeFromString(eDataType, initialValue);
			case OSCALPackage.CITY_TYPE:
				return createCityTypeFromString(eDataType, initialValue);
			case OSCALPackage.COLLECTED_TYPE:
				return createCollectedTypeFromString(eDataType, initialValue);
			case OSCALPackage.COUNTRY_TYPE:
				return createCountryTypeFromString(eDataType, initialValue);
			case OSCALPackage.DATE_DATATYPE:
				return createDateDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.DATE_TIME_DATATYPE:
				return createDateTimeDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.DATE_TIME_WITH_TIMEZONE_DATATYPE:
				return createDateTimeWithTimezoneDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.DEADLINE_TYPE:
				return createDeadlineTypeFromString(eDataType, initialValue);
			case OSCALPackage.DECIMAL_DATATYPE:
				return createDecimalDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.EMAIL_ADDRESS_DATATYPE:
				return createEmailAddressDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.END_TYPE:
				return createEndTypeFromString(eDataType, initialValue);
			case OSCALPackage.END_TYPE1:
				return createEndType1FromString(eDataType, initialValue);
			case OSCALPackage.END_TYPE2:
				return createEndType2FromString(eDataType, initialValue);
			case OSCALPackage.EXPIRES_TYPE:
				return createExpiresTypeFromString(eDataType, initialValue);
			case OSCALPackage.EXPRESSION_TYPE:
				return createExpressionTypeFromString(eDataType, initialValue);
			case OSCALPackage.IMPLEMENTATION_STATEMENT_UUID_TYPE:
				return createImplementationStatementUuidTypeFromString(eDataType, initialValue);
			case OSCALPackage.INFORMATION_TYPE_ID_TYPE:
				return createInformationTypeIdTypeFromString(eDataType, initialValue);
			case OSCALPackage.MEMBER_OF_ORGANIZATION_TYPE:
				return createMemberOfOrganizationTypeFromString(eDataType, initialValue);
			case OSCALPackage.METHOD_TYPE:
				return createMethodTypeFromString(eDataType, initialValue);
			case OSCALPackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case OSCALPackage.NON_NEGATIVE_INTEGER_DATATYPE:
				return createNonNegativeIntegerDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_ASSESSMENT_COMMON_RISK_STATUS_FIELD:
				return createOscalAssessmentCommonRiskStatusFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_CONTROL_COMMON_PARAMETER_VALUE_FIELD:
				return createOscalControlCommonParameterValueFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_CONTROL_COMMON_WITH_ID_FIELD:
				return createOscalControlCommonWithIdFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_IMPLEMENTATION_COMMON_FUNCTION_PERFORMED_FIELD:
				return createOscalImplementationCommonFunctionPerformedFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_MAPPING_COMMON_PERCENTAGE_FIELD:
				return createOscalMappingCommonPercentageFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_ADDR_LINE_FIELD:
				return createOscalMetadataAddrLineFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_EMAIL_ADDRESS_FIELD:
				return createOscalMetadataEmailAddressFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_LAST_MODIFIED_FIELD:
				return createOscalMetadataLastModifiedFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_LOCATION_UUID_FIELD:
				return createOscalMetadataLocationUuidFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_OSCAL_VERSION_FIELD:
				return createOscalMetadataOscalVersionFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_PARTY_UUID_FIELD:
				return createOscalMetadataPartyUuidFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_PUBLISHED_FIELD:
				return createOscalMetadataPublishedFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_ROLE_ID_FIELD:
				return createOscalMetadataRoleIdFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_METADATA_VERSION_FIELD:
				return createOscalMetadataVersionFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_SSP_BASE_FIELD:
				return createOscalSspBaseFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_SSP_DATE_AUTHORIZED_FIELD:
				return createOscalSspDateAuthorizedFIELDFromString(eDataType, initialValue);
			case OSCALPackage.OSCAL_SSP_SELECTED_FIELD:
				return createOscalSspSelectedFIELDFromString(eDataType, initialValue);
			case OSCALPackage.PARTY_UUID_TYPE:
				return createPartyUuidTypeFromString(eDataType, initialValue);
			case OSCALPackage.POSITIVE_INTEGER_DATATYPE:
				return createPositiveIntegerDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.POSTAL_CODE_TYPE:
				return createPostalCodeTypeFromString(eDataType, initialValue);
			case OSCALPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			case OSCALPackage.SECURITY_OBJECTIVE_AVAILABILITY_TYPE:
				return createSecurityObjectiveAvailabilityTypeFromString(eDataType, initialValue);
			case OSCALPackage.SECURITY_OBJECTIVE_CONFIDENTIALITY_TYPE:
				return createSecurityObjectiveConfidentialityTypeFromString(eDataType, initialValue);
			case OSCALPackage.SECURITY_OBJECTIVE_INTEGRITY_TYPE:
				return createSecurityObjectiveIntegrityTypeFromString(eDataType, initialValue);
			case OSCALPackage.SECURITY_SENSITIVITY_LEVEL_TYPE:
				return createSecuritySensitivityLevelTypeFromString(eDataType, initialValue);
			case OSCALPackage.SHORT_NAME_TYPE:
				return createShortNameTypeFromString(eDataType, initialValue);
			case OSCALPackage.SHORT_NAME_TYPE1:
				return createShortNameType1FromString(eDataType, initialValue);
			case OSCALPackage.SHORT_NAME_TYPE2:
				return createShortNameType2FromString(eDataType, initialValue);
			case OSCALPackage.START_TYPE:
				return createStartTypeFromString(eDataType, initialValue);
			case OSCALPackage.START_TYPE1:
				return createStartType1FromString(eDataType, initialValue);
			case OSCALPackage.START_TYPE2:
				return createStartType2FromString(eDataType, initialValue);
			case OSCALPackage.STATEMENT_ID_TYPE:
				return createStatementIdTypeFromString(eDataType, initialValue);
			case OSCALPackage.STATE_TYPE:
				return createStateTypeFromString(eDataType, initialValue);
			case OSCALPackage.STRING_DATATYPE:
				return createStringDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.SYSTEM_NAME_SHORT_TYPE:
				return createSystemNameShortTypeFromString(eDataType, initialValue);
			case OSCALPackage.SYSTEM_NAME_TYPE:
				return createSystemNameTypeFromString(eDataType, initialValue);
			case OSCALPackage.TOKEN_DATATYPE:
				return createTokenDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case OSCALPackage.URI_DATATYPE:
				return createURIDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.URI_REFERENCE_DATATYPE:
				return createURIReferenceDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.URL_TYPE:
				return createUrlTypeFromString(eDataType, initialValue);
			case OSCALPackage.UUID_DATATYPE:
				return createUUIDDatatypeFromString(eDataType, initialValue);
			case OSCALPackage.VALUE_TYPE:
				return createValueTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OSCALPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case OSCALPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case OSCALPackage.AS_IS_TYPE:
				return convertAsIsTypeToString(eDataType, instanceValue);
			case OSCALPackage.AS_IS_TYPE_OBJECT:
				return convertAsIsTypeObjectToString(eDataType, instanceValue);
			case OSCALPackage.BASE64_DATATYPE:
				return convertBase64DatatypeToString(eDataType, instanceValue);
			case OSCALPackage.BOOLEAN_DATATYPE:
				return convertBooleanDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.BOOLEAN_DATATYPE_OBJECT:
				return convertBooleanDatatypeObjectToString(eDataType, instanceValue);
			case OSCALPackage.CATEGORY_TYPE:
				return convertCategoryTypeToString(eDataType, instanceValue);
			case OSCALPackage.CITY_TYPE:
				return convertCityTypeToString(eDataType, instanceValue);
			case OSCALPackage.COLLECTED_TYPE:
				return convertCollectedTypeToString(eDataType, instanceValue);
			case OSCALPackage.COUNTRY_TYPE:
				return convertCountryTypeToString(eDataType, instanceValue);
			case OSCALPackage.DATE_DATATYPE:
				return convertDateDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.DATE_TIME_DATATYPE:
				return convertDateTimeDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.DATE_TIME_WITH_TIMEZONE_DATATYPE:
				return convertDateTimeWithTimezoneDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.DEADLINE_TYPE:
				return convertDeadlineTypeToString(eDataType, instanceValue);
			case OSCALPackage.DECIMAL_DATATYPE:
				return convertDecimalDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.EMAIL_ADDRESS_DATATYPE:
				return convertEmailAddressDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.END_TYPE:
				return convertEndTypeToString(eDataType, instanceValue);
			case OSCALPackage.END_TYPE1:
				return convertEndType1ToString(eDataType, instanceValue);
			case OSCALPackage.END_TYPE2:
				return convertEndType2ToString(eDataType, instanceValue);
			case OSCALPackage.EXPIRES_TYPE:
				return convertExpiresTypeToString(eDataType, instanceValue);
			case OSCALPackage.EXPRESSION_TYPE:
				return convertExpressionTypeToString(eDataType, instanceValue);
			case OSCALPackage.IMPLEMENTATION_STATEMENT_UUID_TYPE:
				return convertImplementationStatementUuidTypeToString(eDataType, instanceValue);
			case OSCALPackage.INFORMATION_TYPE_ID_TYPE:
				return convertInformationTypeIdTypeToString(eDataType, instanceValue);
			case OSCALPackage.MEMBER_OF_ORGANIZATION_TYPE:
				return convertMemberOfOrganizationTypeToString(eDataType, instanceValue);
			case OSCALPackage.METHOD_TYPE:
				return convertMethodTypeToString(eDataType, instanceValue);
			case OSCALPackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case OSCALPackage.NON_NEGATIVE_INTEGER_DATATYPE:
				return convertNonNegativeIntegerDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_ASSESSMENT_COMMON_RISK_STATUS_FIELD:
				return convertOscalAssessmentCommonRiskStatusFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_CONTROL_COMMON_PARAMETER_VALUE_FIELD:
				return convertOscalControlCommonParameterValueFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_CONTROL_COMMON_WITH_ID_FIELD:
				return convertOscalControlCommonWithIdFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_IMPLEMENTATION_COMMON_FUNCTION_PERFORMED_FIELD:
				return convertOscalImplementationCommonFunctionPerformedFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_MAPPING_COMMON_PERCENTAGE_FIELD:
				return convertOscalMappingCommonPercentageFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_ADDR_LINE_FIELD:
				return convertOscalMetadataAddrLineFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_EMAIL_ADDRESS_FIELD:
				return convertOscalMetadataEmailAddressFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_LAST_MODIFIED_FIELD:
				return convertOscalMetadataLastModifiedFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_LOCATION_UUID_FIELD:
				return convertOscalMetadataLocationUuidFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_OSCAL_VERSION_FIELD:
				return convertOscalMetadataOscalVersionFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_PARTY_UUID_FIELD:
				return convertOscalMetadataPartyUuidFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_PUBLISHED_FIELD:
				return convertOscalMetadataPublishedFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_ROLE_ID_FIELD:
				return convertOscalMetadataRoleIdFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_METADATA_VERSION_FIELD:
				return convertOscalMetadataVersionFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_SSP_BASE_FIELD:
				return convertOscalSspBaseFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_SSP_DATE_AUTHORIZED_FIELD:
				return convertOscalSspDateAuthorizedFIELDToString(eDataType, instanceValue);
			case OSCALPackage.OSCAL_SSP_SELECTED_FIELD:
				return convertOscalSspSelectedFIELDToString(eDataType, instanceValue);
			case OSCALPackage.PARTY_UUID_TYPE:
				return convertPartyUuidTypeToString(eDataType, instanceValue);
			case OSCALPackage.POSITIVE_INTEGER_DATATYPE:
				return convertPositiveIntegerDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.POSTAL_CODE_TYPE:
				return convertPostalCodeTypeToString(eDataType, instanceValue);
			case OSCALPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			case OSCALPackage.SECURITY_OBJECTIVE_AVAILABILITY_TYPE:
				return convertSecurityObjectiveAvailabilityTypeToString(eDataType, instanceValue);
			case OSCALPackage.SECURITY_OBJECTIVE_CONFIDENTIALITY_TYPE:
				return convertSecurityObjectiveConfidentialityTypeToString(eDataType, instanceValue);
			case OSCALPackage.SECURITY_OBJECTIVE_INTEGRITY_TYPE:
				return convertSecurityObjectiveIntegrityTypeToString(eDataType, instanceValue);
			case OSCALPackage.SECURITY_SENSITIVITY_LEVEL_TYPE:
				return convertSecuritySensitivityLevelTypeToString(eDataType, instanceValue);
			case OSCALPackage.SHORT_NAME_TYPE:
				return convertShortNameTypeToString(eDataType, instanceValue);
			case OSCALPackage.SHORT_NAME_TYPE1:
				return convertShortNameType1ToString(eDataType, instanceValue);
			case OSCALPackage.SHORT_NAME_TYPE2:
				return convertShortNameType2ToString(eDataType, instanceValue);
			case OSCALPackage.START_TYPE:
				return convertStartTypeToString(eDataType, instanceValue);
			case OSCALPackage.START_TYPE1:
				return convertStartType1ToString(eDataType, instanceValue);
			case OSCALPackage.START_TYPE2:
				return convertStartType2ToString(eDataType, instanceValue);
			case OSCALPackage.STATEMENT_ID_TYPE:
				return convertStatementIdTypeToString(eDataType, instanceValue);
			case OSCALPackage.STATE_TYPE:
				return convertStateTypeToString(eDataType, instanceValue);
			case OSCALPackage.STRING_DATATYPE:
				return convertStringDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.SYSTEM_NAME_SHORT_TYPE:
				return convertSystemNameShortTypeToString(eDataType, instanceValue);
			case OSCALPackage.SYSTEM_NAME_TYPE:
				return convertSystemNameTypeToString(eDataType, instanceValue);
			case OSCALPackage.TOKEN_DATATYPE:
				return convertTokenDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case OSCALPackage.URI_DATATYPE:
				return convertURIDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.URI_REFERENCE_DATATYPE:
				return convertURIReferenceDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.URL_TYPE:
				return convertUrlTypeToString(eDataType, instanceValue);
			case OSCALPackage.UUID_DATATYPE:
				return convertUUIDDatatypeToString(eDataType, instanceValue);
			case OSCALPackage.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alter createAlter() {
		AlterImpl alter = new AlterImpl();
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupAnchor createMarkupAnchor() {
		MarkupAnchorImpl markupAnchor = new MarkupAnchorImpl();
		return markupAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentLog createAssessmentLog() {
		AssessmentLogImpl assessmentLog = new AssessmentLogImpl();
		return assessmentLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentPlatform createAssessmentPlatform() {
		AssessmentPlatformImpl assessmentPlatform = new AssessmentPlatformImpl();
		return assessmentPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociatedActivity createAssociatedActivity() {
		AssociatedActivityImpl associatedActivity = new AssociatedActivityImpl();
		return associatedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtFrequency createAtFrequency() {
		AtFrequencyImpl atFrequency = new AtFrequencyImpl();
		return atFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attestation createAttestation() {
		AttestationImpl attestation = new AttestationImpl();
		return attestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64 createBase64() {
		Base64Impl base64 = new Base64Impl();
		return base64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupBlockQuote createMarkupBlockQuote() {
		MarkupBlockQuoteImpl markupBlockQuote = new MarkupBlockQuoteImpl();
		return markupBlockQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categorization createCategorization() {
		CategorizationImpl categorization = new CategorizationImpl();
		return categorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citation createCitation() {
		CitationImpl citation = new CitationImpl();
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupCode createMarkupCode() {
		MarkupCodeImpl markupCode = new MarkupCodeImpl();
		return markupCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Combine createCombine() {
		CombineImpl combine = new CombineImpl();
		return combine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlObjectiveSelection createControlObjectiveSelection() {
		ControlObjectiveSelectionImpl controlObjectiveSelection = new ControlObjectiveSelectionImpl();
		return controlObjectiveSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSelection createControlSelection() {
		ControlSelectionImpl controlSelection = new ControlSelectionImpl();
		return controlSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Custom createCustom() {
		CustomImpl custom = new CustomImpl();
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLogEntry createRiskLogEntry() {
		RiskLogEntryImpl riskLogEntry = new RiskLogEntryImpl();
		return riskLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentLogEntry createAssessmentLogEntry() {
		AssessmentLogEntryImpl assessmentLogEntry = new AssessmentLogEntryImpl();
		return assessmentLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Export createExport() {
		ExportImpl export = new ExportImpl();
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalId createExternalId() {
		ExternalIdImpl externalId = new ExternalIdImpl();
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facet createFacet() {
		FacetImpl facet = new FacetImpl();
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flat createFlat() {
		FlatImpl flat = new FlatImpl();
		return flat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiedSubject createIdentifiedSubject() {
		IdentifiedSubjectImpl identifiedSubject = new IdentifiedSubjectImpl();
		return identifiedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupImage createMarkupImage() {
		MarkupImageImpl markupImage = new MarkupImageImpl();
		return markupImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementedComponent createImplementedComponent() {
		ImplementedComponentImpl implementedComponent = new ImplementedComponentImpl();
		return implementedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationType createInformationType() {
		InformationTypeImpl informationType = new InformationTypeImpl();
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inherited createInherited() {
		InheritedImpl inherited = new InheritedImpl();
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineMarkup createInlineMarkup() {
		InlineMarkupImpl inlineMarkup = new InlineMarkupImpl();
		return inlineMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupInsert createMarkupInsert() {
		MarkupInsertImpl markupInsert = new MarkupInsertImpl();
		return markupInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeveragedAuthorization createLeveragedAuthorization() {
		LeveragedAuthorizationImpl leveragedAuthorization = new LeveragedAuthorizationImpl();
		return leveragedAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupListItem createMarkupListItem() {
		MarkupListItemImpl markupListItem = new MarkupListItemImpl();
		return markupListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupList createMarkupList() {
		MarkupListImpl markupList = new MarkupListImpl();
		return markupList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultLocalDefinitions createResultLocalDefinitions() {
		ResultLocalDefinitionsImpl resultLocalDefinitions = new ResultLocalDefinitionsImpl();
		return resultLocalDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentResultsLocalDefinitions createAssessmentResultsLocalDefinitions() {
		AssessmentResultsLocalDefinitionsImpl assessmentResultsLocalDefinitions = new AssessmentResultsLocalDefinitionsImpl();
		return assessmentResultsLocalDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentPlanLocalDefinitions createAssessmentPlanLocalDefinitions() {
		AssessmentPlanLocalDefinitionsImpl assessmentPlanLocalDefinitions = new AssessmentPlanLocalDefinitionsImpl();
		return assessmentPlanLocalDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype createMarkupLineDatatype() {
		MarkupLineDatatypeImpl markupLineDatatype = new MarkupLineDatatypeImpl();
		return markupLineDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype createMarkupMultilineDatatype() {
		MarkupMultilineDatatypeImpl markupMultilineDatatype = new MarkupMultilineDatatypeImpl();
		return markupMultilineDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MitigatingFactor createMitigatingFactor() {
		MitigatingFactorImpl mitigatingFactor = new MitigatingFactorImpl();
		return mitigatingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnDate createOnDate() {
		OnDateImpl onDate = new OnDateImpl();
		return onDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupOrderedList createMarkupOrderedList() {
		MarkupOrderedListImpl markupOrderedList = new MarkupOrderedListImpl();
		return markupOrderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoamItemOrigin createPoamItemOrigin() {
		PoamItemOriginImpl poamItemOrigin = new PoamItemOriginImpl();
		return poamItemOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentPlan createAssessmentPlan() {
		AssessmentPlanImpl assessmentPlan = new AssessmentPlanImpl();
		return assessmentPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentResults createAssessmentResults() {
		AssessmentResultsImpl assessmentResults = new AssessmentResultsImpl();
		return assessmentResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportAp createImportAp() {
		ImportApImpl importAp = new ImportApImpl();
		return importAp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAssets createAssessmentAssets() {
		AssessmentAssetsImpl assessmentAssets = new AssessmentAssetsImpl();
		return assessmentAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentMethod createAssessmentMethod() {
		AssessmentMethodImpl assessmentMethod = new AssessmentMethodImpl();
		return assessmentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentPart createAssessmentPart() {
		AssessmentPartImpl assessmentPart = new AssessmentPartImpl();
		return assessmentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSubject createAssessmentSubject() {
		AssessmentSubjectImpl assessmentSubject = new AssessmentSubjectImpl();
		return assessmentSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSubjectPlaceholder createAssessmentSubjectPlaceholder() {
		AssessmentSubjectPlaceholderImpl assessmentSubjectPlaceholder = new AssessmentSubjectPlaceholderImpl();
		return assessmentSubjectPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociatedRisk createAssociatedRisk() {
		AssociatedRiskImpl associatedRisk = new AssociatedRiskImpl();
		return associatedRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Characterization createCharacterization() {
		CharacterizationImpl characterization = new CharacterizationImpl();
		return characterization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finding createFinding() {
		FindingImpl finding = new FindingImpl();
		return finding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingTarget createFindingTarget() {
		FindingTargetImpl findingTarget = new FindingTargetImpl();
		return findingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportSsp createImportSsp() {
		ImportSspImpl importSsp = new ImportSspImpl();
		return importSsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalObjective createLocalObjective() {
		LocalObjectiveImpl localObjective = new LocalObjectiveImpl();
		return localObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggedBy createLoggedBy() {
		LoggedByImpl loggedBy = new LoggedByImpl();
		return loggedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OriginActor createOriginActor() {
		OriginActorImpl originActor = new OriginActorImpl();
		return originActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Origin createOrigin() {
		OriginImpl origin = new OriginImpl();
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedObservation createRelatedObservation() {
		RelatedObservationImpl relatedObservation = new RelatedObservationImpl();
		return relatedObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedTask createRelatedTask() {
		RelatedTaskImpl relatedTask = new RelatedTaskImpl();
		return relatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewedControls createReviewedControls() {
		ReviewedControlsImpl reviewedControls = new ReviewedControlsImpl();
		return reviewedControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Risk createRisk() {
		RiskImpl risk = new RiskImpl();
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSelectControlById createAssessmentSelectControlById() {
		AssessmentSelectControlByIdImpl assessmentSelectControlById = new AssessmentSelectControlByIdImpl();
		return assessmentSelectControlById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectObjectiveById createSelectObjectiveById() {
		SelectObjectiveByIdImpl selectObjectiveById = new SelectObjectiveByIdImpl();
		return selectObjectiveById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectSubjectById createSelectSubjectById() {
		SelectSubjectByIdImpl selectSubjectById = new SelectSubjectByIdImpl();
		return selectSubjectById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectReference createSubjectReference() {
		SubjectReferenceImpl subjectReference = new SubjectReferenceImpl();
		return subjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatId createThreatId() {
		ThreatIdImpl threatId = new ThreatIdImpl();
		return threatId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogGroup createCatalogGroup() {
		CatalogGroupImpl catalogGroup = new CatalogGroupImpl();
		return catalogGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition createComponentDefinition() {
		ComponentDefinitionImpl componentDefinition = new ComponentDefinitionImpl();
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentControlImplementation createComponentControlImplementation() {
		ComponentControlImplementationImpl componentControlImplementation = new ComponentControlImplementationImpl();
		return componentControlImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinedComponent createDefinedComponent() {
		DefinedComponentImpl definedComponent = new DefinedComponentImpl();
		return definedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementedRequirement createComponentImplementedRequirement() {
		ComponentImplementedRequirementImpl componentImplementedRequirement = new ComponentImplementedRequirementImpl();
		return componentImplementedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportComponentDefinition createImportComponentDefinition() {
		ImportComponentDefinitionImpl importComponentDefinition = new ImportComponentDefinitionImpl();
		return importComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncorporatesComponent createIncorporatesComponent() {
		IncorporatesComponentImpl incorporatesComponent = new IncorporatesComponentImpl();
		return incorporatesComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentStatement createComponentStatement() {
		ComponentStatementImpl componentStatement = new ComponentStatementImpl();
		return componentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncludeAll createIncludeAll() {
		IncludeAllImpl includeAll = new IncludeAllImpl();
		return includeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matching createMatching() {
		MatchingImpl matching = new MatchingImpl();
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterConstraint createParameterConstraint() {
		ParameterConstraintImpl parameterConstraint = new ParameterConstraintImpl();
		return parameterConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterGuideline createParameterGuideline() {
		ParameterGuidelineImpl parameterGuideline = new ParameterGuidelineImpl();
		return parameterGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSelection createParameterSelection() {
		ParameterSelectionImpl parameterSelection = new ParameterSelectionImpl();
		return parameterSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSelectControlById createControlSelectControlById() {
		ControlSelectControlByIdImpl controlSelectControlById = new ControlSelectControlByIdImpl();
		return controlSelectControlById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizedPrivilege createAuthorizedPrivilege() {
		AuthorizedPrivilegeImpl authorizedPrivilege = new AuthorizedPrivilegeImpl();
		return authorizedPrivilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationStatus createImplementationStatus() {
		ImplementationStatusImpl implementationStatus = new ImplementationStatusImpl();
		return implementationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem createInventoryItem() {
		InventoryItemImpl inventoryItem = new InventoryItemImpl();
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortRange createPortRange() {
		PortRangeImpl portRange = new PortRangeImpl();
		return portRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetParameter createSetParameter() {
		SetParameterImpl setParameter = new SetParameterImpl();
		return setParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponent createSystemComponent() {
		SystemComponentImpl systemComponent = new SystemComponentImpl();
		return systemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemId createSystemId() {
		SystemIdImpl systemId = new SystemIdImpl();
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemUser createSystemUser() {
		SystemUserImpl systemUser = new SystemUserImpl();
		return systemUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceScore createConfidenceScore() {
		ConfidenceScoreImpl confidenceScore = new ConfidenceScoreImpl();
		return confidenceScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GapSummary createGapSummary() {
		GapSummaryImpl gapSummary = new GapSummaryImpl();
		return gapSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapEntry createMapEntry() {
		MapEntryImpl mapEntry = new MapEntryImpl();
		return mapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingItem createMappingItem() {
		MappingItemImpl mappingItem = new MappingItemImpl();
		return mappingItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingProvenance createMappingProvenance() {
		MappingProvenanceImpl mappingProvenance = new MappingProvenanceImpl();
		return mappingProvenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingResourceReference createMappingResourceReference() {
		MappingResourceReferenceImpl mappingResourceReference = new MappingResourceReferenceImpl();
		return mappingResourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifierItem createQualifierItem() {
		QualifierItemImpl qualifierItem = new QualifierItemImpl();
		return qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingCollection createMappingCollection() {
		MappingCollectionImpl mappingCollection = new MappingCollectionImpl();
		return mappingCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter createBackMatter() {
		BackMatterImpl backMatter = new BackMatterImpl();
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentId createDocumentId() {
		DocumentIdImpl documentId = new DocumentIdImpl();
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hash createHash() {
		HashImpl hash = new HashImpl();
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibleParty createResponsibleParty() {
		ResponsiblePartyImpl responsibleParty = new ResponsiblePartyImpl();
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibleRole createResponsibleRole() {
		ResponsibleRoleImpl responsibleRole = new ResponsibleRoleImpl();
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelephoneNumber createTelephoneNumber() {
		TelephoneNumberImpl telephoneNumber = new TelephoneNumberImpl();
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoamLocalDefinitions createPoamLocalDefinitions() {
		PoamLocalDefinitionsImpl poamLocalDefinitions = new PoamLocalDefinitionsImpl();
		return poamLocalDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfActionAndMilestones createPlanOfActionAndMilestones() {
		PlanOfActionAndMilestonesImpl planOfActionAndMilestones = new PlanOfActionAndMilestonesImpl();
		return planOfActionAndMilestones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoamItem createPoamItem() {
		PoamItemImpl poamItem = new PoamItemImpl();
		return poamItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileGroup createProfileGroup() {
		ProfileGroupImpl profileGroup = new ProfileGroupImpl();
		return profileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertControls createInsertControls() {
		InsertControlsImpl insertControls = new InsertControlsImpl();
		return insertControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merge createMerge() {
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modify createModify() {
		ModifyImpl modify = new ModifyImpl();
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationBoundary createAuthorizationBoundary() {
		AuthorizationBoundaryImpl authorizationBoundary = new AuthorizationBoundaryImpl();
		return authorizationBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ByComponent createByComponent() {
		ByComponentImpl byComponent = new ByComponentImpl();
		return byComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SspControlImplementation createSspControlImplementation() {
		SspControlImplementationImpl sspControlImplementation = new SspControlImplementationImpl();
		return sspControlImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Impact createImpact() {
		ImpactImpl impact = new ImpactImpl();
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SspImplementedRequirement createSspImplementedRequirement() {
		SspImplementedRequirementImpl sspImplementedRequirement = new SspImplementedRequirementImpl();
		return sspImplementedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportProfile createImportProfile() {
		ImportProfileImpl importProfile = new ImportProfileImpl();
		return importProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkArchitecture createNetworkArchitecture() {
		NetworkArchitectureImpl networkArchitecture = new NetworkArchitectureImpl();
		return networkArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityImpactLevel createSecurityImpactLevel() {
		SecurityImpactLevelImpl securityImpactLevel = new SecurityImpactLevelImpl();
		return securityImpactLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SspStatement createSspStatement() {
		SspStatementImpl sspStatement = new SspStatementImpl();
		return sspStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStatus createSystemStatus() {
		SystemStatusImpl systemStatus = new SystemStatusImpl();
		return systemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemCharacteristics createSystemCharacteristics() {
		SystemCharacteristicsImpl systemCharacteristics = new SystemCharacteristicsImpl();
		return systemCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemImplementation createSystemImplementation() {
		SystemImplementationImpl systemImplementation = new SystemImplementationImpl();
		return systemImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInformation createSystemInformation() {
		SystemInformationImpl systemInformation = new SystemInformationImpl();
		return systemInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemSecurityPlan createSystemSecurityPlan() {
		SystemSecurityPlanImpl systemSecurityPlan = new SystemSecurityPlanImpl();
		return systemSecurityPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupPreformatted createMarkupPreformatted() {
		MarkupPreformattedImpl markupPreformatted = new MarkupPreformattedImpl();
		return markupPreformatted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provided createProvided() {
		ProvidedImpl provided = new ProvidedImpl();
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedFinding createRelatedFinding() {
		RelatedFindingImpl relatedFinding = new RelatedFindingImpl();
		return relatedFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedResponse createRelatedResponse() {
		RelatedResponseImpl relatedResponse = new RelatedResponseImpl();
		return relatedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelevantEvidence createRelevantEvidence() {
		RelevantEvidenceImpl relevantEvidence = new RelevantEvidenceImpl();
		return relevantEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Remove createRemove() {
		RemoveImpl remove = new RemoveImpl();
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredAsset createRequiredAsset() {
		RequiredAssetImpl requiredAsset = new RequiredAssetImpl();
		return requiredAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatterResource createBackMatterResource() {
		BackMatterResourceImpl backMatterResource = new BackMatterResourceImpl();
		return backMatterResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responsibility createResponsibility() {
		ResponsibilityImpl responsibility = new ResponsibilityImpl();
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revisions createRevisions() {
		RevisionsImpl revisions = new RevisionsImpl();
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLog createRiskLog() {
		RiskLogImpl riskLog = new RiskLogImpl();
		return riskLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rlink createRlink() {
		RlinkImpl rlink = new RlinkImpl();
		return rlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Satisfied createSatisfied() {
		SatisfiedImpl satisfied = new SatisfiedImpl();
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileSetParameter createProfileSetParameter() {
		ProfileSetParameterImpl profileSetParameter = new ProfileSetParameterImpl();
		return profileSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaceholderSource createPlaceholderSource() {
		PlaceholderSourceImpl placeholderSource = new PlaceholderSourceImpl();
		return placeholderSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingTargetStatus createFindingTargetStatus() {
		FindingTargetStatusImpl findingTargetStatus = new FindingTargetStatusImpl();
		return findingTargetStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponentStatus createSystemComponentStatus() {
		SystemComponentStatusImpl systemComponentStatus = new SystemComponentStatusImpl();
		return systemComponentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupTableCell createMarkupTableCell() {
		MarkupTableCellImpl markupTableCell = new MarkupTableCellImpl();
		return markupTableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupTableRow createMarkupTableRow() {
		MarkupTableRowImpl markupTableRow = new MarkupTableRowImpl();
		return markupTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupTable createMarkupTable() {
		MarkupTableImpl markupTable = new MarkupTableImpl();
		return markupTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermsAndConditions createTermsAndConditions() {
		TermsAndConditionsImpl termsAndConditions = new TermsAndConditionsImpl();
		return termsAndConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintTest createConstraintTest() {
		ConstraintTestImpl constraintTest = new ConstraintTestImpl();
		return constraintTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsesComponent createUsesComponent() {
		UsesComponentImpl usesComponent = new UsesComponentImpl();
		return usesComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WithinDateRange createWithinDateRange() {
		WithinDateRangeImpl withinDateRange = new WithinDateRangeImpl();
		return withinDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(OSCALPackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(OSCALPackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createAsIsTypeFromString(EDataType eDataType, String initialValue) {
		return createBooleanDatatypeFromString(OSCALPackage.eINSTANCE.getBooleanDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAsIsTypeToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanDatatypeToString(OSCALPackage.eINSTANCE.getBooleanDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createAsIsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAsIsTypeFromString(OSCALPackage.eINSTANCE.getAsIsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAsIsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAsIsTypeToString(OSCALPackage.eINSTANCE.getAsIsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64DatatypeFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64DatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanDatatypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanDatatypeFromString(OSCALPackage.eINSTANCE.getBooleanDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanDatatypeToString(OSCALPackage.eINSTANCE.getBooleanDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCategoryTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCityTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCityTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createCollectedTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectedTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCountryTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateDatatypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeDatatypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeWithTimezoneDatatypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeWithTimezoneDatatypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDeadlineTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeadlineTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalDatatypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmailAddressDatatypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailAddressDatatypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createEndTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createEndType1FromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndType1ToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createEndType2FromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndType2ToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createExpiresTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpiresTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpressionTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImplementationStatementUuidTypeFromString(EDataType eDataType, String initialValue) {
		return createUUIDDatatypeFromString(OSCALPackage.eINSTANCE.getUUIDDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationStatementUuidTypeToString(EDataType eDataType, Object instanceValue) {
		return convertUUIDDatatypeToString(OSCALPackage.eINSTANCE.getUUIDDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInformationTypeIdTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInformationTypeIdTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMemberOfOrganizationTypeFromString(EDataType eDataType, String initialValue) {
		return createUUIDDatatypeFromString(OSCALPackage.eINSTANCE.getUUIDDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberOfOrganizationTypeToString(EDataType eDataType, Object instanceValue) {
		return convertUUIDDatatypeToString(OSCALPackage.eINSTANCE.getUUIDDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMethodTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNonNegativeIntegerDatatypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalAssessmentCommonRiskStatusFIELDFromString(EDataType eDataType, String initialValue) {
		return createTokenDatatypeFromString(OSCALPackage.eINSTANCE.getTokenDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalAssessmentCommonRiskStatusFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertTokenDatatypeToString(OSCALPackage.eINSTANCE.getTokenDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalControlCommonParameterValueFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalControlCommonParameterValueFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalControlCommonWithIdFIELDFromString(EDataType eDataType, String initialValue) {
		return createTokenDatatypeFromString(OSCALPackage.eINSTANCE.getTokenDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalControlCommonWithIdFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertTokenDatatypeToString(OSCALPackage.eINSTANCE.getTokenDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalImplementationCommonFunctionPerformedFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalImplementationCommonFunctionPerformedFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createOscalMappingCommonPercentageFIELDFromString(EDataType eDataType, String initialValue) {
		return createDecimalDatatypeFromString(OSCALPackage.eINSTANCE.getDecimalDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMappingCommonPercentageFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertDecimalDatatypeToString(OSCALPackage.eINSTANCE.getDecimalDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataAddrLineFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataAddrLineFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataEmailAddressFIELDFromString(EDataType eDataType, String initialValue) {
		return createEmailAddressDatatypeFromString(OSCALPackage.eINSTANCE.getEmailAddressDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataEmailAddressFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertEmailAddressDatatypeToString(OSCALPackage.eINSTANCE.getEmailAddressDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createOscalMetadataLastModifiedFIELDFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataLastModifiedFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataLocationUuidFIELDFromString(EDataType eDataType, String initialValue) {
		return createUUIDDatatypeFromString(OSCALPackage.eINSTANCE.getUUIDDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataLocationUuidFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertUUIDDatatypeToString(OSCALPackage.eINSTANCE.getUUIDDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataOscalVersionFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataOscalVersionFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataPartyUuidFIELDFromString(EDataType eDataType, String initialValue) {
		return createUUIDDatatypeFromString(OSCALPackage.eINSTANCE.getUUIDDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataPartyUuidFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertUUIDDatatypeToString(OSCALPackage.eINSTANCE.getUUIDDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createOscalMetadataPublishedFIELDFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataPublishedFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataRoleIdFIELDFromString(EDataType eDataType, String initialValue) {
		return createTokenDatatypeFromString(OSCALPackage.eINSTANCE.getTokenDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataRoleIdFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertTokenDatatypeToString(OSCALPackage.eINSTANCE.getTokenDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalMetadataVersionFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalMetadataVersionFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalSspBaseFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalSspBaseFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createOscalSspDateAuthorizedFIELDFromString(EDataType eDataType, String initialValue) {
		return createDateDatatypeFromString(OSCALPackage.eINSTANCE.getDateDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalSspDateAuthorizedFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertDateDatatypeToString(OSCALPackage.eINSTANCE.getDateDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOscalSspSelectedFIELDFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscalSspSelectedFIELDToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPartyUuidTypeFromString(EDataType eDataType, String initialValue) {
		return createUUIDDatatypeFromString(OSCALPackage.eINSTANCE.getUUIDDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartyUuidTypeToString(EDataType eDataType, Object instanceValue) {
		return convertUUIDDatatypeToString(OSCALPackage.eINSTANCE.getUUIDDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntegerDatatypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPostalCodeTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostalCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		return createTokenDatatypeFromString(OSCALPackage.eINSTANCE.getTokenDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return convertTokenDatatypeToString(OSCALPackage.eINSTANCE.getTokenDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSecurityObjectiveAvailabilityTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityObjectiveAvailabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSecurityObjectiveConfidentialityTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityObjectiveConfidentialityTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSecurityObjectiveIntegrityTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityObjectiveIntegrityTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSecuritySensitivityLevelTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuritySensitivityLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShortNameTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortNameTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShortNameType1FromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortNameType1ToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShortNameType2FromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortNameType2ToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createStartTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createStartType1FromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartType1ToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createStartType2FromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTimezoneDatatypeFromString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartType2ToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTimezoneDatatypeToString(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStatementIdTypeFromString(EDataType eDataType, String initialValue) {
		return createTokenDatatypeFromString(OSCALPackage.eINSTANCE.getTokenDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatementIdTypeToString(EDataType eDataType, Object instanceValue) {
		return convertTokenDatatypeToString(OSCALPackage.eINSTANCE.getTokenDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStateTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSystemNameShortTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemNameShortTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSystemNameTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemNameTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTokenDatatypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenDatatypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeTypeFromString(EDataType eDataType, String initialValue) {
		return createTokenDatatypeFromString(OSCALPackage.eINSTANCE.getTokenDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertTokenDatatypeToString(OSCALPackage.eINSTANCE.getTokenDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURIDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURIReferenceDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIReferenceDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlTypeFromString(EDataType eDataType, String initialValue) {
		return createURIDatatypeFromString(OSCALPackage.eINSTANCE.getURIDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlTypeToString(EDataType eDataType, Object instanceValue) {
		return convertURIDatatypeToString(OSCALPackage.eINSTANCE.getURIDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUUIDDatatypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDDatatypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createValueTypeFromString(EDataType eDataType, String initialValue) {
		return createStringDatatypeFromString(OSCALPackage.eINSTANCE.getStringDatatype(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
		return convertStringDatatypeToString(OSCALPackage.eINSTANCE.getStringDatatype(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSCALPackage getOSCALPackage() {
		return (OSCALPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OSCALPackage getPackage() {
		return OSCALPackage.eINSTANCE;
	}

} //OSCALFactoryImpl
