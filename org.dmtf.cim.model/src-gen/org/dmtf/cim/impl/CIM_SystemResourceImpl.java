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

import org.dmtf.cim.CIM_SystemResource;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemResourceImpl#getShareable <em>Shareable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemResourceImpl#getImplementationInfo <em>Implementation Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SystemResourceImpl extends CIM_EnabledLogicalElementImpl implements CIM_SystemResource {
	/**
	 * The default value of the '{@link #getShareable() <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHAREABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShareable() <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareable()
	 * @generated
	 * @ordered
	 */
	protected Boolean shareable = SHAREABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationInfo() <em>Implementation Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IMPLEMENTATION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationInfo() <em>Implementation Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer implementationInfo = IMPLEMENTATION_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SystemResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SystemResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getShareable() {
		return shareable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShareable(Boolean newShareable) {
		Boolean oldShareable = shareable;
		shareable = newShareable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_RESOURCE__SHAREABLE, oldShareable, shareable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getImplementationInfo() {
		return implementationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationInfo(Integer newImplementationInfo) {
		Integer oldImplementationInfo = implementationInfo;
		implementationInfo = newImplementationInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_RESOURCE__IMPLEMENTATION_INFO, oldImplementationInfo, implementationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYSTEM_RESOURCE__SHAREABLE:
				return getShareable();
			case CimPackage.CIM_SYSTEM_RESOURCE__IMPLEMENTATION_INFO:
				return getImplementationInfo();
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
			case CimPackage.CIM_SYSTEM_RESOURCE__SHAREABLE:
				setShareable((Boolean)newValue);
				return;
			case CimPackage.CIM_SYSTEM_RESOURCE__IMPLEMENTATION_INFO:
				setImplementationInfo((Integer)newValue);
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
			case CimPackage.CIM_SYSTEM_RESOURCE__SHAREABLE:
				setShareable(SHAREABLE_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_RESOURCE__IMPLEMENTATION_INFO:
				setImplementationInfo(IMPLEMENTATION_INFO_EDEFAULT);
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
			case CimPackage.CIM_SYSTEM_RESOURCE__SHAREABLE:
				return SHAREABLE_EDEFAULT == null ? shareable != null : !SHAREABLE_EDEFAULT.equals(shareable);
			case CimPackage.CIM_SYSTEM_RESOURCE__IMPLEMENTATION_INFO:
				return IMPLEMENTATION_INFO_EDEFAULT == null ? implementationInfo != null : !IMPLEMENTATION_INFO_EDEFAULT.equals(implementationInfo);
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
		result.append(" (Shareable: ");
		result.append(shareable);
		result.append(", ImplementationInfo: ");
		result.append(implementationInfo);
		result.append(')');
		return result.toString();
	}

} //CIM_SystemResourceImpl
