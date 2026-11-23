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

import org.dmtf.cim.CIM_BGPPeerGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Peer Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerGroupImpl#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPPeerGroupImpl extends CIM_CollectionOfMSEsImpl implements CIM_BGPPeerGroup {
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
	 * The default value of the '{@link #getConnectRetryInterval() <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONNECT_RETRY_INTERVAL_EDEFAULT = Long.valueOf(120L);

	/**
	 * The cached value of the '{@link #getConnectRetryInterval() <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected Long connectRetryInterval = CONNECT_RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldTimeConfigured() <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTimeConfigured()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOLD_TIME_CONFIGURED_EDEFAULT = Integer.valueOf(90);

	/**
	 * The cached value of the '{@link #getHoldTimeConfigured() <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTimeConfigured()
	 * @generated
	 * @ordered
	 */
	protected Integer holdTimeConfigured = HOLD_TIME_CONFIGURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepAliveConfigured() <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveConfigured()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KEEP_ALIVE_CONFIGURED_EDEFAULT = Integer.valueOf(30);

	/**
	 * The cached value of the '{@link #getKeepAliveConfigured() <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveConfigured()
	 * @generated
	 * @ordered
	 */
	protected Integer keepAliveConfigured = KEEP_ALIVE_CONFIGURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinASOriginationInterval() <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASOriginationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_AS_ORIGINATION_INTERVAL_EDEFAULT = Integer.valueOf(15);

	/**
	 * The cached value of the '{@link #getMinASOriginationInterval() <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASOriginationInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer minASOriginationInterval = MIN_AS_ORIGINATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRouteAdvertisementInterval() <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT = Integer.valueOf(30);

	/**
	 * The cached value of the '{@link #getMinRouteAdvertisementInterval() <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer minRouteAdvertisementInterval = MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPPeerGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPPeerGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConnectRetryInterval() {
		return connectRetryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectRetryInterval(Long newConnectRetryInterval) {
		Long oldConnectRetryInterval = connectRetryInterval;
		connectRetryInterval = newConnectRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL, oldConnectRetryInterval, connectRetryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHoldTimeConfigured() {
		return holdTimeConfigured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoldTimeConfigured(Integer newHoldTimeConfigured) {
		Integer oldHoldTimeConfigured = holdTimeConfigured;
		holdTimeConfigured = newHoldTimeConfigured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__HOLD_TIME_CONFIGURED, oldHoldTimeConfigured, holdTimeConfigured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getKeepAliveConfigured() {
		return keepAliveConfigured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepAliveConfigured(Integer newKeepAliveConfigured) {
		Integer oldKeepAliveConfigured = keepAliveConfigured;
		keepAliveConfigured = newKeepAliveConfigured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED, oldKeepAliveConfigured, keepAliveConfigured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinASOriginationInterval() {
		return minASOriginationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinASOriginationInterval(Integer newMinASOriginationInterval) {
		Integer oldMinASOriginationInterval = minASOriginationInterval;
		minASOriginationInterval = newMinASOriginationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL, oldMinASOriginationInterval, minASOriginationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinRouteAdvertisementInterval() {
		return minRouteAdvertisementInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRouteAdvertisementInterval(Integer newMinRouteAdvertisementInterval) {
		Integer oldMinRouteAdvertisementInterval = minRouteAdvertisementInterval;
		minRouteAdvertisementInterval = newMinRouteAdvertisementInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL, oldMinRouteAdvertisementInterval, minRouteAdvertisementInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_BGP_PEER_GROUP__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_BGP_PEER_GROUP__NAME:
				return getName();
			case CimPackage.CIM_BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				return getConnectRetryInterval();
			case CimPackage.CIM_BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				return getHoldTimeConfigured();
			case CimPackage.CIM_BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				return getKeepAliveConfigured();
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				return getMinASOriginationInterval();
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return getMinRouteAdvertisementInterval();
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
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval((Long)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval((Integer)newValue);
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
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval(CONNECT_RETRY_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured(HOLD_TIME_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured(KEEP_ALIVE_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval(MIN_AS_ORIGINATION_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval(MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT);
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
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_BGP_PEER_GROUP__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_BGP_PEER_GROUP__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_BGP_PEER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
				return CONNECT_RETRY_INTERVAL_EDEFAULT == null ? connectRetryInterval != null : !CONNECT_RETRY_INTERVAL_EDEFAULT.equals(connectRetryInterval);
			case CimPackage.CIM_BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
				return HOLD_TIME_CONFIGURED_EDEFAULT == null ? holdTimeConfigured != null : !HOLD_TIME_CONFIGURED_EDEFAULT.equals(holdTimeConfigured);
			case CimPackage.CIM_BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
				return KEEP_ALIVE_CONFIGURED_EDEFAULT == null ? keepAliveConfigured != null : !KEEP_ALIVE_CONFIGURED_EDEFAULT.equals(keepAliveConfigured);
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
				return MIN_AS_ORIGINATION_INTERVAL_EDEFAULT == null ? minASOriginationInterval != null : !MIN_AS_ORIGINATION_INTERVAL_EDEFAULT.equals(minASOriginationInterval);
			case CimPackage.CIM_BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT == null ? minRouteAdvertisementInterval != null : !MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT.equals(minRouteAdvertisementInterval);
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
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Name: ");
		result.append(name);
		result.append(", ConnectRetryInterval: ");
		result.append(connectRetryInterval);
		result.append(", HoldTimeConfigured: ");
		result.append(holdTimeConfigured);
		result.append(", KeepAliveConfigured: ");
		result.append(keepAliveConfigured);
		result.append(", MinASOriginationInterval: ");
		result.append(minASOriginationInterval);
		result.append(", MinRouteAdvertisementInterval: ");
		result.append(minRouteAdvertisementInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPPeerGroupImpl
