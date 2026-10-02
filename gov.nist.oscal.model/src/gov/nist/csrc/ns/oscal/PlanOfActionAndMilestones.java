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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Action And Milestones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Plan of Action and Milestones (POA&amp;M)</b>
 *   : A plan of action and milestones which identifies initial and residual risks, deviations, and disposition, such as those required by FedRAMP.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getImportSsp <em>Import Ssp</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getSystemId <em>System Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getObservation <em>Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getRisk <em>Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getFinding <em>Finding</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getPoamItem <em>Poam Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones()
 * @model extendedMetaData="name='oscal-poam-plan-of-action-and-milestones-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PlanOfActionAndMilestones extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Import Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Ssp</em>' containment reference.
	 * @see #setImportSsp(ImportSsp)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_ImportSsp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='import-ssp' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportSsp getImportSsp();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getImportSsp <em>Import Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Ssp</em>' containment reference.
	 * @see #getImportSsp()
	 * @generated
	 */
	void setImportSsp(ImportSsp value);

	/**
	 * Returns the value of the '<em><b>System Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' containment reference.
	 * @see #setSystemId(SystemId)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_SystemId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system-id' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemId getSystemId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getSystemId <em>System Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id</em>' containment reference.
	 * @see #getSystemId()
	 * @generated
	 */
	void setSystemId(SystemId value);

	/**
	 * Returns the value of the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Definitions</em>' containment reference.
	 * @see #setLocalDefinitions(PoamLocalDefinitions)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_LocalDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	PoamLocalDefinitions getLocalDefinitions();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getLocalDefinitions <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Definitions</em>' containment reference.
	 * @see #getLocalDefinitions()
	 * @generated
	 */
	void setLocalDefinitions(PoamLocalDefinitions value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observation' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='observations'"
	 * @generated
	 */
	EList<Observation> getObservation();

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_Risk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='risk' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='risks'"
	 * @generated
	 */
	EList<Risk> getRisk();

	/**
	 * Returns the value of the '<em><b>Finding</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finding</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_Finding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finding' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='findings'"
	 * @generated
	 */
	EList<Finding> getFinding();

	/**
	 * Returns the value of the '<em><b>Poam Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.PoamItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poam Item</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_PoamItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='poam-item' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='poam-items'"
	 * @generated
	 */
	EList<PoamItem> getPoamItem();

	/**
	 * Returns the value of the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Matter</em>' containment reference.
	 * @see #setBackMatter(BackMatter)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_BackMatter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='back-matter' namespace='##targetNamespace'"
	 * @generated
	 */
	BackMatter getBackMatter();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getBackMatter <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Matter</em>' containment reference.
	 * @see #getBackMatter()
	 * @generated
	 */
	void setBackMatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">POA&amp;M Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with instancescope that can be used to reference this POA&amp;M instance in this OSCAL instance. This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getPlanOfActionAndMilestones_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // PlanOfActionAndMilestones
