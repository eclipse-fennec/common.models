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

import org.dmtf.cim.CIM_BGPAttributesForRoute;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Attributes For Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesForRouteImpl#getPathAttrPeer <em>Path Attr Peer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesForRouteImpl#getPathAttrIPAddrPrefixLen <em>Path Attr IP Addr Prefix Len</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPAttributesForRouteImpl#getPathAttrIPAddrPrefix <em>Path Attr IP Addr Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPAttributesForRouteImpl extends CIM_DependencyImpl implements CIM_BGPAttributesForRoute {
	/**
	 * The default value of the '{@link #getPathAttrPeer() <em>Path Attr Peer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrPeer()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_ATTR_PEER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrPeer() <em>Path Attr Peer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrPeer()
	 * @generated
	 * @ordered
	 */
	protected String pathAttrPeer = PATH_ATTR_PEER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrIPAddrPrefixLen() <em>Path Attr IP Addr Prefix Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrIPAddrPrefixLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_ATTR_IP_ADDR_PREFIX_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrIPAddrPrefixLen() <em>Path Attr IP Addr Prefix Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrIPAddrPrefixLen()
	 * @generated
	 * @ordered
	 */
	protected Integer pathAttrIPAddrPrefixLen = PATH_ATTR_IP_ADDR_PREFIX_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAttrIPAddrPrefix() <em>Path Attr IP Addr Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrIPAddrPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_ATTR_IP_ADDR_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAttrIPAddrPrefix() <em>Path Attr IP Addr Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAttrIPAddrPrefix()
	 * @generated
	 * @ordered
	 */
	protected String pathAttrIPAddrPrefix = PATH_ATTR_IP_ADDR_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPAttributesForRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPAttributesForRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathAttrPeer() {
		return pathAttrPeer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrPeer(String newPathAttrPeer) {
		String oldPathAttrPeer = pathAttrPeer;
		pathAttrPeer = newPathAttrPeer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_PEER, oldPathAttrPeer, pathAttrPeer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathAttrIPAddrPrefixLen() {
		return pathAttrIPAddrPrefixLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrIPAddrPrefixLen(Integer newPathAttrIPAddrPrefixLen) {
		Integer oldPathAttrIPAddrPrefixLen = pathAttrIPAddrPrefixLen;
		pathAttrIPAddrPrefixLen = newPathAttrIPAddrPrefixLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX_LEN, oldPathAttrIPAddrPrefixLen, pathAttrIPAddrPrefixLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathAttrIPAddrPrefix() {
		return pathAttrIPAddrPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAttrIPAddrPrefix(String newPathAttrIPAddrPrefix) {
		String oldPathAttrIPAddrPrefix = pathAttrIPAddrPrefix;
		pathAttrIPAddrPrefix = newPathAttrIPAddrPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX, oldPathAttrIPAddrPrefix, pathAttrIPAddrPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_PEER:
				return getPathAttrPeer();
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX_LEN:
				return getPathAttrIPAddrPrefixLen();
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX:
				return getPathAttrIPAddrPrefix();
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
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_PEER:
				setPathAttrPeer((String)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX_LEN:
				setPathAttrIPAddrPrefixLen((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX:
				setPathAttrIPAddrPrefix((String)newValue);
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
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_PEER:
				setPathAttrPeer(PATH_ATTR_PEER_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX_LEN:
				setPathAttrIPAddrPrefixLen(PATH_ATTR_IP_ADDR_PREFIX_LEN_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX:
				setPathAttrIPAddrPrefix(PATH_ATTR_IP_ADDR_PREFIX_EDEFAULT);
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
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_PEER:
				return PATH_ATTR_PEER_EDEFAULT == null ? pathAttrPeer != null : !PATH_ATTR_PEER_EDEFAULT.equals(pathAttrPeer);
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX_LEN:
				return PATH_ATTR_IP_ADDR_PREFIX_LEN_EDEFAULT == null ? pathAttrIPAddrPrefixLen != null : !PATH_ATTR_IP_ADDR_PREFIX_LEN_EDEFAULT.equals(pathAttrIPAddrPrefixLen);
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE__PATH_ATTR_IP_ADDR_PREFIX:
				return PATH_ATTR_IP_ADDR_PREFIX_EDEFAULT == null ? pathAttrIPAddrPrefix != null : !PATH_ATTR_IP_ADDR_PREFIX_EDEFAULT.equals(pathAttrIPAddrPrefix);
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
		result.append(" (PathAttrPeer: ");
		result.append(pathAttrPeer);
		result.append(", PathAttrIPAddrPrefixLen: ");
		result.append(pathAttrIPAddrPrefixLen);
		result.append(", PathAttrIPAddrPrefix: ");
		result.append(pathAttrIPAddrPrefix);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPAttributesForRouteImpl
