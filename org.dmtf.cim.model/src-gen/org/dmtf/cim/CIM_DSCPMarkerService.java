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
 * A representation of the model object '<em><b>CIM DSCP Marker Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DSCPMarkerService marks the differentiated services codepoint (DSCP) within the DS field in the IPv4 and IPv6 packet headers, as defined in [R2474]. It is marked with the specific value defined in the property, DSCPValue. Following common practice, the value to be written into the field is represented as an unsigned 8-bit integer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DSCPMarkerService#getDSCPValue <em>DSCP Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DSCPMarkerService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DSCPMarkerService extends CIM_MarkerService {
	/**
	 * Returns the value of the '<em><b>DSCP Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an unsigned 8-bit integer, representing a value to be used for marking the DSCP field in an IPv4 or Ipv6 packet header. Since the DSCP consists of 6 bits, the values for this property are limited to the range 0..63. When the DSCP is marked, the remaining two bits in the DS field are left unchanged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DSCP Value</em>' attribute.
	 * @see #setDSCPValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DSCPMarkerService_DSCPValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='63'"
	 * @generated
	 */
	Integer getDSCPValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DSCPMarkerService#getDSCPValue <em>DSCP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSCP Value</em>' attribute.
	 * @see #getDSCPValue()
	 * @generated
	 */
	void setDSCPValue(Integer value);

} // CIM_DSCPMarkerService
