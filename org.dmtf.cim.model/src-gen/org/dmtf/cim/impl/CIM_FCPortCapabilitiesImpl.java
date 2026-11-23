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

import org.dmtf.cim.CIM_FCPortCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortCapabilitiesImpl#getRequestedTypesSupported <em>Requested Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortCapabilitiesImpl#getMaxNPIVLogins <em>Max NPIV Logins</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortCapabilitiesImpl#getNPIVSupported <em>NPIV Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCPortCapabilitiesImpl extends CIM_NetworkPortCapabilitiesImpl implements CIM_FCPortCapabilities {
	/**
	 * The cached value of the '{@link #getRequestedTypesSupported() <em>Requested Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedTypesSupported;

	/**
	 * The default value of the '{@link #getMaxNPIVLogins() <em>Max NPIV Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNPIVLogins()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_NPIV_LOGINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNPIVLogins() <em>Max NPIV Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNPIVLogins()
	 * @generated
	 * @ordered
	 */
	protected Integer maxNPIVLogins = MAX_NPIV_LOGINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNPIVSupported() <em>NPIV Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPIVSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NPIV_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNPIVSupported() <em>NPIV Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPIVSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean npivSupported = NPIV_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCPortCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCPortCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedTypesSupported() {
		if (requestedTypesSupported == null) {
			requestedTypesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_PORT_CAPABILITIES__REQUESTED_TYPES_SUPPORTED);
		}
		return requestedTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxNPIVLogins() {
		return maxNPIVLogins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNPIVLogins(Integer newMaxNPIVLogins) {
		Integer oldMaxNPIVLogins = maxNPIVLogins;
		maxNPIVLogins = newMaxNPIVLogins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_CAPABILITIES__MAX_NPIV_LOGINS, oldMaxNPIVLogins, maxNPIVLogins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNPIVSupported() {
		return npivSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNPIVSupported(Boolean newNPIVSupported) {
		Boolean oldNPIVSupported = npivSupported;
		npivSupported = newNPIVSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_CAPABILITIES__NPIV_SUPPORTED, oldNPIVSupported, npivSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_PORT_CAPABILITIES__REQUESTED_TYPES_SUPPORTED:
				return getRequestedTypesSupported();
			case CimPackage.CIM_FC_PORT_CAPABILITIES__MAX_NPIV_LOGINS:
				return getMaxNPIVLogins();
			case CimPackage.CIM_FC_PORT_CAPABILITIES__NPIV_SUPPORTED:
				return getNPIVSupported();
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
			case CimPackage.CIM_FC_PORT_CAPABILITIES__REQUESTED_TYPES_SUPPORTED:
				getRequestedTypesSupported().clear();
				getRequestedTypesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FC_PORT_CAPABILITIES__MAX_NPIV_LOGINS:
				setMaxNPIVLogins((Integer)newValue);
				return;
			case CimPackage.CIM_FC_PORT_CAPABILITIES__NPIV_SUPPORTED:
				setNPIVSupported((Boolean)newValue);
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
			case CimPackage.CIM_FC_PORT_CAPABILITIES__REQUESTED_TYPES_SUPPORTED:
				getRequestedTypesSupported().clear();
				return;
			case CimPackage.CIM_FC_PORT_CAPABILITIES__MAX_NPIV_LOGINS:
				setMaxNPIVLogins(MAX_NPIV_LOGINS_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_CAPABILITIES__NPIV_SUPPORTED:
				setNPIVSupported(NPIV_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_FC_PORT_CAPABILITIES__REQUESTED_TYPES_SUPPORTED:
				return requestedTypesSupported != null && !requestedTypesSupported.isEmpty();
			case CimPackage.CIM_FC_PORT_CAPABILITIES__MAX_NPIV_LOGINS:
				return MAX_NPIV_LOGINS_EDEFAULT == null ? maxNPIVLogins != null : !MAX_NPIV_LOGINS_EDEFAULT.equals(maxNPIVLogins);
			case CimPackage.CIM_FC_PORT_CAPABILITIES__NPIV_SUPPORTED:
				return NPIV_SUPPORTED_EDEFAULT == null ? npivSupported != null : !NPIV_SUPPORTED_EDEFAULT.equals(npivSupported);
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
		result.append(" (RequestedTypesSupported: ");
		result.append(requestedTypesSupported);
		result.append(", MaxNPIVLogins: ");
		result.append(maxNPIVLogins);
		result.append(", NPIVSupported: ");
		result.append(npivSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_FCPortCapabilitiesImpl
