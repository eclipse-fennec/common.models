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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentPlan <em>Assessment Plan</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentResults <em>Assessment Results</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getMappingCollection <em>Mapping Collection</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getPlanOfActionAndMilestones <em>Plan Of Action And Milestones</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getProfile <em>Profile</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DocumentRoot#getSystemSecurityPlan <em>System Security Plan</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Assessment Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Plan</em>' containment reference.
	 * @see #setAssessmentPlan(AssessmentPlan)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_AssessmentPlan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assessment-plan' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentPlan getAssessmentPlan();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentPlan <em>Assessment Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Plan</em>' containment reference.
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	void setAssessmentPlan(AssessmentPlan value);

	/**
	 * Returns the value of the '<em><b>Assessment Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Results</em>' containment reference.
	 * @see #setAssessmentResults(AssessmentResults)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_AssessmentResults()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assessment-results' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentResults getAssessmentResults();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentResults <em>Assessment Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Results</em>' containment reference.
	 * @see #getAssessmentResults()
	 * @generated
	 */
	void setAssessmentResults(AssessmentResults value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(Catalog)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_Catalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalog getCatalog();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog value);

	/**
	 * Returns the value of the '<em><b>Component Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition</em>' containment reference.
	 * @see #setComponentDefinition(ComponentDefinition)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_ComponentDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component-definition' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentDefinition getComponentDefinition();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getComponentDefinition <em>Component Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition</em>' containment reference.
	 * @see #getComponentDefinition()
	 * @generated
	 */
	void setComponentDefinition(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Mapping Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Collection</em>' containment reference.
	 * @see #setMappingCollection(MappingCollection)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_MappingCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mapping-collection' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingCollection getMappingCollection();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getMappingCollection <em>Mapping Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Collection</em>' containment reference.
	 * @see #getMappingCollection()
	 * @generated
	 */
	void setMappingCollection(MappingCollection value);

	/**
	 * Returns the value of the '<em><b>Plan Of Action And Milestones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Of Action And Milestones</em>' containment reference.
	 * @see #setPlanOfActionAndMilestones(PlanOfActionAndMilestones)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_PlanOfActionAndMilestones()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='plan-of-action-and-milestones' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanOfActionAndMilestones getPlanOfActionAndMilestones();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getPlanOfActionAndMilestones <em>Plan Of Action And Milestones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Of Action And Milestones</em>' containment reference.
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	void setPlanOfActionAndMilestones(PlanOfActionAndMilestones value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Profile)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_Profile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>System Security Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Security Plan</em>' containment reference.
	 * @see #setSystemSecurityPlan(SystemSecurityPlan)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDocumentRoot_SystemSecurityPlan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='system-security-plan' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemSecurityPlan getSystemSecurityPlan();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getSystemSecurityPlan <em>System Security Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Security Plan</em>' containment reference.
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	void setSystemSecurityPlan(SystemSecurityPlan value);

} // DocumentRoot
