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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Security Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Security Plan (SSP)</b>
 *   : A system security plan, such as those described in NIST SP 800-18.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getImportProfile <em>Import Profile</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemCharacteristics <em>System Characteristics</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemImplementation <em>System Implementation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan()
 * @model extendedMetaData="name='oscal-ssp-system-security-plan-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SystemSecurityPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Import Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Profile</em>' containment reference.
	 * @see #setImportProfile(ImportProfile)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_ImportProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='import-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportProfile getImportProfile();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getImportProfile <em>Import Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Profile</em>' containment reference.
	 * @see #getImportProfile()
	 * @generated
	 */
	void setImportProfile(ImportProfile value);

	/**
	 * Returns the value of the '<em><b>System Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Characteristics</em>' containment reference.
	 * @see #setSystemCharacteristics(SystemCharacteristics)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_SystemCharacteristics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system-characteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemCharacteristics getSystemCharacteristics();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemCharacteristics <em>System Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Characteristics</em>' containment reference.
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	void setSystemCharacteristics(SystemCharacteristics value);

	/**
	 * Returns the value of the '<em><b>System Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Implementation</em>' containment reference.
	 * @see #setSystemImplementation(SystemImplementation)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_SystemImplementation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemImplementation getSystemImplementation();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemImplementation <em>System Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Implementation</em>' containment reference.
	 * @see #getSystemImplementation()
	 * @generated
	 */
	void setSystemImplementation(SystemImplementation value);

	/**
	 * Returns the value of the '<em><b>Control Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Implementation</em>' containment reference.
	 * @see #setControlImplementation(SspControlImplementation)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_ControlImplementation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='control-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	SspControlImplementation getControlImplementation();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getControlImplementation <em>Control Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Implementation</em>' containment reference.
	 * @see #getControlImplementation()
	 * @generated
	 */
	void setControlImplementation(SspControlImplementation value);

	/**
	 * Returns the value of the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Matter</em>' containment reference.
	 * @see #setBackMatter(BackMatter)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_BackMatter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='back-matter' namespace='##targetNamespace'"
	 * @generated
	 */
	BackMatter getBackMatter();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getBackMatter <em>Back Matter</em>}' containment reference.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Security Plan Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this system security plan (SSP) elsewhere in this or other OSCAL instances. The locally defined UUID of the SSP can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance).This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemSecurityPlan_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // SystemSecurityPlan
