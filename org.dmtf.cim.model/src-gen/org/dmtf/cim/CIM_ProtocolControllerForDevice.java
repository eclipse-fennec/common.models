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
 * A representation of the model object '<em><b>CIM Protocol Controller For Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates a subclass of LogicalDevice (for example a Storage Volume) is connected through a specific ProtocolController. In many situations (for example storage LUN masking), there may be many of these associations used to relate to different objects. Therefore subclasses have been defined to optimize enumeration of the associations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerForDevice#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerForDevice#getAccessPriority <em>Access Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerForDevice#getAccessState <em>Access State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForDevice()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.54.1' UMLPackagePath='CIM::Device::ProtocolController' override.Antecedent='CIM_ProtocolController REF' override.Antecedent.Description='The ProtocolController.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The controlled Device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolControllerForDevice extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address of the associated Device in the context of the Antecedent Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Number</em>' attribute.
	 * @see #setDeviceNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForDevice_DeviceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDeviceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerForDevice#getDeviceNumber <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Number</em>' attribute.
	 * @see #getDeviceNumber()
	 * @generated
	 */
	void setDeviceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Access Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the priority given to accesses of the device through this Controller. The highest priority path will have the lowest value for this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Priority</em>' attribute.
	 * @see #setAccessPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForDevice_AccessPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAccessPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerForDevice#getAccessPriority <em>Access Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Priority</em>' attribute.
	 * @see #getAccessPriority()
	 * @generated
	 */
	void setAccessPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Access State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AccessState property describes the accessibility of the LogicalDevice through the ProtocolController. 
	 * Unknown (0) indicates the instrumentation does not know whether access is or is not functioning. 
	 * Active (2) indicates normal access. 
	 * Inactive (3) indicates the instrumentation knows this path is not active, and one of the other values (below) does not apply. 
	 * Replication in Progress (4) indicates that the path is temporarily inactive due to a replication activity. 
	 * Mapping Inconsistency (5) indicates the instrumentation has detected that this path is inactive due to an inconsistency in the DeviceNumber/DeviceAccess configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access State</em>' attribute.
	 * @see #setAccessState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForDevice_AccessState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Active\",\"Inactive\",\"Replication In Progress\",\"Mapping Inconsistency\"]'"
	 * @generated
	 */
	Integer getAccessState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerForDevice#getAccessState <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access State</em>' attribute.
	 * @see #getAccessState()
	 * @generated
	 */
	void setAccessState(Integer value);

} // CIM_ProtocolControllerForDevice
