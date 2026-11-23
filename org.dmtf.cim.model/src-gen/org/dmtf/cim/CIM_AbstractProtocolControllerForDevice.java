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
 * A representation of the model object '<em><b>CIM Abstract Protocol Controller For Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract association indicates a subclass of LogicalDevice or a view of a logical device is connected through a specific ProtocolController or view of a ProtocolController. Specific subclasses of this association would identify whether views or specific classes are used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AbstractProtocolControllerForDevice#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractProtocolControllerForDevice#getAccessPriority <em>Access Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractProtocolControllerForDevice#getAccessState <em>Access State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AbstractProtocolControllerForDevice()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Device::ProtocolController' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='A reference to a ProtocolController or a view of a ProtocolController.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='A reference to a LogicalDevice or a view of a LogicalDevice.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AbstractProtocolControllerForDevice extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address of the associated Device in the context of the Antecedent Controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Number</em>' attribute.
	 * @see #setDeviceNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractProtocolControllerForDevice_DeviceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDeviceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractProtocolControllerForDevice#getDeviceNumber <em>Device Number</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractProtocolControllerForDevice_AccessPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAccessPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractProtocolControllerForDevice#getAccessPriority <em>Access Priority</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractProtocolControllerForDevice_AccessState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Active\",\"Inactive\",\"Replication In Progress\",\"Mapping Inconsistency\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getAccessState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractProtocolControllerForDevice#getAccessState <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access State</em>' attribute.
	 * @see #getAccessState()
	 * @generated
	 */
	void setAccessState(Integer value);

} // CIM_AbstractProtocolControllerForDevice
