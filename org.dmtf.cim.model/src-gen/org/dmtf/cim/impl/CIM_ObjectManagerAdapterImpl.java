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

import org.dmtf.cim.CIM_ObjectManagerAdapter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Object Manager Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerAdapterImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerAdapterImpl#getAdapterType <em>Adapter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerAdapterImpl#getOtherAdapterTypeDescription <em>Other Adapter Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ObjectManagerAdapterImpl extends CIM_WBEMServiceImpl implements CIM_ObjectManagerAdapter {
	/**
	 * The default value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected String handle = HANDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADAPTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterType() <em>Adapter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterType()
	 * @generated
	 * @ordered
	 */
	protected Integer adapterType = ADAPTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAdapterTypeDescription() <em>Other Adapter Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAdapterTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ADAPTER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAdapterTypeDescription() <em>Other Adapter Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAdapterTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherAdapterTypeDescription = OTHER_ADAPTER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ObjectManagerAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ObjectManagerAdapter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHandle() {
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandle(String newHandle) {
		String oldHandle = handle;
		handle = newHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_ADAPTER__HANDLE, oldHandle, handle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAdapterType() {
		return adapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapterType(Integer newAdapterType) {
		Integer oldAdapterType = adapterType;
		adapterType = newAdapterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_ADAPTER__ADAPTER_TYPE, oldAdapterType, adapterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAdapterTypeDescription() {
		return otherAdapterTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAdapterTypeDescription(String newOtherAdapterTypeDescription) {
		String oldOtherAdapterTypeDescription = otherAdapterTypeDescription;
		otherAdapterTypeDescription = newOtherAdapterTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER_ADAPTER__OTHER_ADAPTER_TYPE_DESCRIPTION, oldOtherAdapterTypeDescription, otherAdapterTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__HANDLE:
				return getHandle();
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__ADAPTER_TYPE:
				return getAdapterType();
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__OTHER_ADAPTER_TYPE_DESCRIPTION:
				return getOtherAdapterTypeDescription();
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
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__HANDLE:
				setHandle((String)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__ADAPTER_TYPE:
				setAdapterType((Integer)newValue);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__OTHER_ADAPTER_TYPE_DESCRIPTION:
				setOtherAdapterTypeDescription((String)newValue);
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
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__HANDLE:
				setHandle(HANDLE_EDEFAULT);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__ADAPTER_TYPE:
				setAdapterType(ADAPTER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__OTHER_ADAPTER_TYPE_DESCRIPTION:
				setOtherAdapterTypeDescription(OTHER_ADAPTER_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__ADAPTER_TYPE:
				return ADAPTER_TYPE_EDEFAULT == null ? adapterType != null : !ADAPTER_TYPE_EDEFAULT.equals(adapterType);
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER__OTHER_ADAPTER_TYPE_DESCRIPTION:
				return OTHER_ADAPTER_TYPE_DESCRIPTION_EDEFAULT == null ? otherAdapterTypeDescription != null : !OTHER_ADAPTER_TYPE_DESCRIPTION_EDEFAULT.equals(otherAdapterTypeDescription);
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
		result.append(" (Handle: ");
		result.append(handle);
		result.append(", AdapterType: ");
		result.append(adapterType);
		result.append(", OtherAdapterTypeDescription: ");
		result.append(otherAdapterTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_ObjectManagerAdapterImpl
