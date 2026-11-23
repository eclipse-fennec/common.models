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
 * A representation of the model object '<em><b>CIM Connection Based Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ConnectionBasedModem is the superclass for grouping the numerous types of connection-based Modems. A CableModem is a type of connection-based Modem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConnectionBasedModem#getVendorID <em>Vendor ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConnectionBasedModem()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Device::Modems' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ConnectionBasedModem extends CIM_Modem {
	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VendorID information is reported through Modem-specific requests. For example, for ADSLModem Devices, the VendorID is assigned by T1E1.4 according to T1.413, Appendix D. The correct place in the CIM Schema for this information is in PhysicalElement (the Manufacturer property) for hardware and Product (the Vendor property) if the information is related to Product acquisition. This data is also reported here because it is part of the standard output from the Device and is an optimization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConnectionBasedModem_VendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConnectionBasedModem#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(String value);

} // CIM_ConnectionBasedModem
