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
 * A representation of the model object '<em><b>CIM Priority8021 QMarker Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Priority8021QMarkerService marks the Priority field in an 802.1Q- compliant frame, with a specified value. Frames are marked in order to control the conditioning that they will subsequently receive. Following common practice, the value to be written into the field is represented as an unsigned 8-bit integer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Priority8021QMarkerService#getPriorityValue <em>Priority Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Priority8021QMarkerService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Priority8021QMarkerService extends CIM_MarkerService {
	/**
	 * Returns the value of the '<em><b>Priority Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an unsigned 8-bit integer, representing a value to be used for marking the Priority field in the 802.1Q header. Since the Priority field consists of 3 bits, the values for this property are limited to the range 0..7. When the Priority field is marked, the remaining two bits in the octet are left unchanged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority Value</em>' attribute.
	 * @see #setPriorityValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Priority8021QMarkerService_PriorityValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='7'"
	 * @generated
	 */
	Integer getPriorityValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Priority8021QMarkerService#getPriorityValue <em>Priority Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Value</em>' attribute.
	 * @see #getPriorityValue()
	 * @generated
	 */
	void setPriorityValue(Integer value);

} // CIM_Priority8021QMarkerService
