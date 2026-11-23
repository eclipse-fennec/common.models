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
 * A representation of the model object '<em><b>CIM Platform Watchdog Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Capabilities that describes the watchdog service management aspects of a system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogServiceCapabilities#getActionOnExpirationSupported <em>Action On Expiration Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogServiceCapabilities#getWatchdogTimerDataSupported <em>Watchdog Timer Data Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogServiceCapabilities#getLastExpirationDataSupported <em>Last Expiration Data Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::Watchdog' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PlatformWatchdogServiceCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Action On Expiration Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActionOnExpirationSupported indicates the actions which can be performed when the watchdog timer expires. See CIM_PlatformWatchdogService.ActionOnExpiration for a description of the values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action On Expiration Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogServiceCapabilities_ActionOnExpirationSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"None - Status Only\",\"System Reset\",\"System Power Off\",\"System Power Off, then On\",\"Generate System NonMaskableInterrupt (NMI)\",\"Generate System Management Interrupt (SMI)\",\"Reset Monitored Entity\"]' ModelCorrespondence='[\"CIM_PlatformWatchdogService.ActionOnExpiration\"]'"
	 * @generated
	 */
	EList<Integer> getActionOnExpirationSupported();

	/**
	 * Returns the value of the '<em><b>Watchdog Timer Data Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WatchdogTimerDataSupported indicates the data which is provided on the value of the watchdog timer. The values in the enumeration are: A value set to 2 = "Current Value" shall indicate that the time of the current value of the timer is provided. A value set to 3 = "Timer Resolution" shall indicate that the timer resolution for the last expiration is provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Watchdog Timer Data Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogServiceCapabilities_WatchdogTimerDataSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\"]' Values='[\"Current Value\",\"Timer Resolution\"]' ModelCorrespondence='[\"CIM_PlatformWatchdogService.CurrentTimerValue\",\"CIM_PlatformWatchdogService.TimerResolution\"]'"
	 * @generated
	 */
	EList<Integer> getWatchdogTimerDataSupported();

	/**
	 * Returns the value of the '<em><b>Last Expiration Data Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LastExpirationDataSupported indicates the data which is provided on the last expiration of the watchdog timer. The values in the enumeration are: A value set to 2 = "Time" shall indicate that the time of the last expiration is provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Expiration Data Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogServiceCapabilities_LastExpirationDataSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\"]' Values='[\"Time\"]' ModelCorrespondence='[\"CIM_PlatformWatchdogService.TimeOfLastExpiration\"]'"
	 * @generated
	 */
	EList<Integer> getLastExpirationDataSupported();

} // CIM_PlatformWatchdogServiceCapabilities
