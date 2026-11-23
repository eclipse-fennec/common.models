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

import org.dmtf.cim.CIM_OSPFArea;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFAreaImpl#getAreaID <em>Area ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFAreaImpl#getAreaType <em>Area Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFAreaImpl#getExtLsdbLimit <em>Ext Lsdb Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFAreaImpl extends CIM_RoutingProtocolDomainImpl implements CIM_OSPFArea {
	/**
	 * The default value of the '{@link #getAreaID() <em>Area ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaID()
	 * @generated
	 * @ordered
	 */
	protected static final Long AREA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaID() <em>Area ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaID()
	 * @generated
	 * @ordered
	 */
	protected Long areaID = AREA_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAreaType() <em>Area Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AREA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaType() <em>Area Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaType()
	 * @generated
	 * @ordered
	 */
	protected Integer areaType = AREA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtLsdbLimit() <em>Ext Lsdb Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtLsdbLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXT_LSDB_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtLsdbLimit() <em>Ext Lsdb Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtLsdbLimit()
	 * @generated
	 * @ordered
	 */
	protected Long extLsdbLimit = EXT_LSDB_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAreaID() {
		return areaID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaID(Long newAreaID) {
		Long oldAreaID = areaID;
		areaID = newAreaID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_AREA__AREA_ID, oldAreaID, areaID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAreaType() {
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaType(Integer newAreaType) {
		Integer oldAreaType = areaType;
		areaType = newAreaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_AREA__AREA_TYPE, oldAreaType, areaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExtLsdbLimit() {
		return extLsdbLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtLsdbLimit(Long newExtLsdbLimit) {
		Long oldExtLsdbLimit = extLsdbLimit;
		extLsdbLimit = newExtLsdbLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_AREA__EXT_LSDB_LIMIT, oldExtLsdbLimit, extLsdbLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_AREA__AREA_ID:
				return getAreaID();
			case CimPackage.CIM_OSPF_AREA__AREA_TYPE:
				return getAreaType();
			case CimPackage.CIM_OSPF_AREA__EXT_LSDB_LIMIT:
				return getExtLsdbLimit();
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
			case CimPackage.CIM_OSPF_AREA__AREA_ID:
				setAreaID((Long)newValue);
				return;
			case CimPackage.CIM_OSPF_AREA__AREA_TYPE:
				setAreaType((Integer)newValue);
				return;
			case CimPackage.CIM_OSPF_AREA__EXT_LSDB_LIMIT:
				setExtLsdbLimit((Long)newValue);
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
			case CimPackage.CIM_OSPF_AREA__AREA_ID:
				setAreaID(AREA_ID_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_AREA__AREA_TYPE:
				setAreaType(AREA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_AREA__EXT_LSDB_LIMIT:
				setExtLsdbLimit(EXT_LSDB_LIMIT_EDEFAULT);
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
			case CimPackage.CIM_OSPF_AREA__AREA_ID:
				return AREA_ID_EDEFAULT == null ? areaID != null : !AREA_ID_EDEFAULT.equals(areaID);
			case CimPackage.CIM_OSPF_AREA__AREA_TYPE:
				return AREA_TYPE_EDEFAULT == null ? areaType != null : !AREA_TYPE_EDEFAULT.equals(areaType);
			case CimPackage.CIM_OSPF_AREA__EXT_LSDB_LIMIT:
				return EXT_LSDB_LIMIT_EDEFAULT == null ? extLsdbLimit != null : !EXT_LSDB_LIMIT_EDEFAULT.equals(extLsdbLimit);
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
		result.append(" (AreaID: ");
		result.append(areaID);
		result.append(", AreaType: ");
		result.append(areaType);
		result.append(", ExtLsdbLimit: ");
		result.append(extLsdbLimit);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFAreaImpl
