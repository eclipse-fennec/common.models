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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Tier Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TierDomain is a subclass of AdminDomain that identifies tiers belonging to a domain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TierDomain#getDataMovement <em>Data Movement</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierDomain#getDataMovementState <em>Data Movement State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TierDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TierDomain extends CIM_AdminDomain {
	/**
	 * Returns the value of the '<em><b>Data Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if data movement is automatic or requires manual intervention. 
	 * 'Auto' - Movement of data between tiers happens automatically based on the collected statistics. 
	 * 'Manual' - The actual movement of data between tiers happens when requested by a client. The data movement is still based on the collected statistics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Movement</em>' attribute.
	 * @see #setDataMovement(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierDomain_DataMovement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Auto\",\"Manual\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getDataMovement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierDomain#getDataMovement <em>Data Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Movement</em>' attribute.
	 * @see #getDataMovement()
	 * @generated
	 */
	void setDataMovement(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Movement State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the state of data movement that requires manual intervention.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Movement State</em>' attribute.
	 * @see #setDataMovementState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierDomain_DataMovementState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Not Applicable\",\"Waiting for Approval\",\"Waiting for Scheduled Time\",\"In Progress\",\"Stopped\",\"Paused\",\"Aborted\",\"Completed\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_TierDomain.DataMovement\"]'"
	 * @generated
	 */
	Integer getDataMovementState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierDomain#getDataMovementState <em>Data Movement State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Movement State</em>' attribute.
	 * @see #getDataMovementState()
	 * @generated
	 */
	void setDataMovementState(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the state of manual data movement to be changed to the value specified in the RequestedState parameter. Invoking this method multiple times could result in earlier requests being overwritten or lost. 
	 * If 0 is returned, then the task completed successfully. Any other return code indicates an error condition.
	 * @param RequestedState
	 *   Specifies the requested state. Possible values are as follows: 
	 *   Start: begin manual data movement. 
	 *   Stop: stop manual data movement. 
	 *   Pause: pause data movement. 
	 *   Resume: resume data movement.
	 * @param ProvisioningType
	 *   Specifies the type of elements to move. Possible values are as follows: 
	 *   ThinlyProvisioned: only move thinly provisioned elements. 
	 *   ThicklyProvisioned: only move thickly. 
	 *   provisioned elements. 
	 *   If not specified, "Implementation Decides".
	 * @param TimeoutPeriod
	 *   A timeout period that specifies the maximum amount of time that the client expects the transition to the new state to take. The interval format must be used to specify the TimeoutPeriod. A value of 0 or a null parameter indicates that the client has no time requirements for the transition. 
	 *   If this property does not contain 0 or null and the implementation does not support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' must be returned.
	 * @param StartTime Specifies to data and time for the indicated new requested state. If null, data movement starts as soon as possible.
	 * @param DataMovementInterval Specifies the duration for data movement.The interval format must be used. A value of 0 or a null parameter indicates there is no time limit.
	 * <!-- end-model-doc -->
	 * @model RequestedStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Start\",\"Stop\",\"Pause\",\"Resume\",\"DMTF Reserved\",\"Vendor Reserved\"]'" ProvisioningTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"ThinlyProvisioned\",\"ThicklyProvisioned\",\"Both\",\"Implementation Decides\",\"DMTF Reserved\",\"Vendor Reserved\"]'" TimeoutPeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataMovementIntervalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Can NOT complete within Timeout Period\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Transition Started\",\"Invalid State Transition\",\"Use of Timeout Parameter Not Supported\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RequestDataMovementStateChange(Integer RequestedState, Integer ProvisioningType, String TimeoutPeriod, String StartTime, String DataMovementInterval);

} // CIM_TierDomain
