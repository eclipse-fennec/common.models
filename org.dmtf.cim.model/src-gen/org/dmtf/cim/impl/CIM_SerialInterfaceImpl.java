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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_SerialInterface;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Serial Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialInterfaceImpl#getNumberOfStopBits <em>Number Of Stop Bits</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialInterfaceImpl#getParityInfo <em>Parity Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SerialInterfaceImpl#getFlowControlInfo <em>Flow Control Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SerialInterfaceImpl extends CIM_ControlledByImpl implements CIM_SerialInterface {
	/**
	 * The default value of the '{@link #getNumberOfStopBits() <em>Number Of Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStopBits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_STOP_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfStopBits() <em>Number Of Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStopBits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfStopBits = NUMBER_OF_STOP_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParityInfo() <em>Parity Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARITY_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParityInfo() <em>Parity Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer parityInfo = PARITY_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowControlInfo() <em>Flow Control Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowControlInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLOW_CONTROL_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowControlInfo() <em>Flow Control Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowControlInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer flowControlInfo = FLOW_CONTROL_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SerialInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SerialInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfStopBits() {
		return numberOfStopBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfStopBits(Integer newNumberOfStopBits) {
		Integer oldNumberOfStopBits = numberOfStopBits;
		numberOfStopBits = newNumberOfStopBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERIAL_INTERFACE__NUMBER_OF_STOP_BITS, oldNumberOfStopBits, numberOfStopBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParityInfo() {
		return parityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParityInfo(Integer newParityInfo) {
		Integer oldParityInfo = parityInfo;
		parityInfo = newParityInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERIAL_INTERFACE__PARITY_INFO, oldParityInfo, parityInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFlowControlInfo() {
		return flowControlInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowControlInfo(Integer newFlowControlInfo) {
		Integer oldFlowControlInfo = flowControlInfo;
		flowControlInfo = newFlowControlInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERIAL_INTERFACE__FLOW_CONTROL_INFO, oldFlowControlInfo, flowControlInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERIAL_INTERFACE__NUMBER_OF_STOP_BITS:
				return getNumberOfStopBits();
			case CimPackage.CIM_SERIAL_INTERFACE__PARITY_INFO:
				return getParityInfo();
			case CimPackage.CIM_SERIAL_INTERFACE__FLOW_CONTROL_INFO:
				return getFlowControlInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_SERIAL_INTERFACE__NUMBER_OF_STOP_BITS:
				setNumberOfStopBits((Integer)newValue);
				return;
			case CimPackage.CIM_SERIAL_INTERFACE__PARITY_INFO:
				setParityInfo((Integer)newValue);
				return;
			case CimPackage.CIM_SERIAL_INTERFACE__FLOW_CONTROL_INFO:
				setFlowControlInfo((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_SERIAL_INTERFACE__NUMBER_OF_STOP_BITS:
				setNumberOfStopBits(NUMBER_OF_STOP_BITS_EDEFAULT);
				return;
			case CimPackage.CIM_SERIAL_INTERFACE__PARITY_INFO:
				setParityInfo(PARITY_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_SERIAL_INTERFACE__FLOW_CONTROL_INFO:
				setFlowControlInfo(FLOW_CONTROL_INFO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_SERIAL_INTERFACE__NUMBER_OF_STOP_BITS:
				return NUMBER_OF_STOP_BITS_EDEFAULT == null ? numberOfStopBits != null : !NUMBER_OF_STOP_BITS_EDEFAULT.equals(numberOfStopBits);
			case CimPackage.CIM_SERIAL_INTERFACE__PARITY_INFO:
				return PARITY_INFO_EDEFAULT == null ? parityInfo != null : !PARITY_INFO_EDEFAULT.equals(parityInfo);
			case CimPackage.CIM_SERIAL_INTERFACE__FLOW_CONTROL_INFO:
				return FLOW_CONTROL_INFO_EDEFAULT == null ? flowControlInfo != null : !FLOW_CONTROL_INFO_EDEFAULT.equals(flowControlInfo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (NumberOfStopBits: ");
		result.append(numberOfStopBits);
		result.append(", ParityInfo: ");
		result.append(parityInfo);
		result.append(", FlowControlInfo: ");
		result.append(flowControlInfo);
		result.append(')');
		return result.toString();
	}

} //CIM_SerialInterfaceImpl
