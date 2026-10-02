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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Characteristics</b>
 *   : Contains the characteristics of the system, such as its name, purpose, and security impact level.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemId <em>System Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemName <em>System Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemNameShort <em>System Name Short</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDateAuthorized <em>Date Authorized</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecuritySensitivityLevel <em>Security Sensitivity Level</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemInformation <em>System Information</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecurityImpactLevel <em>Security Impact Level</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getAuthorizationBoundary <em>Authorization Boundary</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getNetworkArchitecture <em>Network Architecture</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDataFlow <em>Data Flow</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics()
 * @model extendedMetaData="name='oscal-ssp-system-characteristics-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SystemCharacteristics extends EObject {
	/**
	 * Returns the value of the '<em><b>System Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_SystemId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='system-ids'"
	 * @generated
	 */
	EList<SystemId> getSystemId();

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_SystemName()
	 * @model dataType="gov.nist.csrc.ns.oscal.SystemNameType" required="true"
	 *        extendedMetaData="kind='element' name='system-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>System Name Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name Short</em>' attribute.
	 * @see #setSystemNameShort(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_SystemNameShort()
	 * @model dataType="gov.nist.csrc.ns.oscal.SystemNameShortType"
	 *        extendedMetaData="kind='element' name='system-name-short' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemNameShort();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemNameShort <em>System Name Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name Short</em>' attribute.
	 * @see #getSystemNameShort()
	 * @generated
	 */
	void setSystemNameShort(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Description</b>
	 *   : A summary of the system.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Date Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Authorized</em>' attribute.
	 * @see #setDateAuthorized(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_DateAuthorized()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalSspDateAuthorizedFIELD"
	 *        extendedMetaData="kind='element' name='date-authorized' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateAuthorized();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDateAuthorized <em>Date Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Authorized</em>' attribute.
	 * @see #getDateAuthorized()
	 * @generated
	 */
	void setDateAuthorized(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Security Sensitivity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Sensitivity Level</em>' attribute.
	 * @see #setSecuritySensitivityLevel(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_SecuritySensitivityLevel()
	 * @model dataType="gov.nist.csrc.ns.oscal.SecuritySensitivityLevelType"
	 *        extendedMetaData="kind='element' name='security-sensitivity-level' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecuritySensitivityLevel();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecuritySensitivityLevel <em>Security Sensitivity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Sensitivity Level</em>' attribute.
	 * @see #getSecuritySensitivityLevel()
	 * @generated
	 */
	void setSecuritySensitivityLevel(String value);

	/**
	 * Returns the value of the '<em><b>System Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Information</em>' containment reference.
	 * @see #setSystemInformation(SystemInformation)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_SystemInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system-information' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemInformation getSystemInformation();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemInformation <em>System Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Information</em>' containment reference.
	 * @see #getSystemInformation()
	 * @generated
	 */
	void setSystemInformation(SystemInformation value);

	/**
	 * Returns the value of the '<em><b>Security Impact Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Impact Level</em>' containment reference.
	 * @see #setSecurityImpactLevel(SecurityImpactLevel)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_SecurityImpactLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-impact-level' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityImpactLevel getSecurityImpactLevel();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecurityImpactLevel <em>Security Impact Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Impact Level</em>' containment reference.
	 * @see #getSecurityImpactLevel()
	 * @generated
	 */
	void setSecurityImpactLevel(SecurityImpactLevel value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SystemStatus)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemStatus getStatus();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SystemStatus value);

	/**
	 * Returns the value of the '<em><b>Authorization Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Boundary</em>' containment reference.
	 * @see #setAuthorizationBoundary(AuthorizationBoundary)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_AuthorizationBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='authorization-boundary' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorizationBoundary getAuthorizationBoundary();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getAuthorizationBoundary <em>Authorization Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Boundary</em>' containment reference.
	 * @see #getAuthorizationBoundary()
	 * @generated
	 */
	void setAuthorizationBoundary(AuthorizationBoundary value);

	/**
	 * Returns the value of the '<em><b>Network Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Architecture</em>' containment reference.
	 * @see #setNetworkArchitecture(NetworkArchitecture)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_NetworkArchitecture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network-architecture' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkArchitecture getNetworkArchitecture();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getNetworkArchitecture <em>Network Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Architecture</em>' containment reference.
	 * @see #getNetworkArchitecture()
	 * @generated
	 */
	void setNetworkArchitecture(NetworkArchitecture value);

	/**
	 * Returns the value of the '<em><b>Data Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow</em>' containment reference.
	 * @see #setDataFlow(DataFlow)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_DataFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-flow' namespace='##targetNamespace'"
	 * @generated
	 */
	DataFlow getDataFlow();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDataFlow <em>Data Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Flow</em>' containment reference.
	 * @see #getDataFlow()
	 * @generated
	 */
	void setDataFlow(DataFlow value);

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_ResponsibleParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible-party' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='responsible-parties'"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemCharacteristics_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // SystemCharacteristics
