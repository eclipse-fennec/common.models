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

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gov.nist.csrc.ns.oscal.OSCALPackage
 * @generated
 */
public class OSCALValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OSCALValidator INSTANCE = new OSCALValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gov.nist.csrc.ns.oscal";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCALValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OSCALPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OSCALPackage.ADD:
				return validateAdd((Add)value, diagnostics, context);
			case OSCALPackage.ALTER:
				return validateAlter((Alter)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_LOG:
				return validateAssessmentLog((AssessmentLog)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_PLATFORM:
				return validateAssessmentPlatform((AssessmentPlatform)value, diagnostics, context);
			case OSCALPackage.ASSOCIATED_ACTIVITY:
				return validateAssociatedActivity((AssociatedActivity)value, diagnostics, context);
			case OSCALPackage.AT_FREQUENCY:
				return validateAtFrequency((AtFrequency)value, diagnostics, context);
			case OSCALPackage.ATTESTATION:
				return validateAttestation((Attestation)value, diagnostics, context);
			case OSCALPackage.BASE64:
				return validateBase64((Base64)value, diagnostics, context);
			case OSCALPackage.CATEGORIZATION:
				return validateCategorization((Categorization)value, diagnostics, context);
			case OSCALPackage.CITATION:
				return validateCitation((Citation)value, diagnostics, context);
			case OSCALPackage.COMBINE:
				return validateCombine((Combine)value, diagnostics, context);
			case OSCALPackage.CONTROL_OBJECTIVE_SELECTION:
				return validateControlObjectiveSelection((ControlObjectiveSelection)value, diagnostics, context);
			case OSCALPackage.CONTROL_SELECTION:
				return validateControlSelection((ControlSelection)value, diagnostics, context);
			case OSCALPackage.CUSTOM:
				return validateCustom((Custom)value, diagnostics, context);
			case OSCALPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case OSCALPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OSCALPackage.RISK_LOG_ENTRY:
				return validateRiskLogEntry((RiskLogEntry)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_LOG_ENTRY:
				return validateAssessmentLogEntry((AssessmentLogEntry)value, diagnostics, context);
			case OSCALPackage.EXPORT:
				return validateExport((Export)value, diagnostics, context);
			case OSCALPackage.EXTERNAL_ID:
				return validateExternalId((ExternalId)value, diagnostics, context);
			case OSCALPackage.FACET:
				return validateFacet((Facet)value, diagnostics, context);
			case OSCALPackage.FLAT:
				return validateFlat((Flat)value, diagnostics, context);
			case OSCALPackage.IDENTIFIED_SUBJECT:
				return validateIdentifiedSubject((IdentifiedSubject)value, diagnostics, context);
			case OSCALPackage.IMPLEMENTED_COMPONENT:
				return validateImplementedComponent((ImplementedComponent)value, diagnostics, context);
			case OSCALPackage.INFORMATION_TYPE:
				return validateInformationType((InformationType)value, diagnostics, context);
			case OSCALPackage.INHERITED:
				return validateInherited((Inherited)value, diagnostics, context);
			case OSCALPackage.LEVERAGED_AUTHORIZATION:
				return validateLeveragedAuthorization((LeveragedAuthorization)value, diagnostics, context);
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS:
				return validateResultLocalDefinitions((ResultLocalDefinitions)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS:
				return validateAssessmentResultsLocalDefinitions((AssessmentResultsLocalDefinitions)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_PLAN_LOCAL_DEFINITIONS:
				return validateAssessmentPlanLocalDefinitions((AssessmentPlanLocalDefinitions)value, diagnostics, context);
			case OSCALPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case OSCALPackage.MITIGATING_FACTOR:
				return validateMitigatingFactor((MitigatingFactor)value, diagnostics, context);
			case OSCALPackage.ON_DATE:
				return validateOnDate((OnDate)value, diagnostics, context);
			case OSCALPackage.POAM_ITEM_ORIGIN:
				return validatePoamItemOrigin((PoamItemOrigin)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_PLAN:
				return validateAssessmentPlan((AssessmentPlan)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_RESULTS:
				return validateAssessmentResults((AssessmentResults)value, diagnostics, context);
			case OSCALPackage.IMPORT_AP:
				return validateImportAp((ImportAp)value, diagnostics, context);
			case OSCALPackage.RESULT:
				return validateResult((Result)value, diagnostics, context);
			case OSCALPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_ASSETS:
				return validateAssessmentAssets((AssessmentAssets)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_METHOD:
				return validateAssessmentMethod((AssessmentMethod)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_PART:
				return validateAssessmentPart((AssessmentPart)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_SUBJECT:
				return validateAssessmentSubject((AssessmentSubject)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_SUBJECT_PLACEHOLDER:
				return validateAssessmentSubjectPlaceholder((AssessmentSubjectPlaceholder)value, diagnostics, context);
			case OSCALPackage.ASSOCIATED_RISK:
				return validateAssociatedRisk((AssociatedRisk)value, diagnostics, context);
			case OSCALPackage.CHARACTERIZATION:
				return validateCharacterization((Characterization)value, diagnostics, context);
			case OSCALPackage.FINDING:
				return validateFinding((Finding)value, diagnostics, context);
			case OSCALPackage.FINDING_TARGET:
				return validateFindingTarget((FindingTarget)value, diagnostics, context);
			case OSCALPackage.IMPORT_SSP:
				return validateImportSsp((ImportSsp)value, diagnostics, context);
			case OSCALPackage.LOCAL_OBJECTIVE:
				return validateLocalObjective((LocalObjective)value, diagnostics, context);
			case OSCALPackage.LOGGED_BY:
				return validateLoggedBy((LoggedBy)value, diagnostics, context);
			case OSCALPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case OSCALPackage.ORIGIN_ACTOR:
				return validateOriginActor((OriginActor)value, diagnostics, context);
			case OSCALPackage.ORIGIN:
				return validateOrigin((Origin)value, diagnostics, context);
			case OSCALPackage.RELATED_OBSERVATION:
				return validateRelatedObservation((RelatedObservation)value, diagnostics, context);
			case OSCALPackage.RELATED_TASK:
				return validateRelatedTask((RelatedTask)value, diagnostics, context);
			case OSCALPackage.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case OSCALPackage.REVIEWED_CONTROLS:
				return validateReviewedControls((ReviewedControls)value, diagnostics, context);
			case OSCALPackage.RISK:
				return validateRisk((Risk)value, diagnostics, context);
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID:
				return validateAssessmentSelectControlById((AssessmentSelectControlById)value, diagnostics, context);
			case OSCALPackage.SELECT_OBJECTIVE_BY_ID:
				return validateSelectObjectiveById((SelectObjectiveById)value, diagnostics, context);
			case OSCALPackage.SELECT_SUBJECT_BY_ID:
				return validateSelectSubjectById((SelectSubjectById)value, diagnostics, context);
			case OSCALPackage.SUBJECT_REFERENCE:
				return validateSubjectReference((SubjectReference)value, diagnostics, context);
			case OSCALPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case OSCALPackage.THREAT_ID:
				return validateThreatId((ThreatId)value, diagnostics, context);
			case OSCALPackage.CATALOG:
				return validateCatalog((Catalog)value, diagnostics, context);
			case OSCALPackage.CONTROL:
				return validateControl((Control)value, diagnostics, context);
			case OSCALPackage.CATALOG_GROUP:
				return validateCatalogGroup((CatalogGroup)value, diagnostics, context);
			case OSCALPackage.CAPABILITY:
				return validateCapability((Capability)value, diagnostics, context);
			case OSCALPackage.COMPONENT_DEFINITION:
				return validateComponentDefinition((ComponentDefinition)value, diagnostics, context);
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION:
				return validateComponentControlImplementation((ComponentControlImplementation)value, diagnostics, context);
			case OSCALPackage.DEFINED_COMPONENT:
				return validateDefinedComponent((DefinedComponent)value, diagnostics, context);
			case OSCALPackage.COMPONENT_IMPLEMENTED_REQUIREMENT:
				return validateComponentImplementedRequirement((ComponentImplementedRequirement)value, diagnostics, context);
			case OSCALPackage.IMPORT_COMPONENT_DEFINITION:
				return validateImportComponentDefinition((ImportComponentDefinition)value, diagnostics, context);
			case OSCALPackage.INCORPORATES_COMPONENT:
				return validateIncorporatesComponent((IncorporatesComponent)value, diagnostics, context);
			case OSCALPackage.COMPONENT_STATEMENT:
				return validateComponentStatement((ComponentStatement)value, diagnostics, context);
			case OSCALPackage.INCLUDE_ALL:
				return validateIncludeAll((IncludeAll)value, diagnostics, context);
			case OSCALPackage.MATCHING:
				return validateMatching((Matching)value, diagnostics, context);
			case OSCALPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case OSCALPackage.PARAMETER_CONSTRAINT:
				return validateParameterConstraint((ParameterConstraint)value, diagnostics, context);
			case OSCALPackage.PARAMETER_GUIDELINE:
				return validateParameterGuideline((ParameterGuideline)value, diagnostics, context);
			case OSCALPackage.PARAMETER_SELECTION:
				return validateParameterSelection((ParameterSelection)value, diagnostics, context);
			case OSCALPackage.PART:
				return validatePart((Part)value, diagnostics, context);
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID:
				return validateControlSelectControlById((ControlSelectControlById)value, diagnostics, context);
			case OSCALPackage.AUTHORIZED_PRIVILEGE:
				return validateAuthorizedPrivilege((AuthorizedPrivilege)value, diagnostics, context);
			case OSCALPackage.IMPLEMENTATION_STATUS:
				return validateImplementationStatus((ImplementationStatus)value, diagnostics, context);
			case OSCALPackage.INVENTORY_ITEM:
				return validateInventoryItem((InventoryItem)value, diagnostics, context);
			case OSCALPackage.PORT_RANGE:
				return validatePortRange((PortRange)value, diagnostics, context);
			case OSCALPackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case OSCALPackage.SET_PARAMETER:
				return validateSetParameter((SetParameter)value, diagnostics, context);
			case OSCALPackage.SYSTEM_COMPONENT:
				return validateSystemComponent((SystemComponent)value, diagnostics, context);
			case OSCALPackage.SYSTEM_ID:
				return validateSystemId((SystemId)value, diagnostics, context);
			case OSCALPackage.SYSTEM_USER:
				return validateSystemUser((SystemUser)value, diagnostics, context);
			case OSCALPackage.CONFIDENCE_SCORE:
				return validateConfidenceScore((ConfidenceScore)value, diagnostics, context);
			case OSCALPackage.COVERAGE:
				return validateCoverage((Coverage)value, diagnostics, context);
			case OSCALPackage.GAP_SUMMARY:
				return validateGapSummary((GapSummary)value, diagnostics, context);
			case OSCALPackage.MAP_ENTRY:
				return validateMapEntry((MapEntry)value, diagnostics, context);
			case OSCALPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case OSCALPackage.MAPPING_ITEM:
				return validateMappingItem((MappingItem)value, diagnostics, context);
			case OSCALPackage.MAPPING_PROVENANCE:
				return validateMappingProvenance((MappingProvenance)value, diagnostics, context);
			case OSCALPackage.MAPPING_RESOURCE_REFERENCE:
				return validateMappingResourceReference((MappingResourceReference)value, diagnostics, context);
			case OSCALPackage.QUALIFIER_ITEM:
				return validateQualifierItem((QualifierItem)value, diagnostics, context);
			case OSCALPackage.MAPPING_COLLECTION:
				return validateMappingCollection((MappingCollection)value, diagnostics, context);
			case OSCALPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case OSCALPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case OSCALPackage.BACK_MATTER:
				return validateBackMatter((BackMatter)value, diagnostics, context);
			case OSCALPackage.DOCUMENT_ID:
				return validateDocumentId((DocumentId)value, diagnostics, context);
			case OSCALPackage.HASH:
				return validateHash((Hash)value, diagnostics, context);
			case OSCALPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case OSCALPackage.METADATA:
				return validateMetadata((Metadata)value, diagnostics, context);
			case OSCALPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case OSCALPackage.RESPONSIBLE_PARTY:
				return validateResponsibleParty((ResponsibleParty)value, diagnostics, context);
			case OSCALPackage.RESPONSIBLE_ROLE:
				return validateResponsibleRole((ResponsibleRole)value, diagnostics, context);
			case OSCALPackage.TELEPHONE_NUMBER:
				return validateTelephoneNumber((TelephoneNumber)value, diagnostics, context);
			case OSCALPackage.POAM_LOCAL_DEFINITIONS:
				return validatePoamLocalDefinitions((PoamLocalDefinitions)value, diagnostics, context);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES:
				return validatePlanOfActionAndMilestones((PlanOfActionAndMilestones)value, diagnostics, context);
			case OSCALPackage.POAM_ITEM:
				return validatePoamItem((PoamItem)value, diagnostics, context);
			case OSCALPackage.PROFILE_GROUP:
				return validateProfileGroup((ProfileGroup)value, diagnostics, context);
			case OSCALPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case OSCALPackage.INSERT_CONTROLS:
				return validateInsertControls((InsertControls)value, diagnostics, context);
			case OSCALPackage.MERGE:
				return validateMerge((Merge)value, diagnostics, context);
			case OSCALPackage.MODIFY:
				return validateModify((Modify)value, diagnostics, context);
			case OSCALPackage.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case OSCALPackage.AUTHORIZATION_BOUNDARY:
				return validateAuthorizationBoundary((AuthorizationBoundary)value, diagnostics, context);
			case OSCALPackage.BY_COMPONENT:
				return validateByComponent((ByComponent)value, diagnostics, context);
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION:
				return validateSspControlImplementation((SspControlImplementation)value, diagnostics, context);
			case OSCALPackage.DATA_FLOW:
				return validateDataFlow((DataFlow)value, diagnostics, context);
			case OSCALPackage.DIAGRAM:
				return validateDiagram((Diagram)value, diagnostics, context);
			case OSCALPackage.IMPACT:
				return validateImpact((Impact)value, diagnostics, context);
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT:
				return validateSspImplementedRequirement((SspImplementedRequirement)value, diagnostics, context);
			case OSCALPackage.IMPORT_PROFILE:
				return validateImportProfile((ImportProfile)value, diagnostics, context);
			case OSCALPackage.NETWORK_ARCHITECTURE:
				return validateNetworkArchitecture((NetworkArchitecture)value, diagnostics, context);
			case OSCALPackage.SECURITY_IMPACT_LEVEL:
				return validateSecurityImpactLevel((SecurityImpactLevel)value, diagnostics, context);
			case OSCALPackage.SSP_STATEMENT:
				return validateSspStatement((SspStatement)value, diagnostics, context);
			case OSCALPackage.SYSTEM_STATUS:
				return validateSystemStatus((SystemStatus)value, diagnostics, context);
			case OSCALPackage.SYSTEM_CHARACTERISTICS:
				return validateSystemCharacteristics((SystemCharacteristics)value, diagnostics, context);
			case OSCALPackage.SYSTEM_IMPLEMENTATION:
				return validateSystemImplementation((SystemImplementation)value, diagnostics, context);
			case OSCALPackage.SYSTEM_INFORMATION:
				return validateSystemInformation((SystemInformation)value, diagnostics, context);
			case OSCALPackage.SYSTEM_SECURITY_PLAN:
				return validateSystemSecurityPlan((SystemSecurityPlan)value, diagnostics, context);
			case OSCALPackage.PARTY:
				return validateParty((Party)value, diagnostics, context);
			case OSCALPackage.PROVIDED:
				return validateProvided((Provided)value, diagnostics, context);
			case OSCALPackage.RELATED_FINDING:
				return validateRelatedFinding((RelatedFinding)value, diagnostics, context);
			case OSCALPackage.RELATED_RESPONSE:
				return validateRelatedResponse((RelatedResponse)value, diagnostics, context);
			case OSCALPackage.RELEVANT_EVIDENCE:
				return validateRelevantEvidence((RelevantEvidence)value, diagnostics, context);
			case OSCALPackage.REMOVE:
				return validateRemove((Remove)value, diagnostics, context);
			case OSCALPackage.REQUIRED_ASSET:
				return validateRequiredAsset((RequiredAsset)value, diagnostics, context);
			case OSCALPackage.BACK_MATTER_RESOURCE:
				return validateBackMatterResource((BackMatterResource)value, diagnostics, context);
			case OSCALPackage.RESPONSIBILITY:
				return validateResponsibility((Responsibility)value, diagnostics, context);
			case OSCALPackage.REVISION:
				return validateRevision((Revision)value, diagnostics, context);
			case OSCALPackage.RISK_LOG:
				return validateRiskLog((RiskLog)value, diagnostics, context);
			case OSCALPackage.RLINK:
				return validateRlink((Rlink)value, diagnostics, context);
			case OSCALPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case OSCALPackage.SATISFIED:
				return validateSatisfied((Satisfied)value, diagnostics, context);
			case OSCALPackage.PROFILE_SET_PARAMETER:
				return validateProfileSetParameter((ProfileSetParameter)value, diagnostics, context);
			case OSCALPackage.PLACEHOLDER_SOURCE:
				return validatePlaceholderSource((PlaceholderSource)value, diagnostics, context);
			case OSCALPackage.FINDING_TARGET_STATUS:
				return validateFindingTargetStatus((FindingTargetStatus)value, diagnostics, context);
			case OSCALPackage.SYSTEM_COMPONENT_STATUS:
				return validateSystemComponentStatus((SystemComponentStatus)value, diagnostics, context);
			case OSCALPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case OSCALPackage.TERMS_AND_CONDITIONS:
				return validateTermsAndConditions((TermsAndConditions)value, diagnostics, context);
			case OSCALPackage.CONSTRAINT_TEST:
				return validateConstraintTest((ConstraintTest)value, diagnostics, context);
			case OSCALPackage.TIMING:
				return validateTiming((Timing)value, diagnostics, context);
			case OSCALPackage.USES_COMPONENT:
				return validateUsesComponent((UsesComponent)value, diagnostics, context);
			case OSCALPackage.WITHIN_DATE_RANGE:
				return validateWithinDateRange((WithinDateRange)value, diagnostics, context);
			case OSCALPackage.AS_IS_TYPE:
				return validateAsIsType((Boolean)value, diagnostics, context);
			case OSCALPackage.AS_IS_TYPE_OBJECT:
				return validateAsIsTypeObject((Boolean)value, diagnostics, context);
			case OSCALPackage.BASE64_DATATYPE:
				return validateBase64Datatype((byte[])value, diagnostics, context);
			case OSCALPackage.BOOLEAN_DATATYPE:
				return validateBooleanDatatype((Boolean)value, diagnostics, context);
			case OSCALPackage.BOOLEAN_DATATYPE_OBJECT:
				return validateBooleanDatatypeObject((Boolean)value, diagnostics, context);
			case OSCALPackage.CATEGORY_TYPE:
				return validateCategoryType((String)value, diagnostics, context);
			case OSCALPackage.CITY_TYPE:
				return validateCityType((String)value, diagnostics, context);
			case OSCALPackage.COLLECTED_TYPE:
				return validateCollectedType((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.COUNTRY_TYPE:
				return validateCountryType((String)value, diagnostics, context);
			case OSCALPackage.DATE_DATATYPE:
				return validateDateDatatype((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.DATE_TIME_DATATYPE:
				return validateDateTimeDatatype((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.DATE_TIME_WITH_TIMEZONE_DATATYPE:
				return validateDateTimeWithTimezoneDatatype((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.DEADLINE_TYPE:
				return validateDeadlineType((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.DECIMAL_DATATYPE:
				return validateDecimalDatatype((BigDecimal)value, diagnostics, context);
			case OSCALPackage.EMAIL_ADDRESS_DATATYPE:
				return validateEmailAddressDatatype((String)value, diagnostics, context);
			case OSCALPackage.END_TYPE:
				return validateEndType((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.END_TYPE1:
				return validateEndType1((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.END_TYPE2:
				return validateEndType2((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.EXPIRES_TYPE:
				return validateExpiresType((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.EXPRESSION_TYPE:
				return validateExpressionType((String)value, diagnostics, context);
			case OSCALPackage.IMPLEMENTATION_STATEMENT_UUID_TYPE:
				return validateImplementationStatementUuidType((String)value, diagnostics, context);
			case OSCALPackage.INFORMATION_TYPE_ID_TYPE:
				return validateInformationTypeIdType((String)value, diagnostics, context);
			case OSCALPackage.MARKUP_LINE_DATATYPE:
				return validateMarkupLineDatatype((String)value, diagnostics, context);
			case OSCALPackage.MARKUP_MULTILINE_DATATYPE:
				return validateMarkupMultilineDatatype((String)value, diagnostics, context);
			case OSCALPackage.MEMBER_OF_ORGANIZATION_TYPE:
				return validateMemberOfOrganizationType((String)value, diagnostics, context);
			case OSCALPackage.METHOD_TYPE:
				return validateMethodType((String)value, diagnostics, context);
			case OSCALPackage.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case OSCALPackage.NON_NEGATIVE_INTEGER_DATATYPE:
				return validateNonNegativeIntegerDatatype((BigInteger)value, diagnostics, context);
			case OSCALPackage.OSCAL_ASSESSMENT_COMMON_RISK_STATUS_FIELD:
				return validateOscalAssessmentCommonRiskStatusFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_CONTROL_COMMON_PARAMETER_VALUE_FIELD:
				return validateOscalControlCommonParameterValueFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_CONTROL_COMMON_WITH_ID_FIELD:
				return validateOscalControlCommonWithIdFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_IMPLEMENTATION_COMMON_FUNCTION_PERFORMED_FIELD:
				return validateOscalImplementationCommonFunctionPerformedFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_MAPPING_COMMON_PERCENTAGE_FIELD:
				return validateOscalMappingCommonPercentageFIELD((BigDecimal)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_ADDR_LINE_FIELD:
				return validateOscalMetadataAddrLineFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_EMAIL_ADDRESS_FIELD:
				return validateOscalMetadataEmailAddressFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_LAST_MODIFIED_FIELD:
				return validateOscalMetadataLastModifiedFIELD((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_LOCATION_UUID_FIELD:
				return validateOscalMetadataLocationUuidFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_OSCAL_VERSION_FIELD:
				return validateOscalMetadataOscalVersionFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_PARTY_UUID_FIELD:
				return validateOscalMetadataPartyUuidFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_PUBLISHED_FIELD:
				return validateOscalMetadataPublishedFIELD((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_ROLE_ID_FIELD:
				return validateOscalMetadataRoleIdFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_METADATA_VERSION_FIELD:
				return validateOscalMetadataVersionFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_SSP_BASE_FIELD:
				return validateOscalSspBaseFIELD((String)value, diagnostics, context);
			case OSCALPackage.OSCAL_SSP_DATE_AUTHORIZED_FIELD:
				return validateOscalSspDateAuthorizedFIELD((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.OSCAL_SSP_SELECTED_FIELD:
				return validateOscalSspSelectedFIELD((String)value, diagnostics, context);
			case OSCALPackage.PARTY_UUID_TYPE:
				return validatePartyUuidType((String)value, diagnostics, context);
			case OSCALPackage.POSITIVE_INTEGER_DATATYPE:
				return validatePositiveIntegerDatatype((BigInteger)value, diagnostics, context);
			case OSCALPackage.POSTAL_CODE_TYPE:
				return validatePostalCodeType((String)value, diagnostics, context);
			case OSCALPackage.RELATIONSHIP_TYPE:
				return validateRelationshipType((String)value, diagnostics, context);
			case OSCALPackage.SECURITY_OBJECTIVE_AVAILABILITY_TYPE:
				return validateSecurityObjectiveAvailabilityType((String)value, diagnostics, context);
			case OSCALPackage.SECURITY_OBJECTIVE_CONFIDENTIALITY_TYPE:
				return validateSecurityObjectiveConfidentialityType((String)value, diagnostics, context);
			case OSCALPackage.SECURITY_OBJECTIVE_INTEGRITY_TYPE:
				return validateSecurityObjectiveIntegrityType((String)value, diagnostics, context);
			case OSCALPackage.SECURITY_SENSITIVITY_LEVEL_TYPE:
				return validateSecuritySensitivityLevelType((String)value, diagnostics, context);
			case OSCALPackage.SHORT_NAME_TYPE:
				return validateShortNameType((String)value, diagnostics, context);
			case OSCALPackage.SHORT_NAME_TYPE1:
				return validateShortNameType1((String)value, diagnostics, context);
			case OSCALPackage.SHORT_NAME_TYPE2:
				return validateShortNameType2((String)value, diagnostics, context);
			case OSCALPackage.START_TYPE:
				return validateStartType((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.START_TYPE1:
				return validateStartType1((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.START_TYPE2:
				return validateStartType2((XMLGregorianCalendar)value, diagnostics, context);
			case OSCALPackage.STATEMENT_ID_TYPE:
				return validateStatementIdType((String)value, diagnostics, context);
			case OSCALPackage.STATE_TYPE:
				return validateStateType((String)value, diagnostics, context);
			case OSCALPackage.STRING_DATATYPE:
				return validateStringDatatype((String)value, diagnostics, context);
			case OSCALPackage.SYSTEM_NAME_SHORT_TYPE:
				return validateSystemNameShortType((String)value, diagnostics, context);
			case OSCALPackage.SYSTEM_NAME_TYPE:
				return validateSystemNameType((String)value, diagnostics, context);
			case OSCALPackage.TOKEN_DATATYPE:
				return validateTokenDatatype((String)value, diagnostics, context);
			case OSCALPackage.TYPE_TYPE:
				return validateTypeType((String)value, diagnostics, context);
			case OSCALPackage.URI_DATATYPE:
				return validateURIDatatype((String)value, diagnostics, context);
			case OSCALPackage.URI_REFERENCE_DATATYPE:
				return validateURIReferenceDatatype((String)value, diagnostics, context);
			case OSCALPackage.URL_TYPE:
				return validateUrlType((String)value, diagnostics, context);
			case OSCALPackage.UUID_DATATYPE:
				return validateUUIDDatatype((String)value, diagnostics, context);
			case OSCALPackage.VALUE_TYPE:
				return validateValueType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdd(Add add, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(add, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlter(Alter alter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentLog(AssessmentLog assessmentLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentLog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentPlatform(AssessmentPlatform assessmentPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentPlatform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedActivity(AssociatedActivity associatedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associatedActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtFrequency(AtFrequency atFrequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atFrequency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttestation(Attestation attestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attestation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64(Base64 base64, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategorization(Categorization categorization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categorization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitation(Citation citation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombine(Combine combine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlObjectiveSelection(ControlObjectiveSelection controlObjectiveSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlObjectiveSelection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSelection(ControlSelection controlSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSelection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustom(Custom custom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(custom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskLogEntry(RiskLogEntry riskLogEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskLogEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentLogEntry(AssessmentLogEntry assessmentLogEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentLogEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExport(Export export, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(export, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalId(ExternalId externalId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacet(Facet facet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlat(Flat flat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiedSubject(IdentifiedSubject identifiedSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiedSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementedComponent(ImplementedComponent implementedComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementedComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationType(InformationType informationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInherited(Inherited inherited, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inherited, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeveragedAuthorization(LeveragedAuthorization leveragedAuthorization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leveragedAuthorization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultLocalDefinitions(ResultLocalDefinitions resultLocalDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultLocalDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentResultsLocalDefinitions(AssessmentResultsLocalDefinitions assessmentResultsLocalDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentResultsLocalDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentPlanLocalDefinitions(AssessmentPlanLocalDefinitions assessmentPlanLocalDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentPlanLocalDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMitigatingFactor(MitigatingFactor mitigatingFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mitigatingFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnDate(OnDate onDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoamItemOrigin(PoamItemOrigin poamItemOrigin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(poamItemOrigin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentPlan(AssessmentPlan assessmentPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentResults(AssessmentResults assessmentResults, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentResults, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportAp(ImportAp importAp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importAp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(result, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAssets(AssessmentAssets assessmentAssets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentAssets, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentMethod(AssessmentMethod assessmentMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentPart(AssessmentPart assessmentPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSubject(AssessmentSubject assessmentSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSubjectPlaceholder(AssessmentSubjectPlaceholder assessmentSubjectPlaceholder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentSubjectPlaceholder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedRisk(AssociatedRisk associatedRisk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associatedRisk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterization(Characterization characterization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinding(Finding finding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindingTarget(FindingTarget findingTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findingTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportSsp(ImportSsp importSsp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importSsp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalObjective(LocalObjective localObjective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localObjective, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoggedBy(LoggedBy loggedBy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loggedBy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOriginActor(OriginActor originActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(originActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrigin(Origin origin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(origin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedObservation(RelatedObservation relatedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedTask(RelatedTask relatedTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewedControls(ReviewedControls reviewedControls, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reviewedControls, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRisk(Risk risk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(risk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSelectControlById(AssessmentSelectControlById assessmentSelectControlById, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessmentSelectControlById, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectObjectiveById(SelectObjectiveById selectObjectiveById, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectObjectiveById, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectSubjectById(SelectSubjectById selectSubjectById, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectSubjectById, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectReference(SubjectReference subjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatId(ThreatId threatId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threatId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalog(Catalog catalog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(control, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogGroup(CatalogGroup catalogGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapability(Capability capability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentDefinition(ComponentDefinition componentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentControlImplementation(ComponentControlImplementation componentControlImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentControlImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedComponent(DefinedComponent definedComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definedComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentImplementedRequirement(ComponentImplementedRequirement componentImplementedRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentImplementedRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportComponentDefinition(ImportComponentDefinition importComponentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importComponentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncorporatesComponent(IncorporatesComponent incorporatesComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(incorporatesComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStatement(ComponentStatement componentStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeAll(IncludeAll includeAll, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeAll, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatching(Matching matching, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matching, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterConstraint(ParameterConstraint parameterConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterGuideline(ParameterGuideline parameterGuideline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterGuideline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSelection(ParameterSelection parameterSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterSelection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePart(Part part, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(part, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSelectControlById(ControlSelectControlById controlSelectControlById, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSelectControlById, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizedPrivilege(AuthorizedPrivilege authorizedPrivilege, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorizedPrivilege, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationStatus(ImplementationStatus implementationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInventoryItem(InventoryItem inventoryItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inventoryItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortRange(PortRange portRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetParameter(SetParameter setParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemComponent(SystemComponent systemComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemId(SystemId systemId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUser(SystemUser systemUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemUser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidenceScore(ConfidenceScore confidenceScore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confidenceScore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverage(Coverage coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGapSummary(GapSummary gapSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gapSummary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapEntry(MapEntry mapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingItem(MappingItem mappingItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingProvenance(MappingProvenance mappingProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingProvenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingResourceReference(MappingResourceReference mappingResourceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingResourceReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierItem(QualifierItem qualifierItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualifierItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingCollection(MappingCollection mappingCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackMatter(BackMatter backMatter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backMatter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentId(DocumentId documentId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHash(Hash hash, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hash, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadata(Metadata metadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleParty(ResponsibleParty responsibleParty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibleParty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleRole(ResponsibleRole responsibleRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibleRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumber(TelephoneNumber telephoneNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telephoneNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoamLocalDefinitions(PoamLocalDefinitions poamLocalDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(poamLocalDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfActionAndMilestones(PlanOfActionAndMilestones planOfActionAndMilestones, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planOfActionAndMilestones, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoamItem(PoamItem poamItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(poamItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileGroup(ProfileGroup profileGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertControls(InsertControls insertControls, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertControls, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(merge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModify(Modify modify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modify, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationBoundary(AuthorizationBoundary authorizationBoundary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorizationBoundary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByComponent(ByComponent byComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(byComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSspControlImplementation(SspControlImplementation sspControlImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sspControlImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlow(DataFlow dataFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpact(Impact impact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSspImplementedRequirement(SspImplementedRequirement sspImplementedRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sspImplementedRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportProfile(ImportProfile importProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkArchitecture(NetworkArchitecture networkArchitecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkArchitecture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityImpactLevel(SecurityImpactLevel securityImpactLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityImpactLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSspStatement(SspStatement sspStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sspStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemStatus(SystemStatus systemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemCharacteristics(SystemCharacteristics systemCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemCharacteristics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemImplementation(SystemImplementation systemImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemInformation(SystemInformation systemInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSecurityPlan(SystemSecurityPlan systemSecurityPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemSecurityPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParty(Party party, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(party, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvided(Provided provided, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provided, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedFinding(RelatedFinding relatedFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedFinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedResponse(RelatedResponse relatedResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelevantEvidence(RelevantEvidence relevantEvidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relevantEvidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemove(Remove remove, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remove, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredAsset(RequiredAsset requiredAsset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredAsset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackMatterResource(BackMatterResource backMatterResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backMatterResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibility(Responsibility responsibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(revision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskLog(RiskLog riskLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskLog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRlink(Rlink rlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rlink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSatisfied(Satisfied satisfied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(satisfied, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileSetParameter(ProfileSetParameter profileSetParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileSetParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceholderSource(PlaceholderSource placeholderSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placeholderSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindingTargetStatus(FindingTargetStatus findingTargetStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findingTargetStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemComponentStatus(SystemComponentStatus systemComponentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemComponentStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermsAndConditions(TermsAndConditions termsAndConditions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(termsAndConditions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintTest(ConstraintTest constraintTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiming(Timing timing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsesComponent(UsesComponent usesComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usesComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWithinDateRange(WithinDateRange withinDateRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(withinDateRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsIsType(boolean asIsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanDatatype_Pattern(asIsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsIsTypeObject(Boolean asIsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanDatatype_Pattern(asIsTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Datatype(byte[] base64Datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBase64Datatype_Pattern(base64Datatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBase64Datatype_Pattern
	 */
	public static final  PatternMatcher [][] BASE64_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9A-Za-z+/]+={0,2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Base64 Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Datatype_Pattern(byte[] base64Datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getBase64Datatype(), base64Datatype, BASE64_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanDatatype(boolean booleanDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanDatatype_Pattern(booleanDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBooleanDatatype_Pattern
	 */
	public static final  PatternMatcher [][] BOOLEAN_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("true|1|false|0")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Boolean Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanDatatype_Pattern(boolean booleanDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getBooleanDatatype(), booleanDatatype, BOOLEAN_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanDatatypeObject(Boolean booleanDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanDatatype_Pattern(booleanDatatypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryType(String categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(categoryType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCityType(String cityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(cityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectedType(XMLGregorianCalendar collectedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(collectedType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(countryType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateDatatype(XMLGregorianCalendar dateDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateDatatype_Pattern(dateDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateDatatype_Pattern
	 */
	public static final  PatternMatcher [][] DATE_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateDatatype_Pattern(XMLGregorianCalendar dateDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getDateDatatype(), dateDatatype, DATE_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeDatatype(XMLGregorianCalendar dateTimeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeDatatype_Pattern(dateTimeDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimeDatatype_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeDatatype_Pattern(XMLGregorianCalendar dateTimeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getDateTimeDatatype(), dateTimeDatatype, DATE_TIME_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeWithTimezoneDatatype(XMLGregorianCalendar dateTimeWithTimezoneDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(dateTimeWithTimezoneDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimeWithTimezoneDatatype_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_WITH_TIMEZONE_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time With Timezone Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeWithTimezoneDatatype_Pattern(XMLGregorianCalendar dateTimeWithTimezoneDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getDateTimeWithTimezoneDatatype(), dateTimeWithTimezoneDatatype, DATE_TIME_WITH_TIMEZONE_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadlineType(XMLGregorianCalendar deadlineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(deadlineType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalDatatype(BigDecimal decimalDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalDatatype_Pattern(decimalDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalDatatype_Pattern
	 */
	public static final  PatternMatcher [][] DECIMAL_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Decimal Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalDatatype_Pattern(BigDecimal decimalDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getDecimalDatatype(), decimalDatatype, DECIMAL_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressDatatype(String emailAddressDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEmailAddressDatatype_Pattern(emailAddressDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEmailAddressDatatype_Pattern
	 */
	public static final  PatternMatcher [][] EMAIL_ADDRESS_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+@.+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Email Address Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressDatatype_Pattern(String emailAddressDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getEmailAddressDatatype(), emailAddressDatatype, EMAIL_ADDRESS_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndType(XMLGregorianCalendar endType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(endType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndType1(XMLGregorianCalendar endType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(endType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndType2(XMLGregorianCalendar endType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(endType2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpiresType(XMLGregorianCalendar expiresType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(expiresType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionType(String expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(expressionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationStatementUuidType(String implementationStatementUuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDDatatype_Pattern(implementationStatementUuidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationTypeIdType(String informationTypeIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(informationTypeIdType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkupLineDatatype(String markupLineDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkupMultilineDatatype(String markupMultilineDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberOfOrganizationType(String memberOfOrganizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDDatatype_Pattern(memberOfOrganizationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(String methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(methodType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(nameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntegerDatatype(BigInteger nonNegativeIntegerDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(nonNegativeIntegerDatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNonNegativeIntegerDatatype_Pattern(nonNegativeIntegerDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeIntegerDatatype_Pattern
	 */
	public static final  PatternMatcher [][] NON_NEGATIVE_INTEGER_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Non Negative Integer Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntegerDatatype_Pattern(BigInteger nonNegativeIntegerDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getNonNegativeIntegerDatatype(), nonNegativeIntegerDatatype, NON_NEGATIVE_INTEGER_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalAssessmentCommonRiskStatusFIELD(String oscalAssessmentCommonRiskStatusFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(oscalAssessmentCommonRiskStatusFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalControlCommonParameterValueFIELD(String oscalControlCommonParameterValueFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalControlCommonParameterValueFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalControlCommonWithIdFIELD(String oscalControlCommonWithIdFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(oscalControlCommonWithIdFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalImplementationCommonFunctionPerformedFIELD(String oscalImplementationCommonFunctionPerformedFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalImplementationCommonFunctionPerformedFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMappingCommonPercentageFIELD(BigDecimal oscalMappingCommonPercentageFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalDatatype_Pattern(oscalMappingCommonPercentageFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataAddrLineFIELD(String oscalMetadataAddrLineFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalMetadataAddrLineFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataEmailAddressFIELD(String oscalMetadataEmailAddressFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEmailAddressDatatype_Pattern(oscalMetadataEmailAddressFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataLastModifiedFIELD(XMLGregorianCalendar oscalMetadataLastModifiedFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(oscalMetadataLastModifiedFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataLocationUuidFIELD(String oscalMetadataLocationUuidFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDDatatype_Pattern(oscalMetadataLocationUuidFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataOscalVersionFIELD(String oscalMetadataOscalVersionFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalMetadataOscalVersionFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataPartyUuidFIELD(String oscalMetadataPartyUuidFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDDatatype_Pattern(oscalMetadataPartyUuidFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataPublishedFIELD(XMLGregorianCalendar oscalMetadataPublishedFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(oscalMetadataPublishedFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataRoleIdFIELD(String oscalMetadataRoleIdFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(oscalMetadataRoleIdFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalMetadataVersionFIELD(String oscalMetadataVersionFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalMetadataVersionFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalSspBaseFIELD(String oscalSspBaseFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalSspBaseFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalSspDateAuthorizedFIELD(XMLGregorianCalendar oscalSspDateAuthorizedFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateDatatype_Pattern(oscalSspDateAuthorizedFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOscalSspSelectedFIELD(String oscalSspSelectedFIELD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(oscalSspSelectedFIELD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartyUuidType(String partyUuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDDatatype_Pattern(partyUuidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerDatatype(BigInteger positiveIntegerDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveIntegerDatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveIntegerDatatype_Pattern(positiveIntegerDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntegerDatatype_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_INTEGER_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Integer Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerDatatype_Pattern(BigInteger positiveIntegerDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getPositiveIntegerDatatype(), positiveIntegerDatatype, POSITIVE_INTEGER_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalCodeType(String postalCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(postalCodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipType(String relationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(relationshipType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObjectiveAvailabilityType(String securityObjectiveAvailabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(securityObjectiveAvailabilityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObjectiveConfidentialityType(String securityObjectiveConfidentialityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(securityObjectiveConfidentialityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObjectiveIntegrityType(String securityObjectiveIntegrityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(securityObjectiveIntegrityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySensitivityLevelType(String securitySensitivityLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(securitySensitivityLevelType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortNameType(String shortNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(shortNameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortNameType1(String shortNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(shortNameType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortNameType2(String shortNameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(shortNameType2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartType(XMLGregorianCalendar startType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(startType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartType1(XMLGregorianCalendar startType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(startType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartType2(XMLGregorianCalendar startType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeWithTimezoneDatatype_Pattern(startType2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatementIdType(String statementIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(statementIdType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType(String stateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(stateType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDatatype(String stringDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(stringDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStringDatatype_Pattern
	 */
	public static final  PatternMatcher [][] STRING_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>String Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDatatype_Pattern(String stringDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getStringDatatype(), stringDatatype, STRING_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemNameShortType(String systemNameShortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(systemNameShortType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemNameType(String systemNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(systemNameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenDatatype(String tokenDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(tokenDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTokenDatatype_Pattern
	 */
	public static final  PatternMatcher [][] TOKEN_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\p{L}|_)(\\p{L}|\\p{N}|[.\\-_])*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Token Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenDatatype_Pattern(String tokenDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getTokenDatatype(), tokenDatatype, TOKEN_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(String typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTokenDatatype_Pattern(typeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIDatatype(String uriDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIDatatype_Pattern(uriDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateURIDatatype_Pattern
	 */
	public static final  PatternMatcher [][] URI_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z][a-zA-Z0-9+\\-.]+:.*\\S")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>URI Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIDatatype_Pattern(String uriDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getURIDatatype(), uriDatatype, URI_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIReferenceDatatype(String uriReferenceDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIReferenceDatatype_Pattern(uriReferenceDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateURIReferenceDatatype_Pattern
	 */
	public static final  PatternMatcher [][] URI_REFERENCE_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>URI Reference Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIReferenceDatatype_Pattern(String uriReferenceDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getURIReferenceDatatype(), uriReferenceDatatype, URI_REFERENCE_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType(String urlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIDatatype_Pattern(urlType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUUIDDatatype(String uuidDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDDatatype_Pattern(uuidDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUUIDDatatype_Pattern
	 */
	public static final  PatternMatcher [][] UUID_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[45][0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S(.*\\S)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>UUID Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUUIDDatatype_Pattern(String uuidDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OSCALPackage.eINSTANCE.getUUIDDatatype(), uuidDatatype, UUID_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(String valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringDatatype_Pattern(valueType, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OSCALValidator
