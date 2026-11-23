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
 * A representation of the model object '<em><b>CIM To SMarker Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ToSMarkerService marks the ToS (type of service) field in the IPv4 packet header [R791] with a specific value. Packets are marked in order to control the conditioning that they will subsequently receive. Following common practice, the value to be written into the ToS field is represented as an unsigned 8-bit integer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ToSMarkerService#getToSValue <em>To SValue</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ToSMarkerService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ToSMarkerService extends CIM_MarkerService {
	/**
	 * Returns the value of the '<em><b>To SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an unsigned 8-bit integer, representing a value to be used for marking the type of service (ToS) field in the IPv4 packet header. The ToS field is defined to be a complete octet, so the range for this property is 0..255. Some implementations, however, require that the lowest-order bit in the field is always 0. Such an implementation cannot support an odd TosValue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To SValue</em>' attribute.
	 * @see #setToSValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ToSMarkerService_ToSValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getToSValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ToSMarkerService#getToSValue <em>To SValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To SValue</em>' attribute.
	 * @see #getToSValue()
	 * @generated
	 */
	void setToSValue(Integer value);

} // CIM_ToSMarkerService
