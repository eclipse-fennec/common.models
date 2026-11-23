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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Masking Mapping Exposed Device View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_MaskingMappingExposedDeviceView instance is a view that is derived from CIM_SAPAvailableForElement, CIM_SCSIProtocolController and CIM_ProtocolControllerForUnit.
 * CIM_ElementView may associate CIM_MaskingMappingExposedDeviceView to its underlying elements (regardless of whether or not they are instantiated).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getProtocolEndpoint <em>Protocol Endpoint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getLogicalDevice <em>Logical Device</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCSystemCreationClassName <em>SPC System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCSystemName <em>SPC System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCCreationClassName <em>SPC Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCDeviceID <em>SPC Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getPCFUDeviceNumber <em>PCFU Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getPCFUDeviceAccess <em>PCFU Device Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device' keys='ProtocolEndpoint'"
 * @generated
 */
@ProviderType
public interface CIM_MaskingMappingExposedDeviceView extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_ProtocolEndpoint through which the CIM_LogicalDevice is exposed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Endpoint</em>' reference.
	 * @see #setProtocolEndpoint(CIM_ProtocolEndpoint)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_ProtocolEndpoint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF' Key='true'"
	 * @generated
	 */
	CIM_ProtocolEndpoint getProtocolEndpoint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getProtocolEndpoint <em>Protocol Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Endpoint</em>' reference.
	 * @see #getProtocolEndpoint()
	 * @generated
	 */
	void setProtocolEndpoint(CIM_ProtocolEndpoint value);

	/**
	 * Returns the value of the '<em><b>Logical Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LogicalDevice that is exposed through the ProtocolEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Device</em>' reference.
	 * @see #setLogicalDevice(CIM_LogicalDevice)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_LogicalDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF'"
	 * @generated
	 */
	CIM_LogicalDevice getLogicalDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getLogicalDevice <em>Logical Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Device</em>' reference.
	 * @see #getLogicalDevice()
	 * @generated
	 */
	void setLogicalDevice(CIM_LogicalDevice value);

	/**
	 * Returns the value of the '<em><b>SPC System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the CIM_SCSIProtocolController used with the CIM_ProtocolEndpoint as reported in the underlying CIM_SCSIProtocolController instance for the CIM_ProtocolEndpoint and CIM_LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC System Creation Class Name</em>' attribute.
	 * @see #setSPCSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_SPCSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSPCSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCSystemCreationClassName <em>SPC System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC System Creation Class Name</em>' attribute.
	 * @see #getSPCSystemCreationClassName()
	 * @generated
	 */
	void setSPCSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SPC System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the CIM_SCSIProtocolController used with the CIM_ProtocolEndpoint as reported in the underlying CIM_SCSIProtocolController instance for the CIM_ProtocolEndpoint and CIM_LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC System Name</em>' attribute.
	 * @see #setSPCSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_SPCSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.SystemName\"]'"
	 * @generated
	 */
	String getSPCSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCSystemName <em>SPC System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC System Name</em>' attribute.
	 * @see #getSPCSystemName()
	 * @generated
	 */
	void setSPCSystemName(String value);

	/**
	 * Returns the value of the '<em><b>SPC Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the CIM_SCSIProtocolController used with the CIM_ProtocolEndpoint as reported in the underlying CIM_SCSIProtocolController instance for the CIM_ProtocolEndpoint and CIM_LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Creation Class Name</em>' attribute.
	 * @see #setSPCCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_SPCCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.CreationClassName\"]'"
	 * @generated
	 */
	String getSPCCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCCreationClassName <em>SPC Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Creation Class Name</em>' attribute.
	 * @see #getSPCCreationClassName()
	 * @generated
	 */
	void setSPCCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SPC Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceID for the CIM_LogicalDevice when accessed through the CIM_ProtocolEndpoint as reported in the underlying CIM_ProtocolControllerForUnit instance for the CIM_LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPC Device ID</em>' attribute.
	 * @see #setSPCDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_SPCDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.DeviceID\"]'"
	 * @generated
	 */
	String getSPCDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getSPCDeviceID <em>SPC Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPC Device ID</em>' attribute.
	 * @see #getSPCDeviceID()
	 * @generated
	 */
	void setSPCDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>PCFU Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceNumber (LUN) for the CIM_LogicalDevice when accessed through the CIM_ProtocolEndpoint as reported in the underlying CIM_ProtocolControllerForUnit instance for the CIM_LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PCFU Device Number</em>' attribute.
	 * @see #setPCFUDeviceNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_PCFUDeviceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ProtocolControllerForUnit.DeviceNumber\"]'"
	 * @generated
	 */
	String getPCFUDeviceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getPCFUDeviceNumber <em>PCFU Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCFU Device Number</em>' attribute.
	 * @see #getPCFUDeviceNumber()
	 * @generated
	 */
	void setPCFUDeviceNumber(String value);

	/**
	 * Returns the value of the '<em><b>PCFU Device Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceAccess value for the CIM_LogicalDevice when accessed through the CIM_ProtocolEndpoint as reported in the underlying CIM_ProtocolControllerForUnit instance for the CIM_LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PCFU Device Access</em>' attribute.
	 * @see #setPCFUDeviceAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingMappingExposedDeviceView_PCFUDeviceAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ProtocolControllerForUnit.DeviceAccess\"]'"
	 * @generated
	 */
	Integer getPCFUDeviceAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingMappingExposedDeviceView#getPCFUDeviceAccess <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCFU Device Access</em>' attribute.
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 */
	void setPCFUDeviceAccess(Integer value);

} // CIM_MaskingMappingExposedDeviceView
