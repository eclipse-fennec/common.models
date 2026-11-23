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

import org.dmtf.cim.CIM_DiagnosticRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticRecordImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticRecordImpl#getManagedElementName <em>Managed Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticRecordImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticRecordImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticRecordImpl#getOtherRecordTypeDescription <em>Other Record Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticRecordImpl#getCreationTimeStamp <em>Creation Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticRecordImpl extends CIM_RecordForLogImpl implements CIM_DiagnosticRecord {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagedElementName() <em>Managed Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGED_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagedElementName() <em>Managed Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElementName()
	 * @generated
	 * @ordered
	 */
	protected String managedElementName = MANAGED_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordType() <em>Record Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECORD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordType()
	 * @generated
	 * @ordered
	 */
	protected Integer recordType = RECORD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRecordTypeDescription() <em>Other Record Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecordTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_RECORD_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRecordTypeDescription() <em>Other Record Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecordTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherRecordTypeDescription = OTHER_RECORD_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationTimeStamp() <em>Creation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTimeStamp() <em>Creation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String creationTimeStamp = CREATION_TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RECORD__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagedElementName() {
		return managedElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedElementName(String newManagedElementName) {
		String oldManagedElementName = managedElementName;
		managedElementName = newManagedElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RECORD__MANAGED_ELEMENT_NAME, oldManagedElementName, managedElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationDate(String newExpirationDate) {
		String oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RECORD__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRecordType() {
		return recordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordType(Integer newRecordType) {
		Integer oldRecordType = recordType;
		recordType = newRecordType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RECORD__RECORD_TYPE, oldRecordType, recordType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRecordTypeDescription() {
		return otherRecordTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRecordTypeDescription(String newOtherRecordTypeDescription) {
		String oldOtherRecordTypeDescription = otherRecordTypeDescription;
		otherRecordTypeDescription = newOtherRecordTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RECORD__OTHER_RECORD_TYPE_DESCRIPTION, oldOtherRecordTypeDescription, otherRecordTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationTimeStamp() {
		return creationTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationTimeStamp(String newCreationTimeStamp) {
		String oldCreationTimeStamp = creationTimeStamp;
		creationTimeStamp = newCreationTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RECORD__CREATION_TIME_STAMP, oldCreationTimeStamp, creationTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RECORD__SERVICE_NAME:
				return getServiceName();
			case CimPackage.CIM_DIAGNOSTIC_RECORD__MANAGED_ELEMENT_NAME:
				return getManagedElementName();
			case CimPackage.CIM_DIAGNOSTIC_RECORD__EXPIRATION_DATE:
				return getExpirationDate();
			case CimPackage.CIM_DIAGNOSTIC_RECORD__RECORD_TYPE:
				return getRecordType();
			case CimPackage.CIM_DIAGNOSTIC_RECORD__OTHER_RECORD_TYPE_DESCRIPTION:
				return getOtherRecordTypeDescription();
			case CimPackage.CIM_DIAGNOSTIC_RECORD__CREATION_TIME_STAMP:
				return getCreationTimeStamp();
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
			case CimPackage.CIM_DIAGNOSTIC_RECORD__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__MANAGED_ELEMENT_NAME:
				setManagedElementName((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__RECORD_TYPE:
				setRecordType((Integer)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__OTHER_RECORD_TYPE_DESCRIPTION:
				setOtherRecordTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__CREATION_TIME_STAMP:
				setCreationTimeStamp((String)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_RECORD__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__MANAGED_ELEMENT_NAME:
				setManagedElementName(MANAGED_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__RECORD_TYPE:
				setRecordType(RECORD_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__OTHER_RECORD_TYPE_DESCRIPTION:
				setOtherRecordTypeDescription(OTHER_RECORD_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RECORD__CREATION_TIME_STAMP:
				setCreationTimeStamp(CREATION_TIME_STAMP_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_RECORD__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CimPackage.CIM_DIAGNOSTIC_RECORD__MANAGED_ELEMENT_NAME:
				return MANAGED_ELEMENT_NAME_EDEFAULT == null ? managedElementName != null : !MANAGED_ELEMENT_NAME_EDEFAULT.equals(managedElementName);
			case CimPackage.CIM_DIAGNOSTIC_RECORD__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case CimPackage.CIM_DIAGNOSTIC_RECORD__RECORD_TYPE:
				return RECORD_TYPE_EDEFAULT == null ? recordType != null : !RECORD_TYPE_EDEFAULT.equals(recordType);
			case CimPackage.CIM_DIAGNOSTIC_RECORD__OTHER_RECORD_TYPE_DESCRIPTION:
				return OTHER_RECORD_TYPE_DESCRIPTION_EDEFAULT == null ? otherRecordTypeDescription != null : !OTHER_RECORD_TYPE_DESCRIPTION_EDEFAULT.equals(otherRecordTypeDescription);
			case CimPackage.CIM_DIAGNOSTIC_RECORD__CREATION_TIME_STAMP:
				return CREATION_TIME_STAMP_EDEFAULT == null ? creationTimeStamp != null : !CREATION_TIME_STAMP_EDEFAULT.equals(creationTimeStamp);
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
		result.append(" (ServiceName: ");
		result.append(serviceName);
		result.append(", ManagedElementName: ");
		result.append(managedElementName);
		result.append(", ExpirationDate: ");
		result.append(expirationDate);
		result.append(", RecordType: ");
		result.append(recordType);
		result.append(", OtherRecordTypeDescription: ");
		result.append(otherRecordTypeDescription);
		result.append(", CreationTimeStamp: ");
		result.append(creationTimeStamp);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticRecordImpl
