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

import org.dmtf.cim.CIM_StaticForwardingEntry;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Static Forwarding Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getMACAddress <em>MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getStaticStatus <em>Static Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticForwardingEntryImpl#getAllowedToGo <em>Allowed To Go</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StaticForwardingEntryImpl extends CIM_LogicalElementImpl implements CIM_StaticForwardingEntry {
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
	 * The default value of the '{@link #getServiceCreationClassName() <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceCreationClassName() <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String serviceCreationClassName = SERVICE_CREATION_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getMACAddress() <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMACAddress() <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticStatus() <em>Static Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATIC_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticStatus() <em>Static Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer staticStatus = STATIC_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedToGo() <em>Allowed To Go</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedToGo()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> allowedToGo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StaticForwardingEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StaticForwardingEntry();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceCreationClassName() {
		return serviceCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceCreationClassName(String newServiceCreationClassName) {
		String oldServiceCreationClassName = serviceCreationClassName;
		serviceCreationClassName = newServiceCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_CREATION_CLASS_NAME, oldServiceCreationClassName, serviceCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMACAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMACAddress(String newMACAddress) {
		String oldMACAddress = macAddress;
		macAddress = newMACAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__MAC_ADDRESS, oldMACAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStaticStatus() {
		return staticStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticStatus(Integer newStaticStatus) {
		Integer oldStaticStatus = staticStatus;
		staticStatus = newStaticStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_FORWARDING_ENTRY__STATIC_STATUS, oldStaticStatus, staticStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAllowedToGo() {
		if (allowedToGo == null) {
			allowedToGo = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STATIC_FORWARDING_ENTRY__ALLOWED_TO_GO);
		}
		return allowedToGo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_CREATION_CLASS_NAME:
				return getServiceCreationClassName();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_NAME:
				return getServiceName();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__MAC_ADDRESS:
				return getMACAddress();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__STATIC_STATUS:
				return getStaticStatus();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__ALLOWED_TO_GO:
				return getAllowedToGo();
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
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__MAC_ADDRESS:
				setMACAddress((String)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__STATIC_STATUS:
				setStaticStatus((Integer)newValue);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__ALLOWED_TO_GO:
				getAllowedToGo().clear();
				getAllowedToGo().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName(SERVICE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__MAC_ADDRESS:
				setMACAddress(MAC_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__STATIC_STATUS:
				setStaticStatus(STATIC_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__ALLOWED_TO_GO:
				getAllowedToGo().clear();
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
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_CREATION_CLASS_NAME:
				return SERVICE_CREATION_CLASS_NAME_EDEFAULT == null ? serviceCreationClassName != null : !SERVICE_CREATION_CLASS_NAME_EDEFAULT.equals(serviceCreationClassName);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__STATIC_STATUS:
				return STATIC_STATUS_EDEFAULT == null ? staticStatus != null : !STATIC_STATUS_EDEFAULT.equals(staticStatus);
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY__ALLOWED_TO_GO:
				return allowedToGo != null && !allowedToGo.isEmpty();
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", ServiceCreationClassName: ");
		result.append(serviceCreationClassName);
		result.append(", ServiceName: ");
		result.append(serviceName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", MACAddress: ");
		result.append(macAddress);
		result.append(", StaticStatus: ");
		result.append(staticStatus);
		result.append(", AllowedToGo: ");
		result.append(allowedToGo);
		result.append(')');
		return result.toString();
	}

} //CIM_StaticForwardingEntryImpl
