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

import java.util.Collection;

import org.dmtf.cim.CIM_PCIeSwitch;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM PC Ie Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIeSwitchImpl#getNumberOfPorts <em>Number Of Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIeSwitchImpl#getSecondaryBusNumbers <em>Secondary Bus Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PCIeSwitchImpl extends CIM_PCIDeviceImpl implements CIM_PCIeSwitch {
	/**
	 * The default value of the '{@link #getNumberOfPorts() <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfPorts() <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPorts()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfPorts = NUMBER_OF_PORTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecondaryBusNumbers() <em>Secondary Bus Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryBusNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> secondaryBusNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PCIeSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PCIeSwitch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfPorts() {
		return numberOfPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfPorts(Integer newNumberOfPorts) {
		Integer oldNumberOfPorts = numberOfPorts;
		numberOfPorts = newNumberOfPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PC_IE_SWITCH__NUMBER_OF_PORTS, oldNumberOfPorts, numberOfPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSecondaryBusNumbers() {
		if (secondaryBusNumbers == null) {
			secondaryBusNumbers = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PC_IE_SWITCH__SECONDARY_BUS_NUMBERS);
		}
		return secondaryBusNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PC_IE_SWITCH__NUMBER_OF_PORTS:
				return getNumberOfPorts();
			case CimPackage.CIM_PC_IE_SWITCH__SECONDARY_BUS_NUMBERS:
				return getSecondaryBusNumbers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_PC_IE_SWITCH__NUMBER_OF_PORTS:
				setNumberOfPorts((Integer)newValue);
				return;
			case CimPackage.CIM_PC_IE_SWITCH__SECONDARY_BUS_NUMBERS:
				getSecondaryBusNumbers().clear();
				getSecondaryBusNumbers().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PC_IE_SWITCH__NUMBER_OF_PORTS:
				setNumberOfPorts(NUMBER_OF_PORTS_EDEFAULT);
				return;
			case CimPackage.CIM_PC_IE_SWITCH__SECONDARY_BUS_NUMBERS:
				getSecondaryBusNumbers().clear();
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
			case CimPackage.CIM_PC_IE_SWITCH__NUMBER_OF_PORTS:
				return NUMBER_OF_PORTS_EDEFAULT == null ? numberOfPorts != null : !NUMBER_OF_PORTS_EDEFAULT.equals(numberOfPorts);
			case CimPackage.CIM_PC_IE_SWITCH__SECONDARY_BUS_NUMBERS:
				return secondaryBusNumbers != null && !secondaryBusNumbers.isEmpty();
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
		result.append(" (NumberOfPorts: ");
		result.append(numberOfPorts);
		result.append(", SecondaryBusNumbers: ");
		result.append(secondaryBusNumbers);
		result.append(')');
		return result.toString();
	}

} //CIM_PCIeSwitchImpl
