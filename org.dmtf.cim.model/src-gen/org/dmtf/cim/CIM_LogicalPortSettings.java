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
 * A representation of the model object '<em><b>CIM Logical Port Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalPort may be configured via the LogicalPortSettings class. The configuration changes are expected to be stored to non-volatile memory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortSettings#getRequestedSpeed <em>Requested Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortSettings#getAutoSenseSpeed <em>Auto Sense Speed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalPortSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Requested Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Speed</em>' attribute.
	 * @see #setRequestedSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortSettings_RequestedSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bits per Second' MappingStrings='[\"FC-SWAPI.INCITS-T11|UcPortConfigSetLinkSpeed\"]' ModelCorrespondence='[\"CIM_LogicalPort.Speed\"]' PUnit='bit / second'"
	 * @generated
	 */
	Long getRequestedSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortSettings#getRequestedSpeed <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Speed</em>' attribute.
	 * @see #getRequestedSpeed()
	 * @generated
	 */
	void setRequestedSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Auto Sense Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean indicating whether the LogicalPort should automatically negotiate an optimal bandwidth (TRUE), or attempt to communicate only at the RequestedSpeed (FALSE). The actual bandwidth is reported in LogicalPort.Speed. Changing this value to (FALSE) may cause the OperationalStatus to change to [stopped] if the RequestedSpeed is not compatible with the attached device 
	 * Check LogicalPortCapabilities.AutoSenseSpeedConfigurable to see if this value may be changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Sense Speed</em>' attribute.
	 * @see #setAutoSenseSpeed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortSettings_AutoSenseSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"FC-SWAPI.INCITS-T11|UcPortConfigSetLinkSpeed\"]' ModelCorrespondence='[\"CIM_LogicalPort.Speed\",\"CIM_LogicalPortCapabilities.AutoSenseSpeedConfigurable\"]'"
	 * @generated
	 */
	Boolean getAutoSenseSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortSettings#getAutoSenseSpeed <em>Auto Sense Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Sense Speed</em>' attribute.
	 * @see #getAutoSenseSpeed()
	 * @generated
	 */
	void setAutoSenseSpeed(Boolean value);

} // CIM_LogicalPortSettings
