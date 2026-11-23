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

import org.dmtf.cim.CIM_ManagedSystemElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Managed System Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getStatusDescriptions <em>Status Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getHealthState <em>Health State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getCommunicationStatus <em>Communication Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getDetailedStatus <em>Detailed Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getOperatingStatus <em>Operating Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ManagedSystemElementImpl#getPrimaryStatus <em>Primary Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_ManagedSystemElementImpl extends CIM_ManagedElementImpl implements CIM_ManagedSystemElement {
	/**
	 * The default value of the '{@link #getInstallDate() <em>Install Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallDate() <em>Install Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDate()
	 * @generated
	 * @ordered
	 */
	protected String installDate = INSTALL_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> operationalStatus;

	/**
	 * The cached value of the '{@link #getStatusDescriptions() <em>Status Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> statusDescriptions;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthState() <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEALTH_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthState() <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthState()
	 * @generated
	 * @ordered
	 */
	protected Integer healthState = HEALTH_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationStatus() <em>Communication Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMMUNICATION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationStatus() <em>Communication Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer communicationStatus = COMMUNICATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailedStatus() <em>Detailed Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DETAILED_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailedStatus() <em>Detailed Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer detailedStatus = DETAILED_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingStatus() <em>Operating Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatingStatus() <em>Operating Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer operatingStatus = OPERATING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryStatus() <em>Primary Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryStatus() <em>Primary Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryStatus = PRIMARY_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ManagedSystemElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ManagedSystemElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstallDate() {
		return installDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstallDate(String newInstallDate) {
		String oldInstallDate = installDate;
		installDate = newInstallDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__INSTALL_DATE, oldInstallDate, installDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOperationalStatus() {
		if (operationalStatus == null) {
			operationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS);
		}
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStatusDescriptions() {
		if (statusDescriptions == null) {
			statusDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS);
		}
		return statusDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHealthState() {
		return healthState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthState(Integer newHealthState) {
		Integer oldHealthState = healthState;
		healthState = newHealthState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__HEALTH_STATE, oldHealthState, healthState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCommunicationStatus() {
		return communicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationStatus(Integer newCommunicationStatus) {
		Integer oldCommunicationStatus = communicationStatus;
		communicationStatus = newCommunicationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__COMMUNICATION_STATUS, oldCommunicationStatus, communicationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDetailedStatus() {
		return detailedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailedStatus(Integer newDetailedStatus) {
		Integer oldDetailedStatus = detailedStatus;
		detailedStatus = newDetailedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__DETAILED_STATUS, oldDetailedStatus, detailedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperatingStatus() {
		return operatingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatingStatus(Integer newOperatingStatus) {
		Integer oldOperatingStatus = operatingStatus;
		operatingStatus = newOperatingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATING_STATUS, oldOperatingStatus, operatingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryStatus() {
		return primaryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryStatus(Integer newPrimaryStatus) {
		Integer oldPrimaryStatus = primaryStatus;
		primaryStatus = newPrimaryStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__PRIMARY_STATUS, oldPrimaryStatus, primaryStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				return getInstallDate();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__NAME:
				return getName();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				return getStatusDescriptions();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS:
				return getStatus();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				return getHealthState();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__COMMUNICATION_STATUS:
				return getCommunicationStatus();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__DETAILED_STATUS:
				return getDetailedStatus();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATING_STATUS:
				return getOperatingStatus();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__PRIMARY_STATUS:
				return getPrimaryStatus();
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
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				setInstallDate((String)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				getOperationalStatus().clear();
				getOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				getStatusDescriptions().clear();
				getStatusDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS:
				setStatus((String)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				setHealthState((Integer)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__COMMUNICATION_STATUS:
				setCommunicationStatus((Integer)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__DETAILED_STATUS:
				setDetailedStatus((Integer)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATING_STATUS:
				setOperatingStatus((Integer)newValue);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__PRIMARY_STATUS:
				setPrimaryStatus((Integer)newValue);
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
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				setInstallDate(INSTALL_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				getOperationalStatus().clear();
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				getStatusDescriptions().clear();
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				setHealthState(HEALTH_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__COMMUNICATION_STATUS:
				setCommunicationStatus(COMMUNICATION_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__DETAILED_STATUS:
				setDetailedStatus(DETAILED_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATING_STATUS:
				setOperatingStatus(OPERATING_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__PRIMARY_STATUS:
				setPrimaryStatus(PRIMARY_STATUS_EDEFAULT);
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
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				return INSTALL_DATE_EDEFAULT == null ? installDate != null : !INSTALL_DATE_EDEFAULT.equals(installDate);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				return operationalStatus != null && !operationalStatus.isEmpty();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				return statusDescriptions != null && !statusDescriptions.isEmpty();
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				return HEALTH_STATE_EDEFAULT == null ? healthState != null : !HEALTH_STATE_EDEFAULT.equals(healthState);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__COMMUNICATION_STATUS:
				return COMMUNICATION_STATUS_EDEFAULT == null ? communicationStatus != null : !COMMUNICATION_STATUS_EDEFAULT.equals(communicationStatus);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__DETAILED_STATUS:
				return DETAILED_STATUS_EDEFAULT == null ? detailedStatus != null : !DETAILED_STATUS_EDEFAULT.equals(detailedStatus);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__OPERATING_STATUS:
				return OPERATING_STATUS_EDEFAULT == null ? operatingStatus != null : !OPERATING_STATUS_EDEFAULT.equals(operatingStatus);
			case CimPackage.CIM_MANAGED_SYSTEM_ELEMENT__PRIMARY_STATUS:
				return PRIMARY_STATUS_EDEFAULT == null ? primaryStatus != null : !PRIMARY_STATUS_EDEFAULT.equals(primaryStatus);
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
		result.append(" (InstallDate: ");
		result.append(installDate);
		result.append(", Name: ");
		result.append(name);
		result.append(", OperationalStatus: ");
		result.append(operationalStatus);
		result.append(", StatusDescriptions: ");
		result.append(statusDescriptions);
		result.append(", Status: ");
		result.append(status);
		result.append(", HealthState: ");
		result.append(healthState);
		result.append(", CommunicationStatus: ");
		result.append(communicationStatus);
		result.append(", DetailedStatus: ");
		result.append(detailedStatus);
		result.append(", OperatingStatus: ");
		result.append(operatingStatus);
		result.append(", PrimaryStatus: ");
		result.append(primaryStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_ManagedSystemElementImpl
