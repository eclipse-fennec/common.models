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
 * A representation of the model object '<em><b>CIM Flow Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a service that supports a particular microflow. The microflow is identified by the string-valued property FlowID. In some implementations, an instance of this class corresponds to an entry in the implementation's flow table.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FlowService#getFlowID <em>Flow ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FlowService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FlowService extends CIM_QoSService {
	/**
	 * Returns the value of the '<em><b>Flow ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a string containing an identifier for a microflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow ID</em>' attribute.
	 * @see #setFlowID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FlowService_FlowID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFlowID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FlowService#getFlowID <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow ID</em>' attribute.
	 * @see #getFlowID()
	 * @generated
	 */
	void setFlowID(String value);

} // CIM_FlowService
