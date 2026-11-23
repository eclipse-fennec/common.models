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
 * A representation of the model object '<em><b>CIM Virtual Computer System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from ComputerSystem that represents the ability to virtualize or emulate another ComputerSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualComputerSystem#getVirtualSystem <em>Virtual System</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualComputerSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::SystemElements' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualComputerSystem extends CIM_ComputerSystem {
	/**
	 * Returns the value of the '<em><b>Virtual System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of System or hardware platform that is virtualized. OperatingSystem information is obtained via the RunningOS inherited from ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual System</em>' attribute.
	 * @see #setVirtualSystem(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualComputerSystem_VirtualSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVirtualSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualComputerSystem#getVirtualSystem <em>Virtual System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual System</em>' attribute.
	 * @see #getVirtualSystem()
	 * @generated
	 */
	void setVirtualSystem(String value);

} // CIM_VirtualComputerSystem
