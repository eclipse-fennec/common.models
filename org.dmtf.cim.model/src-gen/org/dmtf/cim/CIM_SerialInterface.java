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
 * A representation of the model object '<em><b>CIM Serial Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SerialInterface is a ControlledBy relationship that indicates which Devices are accessed through the SerialController and describes the characteristics of this access.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SerialInterface#getNumberOfStopBits <em>Number Of Stop Bits</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SerialInterface#getParityInfo <em>Parity Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SerialInterface#getFlowControlInfo <em>Flow Control Info</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SerialInterface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' override.Antecedent='CIM_SerialController REF' override.Antecedent.Description='The SerialController.' override.NegotiatedDataWidth='uint32' override.NegotiatedDataWidth.Description='For the SerialInterface, NegotiatedDataWidth is the number of data bits to be transmitted, without stop bits or parity.' override.NegotiatedDataWidth.Units='Bits' override.NegotiatedDataWidth.PUnit='bit' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SerialInterface extends CIM_ControlledBy {
	/**
	 * Returns the value of the '<em><b>Number Of Stop Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of stop bits to be transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Stop Bits</em>' attribute.
	 * @see #setNumberOfStopBits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialInterface_NumberOfStopBits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' PUnit='bit'"
	 * @generated
	 */
	Integer getNumberOfStopBits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SerialInterface#getNumberOfStopBits <em>Number Of Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Stop Bits</em>' attribute.
	 * @see #getNumberOfStopBits()
	 * @generated
	 */
	void setNumberOfStopBits(Integer value);

	/**
	 * Returns the value of the '<em><b>Parity Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the parity setting for transmitted data. No parity (value=1), even (value=2), or odd (value=3) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parity Info</em>' attribute.
	 * @see #setParityInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialInterface_ParityInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"None\",\"Even\",\"Odd\"]'"
	 * @generated
	 */
	Integer getParityInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SerialInterface#getParityInfo <em>Parity Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Info</em>' attribute.
	 * @see #getParityInfo()
	 * @generated
	 */
	void setParityInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Flow Control Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration that indicates the flow control (Xon-Xoff or RTS/CTS) for transmitted data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Control Info</em>' attribute.
	 * @see #setFlowControlInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialInterface_FlowControlInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Not Supported\",\"None\",\"XonXoff\",\"RTS/CTS\",\"Both XonXoff and RTS/CTS\"]'"
	 * @generated
	 */
	Integer getFlowControlInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SerialInterface#getFlowControlInfo <em>Flow Control Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Control Info</em>' attribute.
	 * @see #getFlowControlInfo()
	 * @generated
	 */
	void setFlowControlInfo(Integer value);

} // CIM_SerialInterface
