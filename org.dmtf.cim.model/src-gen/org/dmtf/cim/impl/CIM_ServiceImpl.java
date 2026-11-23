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
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Service;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getStartMode <em>Start Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getLoSID <em>Lo SID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceImpl#getLoSOrgID <em>Lo SOrg ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_ServiceImpl extends CIM_EnabledLogicalElementImpl implements CIM_Service {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPrimaryOwnerName() <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_OWNER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOwnerName() <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerName()
	 * @generated
	 * @ordered
	 */
	protected String primaryOwnerName = PRIMARY_OWNER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOwnerContact() <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_OWNER_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOwnerContact() <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 * @ordered
	 */
	protected String primaryOwnerContact = PRIMARY_OWNER_CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartMode() <em>Start Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMode()
	 * @generated
	 * @ordered
	 */
	protected static final String START_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMode() <em>Start Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMode()
	 * @generated
	 * @ordered
	 */
	protected String startMode = START_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected Boolean started = STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoSID() <em>Lo SID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoSID()
	 * @generated
	 * @ordered
	 */
	protected static final String LO_SID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoSID() <em>Lo SID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoSID()
	 * @generated
	 * @ordered
	 */
	protected String loSID = LO_SID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoSOrgID() <em>Lo SOrg ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoSOrgID()
	 * @generated
	 * @ordered
	 */
	protected static final String LO_SORG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoSOrgID() <em>Lo SOrg ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoSOrgID()
	 * @generated
	 * @ordered
	 */
	protected String loSOrgID = LO_SORG_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Service();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryOwnerName() {
		return primaryOwnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOwnerName(String newPrimaryOwnerName) {
		String oldPrimaryOwnerName = primaryOwnerName;
		primaryOwnerName = newPrimaryOwnerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__PRIMARY_OWNER_NAME, oldPrimaryOwnerName, primaryOwnerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryOwnerContact() {
		return primaryOwnerContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOwnerContact(String newPrimaryOwnerContact) {
		String oldPrimaryOwnerContact = primaryOwnerContact;
		primaryOwnerContact = newPrimaryOwnerContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__PRIMARY_OWNER_CONTACT, oldPrimaryOwnerContact, primaryOwnerContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartMode() {
		return startMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartMode(String newStartMode) {
		String oldStartMode = startMode;
		startMode = newStartMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__START_MODE, oldStartMode, startMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarted(Boolean newStarted) {
		Boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoSID() {
		return loSID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoSID(String newLoSID) {
		String oldLoSID = loSID;
		loSID = newLoSID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__LO_SID, oldLoSID, loSID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoSOrgID() {
		return loSOrgID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoSOrgID(String newLoSOrgID) {
		String oldLoSOrgID = loSOrgID;
		loSOrgID = newLoSOrgID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE__LO_SORG_ID, oldLoSOrgID, loSOrgID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long StartService() {
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
	public Long StopService() {
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
	public Long ChangeAffectedElementsAssignedSequence(EList<CIM_ManagedElement> ManagedElements, EList<Integer> AssignedSequence, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_SERVICE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_SERVICE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_SERVICE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_NAME:
				return getPrimaryOwnerName();
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_CONTACT:
				return getPrimaryOwnerContact();
			case CimPackage.CIM_SERVICE__START_MODE:
				return getStartMode();
			case CimPackage.CIM_SERVICE__STARTED:
				return getStarted();
			case CimPackage.CIM_SERVICE__LO_SID:
				return getLoSID();
			case CimPackage.CIM_SERVICE__LO_SORG_ID:
				return getLoSOrgID();
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
			case CimPackage.CIM_SERVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__START_MODE:
				setStartMode((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__STARTED:
				setStarted((Boolean)newValue);
				return;
			case CimPackage.CIM_SERVICE__LO_SID:
				setLoSID((String)newValue);
				return;
			case CimPackage.CIM_SERVICE__LO_SORG_ID:
				setLoSOrgID((String)newValue);
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
			case CimPackage.CIM_SERVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName(PRIMARY_OWNER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact(PRIMARY_OWNER_CONTACT_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__START_MODE:
				setStartMode(START_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__LO_SID:
				setLoSID(LO_SID_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE__LO_SORG_ID:
				setLoSOrgID(LO_SORG_ID_EDEFAULT);
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
			case CimPackage.CIM_SERVICE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_SERVICE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_SERVICE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_NAME:
				return PRIMARY_OWNER_NAME_EDEFAULT == null ? primaryOwnerName != null : !PRIMARY_OWNER_NAME_EDEFAULT.equals(primaryOwnerName);
			case CimPackage.CIM_SERVICE__PRIMARY_OWNER_CONTACT:
				return PRIMARY_OWNER_CONTACT_EDEFAULT == null ? primaryOwnerContact != null : !PRIMARY_OWNER_CONTACT_EDEFAULT.equals(primaryOwnerContact);
			case CimPackage.CIM_SERVICE__START_MODE:
				return START_MODE_EDEFAULT == null ? startMode != null : !START_MODE_EDEFAULT.equals(startMode);
			case CimPackage.CIM_SERVICE__STARTED:
				return STARTED_EDEFAULT == null ? started != null : !STARTED_EDEFAULT.equals(started);
			case CimPackage.CIM_SERVICE__LO_SID:
				return LO_SID_EDEFAULT == null ? loSID != null : !LO_SID_EDEFAULT.equals(loSID);
			case CimPackage.CIM_SERVICE__LO_SORG_ID:
				return LO_SORG_ID_EDEFAULT == null ? loSOrgID != null : !LO_SORG_ID_EDEFAULT.equals(loSOrgID);
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
			case CimPackage.CIM_SERVICE___START_SERVICE:
				return StartService();
			case CimPackage.CIM_SERVICE___STOP_SERVICE:
				return StopService();
			case CimPackage.CIM_SERVICE___CHANGE_AFFECTED_ELEMENTS_ASSIGNED_SEQUENCE__ELIST_ELIST_CIM_CONCRETEJOB:
				return ChangeAffectedElementsAssignedSequence((EList<CIM_ManagedElement>)arguments.get(0), (EList<Integer>)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", PrimaryOwnerName: ");
		result.append(primaryOwnerName);
		result.append(", PrimaryOwnerContact: ");
		result.append(primaryOwnerContact);
		result.append(", StartMode: ");
		result.append(startMode);
		result.append(", Started: ");
		result.append(started);
		result.append(", LoSID: ");
		result.append(loSID);
		result.append(", LoSOrgID: ");
		result.append(loSOrgID);
		result.append(')');
		return result.toString();
	}

} //CIM_ServiceImpl
