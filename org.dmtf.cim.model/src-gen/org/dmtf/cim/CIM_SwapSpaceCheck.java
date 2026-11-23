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
 * A representation of the model object '<em><b>CIM Swap Space Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SwapSpaceCheck specifies the amount of swap space that needs to be available on the computer system. The amount is specified in the SwapSpaceSize property. The details of this Check are compared with the value of the CIM_OperatingSystem. TotalSwapSpaceSize property - where the CIM_OperatingSystem object is related (using RunningOS) to the CIM_Computer System instance that describes the environment. When the value of TotalSwapSpaceSize property is greater than or equal to the value specified in SwapSpaceSize, the Check is satisfied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwapSpaceCheck#getSwapSpaceSize <em>Swap Space Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwapSpaceCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_SwapSpaceCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Swap Space Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SwapSpaceSize property specifies the minimum number of KiloBytes of swap space that needs to be available on the target system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swap Space Size</em>' attribute.
	 * @see #setSwapSpaceSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwapSpaceCheck_SwapSpaceSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' ModelCorrespondence='[\"CIM_OperatingSystem.TotalSwapSpaceSize\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getSwapSpaceSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwapSpaceCheck#getSwapSpaceSize <em>Swap Space Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap Space Size</em>' attribute.
	 * @see #getSwapSpaceSize()
	 * @generated
	 */
	void setSwapSpaceSize(Long value);

} // CIM_SwapSpaceCheck
