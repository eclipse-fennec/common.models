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
 * A representation of the model object '<em><b>CIM Memory Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MemoryCheck specifies a condition for the minimum amount of memory that needs to be available on a system. The amount is specified in the MemorySize property. The details of this Check are compared with the value of the CIM_OperatingSystem. FreePhysicalMemory property - where the CIM_OperatingSystem object is related (using InstalledOS) to the CIM_Computer System instance that describes the environment. When the value of the FreePhysicalMemory property is greater than or equal to the value specified in MemorySize, the Check is satisfied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCheck#getMemorySize <em>Memory Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of memory that needs to exist on a computer system for a SoftwareElement to execute properly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCheck_MemorySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' ModelCorrespondence='[\"CIM_OperatingSystem.FreePhysicalMemory\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getMemorySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryCheck#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(Long value);

} // CIM_MemoryCheck
