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

import org.dmtf.cim.CIM_ProcessorAllocationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Processor Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorAllocationSettingDataImpl#getProcessorArchitecture <em>Processor Architecture</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorAllocationSettingDataImpl#getInstructionSet <em>Instruction Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorAllocationSettingDataImpl#getInstructionSetExtensionName <em>Instruction Set Extension Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorAllocationSettingDataImpl#getInstructionSetExtensionStatus <em>Instruction Set Extension Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProcessorAllocationSettingDataImpl extends CIM_ResourceAllocationSettingDataImpl implements CIM_ProcessorAllocationSettingData {
	/**
	 * The default value of the '{@link #getProcessorArchitecture() <em>Processor Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorArchitecture() <em>Processor Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String processorArchitecture = PROCESSOR_ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionSet() <em>Instruction Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSet()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTION_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructionSet() <em>Instruction Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSet()
	 * @generated
	 * @ordered
	 */
	protected String instructionSet = INSTRUCTION_SET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructionSetExtensionName() <em>Instruction Set Extension Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSetExtensionName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instructionSetExtensionName;

	/**
	 * The cached value of the '{@link #getInstructionSetExtensionStatus() <em>Instruction Set Extension Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSetExtensionStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instructionSetExtensionStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProcessorAllocationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProcessorAllocationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessorArchitecture() {
		return processorArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorArchitecture(String newProcessorArchitecture) {
		String oldProcessorArchitecture = processorArchitecture;
		processorArchitecture = newProcessorArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__PROCESSOR_ARCHITECTURE, oldProcessorArchitecture, processorArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructionSet() {
		return instructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructionSet(String newInstructionSet) {
		String oldInstructionSet = instructionSet;
		instructionSet = newInstructionSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET, oldInstructionSet, instructionSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInstructionSetExtensionName() {
		if (instructionSetExtensionName == null) {
			instructionSetExtensionName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_NAME);
		}
		return instructionSetExtensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInstructionSetExtensionStatus() {
		if (instructionSetExtensionStatus == null) {
			instructionSetExtensionStatus = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_STATUS);
		}
		return instructionSetExtensionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__PROCESSOR_ARCHITECTURE:
				return getProcessorArchitecture();
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET:
				return getInstructionSet();
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_NAME:
				return getInstructionSetExtensionName();
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_STATUS:
				return getInstructionSetExtensionStatus();
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
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__PROCESSOR_ARCHITECTURE:
				setProcessorArchitecture((String)newValue);
				return;
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET:
				setInstructionSet((String)newValue);
				return;
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_NAME:
				getInstructionSetExtensionName().clear();
				getInstructionSetExtensionName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_STATUS:
				getInstructionSetExtensionStatus().clear();
				getInstructionSetExtensionStatus().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__PROCESSOR_ARCHITECTURE:
				setProcessorArchitecture(PROCESSOR_ARCHITECTURE_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET:
				setInstructionSet(INSTRUCTION_SET_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_NAME:
				getInstructionSetExtensionName().clear();
				return;
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_STATUS:
				getInstructionSetExtensionStatus().clear();
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
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__PROCESSOR_ARCHITECTURE:
				return PROCESSOR_ARCHITECTURE_EDEFAULT == null ? processorArchitecture != null : !PROCESSOR_ARCHITECTURE_EDEFAULT.equals(processorArchitecture);
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET:
				return INSTRUCTION_SET_EDEFAULT == null ? instructionSet != null : !INSTRUCTION_SET_EDEFAULT.equals(instructionSet);
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_NAME:
				return instructionSetExtensionName != null && !instructionSetExtensionName.isEmpty();
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA__INSTRUCTION_SET_EXTENSION_STATUS:
				return instructionSetExtensionStatus != null && !instructionSetExtensionStatus.isEmpty();
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
		result.append(" (ProcessorArchitecture: ");
		result.append(processorArchitecture);
		result.append(", InstructionSet: ");
		result.append(instructionSet);
		result.append(", InstructionSetExtensionName: ");
		result.append(instructionSetExtensionName);
		result.append(", InstructionSetExtensionStatus: ");
		result.append(instructionSetExtensionStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_ProcessorAllocationSettingDataImpl
