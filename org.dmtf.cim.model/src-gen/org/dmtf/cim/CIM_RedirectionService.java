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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Redirection Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RedirectionService provides the capability to manage redirection services. Examples of this include any video stream directed to a Network Port (by the operating system) on a Computer System redirected out to a remote administrator's console. Similarly this can include input redirected into the same Network Port. Other examples include the redirection of IO from a logical element to a remote or local destination. Each redirection stream is accessible via a SAP. This service can support multiple redirection types via multiple associated SAPs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RedirectionService#getRedirectionServiceType <em>Redirection Service Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedirectionService#getOtherRedirectionServiceType <em>Other Redirection Service Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedirectionService#getMaxCurrentEnabledSAPs <em>Max Current Enabled SA Ps</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedirectionService#getSharingMode <em>Sharing Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.17.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RedirectionService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Redirection Service Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated array indicating the type(s) of Redirection supported by this Service. This value is set to the type of redirection service that this service represents. A value set to 2 = "Text" shall indicate a Text Console Redirection service. A value set to 3 = "KVM" shall indicate a Keyboard, Mouse and Video Console Redirection service. A value set to 4 = "USB" shall indicate a USB Redirection service. A value set to 5 = "media" shall indicate a traditional Media Redirection service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redirection Service Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionService_RedirectionServiceType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Text\",\"KVM\",\"USB\",\"Media\",\"DMTF Reserved\",\"Vendor Specified\"]' ModelCorrespondence='[\"CIM_RedirectionService.OtherRedirectionServiceType\"]'"
	 * @generated
	 */
	EList<Integer> getRedirectionServiceType();

	/**
	 * Returns the value of the '<em><b>Other Redirection Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Redirection Service when the value of the RedirectionServiceType property is set to 1 = "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Redirection Service Type</em>' attribute.
	 * @see #setOtherRedirectionServiceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionService_OtherRedirectionServiceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RedirectionService.RedirectionServiceType\"]'"
	 * @generated
	 */
	String getOtherRedirectionServiceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedirectionService#getOtherRedirectionServiceType <em>Other Redirection Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Redirection Service Type</em>' attribute.
	 * @see #getOtherRedirectionServiceType()
	 * @generated
	 */
	void setOtherRedirectionServiceType(String value);

	/**
	 * Returns the value of the '<em><b>Max Current Enabled SA Ps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of concurrently enabled redirection SAPs. The Service may have multiple (more than this number) SAPs associated with it. However, the number of Active SAPs (EnabledState=Enabled) associated with this Service instance cannot exceed this number. This limitation could come from hardware limitations (e.g. one COM port can only redirect the text to one console), or from any other software resource limitations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Current Enabled SA Ps</em>' attribute.
	 * @see #setMaxCurrentEnabledSAPs(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionService_MaxCurrentEnabledSAPs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaxCurrentEnabledSAPs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedirectionService#getMaxCurrentEnabledSAPs <em>Max Current Enabled SA Ps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Current Enabled SA Ps</em>' attribute.
	 * @see #getMaxCurrentEnabledSAPs()
	 * @generated
	 */
	void setMaxCurrentEnabledSAPs(Integer value);

	/**
	 * Returns the value of the '<em><b>Sharing Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration specifying the impact of enabling the redirection of the text console flow on the original destination of the flow. The original destination is modeled as a concrete subclass of LogicalDevice and associated to this service using a ServiceAffectsElement association). If this value is Exclusive, it shall mean that when the element flow is actively being redirected, then the element being redirected cannot be accessed at the original destination. If this value is Shared, it shall mean that when the element flow is actively being redirected, then the element being redirected can still be accessed at the original destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sharing Mode</em>' attribute.
	 * @see #setSharingMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedirectionService_SharingMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Exclusive\",\"Shared\"]'"
	 * @generated
	 */
	Integer getSharingMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedirectionService#getSharingMode <em>Sharing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharing Mode</em>' attribute.
	 * @see #getSharingMode()
	 * @generated
	 */
	void setSharingMode(Integer value);

} // CIM_RedirectionService
