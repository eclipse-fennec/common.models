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
 * A representation of the model object '<em><b>CIM Wi Fi Radio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WiFiRadio describes a radio transceiver component of a WiFiPort. It is modeled because of the possibility of multiple transceivers being associated with a single port, the possibility of multiple ports being associated with a single radio transceiver, and the possibility of enabling/disabling a radio transceiver independent of its associated WiFiPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WiFiRadio#getSignalStrength <em>Signal Strength</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiRadio#getSignalNoise <em>Signal Noise</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiRadio#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiRadio#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiRadio()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Ports' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiRadio extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Signal Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The received signal strength, in -dBm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Strength</em>' attribute.
	 * @see #setSignalStrength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiRadio_SignalStrength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' PUnit='decibel(m) * -1'"
	 * @generated
	 */
	Long getSignalStrength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiRadio#getSignalStrength <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Strength</em>' attribute.
	 * @see #getSignalStrength()
	 * @generated
	 */
	void setSignalStrength(Long value);

	/**
	 * Returns the value of the '<em><b>Signal Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The received signal noise, in -dBm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Noise</em>' attribute.
	 * @see #setSignalNoise(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiRadio_SignalNoise()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' PUnit='decibel(m) * -1'"
	 * @generated
	 */
	Long getSignalNoise();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiRadio#getSignalNoise <em>Signal Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Noise</em>' attribute.
	 * @see #getSignalNoise()
	 * @generated
	 */
	void setSignalNoise(Long value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Channel shall contain the channel number currently in use by the WiFiRadio to communicate with the station with which it is associated. Each channel number is associated with a particular signal frequency band.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiRadio_Channel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getChannel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiRadio#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(Integer value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency, in Megahertz, of the center frequency of the band (channel) currently in use by the WiFiRado.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiRadio_Frequency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getFrequency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiRadio#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Long value);

} // CIM_WiFiRadio
