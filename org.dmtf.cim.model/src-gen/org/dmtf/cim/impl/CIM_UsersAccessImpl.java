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

import org.dmtf.cim.CIM_UsersAccess;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Users Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UsersAccessImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UsersAccessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UsersAccessImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UsersAccessImpl#getBiometric <em>Biometric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UsersAccessImpl extends CIM_UserEntityImpl implements CIM_UsersAccess {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected String elementID = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBiometric() <em>Biometric</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiometric()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> biometric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UsersAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UsersAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USERS_ACCESS__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USERS_ACCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementID(String newElementID) {
		String oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USERS_ACCESS__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getBiometric() {
		if (biometric == null) {
			biometric = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USERS_ACCESS__BIOMETRIC);
		}
		return biometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USERS_ACCESS__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_USERS_ACCESS__NAME:
				return getName();
			case CimPackage.CIM_USERS_ACCESS__ELEMENT_ID:
				return getElementID();
			case CimPackage.CIM_USERS_ACCESS__BIOMETRIC:
				return getBiometric();
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
			case CimPackage.CIM_USERS_ACCESS__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_USERS_ACCESS__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_USERS_ACCESS__ELEMENT_ID:
				setElementID((String)newValue);
				return;
			case CimPackage.CIM_USERS_ACCESS__BIOMETRIC:
				getBiometric().clear();
				getBiometric().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_USERS_ACCESS__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_USERS_ACCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_USERS_ACCESS__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_USERS_ACCESS__BIOMETRIC:
				getBiometric().clear();
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
			case CimPackage.CIM_USERS_ACCESS__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_USERS_ACCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_USERS_ACCESS__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case CimPackage.CIM_USERS_ACCESS__BIOMETRIC:
				return biometric != null && !biometric.isEmpty();
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
		result.append(" (CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", ElementID: ");
		result.append(elementID);
		result.append(", Biometric: ");
		result.append(biometric);
		result.append(')');
		return result.toString();
	}

} //CIM_UsersAccessImpl
