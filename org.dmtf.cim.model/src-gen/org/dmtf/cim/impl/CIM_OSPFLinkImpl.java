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

import org.dmtf.cim.CIM_OSPFLink;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFLinkImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFLinkImpl#getHelloInterval <em>Hello Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFLinkImpl#getRouterDeadInterval <em>Router Dead Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFLinkImpl#getMulticastForwarding <em>Multicast Forwarding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFLinkImpl extends CIM_ConnectivityCollectionImpl implements CIM_OSPFLink {
	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected Integer linkType = LINK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelloInterval() <em>Hello Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelloInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long HELLO_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelloInterval() <em>Hello Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelloInterval()
	 * @generated
	 * @ordered
	 */
	protected Long helloInterval = HELLO_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouterDeadInterval() <em>Router Dead Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterDeadInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long ROUTER_DEAD_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouterDeadInterval() <em>Router Dead Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterDeadInterval()
	 * @generated
	 * @ordered
	 */
	protected Long routerDeadInterval = ROUTER_DEAD_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulticastForwarding() <em>Multicast Forwarding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastForwarding()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTICAST_FORWARDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMulticastForwarding() <em>Multicast Forwarding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastForwarding()
	 * @generated
	 * @ordered
	 */
	protected Integer multicastForwarding = MULTICAST_FORWARDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkType(Integer newLinkType) {
		Integer oldLinkType = linkType;
		linkType = newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_LINK__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHelloInterval() {
		return helloInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelloInterval(Long newHelloInterval) {
		Long oldHelloInterval = helloInterval;
		helloInterval = newHelloInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_LINK__HELLO_INTERVAL, oldHelloInterval, helloInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRouterDeadInterval() {
		return routerDeadInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouterDeadInterval(Long newRouterDeadInterval) {
		Long oldRouterDeadInterval = routerDeadInterval;
		routerDeadInterval = newRouterDeadInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_LINK__ROUTER_DEAD_INTERVAL, oldRouterDeadInterval, routerDeadInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMulticastForwarding() {
		return multicastForwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMulticastForwarding(Integer newMulticastForwarding) {
		Integer oldMulticastForwarding = multicastForwarding;
		multicastForwarding = newMulticastForwarding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_LINK__MULTICAST_FORWARDING, oldMulticastForwarding, multicastForwarding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_LINK__LINK_TYPE:
				return getLinkType();
			case CimPackage.CIM_OSPF_LINK__HELLO_INTERVAL:
				return getHelloInterval();
			case CimPackage.CIM_OSPF_LINK__ROUTER_DEAD_INTERVAL:
				return getRouterDeadInterval();
			case CimPackage.CIM_OSPF_LINK__MULTICAST_FORWARDING:
				return getMulticastForwarding();
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
			case CimPackage.CIM_OSPF_LINK__LINK_TYPE:
				setLinkType((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_LINK__HELLO_INTERVAL:
				setHelloInterval((Long)newValue);
				return;
			case CimPackage.CIM_OSPF_LINK__ROUTER_DEAD_INTERVAL:
				setRouterDeadInterval((Long)newValue);
				return;
			case CimPackage.CIM_OSPF_LINK__MULTICAST_FORWARDING:
				setMulticastForwarding((Integer)newValue);
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
			case CimPackage.CIM_OSPF_LINK__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_LINK__HELLO_INTERVAL:
				setHelloInterval(HELLO_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_LINK__ROUTER_DEAD_INTERVAL:
				setRouterDeadInterval(ROUTER_DEAD_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_LINK__MULTICAST_FORWARDING:
				setMulticastForwarding(MULTICAST_FORWARDING_EDEFAULT);
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
			case CimPackage.CIM_OSPF_LINK__LINK_TYPE:
				return LINK_TYPE_EDEFAULT == null ? linkType != null : !LINK_TYPE_EDEFAULT.equals(linkType);
			case CimPackage.CIM_OSPF_LINK__HELLO_INTERVAL:
				return HELLO_INTERVAL_EDEFAULT == null ? helloInterval != null : !HELLO_INTERVAL_EDEFAULT.equals(helloInterval);
			case CimPackage.CIM_OSPF_LINK__ROUTER_DEAD_INTERVAL:
				return ROUTER_DEAD_INTERVAL_EDEFAULT == null ? routerDeadInterval != null : !ROUTER_DEAD_INTERVAL_EDEFAULT.equals(routerDeadInterval);
			case CimPackage.CIM_OSPF_LINK__MULTICAST_FORWARDING:
				return MULTICAST_FORWARDING_EDEFAULT == null ? multicastForwarding != null : !MULTICAST_FORWARDING_EDEFAULT.equals(multicastForwarding);
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
		result.append(" (LinkType: ");
		result.append(linkType);
		result.append(", HelloInterval: ");
		result.append(helloInterval);
		result.append(", RouterDeadInterval: ");
		result.append(routerDeadInterval);
		result.append(", MulticastForwarding: ");
		result.append(multicastForwarding);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFLinkImpl
