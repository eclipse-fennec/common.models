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
 * A representation of the model object '<em><b>CIM Computer System Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Similar to the way that LogicalDevices are 'Realized' by PhysicalElements, ComputerSystem may be realized in one or more PhysicalPackages. The ComputerSystemPackage association explicitly defines this relationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystemPackage#getPlatformGUID <em>Platform GUID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemPackage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.13.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_PhysicalPackage REF' override.Antecedent.Description='The PhysicalPackage(s) that realize a Unitary ComputerSystem.' override.Dependent='CIM_ComputerSystem REF' override.Dependent.Description='The UnitaryComputerSystem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ComputerSystemPackage extends CIM_SystemPackaging {
	/**
	 * Returns the value of the '<em><b>Platform GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Gloabally Unique Identifier for the System's Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform GUID</em>' attribute.
	 * @see #setPlatformGUID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemPackage_PlatformGUID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPlatformGUID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ComputerSystemPackage#getPlatformGUID <em>Platform GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform GUID</em>' attribute.
	 * @see #getPlatformGUID()
	 * @generated
	 */
	void setPlatformGUID(String value);

} // CIM_ComputerSystemPackage
