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

import org.dmtf.cim.CIM_MemoryController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryControllerImpl#getProcessorAffinity <em>Processor Affinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemoryControllerImpl extends CIM_ControllerImpl implements CIM_MemoryController {
	/**
	 * The default value of the '{@link #getProcessorAffinity() <em>Processor Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAffinity()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_AFFINITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorAffinity() <em>Processor Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAffinity()
	 * @generated
	 * @ordered
	 */
	protected String processorAffinity = PROCESSOR_AFFINITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemoryController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessorAffinity() {
		return processorAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorAffinity(String newProcessorAffinity) {
		String oldProcessorAffinity = processorAffinity;
		processorAffinity = newProcessorAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_CONTROLLER__PROCESSOR_AFFINITY, oldProcessorAffinity, processorAffinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_CONTROLLER__PROCESSOR_AFFINITY:
				return getProcessorAffinity();
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
			case CimPackage.CIM_MEMORY_CONTROLLER__PROCESSOR_AFFINITY:
				setProcessorAffinity((String)newValue);
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
			case CimPackage.CIM_MEMORY_CONTROLLER__PROCESSOR_AFFINITY:
				setProcessorAffinity(PROCESSOR_AFFINITY_EDEFAULT);
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
			case CimPackage.CIM_MEMORY_CONTROLLER__PROCESSOR_AFFINITY:
				return PROCESSOR_AFFINITY_EDEFAULT == null ? processorAffinity != null : !PROCESSOR_AFFINITY_EDEFAULT.equals(processorAffinity);
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
		result.append(" (ProcessorAffinity: ");
		result.append(processorAffinity);
		result.append(')');
		return result.toString();
	}

} //CIM_MemoryControllerImpl
