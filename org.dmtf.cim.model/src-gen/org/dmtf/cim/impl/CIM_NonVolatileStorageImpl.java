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

import org.dmtf.cim.CIM_NonVolatileStorage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Non Volatile Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NonVolatileStorageImpl#getIsWriteable <em>Is Writeable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NonVolatileStorageImpl#getApplicationWriteable <em>Application Writeable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NonVolatileStorageImpl#getStartAddressForApplicationWrite <em>Start Address For Application Write</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NonVolatileStorageImpl#getApplicationWriteableSize <em>Application Writeable Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NonVolatileStorageImpl extends CIM_MemoryImpl implements CIM_NonVolatileStorage {
	/**
	 * The default value of the '{@link #getIsWriteable() <em>Is Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsWriteable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_WRITEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsWriteable() <em>Is Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsWriteable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isWriteable = IS_WRITEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationWriteable() <em>Application Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationWriteable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPLICATION_WRITEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationWriteable() <em>Application Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationWriteable()
	 * @generated
	 * @ordered
	 */
	protected Boolean applicationWriteable = APPLICATION_WRITEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartAddressForApplicationWrite() <em>Start Address For Application Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddressForApplicationWrite()
	 * @generated
	 * @ordered
	 */
	protected static final Long START_ADDRESS_FOR_APPLICATION_WRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartAddressForApplicationWrite() <em>Start Address For Application Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddressForApplicationWrite()
	 * @generated
	 * @ordered
	 */
	protected Long startAddressForApplicationWrite = START_ADDRESS_FOR_APPLICATION_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationWriteableSize() <em>Application Writeable Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationWriteableSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long APPLICATION_WRITEABLE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationWriteableSize() <em>Application Writeable Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationWriteableSize()
	 * @generated
	 * @ordered
	 */
	protected Long applicationWriteableSize = APPLICATION_WRITEABLE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NonVolatileStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NonVolatileStorage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsWriteable() {
		return isWriteable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsWriteable(Boolean newIsWriteable) {
		Boolean oldIsWriteable = isWriteable;
		isWriteable = newIsWriteable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NON_VOLATILE_STORAGE__IS_WRITEABLE, oldIsWriteable, isWriteable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getApplicationWriteable() {
		return applicationWriteable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationWriteable(Boolean newApplicationWriteable) {
		Boolean oldApplicationWriteable = applicationWriteable;
		applicationWriteable = newApplicationWriteable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE, oldApplicationWriteable, applicationWriteable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStartAddressForApplicationWrite() {
		return startAddressForApplicationWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartAddressForApplicationWrite(Long newStartAddressForApplicationWrite) {
		Long oldStartAddressForApplicationWrite = startAddressForApplicationWrite;
		startAddressForApplicationWrite = newStartAddressForApplicationWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NON_VOLATILE_STORAGE__START_ADDRESS_FOR_APPLICATION_WRITE, oldStartAddressForApplicationWrite, startAddressForApplicationWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getApplicationWriteableSize() {
		return applicationWriteableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationWriteableSize(Long newApplicationWriteableSize) {
		Long oldApplicationWriteableSize = applicationWriteableSize;
		applicationWriteableSize = newApplicationWriteableSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE_SIZE, oldApplicationWriteableSize, applicationWriteableSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NON_VOLATILE_STORAGE__IS_WRITEABLE:
				return getIsWriteable();
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE:
				return getApplicationWriteable();
			case CimPackage.CIM_NON_VOLATILE_STORAGE__START_ADDRESS_FOR_APPLICATION_WRITE:
				return getStartAddressForApplicationWrite();
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE_SIZE:
				return getApplicationWriteableSize();
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
			case CimPackage.CIM_NON_VOLATILE_STORAGE__IS_WRITEABLE:
				setIsWriteable((Boolean)newValue);
				return;
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE:
				setApplicationWriteable((Boolean)newValue);
				return;
			case CimPackage.CIM_NON_VOLATILE_STORAGE__START_ADDRESS_FOR_APPLICATION_WRITE:
				setStartAddressForApplicationWrite((Long)newValue);
				return;
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE_SIZE:
				setApplicationWriteableSize((Long)newValue);
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
			case CimPackage.CIM_NON_VOLATILE_STORAGE__IS_WRITEABLE:
				setIsWriteable(IS_WRITEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE:
				setApplicationWriteable(APPLICATION_WRITEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_NON_VOLATILE_STORAGE__START_ADDRESS_FOR_APPLICATION_WRITE:
				setStartAddressForApplicationWrite(START_ADDRESS_FOR_APPLICATION_WRITE_EDEFAULT);
				return;
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE_SIZE:
				setApplicationWriteableSize(APPLICATION_WRITEABLE_SIZE_EDEFAULT);
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
			case CimPackage.CIM_NON_VOLATILE_STORAGE__IS_WRITEABLE:
				return IS_WRITEABLE_EDEFAULT == null ? isWriteable != null : !IS_WRITEABLE_EDEFAULT.equals(isWriteable);
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE:
				return APPLICATION_WRITEABLE_EDEFAULT == null ? applicationWriteable != null : !APPLICATION_WRITEABLE_EDEFAULT.equals(applicationWriteable);
			case CimPackage.CIM_NON_VOLATILE_STORAGE__START_ADDRESS_FOR_APPLICATION_WRITE:
				return START_ADDRESS_FOR_APPLICATION_WRITE_EDEFAULT == null ? startAddressForApplicationWrite != null : !START_ADDRESS_FOR_APPLICATION_WRITE_EDEFAULT.equals(startAddressForApplicationWrite);
			case CimPackage.CIM_NON_VOLATILE_STORAGE__APPLICATION_WRITEABLE_SIZE:
				return APPLICATION_WRITEABLE_SIZE_EDEFAULT == null ? applicationWriteableSize != null : !APPLICATION_WRITEABLE_SIZE_EDEFAULT.equals(applicationWriteableSize);
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
		result.append(" (IsWriteable: ");
		result.append(isWriteable);
		result.append(", ApplicationWriteable: ");
		result.append(applicationWriteable);
		result.append(", StartAddressForApplicationWrite: ");
		result.append(startAddressForApplicationWrite);
		result.append(", ApplicationWriteableSize: ");
		result.append(applicationWriteableSize);
		result.append(')');
		return result.toString();
	}

} //CIM_NonVolatileStorageImpl
