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
 * A representation of the model object '<em><b>CIM Alarm Device Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AlarmDeviceCapabilities describes the capabilities supported for changing the state OF THE ASSOCIATED AlarmDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDeviceCapabilities#getRequestedAlarmStatesSupported <em>Requested Alarm States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDeviceCapabilities#getAlarmIndicatorTypesConfigurable <em>Alarm Indicator Types Configurable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDeviceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AlarmDeviceCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Requested Alarm States Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestedAlarmStatesSupported indicates the possible states that can be requested when using the method SetAlarmState on the AlarmDevice. A value of 1 indicates that AlarmDevice indicators may be inactivated, a value of 2 or 3 indicates that AlarmDevice indicators may be activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Alarm States Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDeviceCapabilities_RequestedAlarmStatesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Off\",\"Steady\",\"Alternating\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_AlarmDevice.SetAlarmState\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedAlarmStatesSupported();

	/**
	 * Returns the value of the '<em><b>Alarm Indicator Types Configurable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AlarmIndicatorTypesConfigurable indicates the possible indicators that can be enabled or disabled when using the method SetAlarmIndicator on the AlarmDevice. An indicator is a device that emits sound (Audio), emits light or changes color (Visual), or emits vibrations (Motion) to indicate some condition. Indicators may include the audible alarm on a RAID controller, the location LED on a chassis, or the vibration of a cell phone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Indicator Types Configurable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDeviceCapabilities_AlarmIndicatorTypesConfigurable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Audio\",\"Visual\",\"Motion\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_AlarmDevice.SetAlarmIndicator\"]'"
	 * @generated
	 */
	EList<Integer> getAlarmIndicatorTypesConfigurable();

} // CIM_AlarmDeviceCapabilities
