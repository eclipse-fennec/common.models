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

import org.dmtf.cim.CIM_ReplicationGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replication Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationGroupImpl#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationGroupImpl#getDeleteOnEmptyElement <em>Delete On Empty Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationGroupImpl#getDeleteOnUnassociated <em>Delete On Unassociated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationGroupImpl#getConsistentPointInTime <em>Consistent Point In Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationGroupImpl#getReservedAs <em>Reserved As</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationGroupImpl#getSupportedSyncTypes <em>Supported Sync Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ReplicationGroupImpl extends CIM_SystemSpecificCollectionImpl implements CIM_ReplicationGroup {
	/**
	 * The default value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PERSISTENT_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected Boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteOnEmptyElement() <em>Delete On Empty Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnEmptyElement()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_EMPTY_ELEMENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDeleteOnEmptyElement() <em>Delete On Empty Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnEmptyElement()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnEmptyElement = DELETE_ON_EMPTY_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteOnUnassociated() <em>Delete On Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnUnassociated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_UNASSOCIATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDeleteOnUnassociated() <em>Delete On Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnUnassociated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnUnassociated = DELETE_ON_UNASSOCIATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistentPointInTime() <em>Consistent Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentPointInTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSISTENT_POINT_IN_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConsistentPointInTime() <em>Consistent Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentPointInTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean consistentPointInTime = CONSISTENT_POINT_IN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedAs() <em>Reserved As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedAs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservedAs() <em>Reserved As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedAs()
	 * @generated
	 * @ordered
	 */
	protected Integer reservedAs = RESERVED_AS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedSyncTypes() <em>Supported Sync Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSyncTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSyncTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplicationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplicationGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(Boolean newPersistent) {
		Boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_GROUP__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnEmptyElement() {
		return deleteOnEmptyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnEmptyElement(Boolean newDeleteOnEmptyElement) {
		Boolean oldDeleteOnEmptyElement = deleteOnEmptyElement;
		deleteOnEmptyElement = newDeleteOnEmptyElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_EMPTY_ELEMENT, oldDeleteOnEmptyElement, deleteOnEmptyElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnUnassociated() {
		return deleteOnUnassociated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnUnassociated(Boolean newDeleteOnUnassociated) {
		Boolean oldDeleteOnUnassociated = deleteOnUnassociated;
		deleteOnUnassociated = newDeleteOnUnassociated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_UNASSOCIATED, oldDeleteOnUnassociated, deleteOnUnassociated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConsistentPointInTime() {
		return consistentPointInTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistentPointInTime(Boolean newConsistentPointInTime) {
		Boolean oldConsistentPointInTime = consistentPointInTime;
		consistentPointInTime = newConsistentPointInTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_GROUP__CONSISTENT_POINT_IN_TIME, oldConsistentPointInTime, consistentPointInTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReservedAs() {
		return reservedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedAs(Integer newReservedAs) {
		Integer oldReservedAs = reservedAs;
		reservedAs = newReservedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_GROUP__RESERVED_AS, oldReservedAs, reservedAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSyncTypes() {
		if (supportedSyncTypes == null) {
			supportedSyncTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICATION_GROUP__SUPPORTED_SYNC_TYPES);
		}
		return supportedSyncTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REPLICATION_GROUP__PERSISTENT:
				return getPersistent();
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_EMPTY_ELEMENT:
				return getDeleteOnEmptyElement();
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_UNASSOCIATED:
				return getDeleteOnUnassociated();
			case CimPackage.CIM_REPLICATION_GROUP__CONSISTENT_POINT_IN_TIME:
				return getConsistentPointInTime();
			case CimPackage.CIM_REPLICATION_GROUP__RESERVED_AS:
				return getReservedAs();
			case CimPackage.CIM_REPLICATION_GROUP__SUPPORTED_SYNC_TYPES:
				return getSupportedSyncTypes();
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
			case CimPackage.CIM_REPLICATION_GROUP__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_EMPTY_ELEMENT:
				setDeleteOnEmptyElement((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_UNASSOCIATED:
				setDeleteOnUnassociated((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__CONSISTENT_POINT_IN_TIME:
				setConsistentPointInTime((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__RESERVED_AS:
				setReservedAs((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__SUPPORTED_SYNC_TYPES:
				getSupportedSyncTypes().clear();
				getSupportedSyncTypes().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_REPLICATION_GROUP__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_EMPTY_ELEMENT:
				setDeleteOnEmptyElement(DELETE_ON_EMPTY_ELEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_UNASSOCIATED:
				setDeleteOnUnassociated(DELETE_ON_UNASSOCIATED_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__CONSISTENT_POINT_IN_TIME:
				setConsistentPointInTime(CONSISTENT_POINT_IN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__RESERVED_AS:
				setReservedAs(RESERVED_AS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_GROUP__SUPPORTED_SYNC_TYPES:
				getSupportedSyncTypes().clear();
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
			case CimPackage.CIM_REPLICATION_GROUP__PERSISTENT:
				return PERSISTENT_EDEFAULT == null ? persistent != null : !PERSISTENT_EDEFAULT.equals(persistent);
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_EMPTY_ELEMENT:
				return DELETE_ON_EMPTY_ELEMENT_EDEFAULT == null ? deleteOnEmptyElement != null : !DELETE_ON_EMPTY_ELEMENT_EDEFAULT.equals(deleteOnEmptyElement);
			case CimPackage.CIM_REPLICATION_GROUP__DELETE_ON_UNASSOCIATED:
				return DELETE_ON_UNASSOCIATED_EDEFAULT == null ? deleteOnUnassociated != null : !DELETE_ON_UNASSOCIATED_EDEFAULT.equals(deleteOnUnassociated);
			case CimPackage.CIM_REPLICATION_GROUP__CONSISTENT_POINT_IN_TIME:
				return CONSISTENT_POINT_IN_TIME_EDEFAULT == null ? consistentPointInTime != null : !CONSISTENT_POINT_IN_TIME_EDEFAULT.equals(consistentPointInTime);
			case CimPackage.CIM_REPLICATION_GROUP__RESERVED_AS:
				return RESERVED_AS_EDEFAULT == null ? reservedAs != null : !RESERVED_AS_EDEFAULT.equals(reservedAs);
			case CimPackage.CIM_REPLICATION_GROUP__SUPPORTED_SYNC_TYPES:
				return supportedSyncTypes != null && !supportedSyncTypes.isEmpty();
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
		result.append(" (Persistent: ");
		result.append(persistent);
		result.append(", DeleteOnEmptyElement: ");
		result.append(deleteOnEmptyElement);
		result.append(", DeleteOnUnassociated: ");
		result.append(deleteOnUnassociated);
		result.append(", ConsistentPointInTime: ");
		result.append(consistentPointInTime);
		result.append(", ReservedAs: ");
		result.append(reservedAs);
		result.append(", SupportedSyncTypes: ");
		result.append(supportedSyncTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_ReplicationGroupImpl
