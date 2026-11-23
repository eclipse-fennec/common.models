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
 * A representation of the model object '<em><b>CIM FC Active Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association specializes ActiveConnection to represent the connections between two Fibre Channel ProtocolEndpoints. The ActiveConnection can be an ISL, a Host to Switch Link, a Switch to Device Link, or a connection created
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCActiveConnection#getDiscriminator <em>Discriminator</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCActiveConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::FC' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_FCActiveConnection extends CIM_ActiveConnection {
	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration used to discriminate the context in which the ActiveConnectionis instantiated: Not Applicable(2) indicates that this ActiveConnection is not instantiated in any special context, VF(3) indicates that this ActiveConnection is instantiated in the context of Virtual Fabrics, NPIV(7) indicates that this ActiveConnection is instantiated in the context of N Port Virtualization (NPIV), Chassis(9) icdicates that this ActiveConnection is instantiated as part of a chassis to chassis connection, FCoE(10) indicates that this ActiveConnection is instatiated in the context of Fibre Channel over Ethernet (FCoE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCActiveConnection_Discriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"5\",\"7\",\"9\",\"10\",\"..\"]' Values='[\"Unknown\",\"Not Applicable\",\"VF\",\"IFR\",\"NPIV\",\"Chassis\",\"FCoE\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getDiscriminator();

} // CIM_FCActiveConnection
