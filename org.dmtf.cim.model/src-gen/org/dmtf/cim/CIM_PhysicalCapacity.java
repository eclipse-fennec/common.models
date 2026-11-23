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
 * A representation of the model object '<em><b>CIM Physical Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PhysicalCapacity is an abstract class describing a PhysicalElement's minimum/maximum requirements and ability to support different types of hardware. For example, minimum and maximum memory requirements can be modeled as a subclass of CIM_PhysicalCapacity. 
 * 
 * Note that the items described in subclasses of PhysicalCapacity, for example the class ConfigurationCapacity, are either directly PhysicalElements (such as I/O slots or storage library magazines) or closely associated to PhysicalElements via the Realizes relationship (i.e., LogicalDevices such as batteries or processors).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalCapacity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalCapacity()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Physical::Misc'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalCapacity extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the label by which the Physical Capacity object is known. When subclassed, the Name property can be overridden to be a Key property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalCapacity_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalCapacity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CIM_PhysicalCapacity
