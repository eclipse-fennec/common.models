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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.nist.csrc.ns.oscal.OSCALPackage
 * @generated
 */
public class OSCALSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OSCALPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCALSwitch() {
		if (modelPackage == null) {
			modelPackage = OSCALPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OSCALPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ALTER: {
				Alter alter = (Alter)theEObject;
				T result = caseAlter(alter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_ANCHOR: {
				MarkupAnchor markupAnchor = (MarkupAnchor)theEObject;
				T result = caseMarkupAnchor(markupAnchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_LOG: {
				AssessmentLog assessmentLog = (AssessmentLog)theEObject;
				T result = caseAssessmentLog(assessmentLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_PLATFORM: {
				AssessmentPlatform assessmentPlatform = (AssessmentPlatform)theEObject;
				T result = caseAssessmentPlatform(assessmentPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSOCIATED_ACTIVITY: {
				AssociatedActivity associatedActivity = (AssociatedActivity)theEObject;
				T result = caseAssociatedActivity(associatedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.AT_FREQUENCY: {
				AtFrequency atFrequency = (AtFrequency)theEObject;
				T result = caseAtFrequency(atFrequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ATTESTATION: {
				Attestation attestation = (Attestation)theEObject;
				T result = caseAttestation(attestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.BASE64: {
				Base64 base64 = (Base64)theEObject;
				T result = caseBase64(base64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_BLOCK_QUOTE: {
				MarkupBlockQuote markupBlockQuote = (MarkupBlockQuote)theEObject;
				T result = caseMarkupBlockQuote(markupBlockQuote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CATEGORIZATION: {
				Categorization categorization = (Categorization)theEObject;
				T result = caseCategorization(categorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CITATION: {
				Citation citation = (Citation)theEObject;
				T result = caseCitation(citation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_CODE: {
				MarkupCode markupCode = (MarkupCode)theEObject;
				T result = caseMarkupCode(markupCode);
				if (result == null) result = caseInlineMarkup(markupCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.COMBINE: {
				Combine combine = (Combine)theEObject;
				T result = caseCombine(combine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CONTROL_OBJECTIVE_SELECTION: {
				ControlObjectiveSelection controlObjectiveSelection = (ControlObjectiveSelection)theEObject;
				T result = caseControlObjectiveSelection(controlObjectiveSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CONTROL_SELECTION: {
				ControlSelection controlSelection = (ControlSelection)theEObject;
				T result = caseControlSelection(controlSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CUSTOM: {
				Custom custom = (Custom)theEObject;
				T result = caseCustom(custom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RISK_LOG_ENTRY: {
				RiskLogEntry riskLogEntry = (RiskLogEntry)theEObject;
				T result = caseRiskLogEntry(riskLogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_LOG_ENTRY: {
				AssessmentLogEntry assessmentLogEntry = (AssessmentLogEntry)theEObject;
				T result = caseAssessmentLogEntry(assessmentLogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.EXPORT: {
				Export export = (Export)theEObject;
				T result = caseExport(export);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.EXTERNAL_ID: {
				ExternalId externalId = (ExternalId)theEObject;
				T result = caseExternalId(externalId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.FACET: {
				Facet facet = (Facet)theEObject;
				T result = caseFacet(facet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.FLAT: {
				Flat flat = (Flat)theEObject;
				T result = caseFlat(flat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IDENTIFIED_SUBJECT: {
				IdentifiedSubject identifiedSubject = (IdentifiedSubject)theEObject;
				T result = caseIdentifiedSubject(identifiedSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_IMAGE: {
				MarkupImage markupImage = (MarkupImage)theEObject;
				T result = caseMarkupImage(markupImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPLEMENTED_COMPONENT: {
				ImplementedComponent implementedComponent = (ImplementedComponent)theEObject;
				T result = caseImplementedComponent(implementedComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INFORMATION_TYPE: {
				InformationType informationType = (InformationType)theEObject;
				T result = caseInformationType(informationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INHERITED: {
				Inherited inherited = (Inherited)theEObject;
				T result = caseInherited(inherited);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INLINE_MARKUP: {
				InlineMarkup inlineMarkup = (InlineMarkup)theEObject;
				T result = caseInlineMarkup(inlineMarkup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_INSERT: {
				MarkupInsert markupInsert = (MarkupInsert)theEObject;
				T result = caseMarkupInsert(markupInsert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.LEVERAGED_AUTHORIZATION: {
				LeveragedAuthorization leveragedAuthorization = (LeveragedAuthorization)theEObject;
				T result = caseLeveragedAuthorization(leveragedAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_LIST_ITEM: {
				MarkupListItem markupListItem = (MarkupListItem)theEObject;
				T result = caseMarkupListItem(markupListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_LIST: {
				MarkupList markupList = (MarkupList)theEObject;
				T result = caseMarkupList(markupList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS: {
				ResultLocalDefinitions resultLocalDefinitions = (ResultLocalDefinitions)theEObject;
				T result = caseResultLocalDefinitions(resultLocalDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_RESULTS_LOCAL_DEFINITIONS: {
				AssessmentResultsLocalDefinitions assessmentResultsLocalDefinitions = (AssessmentResultsLocalDefinitions)theEObject;
				T result = caseAssessmentResultsLocalDefinitions(assessmentResultsLocalDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_PLAN_LOCAL_DEFINITIONS: {
				AssessmentPlanLocalDefinitions assessmentPlanLocalDefinitions = (AssessmentPlanLocalDefinitions)theEObject;
				T result = caseAssessmentPlanLocalDefinitions(assessmentPlanLocalDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_LINE_DATATYPE: {
				MarkupLineDatatype markupLineDatatype = (MarkupLineDatatype)theEObject;
				T result = caseMarkupLineDatatype(markupLineDatatype);
				if (result == null) result = caseInlineMarkup(markupLineDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_MULTILINE_DATATYPE: {
				MarkupMultilineDatatype markupMultilineDatatype = (MarkupMultilineDatatype)theEObject;
				T result = caseMarkupMultilineDatatype(markupMultilineDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MITIGATING_FACTOR: {
				MitigatingFactor mitigatingFactor = (MitigatingFactor)theEObject;
				T result = caseMitigatingFactor(mitigatingFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ON_DATE: {
				OnDate onDate = (OnDate)theEObject;
				T result = caseOnDate(onDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_ORDERED_LIST: {
				MarkupOrderedList markupOrderedList = (MarkupOrderedList)theEObject;
				T result = caseMarkupOrderedList(markupOrderedList);
				if (result == null) result = caseMarkupList(markupOrderedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.POAM_ITEM_ORIGIN: {
				PoamItemOrigin poamItemOrigin = (PoamItemOrigin)theEObject;
				T result = casePoamItemOrigin(poamItemOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_PLAN: {
				AssessmentPlan assessmentPlan = (AssessmentPlan)theEObject;
				T result = caseAssessmentPlan(assessmentPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_RESULTS: {
				AssessmentResults assessmentResults = (AssessmentResults)theEObject;
				T result = caseAssessmentResults(assessmentResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPORT_AP: {
				ImportAp importAp = (ImportAp)theEObject;
				T result = caseImportAp(importAp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case OSCALPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_ASSETS: {
				AssessmentAssets assessmentAssets = (AssessmentAssets)theEObject;
				T result = caseAssessmentAssets(assessmentAssets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_METHOD: {
				AssessmentMethod assessmentMethod = (AssessmentMethod)theEObject;
				T result = caseAssessmentMethod(assessmentMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_PART: {
				AssessmentPart assessmentPart = (AssessmentPart)theEObject;
				T result = caseAssessmentPart(assessmentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_SUBJECT: {
				AssessmentSubject assessmentSubject = (AssessmentSubject)theEObject;
				T result = caseAssessmentSubject(assessmentSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_SUBJECT_PLACEHOLDER: {
				AssessmentSubjectPlaceholder assessmentSubjectPlaceholder = (AssessmentSubjectPlaceholder)theEObject;
				T result = caseAssessmentSubjectPlaceholder(assessmentSubjectPlaceholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSOCIATED_RISK: {
				AssociatedRisk associatedRisk = (AssociatedRisk)theEObject;
				T result = caseAssociatedRisk(associatedRisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CHARACTERIZATION: {
				Characterization characterization = (Characterization)theEObject;
				T result = caseCharacterization(characterization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.FINDING: {
				Finding finding = (Finding)theEObject;
				T result = caseFinding(finding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.FINDING_TARGET: {
				FindingTarget findingTarget = (FindingTarget)theEObject;
				T result = caseFindingTarget(findingTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPORT_SSP: {
				ImportSsp importSsp = (ImportSsp)theEObject;
				T result = caseImportSsp(importSsp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.LOCAL_OBJECTIVE: {
				LocalObjective localObjective = (LocalObjective)theEObject;
				T result = caseLocalObjective(localObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.LOGGED_BY: {
				LoggedBy loggedBy = (LoggedBy)theEObject;
				T result = caseLoggedBy(loggedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ORIGIN_ACTOR: {
				OriginActor originActor = (OriginActor)theEObject;
				T result = caseOriginActor(originActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ORIGIN: {
				Origin origin = (Origin)theEObject;
				T result = caseOrigin(origin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RELATED_OBSERVATION: {
				RelatedObservation relatedObservation = (RelatedObservation)theEObject;
				T result = caseRelatedObservation(relatedObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RELATED_TASK: {
				RelatedTask relatedTask = (RelatedTask)theEObject;
				T result = caseRelatedTask(relatedTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.REVIEWED_CONTROLS: {
				ReviewedControls reviewedControls = (ReviewedControls)theEObject;
				T result = caseReviewedControls(reviewedControls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RISK: {
				Risk risk = (Risk)theEObject;
				T result = caseRisk(risk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID: {
				AssessmentSelectControlById assessmentSelectControlById = (AssessmentSelectControlById)theEObject;
				T result = caseAssessmentSelectControlById(assessmentSelectControlById);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SELECT_OBJECTIVE_BY_ID: {
				SelectObjectiveById selectObjectiveById = (SelectObjectiveById)theEObject;
				T result = caseSelectObjectiveById(selectObjectiveById);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SELECT_SUBJECT_BY_ID: {
				SelectSubjectById selectSubjectById = (SelectSubjectById)theEObject;
				T result = caseSelectSubjectById(selectSubjectById);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SUBJECT_REFERENCE: {
				SubjectReference subjectReference = (SubjectReference)theEObject;
				T result = caseSubjectReference(subjectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.THREAT_ID: {
				ThreatId threatId = (ThreatId)theEObject;
				T result = caseThreatId(threatId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CATALOG: {
				Catalog catalog = (Catalog)theEObject;
				T result = caseCatalog(catalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CATALOG_GROUP: {
				CatalogGroup catalogGroup = (CatalogGroup)theEObject;
				T result = caseCatalogGroup(catalogGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.COMPONENT_DEFINITION: {
				ComponentDefinition componentDefinition = (ComponentDefinition)theEObject;
				T result = caseComponentDefinition(componentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.COMPONENT_CONTROL_IMPLEMENTATION: {
				ComponentControlImplementation componentControlImplementation = (ComponentControlImplementation)theEObject;
				T result = caseComponentControlImplementation(componentControlImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.DEFINED_COMPONENT: {
				DefinedComponent definedComponent = (DefinedComponent)theEObject;
				T result = caseDefinedComponent(definedComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.COMPONENT_IMPLEMENTED_REQUIREMENT: {
				ComponentImplementedRequirement componentImplementedRequirement = (ComponentImplementedRequirement)theEObject;
				T result = caseComponentImplementedRequirement(componentImplementedRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPORT_COMPONENT_DEFINITION: {
				ImportComponentDefinition importComponentDefinition = (ImportComponentDefinition)theEObject;
				T result = caseImportComponentDefinition(importComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INCORPORATES_COMPONENT: {
				IncorporatesComponent incorporatesComponent = (IncorporatesComponent)theEObject;
				T result = caseIncorporatesComponent(incorporatesComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.COMPONENT_STATEMENT: {
				ComponentStatement componentStatement = (ComponentStatement)theEObject;
				T result = caseComponentStatement(componentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INCLUDE_ALL: {
				IncludeAll includeAll = (IncludeAll)theEObject;
				T result = caseIncludeAll(includeAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MATCHING: {
				Matching matching = (Matching)theEObject;
				T result = caseMatching(matching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PARAMETER_CONSTRAINT: {
				ParameterConstraint parameterConstraint = (ParameterConstraint)theEObject;
				T result = caseParameterConstraint(parameterConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PARAMETER_GUIDELINE: {
				ParameterGuideline parameterGuideline = (ParameterGuideline)theEObject;
				T result = caseParameterGuideline(parameterGuideline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PARAMETER_SELECTION: {
				ParameterSelection parameterSelection = (ParameterSelection)theEObject;
				T result = caseParameterSelection(parameterSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CONTROL_SELECT_CONTROL_BY_ID: {
				ControlSelectControlById controlSelectControlById = (ControlSelectControlById)theEObject;
				T result = caseControlSelectControlById(controlSelectControlById);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.AUTHORIZED_PRIVILEGE: {
				AuthorizedPrivilege authorizedPrivilege = (AuthorizedPrivilege)theEObject;
				T result = caseAuthorizedPrivilege(authorizedPrivilege);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPLEMENTATION_STATUS: {
				ImplementationStatus implementationStatus = (ImplementationStatus)theEObject;
				T result = caseImplementationStatus(implementationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INVENTORY_ITEM: {
				InventoryItem inventoryItem = (InventoryItem)theEObject;
				T result = caseInventoryItem(inventoryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PORT_RANGE: {
				PortRange portRange = (PortRange)theEObject;
				T result = casePortRange(portRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				T result = caseProtocol(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SET_PARAMETER: {
				SetParameter setParameter = (SetParameter)theEObject;
				T result = caseSetParameter(setParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_COMPONENT: {
				SystemComponent systemComponent = (SystemComponent)theEObject;
				T result = caseSystemComponent(systemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_ID: {
				SystemId systemId = (SystemId)theEObject;
				T result = caseSystemId(systemId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_USER: {
				SystemUser systemUser = (SystemUser)theEObject;
				T result = caseSystemUser(systemUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CONFIDENCE_SCORE: {
				ConfidenceScore confidenceScore = (ConfidenceScore)theEObject;
				T result = caseConfidenceScore(confidenceScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.GAP_SUMMARY: {
				GapSummary gapSummary = (GapSummary)theEObject;
				T result = caseGapSummary(gapSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MAP_ENTRY: {
				MapEntry mapEntry = (MapEntry)theEObject;
				T result = caseMapEntry(mapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MAPPING_ITEM: {
				MappingItem mappingItem = (MappingItem)theEObject;
				T result = caseMappingItem(mappingItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MAPPING_PROVENANCE: {
				MappingProvenance mappingProvenance = (MappingProvenance)theEObject;
				T result = caseMappingProvenance(mappingProvenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MAPPING_RESOURCE_REFERENCE: {
				MappingResourceReference mappingResourceReference = (MappingResourceReference)theEObject;
				T result = caseMappingResourceReference(mappingResourceReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.QUALIFIER_ITEM: {
				QualifierItem qualifierItem = (QualifierItem)theEObject;
				T result = caseQualifierItem(qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MAPPING_COLLECTION: {
				MappingCollection mappingCollection = (MappingCollection)theEObject;
				T result = caseMappingCollection(mappingCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.BACK_MATTER: {
				BackMatter backMatter = (BackMatter)theEObject;
				T result = caseBackMatter(backMatter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.DOCUMENT_ID: {
				DocumentId documentId = (DocumentId)theEObject;
				T result = caseDocumentId(documentId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.HASH: {
				Hash hash = (Hash)theEObject;
				T result = caseHash(hash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RESPONSIBLE_PARTY: {
				ResponsibleParty responsibleParty = (ResponsibleParty)theEObject;
				T result = caseResponsibleParty(responsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RESPONSIBLE_ROLE: {
				ResponsibleRole responsibleRole = (ResponsibleRole)theEObject;
				T result = caseResponsibleRole(responsibleRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.TELEPHONE_NUMBER: {
				TelephoneNumber telephoneNumber = (TelephoneNumber)theEObject;
				T result = caseTelephoneNumber(telephoneNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.POAM_LOCAL_DEFINITIONS: {
				PoamLocalDefinitions poamLocalDefinitions = (PoamLocalDefinitions)theEObject;
				T result = casePoamLocalDefinitions(poamLocalDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES: {
				PlanOfActionAndMilestones planOfActionAndMilestones = (PlanOfActionAndMilestones)theEObject;
				T result = casePlanOfActionAndMilestones(planOfActionAndMilestones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.POAM_ITEM: {
				PoamItem poamItem = (PoamItem)theEObject;
				T result = casePoamItem(poamItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PROFILE_GROUP: {
				ProfileGroup profileGroup = (ProfileGroup)theEObject;
				T result = caseProfileGroup(profileGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.INSERT_CONTROLS: {
				InsertControls insertControls = (InsertControls)theEObject;
				T result = caseInsertControls(insertControls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MERGE: {
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MODIFY: {
				Modify modify = (Modify)theEObject;
				T result = caseModify(modify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PROFILE: {
				Profile profile = (Profile)theEObject;
				T result = caseProfile(profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.AUTHORIZATION_BOUNDARY: {
				AuthorizationBoundary authorizationBoundary = (AuthorizationBoundary)theEObject;
				T result = caseAuthorizationBoundary(authorizationBoundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.BY_COMPONENT: {
				ByComponent byComponent = (ByComponent)theEObject;
				T result = caseByComponent(byComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SSP_CONTROL_IMPLEMENTATION: {
				SspControlImplementation sspControlImplementation = (SspControlImplementation)theEObject;
				T result = caseSspControlImplementation(sspControlImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPACT: {
				Impact impact = (Impact)theEObject;
				T result = caseImpact(impact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SSP_IMPLEMENTED_REQUIREMENT: {
				SspImplementedRequirement sspImplementedRequirement = (SspImplementedRequirement)theEObject;
				T result = caseSspImplementedRequirement(sspImplementedRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.IMPORT_PROFILE: {
				ImportProfile importProfile = (ImportProfile)theEObject;
				T result = caseImportProfile(importProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.NETWORK_ARCHITECTURE: {
				NetworkArchitecture networkArchitecture = (NetworkArchitecture)theEObject;
				T result = caseNetworkArchitecture(networkArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SECURITY_IMPACT_LEVEL: {
				SecurityImpactLevel securityImpactLevel = (SecurityImpactLevel)theEObject;
				T result = caseSecurityImpactLevel(securityImpactLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SSP_STATEMENT: {
				SspStatement sspStatement = (SspStatement)theEObject;
				T result = caseSspStatement(sspStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_STATUS: {
				SystemStatus systemStatus = (SystemStatus)theEObject;
				T result = caseSystemStatus(systemStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_CHARACTERISTICS: {
				SystemCharacteristics systemCharacteristics = (SystemCharacteristics)theEObject;
				T result = caseSystemCharacteristics(systemCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_IMPLEMENTATION: {
				SystemImplementation systemImplementation = (SystemImplementation)theEObject;
				T result = caseSystemImplementation(systemImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_INFORMATION: {
				SystemInformation systemInformation = (SystemInformation)theEObject;
				T result = caseSystemInformation(systemInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_SECURITY_PLAN: {
				SystemSecurityPlan systemSecurityPlan = (SystemSecurityPlan)theEObject;
				T result = caseSystemSecurityPlan(systemSecurityPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_PREFORMATTED: {
				MarkupPreformatted markupPreformatted = (MarkupPreformatted)theEObject;
				T result = caseMarkupPreformatted(markupPreformatted);
				if (result == null) result = caseInlineMarkup(markupPreformatted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PROVIDED: {
				Provided provided = (Provided)theEObject;
				T result = caseProvided(provided);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RELATED_FINDING: {
				RelatedFinding relatedFinding = (RelatedFinding)theEObject;
				T result = caseRelatedFinding(relatedFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RELATED_RESPONSE: {
				RelatedResponse relatedResponse = (RelatedResponse)theEObject;
				T result = caseRelatedResponse(relatedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RELEVANT_EVIDENCE: {
				RelevantEvidence relevantEvidence = (RelevantEvidence)theEObject;
				T result = caseRelevantEvidence(relevantEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.REMOVE: {
				Remove remove = (Remove)theEObject;
				T result = caseRemove(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.REQUIRED_ASSET: {
				RequiredAsset requiredAsset = (RequiredAsset)theEObject;
				T result = caseRequiredAsset(requiredAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.BACK_MATTER_RESOURCE: {
				BackMatterResource backMatterResource = (BackMatterResource)theEObject;
				T result = caseBackMatterResource(backMatterResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RESPONSIBILITY: {
				Responsibility responsibility = (Responsibility)theEObject;
				T result = caseResponsibility(responsibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.REVISIONS: {
				Revisions revisions = (Revisions)theEObject;
				T result = caseRevisions(revisions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.REVISION: {
				Revision revision = (Revision)theEObject;
				T result = caseRevision(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RISK_LOG: {
				RiskLog riskLog = (RiskLog)theEObject;
				T result = caseRiskLog(riskLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.RLINK: {
				Rlink rlink = (Rlink)theEObject;
				T result = caseRlink(rlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SATISFIED: {
				Satisfied satisfied = (Satisfied)theEObject;
				T result = caseSatisfied(satisfied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PROFILE_SET_PARAMETER: {
				ProfileSetParameter profileSetParameter = (ProfileSetParameter)theEObject;
				T result = caseProfileSetParameter(profileSetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.PLACEHOLDER_SOURCE: {
				PlaceholderSource placeholderSource = (PlaceholderSource)theEObject;
				T result = casePlaceholderSource(placeholderSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.FINDING_TARGET_STATUS: {
				FindingTargetStatus findingTargetStatus = (FindingTargetStatus)theEObject;
				T result = caseFindingTargetStatus(findingTargetStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.SYSTEM_COMPONENT_STATUS: {
				SystemComponentStatus systemComponentStatus = (SystemComponentStatus)theEObject;
				T result = caseSystemComponentStatus(systemComponentStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_TABLE_CELL: {
				MarkupTableCell markupTableCell = (MarkupTableCell)theEObject;
				T result = caseMarkupTableCell(markupTableCell);
				if (result == null) result = caseInlineMarkup(markupTableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_TABLE_ROW: {
				MarkupTableRow markupTableRow = (MarkupTableRow)theEObject;
				T result = caseMarkupTableRow(markupTableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.MARKUP_TABLE: {
				MarkupTable markupTable = (MarkupTable)theEObject;
				T result = caseMarkupTable(markupTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.TERMS_AND_CONDITIONS: {
				TermsAndConditions termsAndConditions = (TermsAndConditions)theEObject;
				T result = caseTermsAndConditions(termsAndConditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.CONSTRAINT_TEST: {
				ConstraintTest constraintTest = (ConstraintTest)theEObject;
				T result = caseConstraintTest(constraintTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.USES_COMPONENT: {
				UsesComponent usesComponent = (UsesComponent)theEObject;
				T result = caseUsesComponent(usesComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSCALPackage.WITHIN_DATE_RANGE: {
				WithinDateRange withinDateRange = (WithinDateRange)theEObject;
				T result = caseWithinDateRange(withinDateRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlter(Alter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupAnchor(MarkupAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentLog(AssessmentLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentPlatform(AssessmentPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedActivity(AssociatedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Frequency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtFrequency(AtFrequency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttestation(Attestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64(Base64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Block Quote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Block Quote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupBlockQuote(MarkupBlockQuote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorization(Categorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitation(Citation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupCode(MarkupCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombine(Combine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Objective Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Objective Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlObjectiveSelection(ControlObjectiveSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSelection(ControlSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustom(Custom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskLogEntry(RiskLogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentLogEntry(AssessmentLogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExport(Export object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalId(ExternalId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacet(Facet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlat(Flat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedSubject(IdentifiedSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupImage(MarkupImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implemented Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implemented Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementedComponent(ImplementedComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationType(InformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInherited(Inherited object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineMarkup(InlineMarkup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupInsert(MarkupInsert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leveraged Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leveraged Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeveragedAuthorization(LeveragedAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupListItem(MarkupListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupList(MarkupList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Local Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultLocalDefinitions(ResultLocalDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Results Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Results Local Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentResultsLocalDefinitions(AssessmentResultsLocalDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Plan Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Plan Local Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentPlanLocalDefinitions(AssessmentPlanLocalDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Line Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Line Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupLineDatatype(MarkupLineDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Multiline Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Multiline Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupMultilineDatatype(MarkupMultilineDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigating Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigating Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigatingFactor(MitigatingFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnDate(OnDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupOrderedList(MarkupOrderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poam Item Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poam Item Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoamItemOrigin(PoamItemOrigin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentPlan(AssessmentPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentResults(AssessmentResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Ap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Ap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportAp(ImportAp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Assets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Assets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAssets(AssessmentAssets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentMethod(AssessmentMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentPart(AssessmentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSubject(AssessmentSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Subject Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Subject Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSubjectPlaceholder(AssessmentSubjectPlaceholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedRisk(AssociatedRisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characterization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characterization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterization(Characterization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinding(Finding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindingTarget(FindingTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Ssp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Ssp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportSsp(ImportSsp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalObjective(LocalObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logged By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logged By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoggedBy(LoggedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Origin Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Origin Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginActor(OriginActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrigin(Origin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedObservation(RelatedObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedTask(RelatedTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reviewed Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reviewed Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewedControls(ReviewedControls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisk(Risk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Select Control By Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Select Control By Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSelectControlById(AssessmentSelectControlById object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Objective By Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Objective By Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectObjectiveById(SelectObjectiveById object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Subject By Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Subject By Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectSubjectById(SelectSubjectById object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectReference(SubjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatId(ThreatId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogGroup(CatalogGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinition(ComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Control Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Control Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentControlImplementation(ComponentControlImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedComponent(DefinedComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Implemented Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Implemented Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentImplementedRequirement(ComponentImplementedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportComponentDefinition(ImportComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incorporates Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incorporates Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncorporatesComponent(IncorporatesComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentStatement(ComponentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeAll(IncludeAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatching(Matching object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConstraint(ParameterConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Guideline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterGuideline(ParameterGuideline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSelection(ParameterSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Select Control By Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Select Control By Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSelectControlById(ControlSelectControlById object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorized Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorized Privilege</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizedPrivilege(AuthorizedPrivilege object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationStatus(ImplementationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryItem(InventoryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRange(PortRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetParameter(SetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComponent(SystemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemId(SystemId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUser(SystemUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidence Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidence Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidenceScore(ConfidenceScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGapSummary(GapSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapEntry(MapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingItem(MappingItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingProvenance(MappingProvenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Resource Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Resource Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingResourceReference(MappingResourceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierItem(QualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingCollection(MappingCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back Matter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back Matter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackMatter(BackMatter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentId(DocumentId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHash(Hash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleParty(ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleRole(ResponsibleRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneNumber(TelephoneNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poam Local Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poam Local Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoamLocalDefinitions(PoamLocalDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Action And Milestones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Action And Milestones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfActionAndMilestones(PlanOfActionAndMilestones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poam Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poam Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoamItem(PoamItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileGroup(ProfileGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertControls(InsertControls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModify(Modify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationBoundary(AuthorizationBoundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByComponent(ByComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssp Control Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssp Control Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSspControlImplementation(SspControlImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpact(Impact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssp Implemented Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssp Implemented Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSspImplementedRequirement(SspImplementedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportProfile(ImportProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkArchitecture(NetworkArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Impact Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Impact Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityImpactLevel(SecurityImpactLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssp Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssp Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSspStatement(SspStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemStatus(SystemStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemCharacteristics(SystemCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemImplementation(SystemImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInformation(SystemInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Security Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Security Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSecurityPlan(SystemSecurityPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Preformatted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Preformatted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupPreformatted(MarkupPreformatted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvided(Provided object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedFinding(RelatedFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedResponse(RelatedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelevantEvidence(RelevantEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemove(Remove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredAsset(RequiredAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back Matter Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back Matter Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackMatterResource(BackMatterResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibility(Responsibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revisions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revisions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevisions(Revisions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision(Revision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskLog(RiskLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRlink(Rlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfied(Satisfied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Set Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileSetParameter(ProfileSetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholderSource(PlaceholderSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding Target Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding Target Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindingTargetStatus(FindingTargetStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Component Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Component Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComponentStatus(SystemComponentStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupTableCell(MarkupTableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupTableRow(MarkupTableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupTable(MarkupTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terms And Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terms And Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermsAndConditions(TermsAndConditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintTest(ConstraintTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesComponent(UsesComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Within Date Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within Date Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithinDateRange(WithinDateRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OSCALSwitch
