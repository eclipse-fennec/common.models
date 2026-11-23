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

import org.dmtf.cim.CIM_Door;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DoorImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DoorImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DoorImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DoorImpl#getLastOpened <em>Last Opened</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DoorImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DoorImpl extends CIM_LogicalDeviceImpl implements CIM_Door {
	/**
	 * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected Boolean open = OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastOpened() <em>Last Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOpened()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_OPENED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastOpened() <em>Last Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOpened()
	 * @generated
	 * @ordered
	 */
	protected String lastOpened = LAST_OPENED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DoorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Door();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen(Boolean newOpen) {
		Boolean oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOOR__OPEN, oldOpen, open));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(Boolean newLocked) {
		Boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOOR__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(Long newTimeout) {
		Long oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOOR__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastOpened() {
		return lastOpened;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOpened(String newLastOpened) {
		String oldLastOpened = lastOpened;
		lastOpened = newLastOpened;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DOOR__LAST_OPENED, oldLastOpened, lastOpened));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DOOR__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DOOR__OPEN:
				return getOpen();
			case CimPackage.CIM_DOOR__LOCKED:
				return getLocked();
			case CimPackage.CIM_DOOR__TIMEOUT:
				return getTimeout();
			case CimPackage.CIM_DOOR__LAST_OPENED:
				return getLastOpened();
			case CimPackage.CIM_DOOR__CAPABILITIES:
				return getCapabilities();
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
			case CimPackage.CIM_DOOR__OPEN:
				setOpen((Boolean)newValue);
				return;
			case CimPackage.CIM_DOOR__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case CimPackage.CIM_DOOR__TIMEOUT:
				setTimeout((Long)newValue);
				return;
			case CimPackage.CIM_DOOR__LAST_OPENED:
				setLastOpened((String)newValue);
				return;
			case CimPackage.CIM_DOOR__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DOOR__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case CimPackage.CIM_DOOR__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case CimPackage.CIM_DOOR__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_DOOR__LAST_OPENED:
				setLastOpened(LAST_OPENED_EDEFAULT);
				return;
			case CimPackage.CIM_DOOR__CAPABILITIES:
				getCapabilities().clear();
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
			case CimPackage.CIM_DOOR__OPEN:
				return OPEN_EDEFAULT == null ? open != null : !OPEN_EDEFAULT.equals(open);
			case CimPackage.CIM_DOOR__LOCKED:
				return LOCKED_EDEFAULT == null ? locked != null : !LOCKED_EDEFAULT.equals(locked);
			case CimPackage.CIM_DOOR__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case CimPackage.CIM_DOOR__LAST_OPENED:
				return LAST_OPENED_EDEFAULT == null ? lastOpened != null : !LAST_OPENED_EDEFAULT.equals(lastOpened);
			case CimPackage.CIM_DOOR__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
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
		result.append(" (Open: ");
		result.append(open);
		result.append(", Locked: ");
		result.append(locked);
		result.append(", Timeout: ");
		result.append(timeout);
		result.append(", LastOpened: ");
		result.append(lastOpened);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(')');
		return result.toString();
	}

} //CIM_DoorImpl
