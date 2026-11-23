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

import org.dmtf.cim.CIM_Memory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getEndingAddress <em>Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorInfo <em>Error Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getOtherErrorDescription <em>Other Error Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getCorrectableError <em>Correctable Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorTime <em>Error Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorAccess <em>Error Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorTransferSize <em>Error Transfer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorData <em>Error Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorDataOrder <em>Error Data Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorAddress <em>Error Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getSystemLevelAddress <em>System Level Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getErrorResolution <em>Error Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryImpl#getAdditionalErrorData <em>Additional Error Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemoryImpl extends CIM_StorageExtentImpl implements CIM_Memory {
	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartingAddress() <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long STARTING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingAddress() <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long startingAddress = STARTING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndingAddress() <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long ENDING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingAddress() <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long endingAddress = ENDING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorInfo() <em>Error Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorInfo() <em>Error Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer errorInfo = ERROR_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherErrorDescription() <em>Other Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ERROR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherErrorDescription() <em>Other Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherErrorDescription = OTHER_ERROR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrectableError() <em>Correctable Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectableError()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CORRECTABLE_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrectableError() <em>Correctable Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectableError()
	 * @generated
	 * @ordered
	 */
	protected Boolean correctableError = CORRECTABLE_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorTime() <em>Error Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorTime() <em>Error Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTime()
	 * @generated
	 * @ordered
	 */
	protected String errorTime = ERROR_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorAccess() <em>Error Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorAccess() <em>Error Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer errorAccess = ERROR_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorTransferSize() <em>Error Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTransferSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_TRANSFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorTransferSize() <em>Error Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTransferSize()
	 * @generated
	 * @ordered
	 */
	protected Long errorTransferSize = ERROR_TRANSFER_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorData() <em>Error Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorData()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> errorData;

	/**
	 * The default value of the '{@link #getErrorDataOrder() <em>Error Data Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDataOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_DATA_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDataOrder() <em>Error Data Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDataOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer errorDataOrder = ERROR_DATA_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorAddress() <em>Error Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorAddress() <em>Error Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorAddress()
	 * @generated
	 * @ordered
	 */
	protected Long errorAddress = ERROR_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemLevelAddress() <em>System Level Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLevelAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYSTEM_LEVEL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemLevelAddress() <em>System Level Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLevelAddress()
	 * @generated
	 * @ordered
	 */
	protected Boolean systemLevelAddress = SYSTEM_LEVEL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorResolution() <em>Error Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorResolution() <em>Error Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorResolution()
	 * @generated
	 * @ordered
	 */
	protected Long errorResolution = ERROR_RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalErrorData() <em>Additional Error Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalErrorData()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> additionalErrorData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Memory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatile(Boolean newVolatile) {
		Boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStartingAddress() {
		return startingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartingAddress(Long newStartingAddress) {
		Long oldStartingAddress = startingAddress;
		startingAddress = newStartingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__STARTING_ADDRESS, oldStartingAddress, startingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEndingAddress() {
		return endingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndingAddress(Long newEndingAddress) {
		Long oldEndingAddress = endingAddress;
		endingAddress = newEndingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ENDING_ADDRESS, oldEndingAddress, endingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorInfo() {
		return errorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorInfo(Integer newErrorInfo) {
		Integer oldErrorInfo = errorInfo;
		errorInfo = newErrorInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_INFO, oldErrorInfo, errorInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherErrorDescription() {
		return otherErrorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherErrorDescription(String newOtherErrorDescription) {
		String oldOtherErrorDescription = otherErrorDescription;
		otherErrorDescription = newOtherErrorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__OTHER_ERROR_DESCRIPTION, oldOtherErrorDescription, otherErrorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCorrectableError() {
		return correctableError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectableError(Boolean newCorrectableError) {
		Boolean oldCorrectableError = correctableError;
		correctableError = newCorrectableError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__CORRECTABLE_ERROR, oldCorrectableError, correctableError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorTime() {
		return errorTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorTime(String newErrorTime) {
		String oldErrorTime = errorTime;
		errorTime = newErrorTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_TIME, oldErrorTime, errorTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorAccess() {
		return errorAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorAccess(Integer newErrorAccess) {
		Integer oldErrorAccess = errorAccess;
		errorAccess = newErrorAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_ACCESS, oldErrorAccess, errorAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorTransferSize() {
		return errorTransferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorTransferSize(Long newErrorTransferSize) {
		Long oldErrorTransferSize = errorTransferSize;
		errorTransferSize = newErrorTransferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_TRANSFER_SIZE, oldErrorTransferSize, errorTransferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getErrorData() {
		if (errorData == null) {
			errorData = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY__ERROR_DATA);
		}
		return errorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorDataOrder() {
		return errorDataOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorDataOrder(Integer newErrorDataOrder) {
		Integer oldErrorDataOrder = errorDataOrder;
		errorDataOrder = newErrorDataOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_DATA_ORDER, oldErrorDataOrder, errorDataOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorAddress() {
		return errorAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorAddress(Long newErrorAddress) {
		Long oldErrorAddress = errorAddress;
		errorAddress = newErrorAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_ADDRESS, oldErrorAddress, errorAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSystemLevelAddress() {
		return systemLevelAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemLevelAddress(Boolean newSystemLevelAddress) {
		Boolean oldSystemLevelAddress = systemLevelAddress;
		systemLevelAddress = newSystemLevelAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__SYSTEM_LEVEL_ADDRESS, oldSystemLevelAddress, systemLevelAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorResolution() {
		return errorResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorResolution(Long newErrorResolution) {
		Long oldErrorResolution = errorResolution;
		errorResolution = newErrorResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY__ERROR_RESOLUTION, oldErrorResolution, errorResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAdditionalErrorData() {
		if (additionalErrorData == null) {
			additionalErrorData = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY__ADDITIONAL_ERROR_DATA);
		}
		return additionalErrorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY__VOLATILE:
				return getVolatile();
			case CimPackage.CIM_MEMORY__STARTING_ADDRESS:
				return getStartingAddress();
			case CimPackage.CIM_MEMORY__ENDING_ADDRESS:
				return getEndingAddress();
			case CimPackage.CIM_MEMORY__ERROR_INFO:
				return getErrorInfo();
			case CimPackage.CIM_MEMORY__OTHER_ERROR_DESCRIPTION:
				return getOtherErrorDescription();
			case CimPackage.CIM_MEMORY__CORRECTABLE_ERROR:
				return getCorrectableError();
			case CimPackage.CIM_MEMORY__ERROR_TIME:
				return getErrorTime();
			case CimPackage.CIM_MEMORY__ERROR_ACCESS:
				return getErrorAccess();
			case CimPackage.CIM_MEMORY__ERROR_TRANSFER_SIZE:
				return getErrorTransferSize();
			case CimPackage.CIM_MEMORY__ERROR_DATA:
				return getErrorData();
			case CimPackage.CIM_MEMORY__ERROR_DATA_ORDER:
				return getErrorDataOrder();
			case CimPackage.CIM_MEMORY__ERROR_ADDRESS:
				return getErrorAddress();
			case CimPackage.CIM_MEMORY__SYSTEM_LEVEL_ADDRESS:
				return getSystemLevelAddress();
			case CimPackage.CIM_MEMORY__ERROR_RESOLUTION:
				return getErrorResolution();
			case CimPackage.CIM_MEMORY__ADDITIONAL_ERROR_DATA:
				return getAdditionalErrorData();
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
			case CimPackage.CIM_MEMORY__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case CimPackage.CIM_MEMORY__STARTING_ADDRESS:
				setStartingAddress((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY__ENDING_ADDRESS:
				setEndingAddress((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_INFO:
				setErrorInfo((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY__OTHER_ERROR_DESCRIPTION:
				setOtherErrorDescription((String)newValue);
				return;
			case CimPackage.CIM_MEMORY__CORRECTABLE_ERROR:
				setCorrectableError((Boolean)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_TIME:
				setErrorTime((String)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_ACCESS:
				setErrorAccess((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_TRANSFER_SIZE:
				setErrorTransferSize((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_DATA:
				getErrorData().clear();
				getErrorData().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_DATA_ORDER:
				setErrorDataOrder((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_ADDRESS:
				setErrorAddress((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY__SYSTEM_LEVEL_ADDRESS:
				setSystemLevelAddress((Boolean)newValue);
				return;
			case CimPackage.CIM_MEMORY__ERROR_RESOLUTION:
				setErrorResolution((Long)newValue);
				return;
			case CimPackage.CIM_MEMORY__ADDITIONAL_ERROR_DATA:
				getAdditionalErrorData().clear();
				getAdditionalErrorData().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_MEMORY__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__STARTING_ADDRESS:
				setStartingAddress(STARTING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ENDING_ADDRESS:
				setEndingAddress(ENDING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_INFO:
				setErrorInfo(ERROR_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__OTHER_ERROR_DESCRIPTION:
				setOtherErrorDescription(OTHER_ERROR_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__CORRECTABLE_ERROR:
				setCorrectableError(CORRECTABLE_ERROR_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_TIME:
				setErrorTime(ERROR_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_ACCESS:
				setErrorAccess(ERROR_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_TRANSFER_SIZE:
				setErrorTransferSize(ERROR_TRANSFER_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_DATA:
				getErrorData().clear();
				return;
			case CimPackage.CIM_MEMORY__ERROR_DATA_ORDER:
				setErrorDataOrder(ERROR_DATA_ORDER_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_ADDRESS:
				setErrorAddress(ERROR_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__SYSTEM_LEVEL_ADDRESS:
				setSystemLevelAddress(SYSTEM_LEVEL_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ERROR_RESOLUTION:
				setErrorResolution(ERROR_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY__ADDITIONAL_ERROR_DATA:
				getAdditionalErrorData().clear();
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
			case CimPackage.CIM_MEMORY__VOLATILE:
				return VOLATILE_EDEFAULT == null ? volatile_ != null : !VOLATILE_EDEFAULT.equals(volatile_);
			case CimPackage.CIM_MEMORY__STARTING_ADDRESS:
				return STARTING_ADDRESS_EDEFAULT == null ? startingAddress != null : !STARTING_ADDRESS_EDEFAULT.equals(startingAddress);
			case CimPackage.CIM_MEMORY__ENDING_ADDRESS:
				return ENDING_ADDRESS_EDEFAULT == null ? endingAddress != null : !ENDING_ADDRESS_EDEFAULT.equals(endingAddress);
			case CimPackage.CIM_MEMORY__ERROR_INFO:
				return ERROR_INFO_EDEFAULT == null ? errorInfo != null : !ERROR_INFO_EDEFAULT.equals(errorInfo);
			case CimPackage.CIM_MEMORY__OTHER_ERROR_DESCRIPTION:
				return OTHER_ERROR_DESCRIPTION_EDEFAULT == null ? otherErrorDescription != null : !OTHER_ERROR_DESCRIPTION_EDEFAULT.equals(otherErrorDescription);
			case CimPackage.CIM_MEMORY__CORRECTABLE_ERROR:
				return CORRECTABLE_ERROR_EDEFAULT == null ? correctableError != null : !CORRECTABLE_ERROR_EDEFAULT.equals(correctableError);
			case CimPackage.CIM_MEMORY__ERROR_TIME:
				return ERROR_TIME_EDEFAULT == null ? errorTime != null : !ERROR_TIME_EDEFAULT.equals(errorTime);
			case CimPackage.CIM_MEMORY__ERROR_ACCESS:
				return ERROR_ACCESS_EDEFAULT == null ? errorAccess != null : !ERROR_ACCESS_EDEFAULT.equals(errorAccess);
			case CimPackage.CIM_MEMORY__ERROR_TRANSFER_SIZE:
				return ERROR_TRANSFER_SIZE_EDEFAULT == null ? errorTransferSize != null : !ERROR_TRANSFER_SIZE_EDEFAULT.equals(errorTransferSize);
			case CimPackage.CIM_MEMORY__ERROR_DATA:
				return errorData != null && !errorData.isEmpty();
			case CimPackage.CIM_MEMORY__ERROR_DATA_ORDER:
				return ERROR_DATA_ORDER_EDEFAULT == null ? errorDataOrder != null : !ERROR_DATA_ORDER_EDEFAULT.equals(errorDataOrder);
			case CimPackage.CIM_MEMORY__ERROR_ADDRESS:
				return ERROR_ADDRESS_EDEFAULT == null ? errorAddress != null : !ERROR_ADDRESS_EDEFAULT.equals(errorAddress);
			case CimPackage.CIM_MEMORY__SYSTEM_LEVEL_ADDRESS:
				return SYSTEM_LEVEL_ADDRESS_EDEFAULT == null ? systemLevelAddress != null : !SYSTEM_LEVEL_ADDRESS_EDEFAULT.equals(systemLevelAddress);
			case CimPackage.CIM_MEMORY__ERROR_RESOLUTION:
				return ERROR_RESOLUTION_EDEFAULT == null ? errorResolution != null : !ERROR_RESOLUTION_EDEFAULT.equals(errorResolution);
			case CimPackage.CIM_MEMORY__ADDITIONAL_ERROR_DATA:
				return additionalErrorData != null && !additionalErrorData.isEmpty();
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
		result.append(" (Volatile: ");
		result.append(volatile_);
		result.append(", StartingAddress: ");
		result.append(startingAddress);
		result.append(", EndingAddress: ");
		result.append(endingAddress);
		result.append(", ErrorInfo: ");
		result.append(errorInfo);
		result.append(", OtherErrorDescription: ");
		result.append(otherErrorDescription);
		result.append(", CorrectableError: ");
		result.append(correctableError);
		result.append(", ErrorTime: ");
		result.append(errorTime);
		result.append(", ErrorAccess: ");
		result.append(errorAccess);
		result.append(", ErrorTransferSize: ");
		result.append(errorTransferSize);
		result.append(", ErrorData: ");
		result.append(errorData);
		result.append(", ErrorDataOrder: ");
		result.append(errorDataOrder);
		result.append(", ErrorAddress: ");
		result.append(errorAddress);
		result.append(", SystemLevelAddress: ");
		result.append(systemLevelAddress);
		result.append(", ErrorResolution: ");
		result.append(errorResolution);
		result.append(", AdditionalErrorData: ");
		result.append(additionalErrorData);
		result.append(')');
		return result.toString();
	}

} //CIM_MemoryImpl
