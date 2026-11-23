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
 * A representation of the model object '<em><b>CIM IB Subnet Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Infiniband Subnet Manager (SM) is an entity responsible for configuring and managing an IB subnet. It uses Subnet Management Agents (SMA) to access and manage individual nodes. The SM is hosted in the context of a specific computer system (i.e., hosted by an instance of UnitaryComputerSystem), as described by the HostedService association. Note that there may be multiple SMs operating in a subnet, but only the elected master is allowed to perform configuration functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IBSubnetManager#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IBSubnetManager#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IBSubnetManager()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Device::IB' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IBSubnetManager extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administratively assigned priority for this SM, used to establish the master. A higher number indicates a higher priority and likelihood of becoming the master. The property value can be reset by the master SM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IBSubnetManager_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' MappingStrings='[\"MAD.IBTA | SMInfo | Priority\"]'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IBSubnetManager#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated value that indicates the Subnet Manager's State. The values are fairly self-explanatory except for "Not Active". This value indicates that the SM is available to participate in the subnet, but has not been given permission. A value "Unknown" (0) is also defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IBSubnetManager_State()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Not Active\",\"Discovering\",\"Standby\",\"Master\"]' MappingStrings='[\"MAD.IBTA | SMInfo | SMState\"]'"
	 * @generated
	 */
	Integer getState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IBSubnetManager#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Integer value);

} // CIM_IBSubnetManager
