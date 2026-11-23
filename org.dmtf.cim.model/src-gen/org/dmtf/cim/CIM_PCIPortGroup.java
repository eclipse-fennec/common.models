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
 * A representation of the model object '<em><b>CIM PCI Port Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of one or more PCI device ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PCIPortGroup#getBusNumber <em>Bus Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCIPortGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Controller' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCIPortGroup extends CIM_LogicalPortGroup {
	/**
	 * Returns the value of the '<em><b>Bus Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bus number shared by the PCI device ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Number</em>' attribute.
	 * @see #setBusNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIPortGroup_BusNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getBusNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIPortGroup#getBusNumber <em>Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Number</em>' attribute.
	 * @see #getBusNumber()
	 * @generated
	 */
	void setBusNumber(Integer value);

} // CIM_PCIPortGroup
