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
 * A representation of the model object '<em><b>CIM Initiator Target Logical Unit Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association that models a host driver path to a logical unit. Each permutation of initiator and target ProtocolEndpoints and logical units is considered a separate path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getTarget <em>Target</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getLogicalUnit <em>Logical Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorTargetLogicalUnitPath()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageDevices' keys='Initiator,Target,LogicalUnit'"
 * @generated
 */
@ProviderType
public interface CIM_InitiatorTargetLogicalUnitPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initiator endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator</em>' reference.
	 * @see #setInitiator(CIM_ProtocolEndpoint)
	 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorTargetLogicalUnitPath_Initiator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF' Key='true'"
	 * @generated
	 */
	CIM_ProtocolEndpoint getInitiator();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getInitiator <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(CIM_ProtocolEndpoint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A target endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CIM_ProtocolEndpoint)
	 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorTargetLogicalUnitPath_Target()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF' Key='true'"
	 * @generated
	 */
	CIM_ProtocolEndpoint getTarget();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CIM_ProtocolEndpoint value);

	/**
	 * Returns the value of the '<em><b>Logical Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subclass of LogicalDevice representing a Logical Unit (such as StorageVolume or TapeDrive). Refer to the Logical Unit Number section of ANSI INCITS 402-2005 , the SCSI-3 Architecture Model (SAM).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Unit</em>' reference.
	 * @see #setLogicalUnit(CIM_LogicalDevice)
	 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorTargetLogicalUnitPath_LogicalUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' Key='true'"
	 * @generated
	 */
	CIM_LogicalDevice getLogicalUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getLogicalUnit <em>Logical Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Unit</em>' reference.
	 * @see #getLogicalUnit()
	 * @generated
	 */
	void setLogicalUnit(CIM_LogicalDevice value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of this path. Values are defined as follows: 
	 * Unknown - the path is unavailable,but the cause is not known. 
	 * Active - The path is okay and active. 
	 * Passive - The path is okay, but is associated with a target port of target port group in standby access state. Only applies to devices with asymmetric access. 
	 * Disabled - The path is disabled by administrative request (DisablePathLU). 
	 * Path Error - The path is unusable due to an error on this path and no SCSI status was received. 
	 * Logical Unit Error - A SCSI status was received for an I/O through this path indicating a logical unit error. 
	 * Reserved - The path is unavailable due to a reservation. 
	 * Removed - The path is unavailable because the OS or drivers marked the pathunusable. 
	 * Transitioning - the path is transitioning between two valid states. 
	 * The only valid values a client can specify are Disabled and Active. All other states are determined by the underlying implementation; attempts to set them should be given an error response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorTargetLogicalUnitPath_State()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Unknown\",\"Active\",\"Passive\",\"Disabled\",\"Path Error\",\"Logical Unit Error\",\"Reserved\",\"Removed\",\"Transitioning\"]' MappingStrings='[\"MP_API.SNIA|MP_PATH_LOGICAL_UNIT_PROPERTIES|pathState\"]'"
	 * @generated
	 */
	Long getState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InitiatorTargetLogicalUnitPath#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Long value);

} // CIM_InitiatorTargetLogicalUnitPath
