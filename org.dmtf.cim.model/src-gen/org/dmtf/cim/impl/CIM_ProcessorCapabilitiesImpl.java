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

import org.dmtf.cim.CIM_ProcessorCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Processor Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorCapabilitiesImpl#getNumberOfProcessorCores <em>Number Of Processor Cores</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorCapabilitiesImpl#getNumberOfHardwareThreads <em>Number Of Hardware Threads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProcessorCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_ProcessorCapabilities {
	/**
	 * The default value of the '{@link #getNumberOfProcessorCores() <em>Number Of Processor Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessorCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PROCESSOR_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfProcessorCores() <em>Number Of Processor Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessorCores()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfProcessorCores = NUMBER_OF_PROCESSOR_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfHardwareThreads() <em>Number Of Hardware Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfHardwareThreads()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_HARDWARE_THREADS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfHardwareThreads() <em>Number Of Hardware Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfHardwareThreads()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfHardwareThreads = NUMBER_OF_HARDWARE_THREADS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProcessorCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProcessorCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfProcessorCores() {
		return numberOfProcessorCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfProcessorCores(Integer newNumberOfProcessorCores) {
		Integer oldNumberOfProcessorCores = numberOfProcessorCores;
		numberOfProcessorCores = newNumberOfProcessorCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_PROCESSOR_CORES, oldNumberOfProcessorCores, numberOfProcessorCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfHardwareThreads() {
		return numberOfHardwareThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfHardwareThreads(Integer newNumberOfHardwareThreads) {
		Integer oldNumberOfHardwareThreads = numberOfHardwareThreads;
		numberOfHardwareThreads = newNumberOfHardwareThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_HARDWARE_THREADS, oldNumberOfHardwareThreads, numberOfHardwareThreads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_PROCESSOR_CORES:
				return getNumberOfProcessorCores();
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_HARDWARE_THREADS:
				return getNumberOfHardwareThreads();
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
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_PROCESSOR_CORES:
				setNumberOfProcessorCores((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_HARDWARE_THREADS:
				setNumberOfHardwareThreads((Integer)newValue);
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
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_PROCESSOR_CORES:
				setNumberOfProcessorCores(NUMBER_OF_PROCESSOR_CORES_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_HARDWARE_THREADS:
				setNumberOfHardwareThreads(NUMBER_OF_HARDWARE_THREADS_EDEFAULT);
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
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_PROCESSOR_CORES:
				return NUMBER_OF_PROCESSOR_CORES_EDEFAULT == null ? numberOfProcessorCores != null : !NUMBER_OF_PROCESSOR_CORES_EDEFAULT.equals(numberOfProcessorCores);
			case CimPackage.CIM_PROCESSOR_CAPABILITIES__NUMBER_OF_HARDWARE_THREADS:
				return NUMBER_OF_HARDWARE_THREADS_EDEFAULT == null ? numberOfHardwareThreads != null : !NUMBER_OF_HARDWARE_THREADS_EDEFAULT.equals(numberOfHardwareThreads);
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
		result.append(" (NumberOfProcessorCores: ");
		result.append(numberOfProcessorCores);
		result.append(", NumberOfHardwareThreads: ");
		result.append(numberOfHardwareThreads);
		result.append(')');
		return result.toString();
	}

} //CIM_ProcessorCapabilitiesImpl
