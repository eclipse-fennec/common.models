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

import org.dmtf.cim.CIM_ZoneCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Zone Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getZoneNameMaxLen <em>Zone Name Max Len</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getZoneNameFormat <em>Zone Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getMaxNumZoneSets <em>Max Num Zone Sets</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getMaxNumZone <em>Max Num Zone</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getMaxNumZoneMembers <em>Max Num Zone Members</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getMaxNumZonesPerZoneSet <em>Max Num Zones Per Zone Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getMaxNumZoneAliases <em>Max Num Zone Aliases</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getSupportedConnectivityMemberTypes <em>Supported Connectivity Member Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneCapabilitiesImpl#getOtherSupportedConnectivityMemberTypes <em>Other Supported Connectivity Member Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ZoneCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_ZoneCapabilities {
	/**
	 * The default value of the '{@link #getZoneNameMaxLen() <em>Zone Name Max Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneNameMaxLen()
	 * @generated
	 * @ordered
	 */
	protected static final Long ZONE_NAME_MAX_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneNameMaxLen() <em>Zone Name Max Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneNameMaxLen()
	 * @generated
	 * @ordered
	 */
	protected Long zoneNameMaxLen = ZONE_NAME_MAX_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoneNameFormat() <em>Zone Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZONE_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneNameFormat() <em>Zone Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneNameFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer zoneNameFormat = ZONE_NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumZoneSets() <em>Max Num Zone Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZoneSets()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUM_ZONE_SETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumZoneSets() <em>Max Num Zone Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZoneSets()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumZoneSets = MAX_NUM_ZONE_SETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumZone() <em>Max Num Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZone()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUM_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumZone() <em>Max Num Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZone()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumZone = MAX_NUM_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumZoneMembers() <em>Max Num Zone Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZoneMembers()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUM_ZONE_MEMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumZoneMembers() <em>Max Num Zone Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZoneMembers()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumZoneMembers = MAX_NUM_ZONE_MEMBERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumZonesPerZoneSet() <em>Max Num Zones Per Zone Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZonesPerZoneSet()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUM_ZONES_PER_ZONE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumZonesPerZoneSet() <em>Max Num Zones Per Zone Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZonesPerZoneSet()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumZonesPerZoneSet = MAX_NUM_ZONES_PER_ZONE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumZoneAliases() <em>Max Num Zone Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZoneAliases()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUM_ZONE_ALIASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumZoneAliases() <em>Max Num Zone Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumZoneAliases()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumZoneAliases = MAX_NUM_ZONE_ALIASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedConnectivityMemberTypes() <em>Supported Connectivity Member Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedConnectivityMemberTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedConnectivityMemberTypes;

	/**
	 * The cached value of the '{@link #getOtherSupportedConnectivityMemberTypes() <em>Other Supported Connectivity Member Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedConnectivityMemberTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedConnectivityMemberTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ZoneCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ZoneCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getZoneNameMaxLen() {
		return zoneNameMaxLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoneNameMaxLen(Long newZoneNameMaxLen) {
		Long oldZoneNameMaxLen = zoneNameMaxLen;
		zoneNameMaxLen = newZoneNameMaxLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_MAX_LEN, oldZoneNameMaxLen, zoneNameMaxLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getZoneNameFormat() {
		return zoneNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoneNameFormat(Integer newZoneNameFormat) {
		Integer oldZoneNameFormat = zoneNameFormat;
		zoneNameFormat = newZoneNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_FORMAT, oldZoneNameFormat, zoneNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumZoneSets() {
		return maxNumZoneSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumZoneSets(Long newMaxNumZoneSets) {
		Long oldMaxNumZoneSets = maxNumZoneSets;
		maxNumZoneSets = newMaxNumZoneSets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_SETS, oldMaxNumZoneSets, maxNumZoneSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumZone() {
		return maxNumZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumZone(Long newMaxNumZone) {
		Long oldMaxNumZone = maxNumZone;
		maxNumZone = newMaxNumZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE, oldMaxNumZone, maxNumZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumZoneMembers() {
		return maxNumZoneMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumZoneMembers(Long newMaxNumZoneMembers) {
		Long oldMaxNumZoneMembers = maxNumZoneMembers;
		maxNumZoneMembers = newMaxNumZoneMembers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_MEMBERS, oldMaxNumZoneMembers, maxNumZoneMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumZonesPerZoneSet() {
		return maxNumZonesPerZoneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumZonesPerZoneSet(Long newMaxNumZonesPerZoneSet) {
		Long oldMaxNumZonesPerZoneSet = maxNumZonesPerZoneSet;
		maxNumZonesPerZoneSet = newMaxNumZonesPerZoneSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONES_PER_ZONE_SET, oldMaxNumZonesPerZoneSet, maxNumZonesPerZoneSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumZoneAliases() {
		return maxNumZoneAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumZoneAliases(Long newMaxNumZoneAliases) {
		Long oldMaxNumZoneAliases = maxNumZoneAliases;
		maxNumZoneAliases = newMaxNumZoneAliases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_ALIASES, oldMaxNumZoneAliases, maxNumZoneAliases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedConnectivityMemberTypes() {
		if (supportedConnectivityMemberTypes == null) {
			supportedConnectivityMemberTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ZONE_CAPABILITIES__SUPPORTED_CONNECTIVITY_MEMBER_TYPES);
		}
		return supportedConnectivityMemberTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedConnectivityMemberTypes() {
		if (otherSupportedConnectivityMemberTypes == null) {
			otherSupportedConnectivityMemberTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ZONE_CAPABILITIES__OTHER_SUPPORTED_CONNECTIVITY_MEMBER_TYPES);
		}
		return otherSupportedConnectivityMemberTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_MAX_LEN:
				return getZoneNameMaxLen();
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_FORMAT:
				return getZoneNameFormat();
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_SETS:
				return getMaxNumZoneSets();
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE:
				return getMaxNumZone();
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_MEMBERS:
				return getMaxNumZoneMembers();
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONES_PER_ZONE_SET:
				return getMaxNumZonesPerZoneSet();
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_ALIASES:
				return getMaxNumZoneAliases();
			case CimPackage.CIM_ZONE_CAPABILITIES__SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				return getSupportedConnectivityMemberTypes();
			case CimPackage.CIM_ZONE_CAPABILITIES__OTHER_SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				return getOtherSupportedConnectivityMemberTypes();
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
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_MAX_LEN:
				setZoneNameMaxLen((Long)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_FORMAT:
				setZoneNameFormat((Integer)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_SETS:
				setMaxNumZoneSets((Long)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE:
				setMaxNumZone((Long)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_MEMBERS:
				setMaxNumZoneMembers((Long)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONES_PER_ZONE_SET:
				setMaxNumZonesPerZoneSet((Long)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_ALIASES:
				setMaxNumZoneAliases((Long)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				getSupportedConnectivityMemberTypes().clear();
				getSupportedConnectivityMemberTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__OTHER_SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				getOtherSupportedConnectivityMemberTypes().clear();
				getOtherSupportedConnectivityMemberTypes().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_MAX_LEN:
				setZoneNameMaxLen(ZONE_NAME_MAX_LEN_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_FORMAT:
				setZoneNameFormat(ZONE_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_SETS:
				setMaxNumZoneSets(MAX_NUM_ZONE_SETS_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE:
				setMaxNumZone(MAX_NUM_ZONE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_MEMBERS:
				setMaxNumZoneMembers(MAX_NUM_ZONE_MEMBERS_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONES_PER_ZONE_SET:
				setMaxNumZonesPerZoneSet(MAX_NUM_ZONES_PER_ZONE_SET_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_ALIASES:
				setMaxNumZoneAliases(MAX_NUM_ZONE_ALIASES_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				getSupportedConnectivityMemberTypes().clear();
				return;
			case CimPackage.CIM_ZONE_CAPABILITIES__OTHER_SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				getOtherSupportedConnectivityMemberTypes().clear();
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
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_MAX_LEN:
				return ZONE_NAME_MAX_LEN_EDEFAULT == null ? zoneNameMaxLen != null : !ZONE_NAME_MAX_LEN_EDEFAULT.equals(zoneNameMaxLen);
			case CimPackage.CIM_ZONE_CAPABILITIES__ZONE_NAME_FORMAT:
				return ZONE_NAME_FORMAT_EDEFAULT == null ? zoneNameFormat != null : !ZONE_NAME_FORMAT_EDEFAULT.equals(zoneNameFormat);
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_SETS:
				return MAX_NUM_ZONE_SETS_EDEFAULT == null ? maxNumZoneSets != null : !MAX_NUM_ZONE_SETS_EDEFAULT.equals(maxNumZoneSets);
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE:
				return MAX_NUM_ZONE_EDEFAULT == null ? maxNumZone != null : !MAX_NUM_ZONE_EDEFAULT.equals(maxNumZone);
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_MEMBERS:
				return MAX_NUM_ZONE_MEMBERS_EDEFAULT == null ? maxNumZoneMembers != null : !MAX_NUM_ZONE_MEMBERS_EDEFAULT.equals(maxNumZoneMembers);
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONES_PER_ZONE_SET:
				return MAX_NUM_ZONES_PER_ZONE_SET_EDEFAULT == null ? maxNumZonesPerZoneSet != null : !MAX_NUM_ZONES_PER_ZONE_SET_EDEFAULT.equals(maxNumZonesPerZoneSet);
			case CimPackage.CIM_ZONE_CAPABILITIES__MAX_NUM_ZONE_ALIASES:
				return MAX_NUM_ZONE_ALIASES_EDEFAULT == null ? maxNumZoneAliases != null : !MAX_NUM_ZONE_ALIASES_EDEFAULT.equals(maxNumZoneAliases);
			case CimPackage.CIM_ZONE_CAPABILITIES__SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				return supportedConnectivityMemberTypes != null && !supportedConnectivityMemberTypes.isEmpty();
			case CimPackage.CIM_ZONE_CAPABILITIES__OTHER_SUPPORTED_CONNECTIVITY_MEMBER_TYPES:
				return otherSupportedConnectivityMemberTypes != null && !otherSupportedConnectivityMemberTypes.isEmpty();
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
		result.append(" (ZoneNameMaxLen: ");
		result.append(zoneNameMaxLen);
		result.append(", ZoneNameFormat: ");
		result.append(zoneNameFormat);
		result.append(", MaxNumZoneSets: ");
		result.append(maxNumZoneSets);
		result.append(", MaxNumZone: ");
		result.append(maxNumZone);
		result.append(", MaxNumZoneMembers: ");
		result.append(maxNumZoneMembers);
		result.append(", MaxNumZonesPerZoneSet: ");
		result.append(maxNumZonesPerZoneSet);
		result.append(", MaxNumZoneAliases: ");
		result.append(maxNumZoneAliases);
		result.append(", SupportedConnectivityMemberTypes: ");
		result.append(supportedConnectivityMemberTypes);
		result.append(", OtherSupportedConnectivityMemberTypes: ");
		result.append(otherSupportedConnectivityMemberTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_ZoneCapabilitiesImpl
