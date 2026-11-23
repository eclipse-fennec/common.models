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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CIM_OpaqueManagementData;
import org.dmtf.cim.CIM_OpaqueManagementDataService;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Opaque Management Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataServiceImpl#getAvailableStorage <em>Available Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataServiceImpl#getLockTimeout <em>Lock Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataServiceImpl#getMaxCreateSize <em>Max Create Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OpaqueManagementDataServiceImpl extends CIM_ServiceImpl implements CIM_OpaqueManagementDataService {
	/**
	 * The default value of the '{@link #getAvailableStorage() <em>Available Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStorage()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVAILABLE_STORAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableStorage() <em>Available Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStorage()
	 * @generated
	 * @ordered
	 */
	protected Long availableStorage = AVAILABLE_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockTimeout() <em>Lock Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCK_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockTimeout() <em>Lock Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockTimeout()
	 * @generated
	 * @ordered
	 */
	protected String lockTimeout = LOCK_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCreateSize() <em>Max Create Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCreateSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CREATE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCreateSize() <em>Max Create Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCreateSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxCreateSize = MAX_CREATE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OpaqueManagementDataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OpaqueManagementDataService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAvailableStorage() {
		return availableStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableStorage(Long newAvailableStorage) {
		Long oldAvailableStorage = availableStorage;
		availableStorage = newAvailableStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__AVAILABLE_STORAGE, oldAvailableStorage, availableStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLockTimeout() {
		return lockTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockTimeout(String newLockTimeout) {
		String oldLockTimeout = lockTimeout;
		lockTimeout = newLockTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__LOCK_TIMEOUT, oldLockTimeout, lockTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCreateSize() {
		return maxCreateSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCreateSize(Long newMaxCreateSize) {
		Long oldMaxCreateSize = maxCreateSize;
		maxCreateSize = newMaxCreateSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__MAX_CREATE_SIZE, oldMaxCreateSize, maxCreateSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AssignAccess(CIM_Identity Identity, CIM_OpaqueManagementData OpaqueManagementData, EList<Integer> Activities) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Create(Long MaxSize, String DataFormat, String ElementName, CIM_Identity Owner, CIM_StorageExtent BasedOnExtent, CIM_OpaqueManagementData OpaqueManagementData, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ExportToURI(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, String ExportURI, EList<Integer> LockToken, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ImportFromURI(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, Boolean Truncate, String ImportURI, EList<Integer> LockToken, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Lock(CIM_OpaqueManagementData OpaqueManagementData, Boolean Lock, EList<Integer> LockToken) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Read(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, EList<Integer> Data, EList<Integer> LockToken) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ReassignOwnership(CIM_Identity NewOwner, CIM_OpaqueManagementData OpaqueManagementData) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Write(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, Boolean Truncate, EList<Integer> Data, EList<Integer> LockToken, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__AVAILABLE_STORAGE:
				return getAvailableStorage();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__LOCK_TIMEOUT:
				return getLockTimeout();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__MAX_CREATE_SIZE:
				return getMaxCreateSize();
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__AVAILABLE_STORAGE:
				setAvailableStorage((Long)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__LOCK_TIMEOUT:
				setLockTimeout((String)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__MAX_CREATE_SIZE:
				setMaxCreateSize((Long)newValue);
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__AVAILABLE_STORAGE:
				setAvailableStorage(AVAILABLE_STORAGE_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__LOCK_TIMEOUT:
				setLockTimeout(LOCK_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__MAX_CREATE_SIZE:
				setMaxCreateSize(MAX_CREATE_SIZE_EDEFAULT);
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__AVAILABLE_STORAGE:
				return AVAILABLE_STORAGE_EDEFAULT == null ? availableStorage != null : !AVAILABLE_STORAGE_EDEFAULT.equals(availableStorage);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__LOCK_TIMEOUT:
				return LOCK_TIMEOUT_EDEFAULT == null ? lockTimeout != null : !LOCK_TIMEOUT_EDEFAULT.equals(lockTimeout);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE__MAX_CREATE_SIZE:
				return MAX_CREATE_SIZE_EDEFAULT == null ? maxCreateSize != null : !MAX_CREATE_SIZE_EDEFAULT.equals(maxCreateSize);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___ASSIGN_ACCESS__CIM_IDENTITY_CIM_OPAQUEMANAGEMENTDATA_ELIST:
				return AssignAccess((CIM_Identity)arguments.get(0), (CIM_OpaqueManagementData)arguments.get(1), (EList<Integer>)arguments.get(2));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___CREATE__LONG_STRING_STRING_CIM_IDENTITY_CIM_STORAGEEXTENT_CIM_OPAQUEMANAGEMENTDATA_CIM_CONCRETEJOB:
				return Create((Long)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (CIM_Identity)arguments.get(3), (CIM_StorageExtent)arguments.get(4), (CIM_OpaqueManagementData)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___EXPORT_TO_URI__CIM_OPAQUEMANAGEMENTDATA_LONG_LONG_STRING_ELIST_CIM_CONCRETEJOB:
				return ExportToURI((CIM_OpaqueManagementData)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (String)arguments.get(3), (EList<Integer>)arguments.get(4), (CIM_ConcreteJob)arguments.get(5));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___IMPORT_FROM_URI__CIM_OPAQUEMANAGEMENTDATA_LONG_LONG_BOOLEAN_STRING_ELIST_CIM_CONCRETEJOB:
				return ImportFromURI((CIM_OpaqueManagementData)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (Boolean)arguments.get(3), (String)arguments.get(4), (EList<Integer>)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___LOCK__CIM_OPAQUEMANAGEMENTDATA_BOOLEAN_ELIST:
				return Lock((CIM_OpaqueManagementData)arguments.get(0), (Boolean)arguments.get(1), (EList<Integer>)arguments.get(2));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___READ__CIM_OPAQUEMANAGEMENTDATA_LONG_LONG_ELIST_ELIST:
				return Read((CIM_OpaqueManagementData)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (EList<Integer>)arguments.get(3), (EList<Integer>)arguments.get(4));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___REASSIGN_OWNERSHIP__CIM_IDENTITY_CIM_OPAQUEMANAGEMENTDATA:
				return ReassignOwnership((CIM_Identity)arguments.get(0), (CIM_OpaqueManagementData)arguments.get(1));
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE___WRITE__CIM_OPAQUEMANAGEMENTDATA_LONG_LONG_BOOLEAN_ELIST_ELIST_CIM_CONCRETEJOB:
				return Write((CIM_OpaqueManagementData)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (Boolean)arguments.get(3), (EList<Integer>)arguments.get(4), (EList<Integer>)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (AvailableStorage: ");
		result.append(availableStorage);
		result.append(", LockTimeout: ");
		result.append(lockTimeout);
		result.append(", MaxCreateSize: ");
		result.append(maxCreateSize);
		result.append(')');
		return result.toString();
	}

} //CIM_OpaqueManagementDataServiceImpl
