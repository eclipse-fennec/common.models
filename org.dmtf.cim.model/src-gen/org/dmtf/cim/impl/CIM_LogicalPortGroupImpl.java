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

import org.dmtf.cim.CIM_LogicalPortGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Port Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortGroupImpl#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortGroupImpl#getOtherNameFormat <em>Other Name Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalPortGroupImpl extends CIM_SystemSpecificCollectionImpl implements CIM_LogicalPortGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String nameFormat = NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherNameFormat() <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherNameFormat() <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String otherNameFormat = OTHER_NAME_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalPortGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalPortGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameFormat() {
		return nameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameFormat(String newNameFormat) {
		String oldNameFormat = nameFormat;
		nameFormat = newNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_GROUP__NAME_FORMAT, oldNameFormat, nameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherNameFormat() {
		return otherNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherNameFormat(String newOtherNameFormat) {
		String oldOtherNameFormat = otherNameFormat;
		otherNameFormat = newOtherNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_GROUP__OTHER_NAME_FORMAT, oldOtherNameFormat, otherNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME:
				return getName();
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME_FORMAT:
				return getNameFormat();
			case CimPackage.CIM_LOGICAL_PORT_GROUP__OTHER_NAME_FORMAT:
				return getOtherNameFormat();
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
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME_FORMAT:
				setNameFormat((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_GROUP__OTHER_NAME_FORMAT:
				setOtherNameFormat((String)newValue);
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
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME_FORMAT:
				setNameFormat(NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT_GROUP__OTHER_NAME_FORMAT:
				setOtherNameFormat(OTHER_NAME_FORMAT_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_LOGICAL_PORT_GROUP__NAME_FORMAT:
				return NAME_FORMAT_EDEFAULT == null ? nameFormat != null : !NAME_FORMAT_EDEFAULT.equals(nameFormat);
			case CimPackage.CIM_LOGICAL_PORT_GROUP__OTHER_NAME_FORMAT:
				return OTHER_NAME_FORMAT_EDEFAULT == null ? otherNameFormat != null : !OTHER_NAME_FORMAT_EDEFAULT.equals(otherNameFormat);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", NameFormat: ");
		result.append(nameFormat);
		result.append(", OtherNameFormat: ");
		result.append(otherNameFormat);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalPortGroupImpl
