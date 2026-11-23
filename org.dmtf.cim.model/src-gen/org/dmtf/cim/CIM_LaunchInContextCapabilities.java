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
 * A representation of the model object '<em><b>CIM Launch In Context Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class exposes the capabilities of the Launch in Context service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextCapabilities#getMaxRestrictionListSize <em>Max Restriction List Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LaunchInContextCapabilities#getMaxLaunchPoints <em>Max Launch Points</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Core::LaunchInContext' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LaunchInContextCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Max Restriction List Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property asserts the maximum accepted size of the RestrictedToElement array parameter used in the CIM_LaunchInContextService methods: CreateLaunchPoint, RemoveLaunchPoint, and AssertLaunchPoint.
	 * A zero indicates no defined limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Restriction List Size</em>' attribute.
	 * @see #setMaxRestrictionListSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextCapabilities_MaxRestrictionListSize()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaxRestrictionListSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LaunchInContextCapabilities#getMaxRestrictionListSize <em>Max Restriction List Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Restriction List Size</em>' attribute.
	 * @see #getMaxRestrictionListSize()
	 * @generated
	 */
	void setMaxRestrictionListSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Launch Points</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property asserts the maximum number of CIM_LaunchInContextSAP instances that may be instantiated at one time within the modeled implementation.
	 * A zero indicates no defined limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Launch Points</em>' attribute.
	 * @see #setMaxLaunchPoints(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LaunchInContextCapabilities_MaxLaunchPoints()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaxLaunchPoints();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LaunchInContextCapabilities#getMaxLaunchPoints <em>Max Launch Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Launch Points</em>' attribute.
	 * @see #getMaxLaunchPoints()
	 * @generated
	 */
	void setMaxLaunchPoints(Integer value);

} // CIM_LaunchInContextCapabilities
