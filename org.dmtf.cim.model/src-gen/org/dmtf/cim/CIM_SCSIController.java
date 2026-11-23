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
 * A representation of the model object '<em><b>CIM SCSI Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of this class is deprecated in lieu of SCSIProtocolController. The latter reflects the protocol- related issues of SCSI interfaces, because these are not bus master-type Controllers." Deprecated description: Capabilities and management of the SCSIController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIController#getProtectionManagement <em>Protection Management</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIController#getMaxDataWidth <em>Max Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIController#getMaxTransferRate <em>Max Transfer Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIController#getControllerTimeouts <em>Controller Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIController#getSignalCapabilities <em>Signal Capabilities</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_SCSIProtocolController\"]' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Protection Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: An integer enumeration that indicates whether or not the SCSIController provides redundancy or protection against device failures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Management</em>' attribute.
	 * @see #setProtectionManagement(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIController_ProtectionManagement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Unprotected\",\"Protected\",\"Protected through SCC (SCSI-3 Controller Command)\",\"Protected through SCC-2 (SCSI-3 Controller Command)\"]' MappingStrings='[\"MIF.DMTF|Storage Controller|001.3\"]'"
	 * @generated
	 */
	Integer getProtectionManagement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIController#getProtectionManagement <em>Protection Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Management</em>' attribute.
	 * @see #getProtectionManagement()
	 * @generated
	 */
	void setProtectionManagement(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Maximum data width (in bits) supported by the SCSIController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Width</em>' attribute.
	 * @see #setMaxDataWidth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIController_MaxDataWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]' Units='Bits' MappingStrings='[\"MIF.DMTF|Bus Port|004.7\"]' PUnit='bit'"
	 * @generated
	 */
	Long getMaxDataWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIController#getMaxDataWidth <em>Max Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Width</em>' attribute.
	 * @see #getMaxDataWidth()
	 * @generated
	 */
	void setMaxDataWidth(Long value);

	/**
	 * Returns the value of the '<em><b>Max Transfer Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Maximum transfer rate (in Bits per Second) supported by the SCSIController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Transfer Rate</em>' attribute.
	 * @see #setMaxTransferRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIController_MaxTransferRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Units='Bits per Second' MappingStrings='[\"MIF.DMTF|Bus Port|004.8\"]' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxTransferRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIController#getMaxTransferRate <em>Max Transfer Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Transfer Rate</em>' attribute.
	 * @see #getMaxTransferRate()
	 * @generated
	 */
	void setMaxTransferRate(Long value);

	/**
	 * Returns the value of the '<em><b>Controller Timeouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Number of SCSIController timeouts that have occurred since the TimeOfLastReset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Timeouts</em>' attribute.
	 * @see #setControllerTimeouts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIController_ControllerTimeouts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getControllerTimeouts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIController#getControllerTimeouts <em>Controller Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Timeouts</em>' attribute.
	 * @see #getControllerTimeouts()
	 * @generated
	 */
	void setControllerTimeouts(Long value);

	/**
	 * Returns the value of the '<em><b>Signal Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Signal capabilities that can be supported by the SCSIController. For example, the Controller can support "Single Ended" and "Differential". In this case, the values 3 and 4 would be written to the Signal Capabilities array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIController_SignalCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Single Ended\",\"Differential\",\"Low Voltage Differential\",\"Optical\"]' ModelCorrespondence='[\"CIM_SCSIInterface.SCSISignal\"]'"
	 * @generated
	 */
	EList<Integer> getSignalCapabilities();

} // CIM_SCSIController
