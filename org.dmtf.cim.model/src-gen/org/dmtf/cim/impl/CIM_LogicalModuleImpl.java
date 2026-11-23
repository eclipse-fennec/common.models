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

import org.dmtf.cim.CIM_LogicalModule;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalModuleImpl#getModuleNumber <em>Module Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalModuleImpl#getLogicalModuleType <em>Logical Module Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalModuleImpl#getOtherLogicalModuleTypeDescription <em>Other Logical Module Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalModuleImpl extends CIM_LogicalDeviceImpl implements CIM_LogicalModule {
	/**
	 * The default value of the '{@link #getModuleNumber() <em>Module Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODULE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleNumber() <em>Module Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer moduleNumber = MODULE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalModuleType() <em>Logical Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModuleType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOGICAL_MODULE_TYPE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getLogicalModuleType() <em>Logical Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModuleType()
	 * @generated
	 * @ordered
	 */
	protected Integer logicalModuleType = LOGICAL_MODULE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLogicalModuleTypeDescription() <em>Other Logical Module Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogicalModuleTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLogicalModuleTypeDescription() <em>Other Logical Module Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogicalModuleTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherLogicalModuleTypeDescription = OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getModuleNumber() {
		return moduleNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleNumber(Integer newModuleNumber) {
		Integer oldModuleNumber = moduleNumber;
		moduleNumber = newModuleNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_MODULE__MODULE_NUMBER, oldModuleNumber, moduleNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLogicalModuleType() {
		return logicalModuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalModuleType(Integer newLogicalModuleType) {
		Integer oldLogicalModuleType = logicalModuleType;
		logicalModuleType = newLogicalModuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_MODULE__LOGICAL_MODULE_TYPE, oldLogicalModuleType, logicalModuleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLogicalModuleTypeDescription() {
		return otherLogicalModuleTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLogicalModuleTypeDescription(String newOtherLogicalModuleTypeDescription) {
		String oldOtherLogicalModuleTypeDescription = otherLogicalModuleTypeDescription;
		otherLogicalModuleTypeDescription = newOtherLogicalModuleTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION, oldOtherLogicalModuleTypeDescription, otherLogicalModuleTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_MODULE__MODULE_NUMBER:
				return getModuleNumber();
			case CimPackage.CIM_LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				return getLogicalModuleType();
			case CimPackage.CIM_LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				return getOtherLogicalModuleTypeDescription();
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
			case CimPackage.CIM_LOGICAL_MODULE__MODULE_NUMBER:
				setModuleNumber((Integer)newValue);
				return;
			case CimPackage.CIM_LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				setLogicalModuleType((Integer)newValue);
				return;
			case CimPackage.CIM_LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				setOtherLogicalModuleTypeDescription((String)newValue);
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
			case CimPackage.CIM_LOGICAL_MODULE__MODULE_NUMBER:
				setModuleNumber(MODULE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				setLogicalModuleType(LOGICAL_MODULE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				setOtherLogicalModuleTypeDescription(OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_MODULE__MODULE_NUMBER:
				return MODULE_NUMBER_EDEFAULT == null ? moduleNumber != null : !MODULE_NUMBER_EDEFAULT.equals(moduleNumber);
			case CimPackage.CIM_LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				return LOGICAL_MODULE_TYPE_EDEFAULT == null ? logicalModuleType != null : !LOGICAL_MODULE_TYPE_EDEFAULT.equals(logicalModuleType);
			case CimPackage.CIM_LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				return OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT == null ? otherLogicalModuleTypeDescription != null : !OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT.equals(otherLogicalModuleTypeDescription);
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
		result.append(" (ModuleNumber: ");
		result.append(moduleNumber);
		result.append(", LogicalModuleType: ");
		result.append(logicalModuleType);
		result.append(", OtherLogicalModuleTypeDescription: ");
		result.append(otherLogicalModuleTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalModuleImpl
