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

import org.dmtf.cim.CIM_FCSwitchCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Switch Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchCapabilitiesImpl#getDomainIDConfigureable <em>Domain ID Configureable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchCapabilitiesImpl#getMinDomainID <em>Min Domain ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchCapabilitiesImpl#getMaxDomainID <em>Max Domain ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchCapabilitiesImpl#getDomainIDLockedSupported <em>Domain ID Locked Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchCapabilitiesImpl#getPrincipalPrioritiesSupported <em>Principal Priorities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCSwitchCapabilitiesImpl#getNPIVSupported <em>NPIV Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCSwitchCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_FCSwitchCapabilities {
	/**
	 * The default value of the '{@link #getDomainIDConfigureable() <em>Domain ID Configureable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainIDConfigureable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOMAIN_ID_CONFIGUREABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainIDConfigureable() <em>Domain ID Configureable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainIDConfigureable()
	 * @generated
	 * @ordered
	 */
	protected Boolean domainIDConfigureable = DOMAIN_ID_CONFIGUREABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDomainID() <em>Min Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDomainID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinDomainID() <em>Min Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDomainID()
	 * @generated
	 * @ordered
	 */
	protected Integer minDomainID = MIN_DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDomainID() <em>Max Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDomainID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDomainID() <em>Max Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDomainID()
	 * @generated
	 * @ordered
	 */
	protected Integer maxDomainID = MAX_DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainIDLockedSupported() <em>Domain ID Locked Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainIDLockedSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOMAIN_ID_LOCKED_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainIDLockedSupported() <em>Domain ID Locked Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainIDLockedSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean domainIDLockedSupported = DOMAIN_ID_LOCKED_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrincipalPrioritiesSupported() <em>Principal Priorities Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalPrioritiesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> principalPrioritiesSupported;

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
	protected CIM_FCSwitchCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCSwitchCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDomainIDConfigureable() {
		return domainIDConfigureable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainIDConfigureable(Boolean newDomainIDConfigureable) {
		Boolean oldDomainIDConfigureable = domainIDConfigureable;
		domainIDConfigureable = newDomainIDConfigureable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_CONFIGUREABLE, oldDomainIDConfigureable, domainIDConfigureable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinDomainID() {
		return minDomainID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinDomainID(Integer newMinDomainID) {
		Integer oldMinDomainID = minDomainID;
		minDomainID = newMinDomainID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_CAPABILITIES__MIN_DOMAIN_ID, oldMinDomainID, minDomainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxDomainID() {
		return maxDomainID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDomainID(Integer newMaxDomainID) {
		Integer oldMaxDomainID = maxDomainID;
		maxDomainID = newMaxDomainID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_CAPABILITIES__MAX_DOMAIN_ID, oldMaxDomainID, maxDomainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDomainIDLockedSupported() {
		return domainIDLockedSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainIDLockedSupported(Boolean newDomainIDLockedSupported) {
		Boolean oldDomainIDLockedSupported = domainIDLockedSupported;
		domainIDLockedSupported = newDomainIDLockedSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_LOCKED_SUPPORTED, oldDomainIDLockedSupported, domainIDLockedSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPrincipalPrioritiesSupported() {
		if (principalPrioritiesSupported == null) {
			principalPrioritiesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_SWITCH_CAPABILITIES__PRINCIPAL_PRIORITIES_SUPPORTED);
		}
		return principalPrioritiesSupported;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_SWITCH_CAPABILITIES__NPIV_SUPPORTED, oldNPIVSupported, npivSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_CONFIGUREABLE:
				return getDomainIDConfigureable();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MIN_DOMAIN_ID:
				return getMinDomainID();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MAX_DOMAIN_ID:
				return getMaxDomainID();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_LOCKED_SUPPORTED:
				return getDomainIDLockedSupported();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__PRINCIPAL_PRIORITIES_SUPPORTED:
				return getPrincipalPrioritiesSupported();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__NPIV_SUPPORTED:
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
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_CONFIGUREABLE:
				setDomainIDConfigureable((Boolean)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MIN_DOMAIN_ID:
				setMinDomainID((Integer)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MAX_DOMAIN_ID:
				setMaxDomainID((Integer)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_LOCKED_SUPPORTED:
				setDomainIDLockedSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__PRINCIPAL_PRIORITIES_SUPPORTED:
				getPrincipalPrioritiesSupported().clear();
				getPrincipalPrioritiesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__NPIV_SUPPORTED:
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
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_CONFIGUREABLE:
				setDomainIDConfigureable(DOMAIN_ID_CONFIGUREABLE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MIN_DOMAIN_ID:
				setMinDomainID(MIN_DOMAIN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MAX_DOMAIN_ID:
				setMaxDomainID(MAX_DOMAIN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_LOCKED_SUPPORTED:
				setDomainIDLockedSupported(DOMAIN_ID_LOCKED_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__PRINCIPAL_PRIORITIES_SUPPORTED:
				getPrincipalPrioritiesSupported().clear();
				return;
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__NPIV_SUPPORTED:
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
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_CONFIGUREABLE:
				return DOMAIN_ID_CONFIGUREABLE_EDEFAULT == null ? domainIDConfigureable != null : !DOMAIN_ID_CONFIGUREABLE_EDEFAULT.equals(domainIDConfigureable);
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MIN_DOMAIN_ID:
				return MIN_DOMAIN_ID_EDEFAULT == null ? minDomainID != null : !MIN_DOMAIN_ID_EDEFAULT.equals(minDomainID);
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__MAX_DOMAIN_ID:
				return MAX_DOMAIN_ID_EDEFAULT == null ? maxDomainID != null : !MAX_DOMAIN_ID_EDEFAULT.equals(maxDomainID);
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__DOMAIN_ID_LOCKED_SUPPORTED:
				return DOMAIN_ID_LOCKED_SUPPORTED_EDEFAULT == null ? domainIDLockedSupported != null : !DOMAIN_ID_LOCKED_SUPPORTED_EDEFAULT.equals(domainIDLockedSupported);
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__PRINCIPAL_PRIORITIES_SUPPORTED:
				return principalPrioritiesSupported != null && !principalPrioritiesSupported.isEmpty();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES__NPIV_SUPPORTED:
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
		result.append(" (DomainIDConfigureable: ");
		result.append(domainIDConfigureable);
		result.append(", MinDomainID: ");
		result.append(minDomainID);
		result.append(", MaxDomainID: ");
		result.append(maxDomainID);
		result.append(", DomainIDLockedSupported: ");
		result.append(domainIDLockedSupported);
		result.append(", PrincipalPrioritiesSupported: ");
		result.append(principalPrioritiesSupported);
		result.append(", NPIVSupported: ");
		result.append(npivSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_FCSwitchCapabilitiesImpl
