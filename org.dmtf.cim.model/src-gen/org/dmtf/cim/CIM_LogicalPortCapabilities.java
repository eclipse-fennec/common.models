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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Logical Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalPortCapabilities describes the configuration capabilities for properties in LogicalPortSettings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortCapabilities#getRequestedSpeedsSupported <em>Requested Speeds Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortCapabilities#getAutoSenseSpeedConfigurable <em>Auto Sense Speed Configurable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalPortCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Requested Speeds Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of supported port speeds that can be configured on LogicalPortSettings.RequestedSpeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Speeds Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortCapabilities_RequestedSpeedsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ModelCorrespondence='[\"CIM_NetworkPort.Speed\"]'"
	 * @generated
	 */
	EList<Long> getRequestedSpeedsSupported();

	/**
	 * Returns the value of the '<em><b>Auto Sense Speed Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean indicating whether the value in LogicalPortSettings.AutoSenseSpeed may be changed (TRUE), or may only be viewed (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Sense Speed Configurable</em>' attribute.
	 * @see #setAutoSenseSpeedConfigurable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortCapabilities_AutoSenseSpeedConfigurable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_NetworkPort.Speed\"]'"
	 * @generated
	 */
	Boolean getAutoSenseSpeedConfigurable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortCapabilities#getAutoSenseSpeedConfigurable <em>Auto Sense Speed Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Sense Speed Configurable</em>' attribute.
	 * @see #getAutoSenseSpeedConfigurable()
	 * @generated
	 */
	void setAutoSenseSpeedConfigurable(Boolean value);

} // CIM_LogicalPortCapabilities
