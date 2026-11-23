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

import org.dmtf.cim.CIM_CIMOMStatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CIMOM Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getOtherOperationType <em>Other Operation Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getNumberOfOperations <em>Number Of Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getCimomElapsedTime <em>Cimom Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getProviderElapsedTime <em>Provider Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getRequestSize <em>Request Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIMOMStatisticalDataImpl#getResponseSize <em>Response Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CIMOMStatisticalDataImpl extends CIM_StatisticalDataImpl implements CIM_CIMOMStatisticalData {
	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected Integer operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherOperationType() <em>Other Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_OPERATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherOperationType() <em>Other Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherOperationType()
	 * @generated
	 * @ordered
	 */
	protected String otherOperationType = OTHER_OPERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfOperations() <em>Number Of Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfOperations() <em>Number Of Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOperations()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfOperations = NUMBER_OF_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCimomElapsedTime() <em>Cimom Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCimomElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CIMOM_ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCimomElapsedTime() <em>Cimom Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCimomElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected String cimomElapsedTime = CIMOM_ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderElapsedTime() <em>Provider Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderElapsedTime() <em>Provider Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected String providerElapsedTime = PROVIDER_ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestSize() <em>Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUEST_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestSize() <em>Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestSize()
	 * @generated
	 * @ordered
	 */
	protected Long requestSize = REQUEST_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseSize() <em>Response Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESPONSE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseSize() <em>Response Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseSize()
	 * @generated
	 * @ordered
	 */
	protected Long responseSize = RESPONSE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CIMOMStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CIMOMStatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationType(Integer newOperationType) {
		Integer oldOperationType = operationType;
		operationType = newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherOperationType() {
		return otherOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherOperationType(String newOtherOperationType) {
		String oldOtherOperationType = otherOperationType;
		otherOperationType = newOtherOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__OTHER_OPERATION_TYPE, oldOtherOperationType, otherOperationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfOperations() {
		return numberOfOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfOperations(Long newNumberOfOperations) {
		Long oldNumberOfOperations = numberOfOperations;
		numberOfOperations = newNumberOfOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__NUMBER_OF_OPERATIONS, oldNumberOfOperations, numberOfOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCimomElapsedTime() {
		return cimomElapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCimomElapsedTime(String newCimomElapsedTime) {
		String oldCimomElapsedTime = cimomElapsedTime;
		cimomElapsedTime = newCimomElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__CIMOM_ELAPSED_TIME, oldCimomElapsedTime, cimomElapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderElapsedTime() {
		return providerElapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderElapsedTime(String newProviderElapsedTime) {
		String oldProviderElapsedTime = providerElapsedTime;
		providerElapsedTime = newProviderElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__PROVIDER_ELAPSED_TIME, oldProviderElapsedTime, providerElapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestSize() {
		return requestSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestSize(Long newRequestSize) {
		Long oldRequestSize = requestSize;
		requestSize = newRequestSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__REQUEST_SIZE, oldRequestSize, requestSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResponseSize() {
		return responseSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseSize(Long newResponseSize) {
		Long oldResponseSize = responseSize;
		responseSize = newResponseSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIMOM_STATISTICAL_DATA__RESPONSE_SIZE, oldResponseSize, responseSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OPERATION_TYPE:
				return getOperationType();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OTHER_OPERATION_TYPE:
				return getOtherOperationType();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__NUMBER_OF_OPERATIONS:
				return getNumberOfOperations();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__CIMOM_ELAPSED_TIME:
				return getCimomElapsedTime();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__PROVIDER_ELAPSED_TIME:
				return getProviderElapsedTime();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__REQUEST_SIZE:
				return getRequestSize();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__RESPONSE_SIZE:
				return getResponseSize();
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
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OPERATION_TYPE:
				setOperationType((Integer)newValue);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OTHER_OPERATION_TYPE:
				setOtherOperationType((String)newValue);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__NUMBER_OF_OPERATIONS:
				setNumberOfOperations((Long)newValue);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__CIMOM_ELAPSED_TIME:
				setCimomElapsedTime((String)newValue);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__PROVIDER_ELAPSED_TIME:
				setProviderElapsedTime((String)newValue);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__REQUEST_SIZE:
				setRequestSize((Long)newValue);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__RESPONSE_SIZE:
				setResponseSize((Long)newValue);
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
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OTHER_OPERATION_TYPE:
				setOtherOperationType(OTHER_OPERATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__NUMBER_OF_OPERATIONS:
				setNumberOfOperations(NUMBER_OF_OPERATIONS_EDEFAULT);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__CIMOM_ELAPSED_TIME:
				setCimomElapsedTime(CIMOM_ELAPSED_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__PROVIDER_ELAPSED_TIME:
				setProviderElapsedTime(PROVIDER_ELAPSED_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__REQUEST_SIZE:
				setRequestSize(REQUEST_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__RESPONSE_SIZE:
				setResponseSize(RESPONSE_SIZE_EDEFAULT);
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
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OPERATION_TYPE:
				return OPERATION_TYPE_EDEFAULT == null ? operationType != null : !OPERATION_TYPE_EDEFAULT.equals(operationType);
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__OTHER_OPERATION_TYPE:
				return OTHER_OPERATION_TYPE_EDEFAULT == null ? otherOperationType != null : !OTHER_OPERATION_TYPE_EDEFAULT.equals(otherOperationType);
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__NUMBER_OF_OPERATIONS:
				return NUMBER_OF_OPERATIONS_EDEFAULT == null ? numberOfOperations != null : !NUMBER_OF_OPERATIONS_EDEFAULT.equals(numberOfOperations);
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__CIMOM_ELAPSED_TIME:
				return CIMOM_ELAPSED_TIME_EDEFAULT == null ? cimomElapsedTime != null : !CIMOM_ELAPSED_TIME_EDEFAULT.equals(cimomElapsedTime);
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__PROVIDER_ELAPSED_TIME:
				return PROVIDER_ELAPSED_TIME_EDEFAULT == null ? providerElapsedTime != null : !PROVIDER_ELAPSED_TIME_EDEFAULT.equals(providerElapsedTime);
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__REQUEST_SIZE:
				return REQUEST_SIZE_EDEFAULT == null ? requestSize != null : !REQUEST_SIZE_EDEFAULT.equals(requestSize);
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA__RESPONSE_SIZE:
				return RESPONSE_SIZE_EDEFAULT == null ? responseSize != null : !RESPONSE_SIZE_EDEFAULT.equals(responseSize);
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
		result.append(" (OperationType: ");
		result.append(operationType);
		result.append(", OtherOperationType: ");
		result.append(otherOperationType);
		result.append(", NumberOfOperations: ");
		result.append(numberOfOperations);
		result.append(", CimomElapsedTime: ");
		result.append(cimomElapsedTime);
		result.append(", ProviderElapsedTime: ");
		result.append(providerElapsedTime);
		result.append(", RequestSize: ");
		result.append(requestSize);
		result.append(", ResponseSize: ");
		result.append(responseSize);
		result.append(')');
		return result.toString();
	}

} //CIM_CIMOMStatisticalDataImpl
