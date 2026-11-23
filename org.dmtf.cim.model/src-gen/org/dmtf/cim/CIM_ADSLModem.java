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
 * A representation of the model object '<em><b>CIM ADSL Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ADSLModem class represents Modems of the DSL type = ADSL, Asymmetric Digital Subscriber Line.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ADSLModem#getNoiseMargin <em>Noise Margin</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ADSLModem#getLineAttenuation <em>Line Attenuation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ADSLModem#getLineState <em>Line State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ADSLModem#getTotalOutputPower <em>Total Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ADSLModem#getMaxDataRate <em>Max Data Rate</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ADSLModem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Modems' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ADSLModem extends CIM_DSLModem {
	/**
	 * Returns the value of the '<em><b>Noise Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noise Margin of this Modem with respect to its received signal, in tenths of dB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Margin</em>' attribute.
	 * @see #setNoiseMargin(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ADSLModem_NoiseMargin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Tenths of Decibels' PUnit='decibel * 10^-1'"
	 * @generated
	 */
	Long getNoiseMargin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ADSLModem#getNoiseMargin <em>Noise Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Margin</em>' attribute.
	 * @see #getNoiseMargin()
	 * @generated
	 */
	void setNoiseMargin(Long value);

	/**
	 * Returns the value of the '<em><b>Line Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measured difference in the total power transmitted by the peer Modem and the total power received by this Modem. This value is measured in tenths of dB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Attenuation</em>' attribute.
	 * @see #setLineAttenuation(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ADSLModem_LineAttenuation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Tenths of Decibels' Gauge='true' PUnit='decibel * 10^-1'"
	 * @generated
	 */
	Long getLineAttenuation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ADSLModem#getLineAttenuation <em>Line Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Attenuation</em>' attribute.
	 * @see #getLineAttenuation()
	 * @generated
	 */
	void setLineAttenuation(Long value);

	/**
	 * Returns the value of the '<em><b>Line State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status indicates the current state of the connection (line). The property holds a bit map that describes the possible conditions. For example, 
	 * 1) No Defect - There are no defects on the line; 
	 * 2) Loss Of Framing - ATUR failure due to the inability to receive a valid frame; 
	 * 4) Loss Of Signal - ATUR failure due to the inability to receive a signal; 
	 * 8) Loss Of Power - ATUR failure due to loss of power; 
	 * 32) Loss Of Signal Quality - Loss of Signal Quality is declared when the NoiseMargin falls below the minimum NoiseMargin, or the bit-error-rate exceeds 10^-7.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line State</em>' attribute.
	 * @see #setLineState(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ADSLModem_LineState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"4\",\"8\",\"32\"]' Values='[\"No Defect\",\"Loss Of Framing\",\"Loss Of Signal\",\"Loss Of Power\",\"Loss Of Signal Quality\"]'"
	 * @generated
	 */
	Long getLineState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ADSLModem#getLineState <em>Line State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line State</em>' attribute.
	 * @see #getLineState()
	 * @generated
	 */
	void setLineState(Long value);

	/**
	 * Returns the value of the '<em><b>Total Output Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measured total output power (in tenths of dB) transmitted by this Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Output Power</em>' attribute.
	 * @see #setTotalOutputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ADSLModem_TotalOutputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Tenths of Decibels' Gauge='true' PUnit='decibel * 10^-1'"
	 * @generated
	 */
	Long getTotalOutputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ADSLModem#getTotalOutputPower <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Output Power</em>' attribute.
	 * @see #getTotalOutputPower()
	 * @generated
	 */
	void setTotalOutputPower(Long value);

	/**
	 * Returns the value of the '<em><b>Max Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum currently attainable data rate for the Modem. This value will be equal to or greater than the current line rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Rate</em>' attribute.
	 * @see #setMaxDataRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ADSLModem_MaxDataRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxDataRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ADSLModem#getMaxDataRate <em>Max Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Rate</em>' attribute.
	 * @see #getMaxDataRate()
	 * @generated
	 */
	void setMaxDataRate(Long value);

} // CIM_ADSLModem
