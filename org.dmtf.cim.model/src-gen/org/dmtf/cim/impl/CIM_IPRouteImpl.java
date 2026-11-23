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

import org.dmtf.cim.CIM_IPRoute;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getIPDestinationAddress <em>IP Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getIPDestinationMask <em>IP Destination Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPRouteImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_IPRouteImpl extends CIM_NextHopRoutingImpl implements CIM_IPRoute {
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
	 * The default value of the '{@link #getIPDestinationAddress() <em>IP Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPDestinationAddress() <em>IP Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipDestinationAddress = IP_DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPDestinationMask() <em>IP Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_DESTINATION_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPDestinationMask() <em>IP Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected String ipDestinationMask = IP_DESTINATION_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPRoute();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__SERVICE_CREATION_CLASS_NAME, oldServiceCreationClassName, serviceCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIPDestinationAddress() {
		return ipDestinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPDestinationAddress(String newIPDestinationAddress) {
		String oldIPDestinationAddress = ipDestinationAddress;
		ipDestinationAddress = newIPDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__IP_DESTINATION_ADDRESS, oldIPDestinationAddress, ipDestinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIPDestinationMask() {
		return ipDestinationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPDestinationMask(String newIPDestinationMask) {
		String oldIPDestinationMask = ipDestinationMask;
		ipDestinationMask = newIPDestinationMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__IP_DESTINATION_MASK, oldIPDestinationMask, ipDestinationMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(Integer newAddressType) {
		Integer oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ROUTE__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_ROUTE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_IP_ROUTE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_IP_ROUTE__SERVICE_CREATION_CLASS_NAME:
				return getServiceCreationClassName();
			case CimPackage.CIM_IP_ROUTE__SERVICE_NAME:
				return getServiceName();
			case CimPackage.CIM_IP_ROUTE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_ADDRESS:
				return getIPDestinationAddress();
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_MASK:
				return getIPDestinationMask();
			case CimPackage.CIM_IP_ROUTE__ADDRESS_TYPE:
				return getAddressType();
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
			case CimPackage.CIM_IP_ROUTE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_ADDRESS:
				setIPDestinationAddress((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_MASK:
				setIPDestinationMask((String)newValue);
				return;
			case CimPackage.CIM_IP_ROUTE__ADDRESS_TYPE:
				setAddressType((Integer)newValue);
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
			case CimPackage.CIM_IP_ROUTE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName(SERVICE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_ADDRESS:
				setIPDestinationAddress(IP_DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_MASK:
				setIPDestinationMask(IP_DESTINATION_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ROUTE__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
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
			case CimPackage.CIM_IP_ROUTE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_IP_ROUTE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_IP_ROUTE__SERVICE_CREATION_CLASS_NAME:
				return SERVICE_CREATION_CLASS_NAME_EDEFAULT == null ? serviceCreationClassName != null : !SERVICE_CREATION_CLASS_NAME_EDEFAULT.equals(serviceCreationClassName);
			case CimPackage.CIM_IP_ROUTE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CimPackage.CIM_IP_ROUTE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_ADDRESS:
				return IP_DESTINATION_ADDRESS_EDEFAULT == null ? ipDestinationAddress != null : !IP_DESTINATION_ADDRESS_EDEFAULT.equals(ipDestinationAddress);
			case CimPackage.CIM_IP_ROUTE__IP_DESTINATION_MASK:
				return IP_DESTINATION_MASK_EDEFAULT == null ? ipDestinationMask != null : !IP_DESTINATION_MASK_EDEFAULT.equals(ipDestinationMask);
			case CimPackage.CIM_IP_ROUTE__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
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
		result.append(", IPDestinationAddress: ");
		result.append(ipDestinationAddress);
		result.append(", IPDestinationMask: ");
		result.append(ipDestinationMask);
		result.append(", AddressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //CIM_IPRouteImpl
