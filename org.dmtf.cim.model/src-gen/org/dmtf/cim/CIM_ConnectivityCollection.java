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
 * A representation of the model object '<em><b>CIM Connectivity Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectivityCollection groups together a set of ProtocolEndpoints of the same 'type' (i.e., class) which are able to communicate with each other. It may also group related Systems, users or other ManagedElements. A ConnectivityCollection represents the ability to send and/or receive data over a set of ProtocolEndpoints. The collection is defined in the context of an AdminDomain or scoping ComputerSystem. This is mandated by the Hosted Collection association on the SystemSpecificCollection superclass. Note that the entities aggregated into the Collection are specified using the association, MemberOfCollection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConnectivityCollection#getConnectivityStatus <em>Connectivity Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConnectivityCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ConnectivityCollection extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Connectivity Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration describing the current or potential connectivity between endpoints in this collection. Connectivity may be provided or not, or may be in a degraded/partitioned state if one or more endpoints or links have failed. The latter would prevent full connectivity between all elements in the Collection, but would permit connectivity between subsets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectivity Status</em>' attribute.
	 * @see #setConnectivityStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConnectivityCollection_ConnectivityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Connectivity/Up\",\"No Connectivity/Down\",\"Partitioned\"]'"
	 * @generated
	 */
	Integer getConnectivityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConnectivityCollection#getConnectivityStatus <em>Connectivity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Status</em>' attribute.
	 * @see #getConnectivityStatus()
	 * @generated
	 */
	void setConnectivityStatus(Integer value);

} // CIM_ConnectivityCollection
