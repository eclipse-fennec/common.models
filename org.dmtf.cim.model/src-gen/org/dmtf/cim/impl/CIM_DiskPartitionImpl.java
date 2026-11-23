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

import org.dmtf.cim.CIM_DiskPartition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionImpl#getPrimaryPartition <em>Primary Partition</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionImpl#getPartitionType <em>Partition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionImpl#getPartitionSubtype <em>Partition Subtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskPartitionImpl extends CIM_GenericDiskPartitionImpl implements CIM_DiskPartition {
	/**
	 * The default value of the '{@link #getPrimaryPartition() <em>Primary Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryPartition()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMARY_PARTITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryPartition() <em>Primary Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryPartition()
	 * @generated
	 * @ordered
	 */
	protected Boolean primaryPartition = PRIMARY_PARTITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionType() <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARTITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionType() <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionType()
	 * @generated
	 * @ordered
	 */
	protected Integer partitionType = PARTITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionSubtype() <em>Partition Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARTITION_SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionSubtype() <em>Partition Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionSubtype()
	 * @generated
	 * @ordered
	 */
	protected Integer partitionSubtype = PARTITION_SUBTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrimaryPartition() {
		return primaryPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryPartition(Boolean newPrimaryPartition) {
		Boolean oldPrimaryPartition = primaryPartition;
		primaryPartition = newPrimaryPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION__PRIMARY_PARTITION, oldPrimaryPartition, primaryPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPartitionType() {
		return partitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitionType(Integer newPartitionType) {
		Integer oldPartitionType = partitionType;
		partitionType = newPartitionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION__PARTITION_TYPE, oldPartitionType, partitionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPartitionSubtype() {
		return partitionSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitionSubtype(Integer newPartitionSubtype) {
		Integer oldPartitionSubtype = partitionSubtype;
		partitionSubtype = newPartitionSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION__PARTITION_SUBTYPE, oldPartitionSubtype, partitionSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_PARTITION__PRIMARY_PARTITION:
				return getPrimaryPartition();
			case CimPackage.CIM_DISK_PARTITION__PARTITION_TYPE:
				return getPartitionType();
			case CimPackage.CIM_DISK_PARTITION__PARTITION_SUBTYPE:
				return getPartitionSubtype();
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
			case CimPackage.CIM_DISK_PARTITION__PRIMARY_PARTITION:
				setPrimaryPartition((Boolean)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION__PARTITION_TYPE:
				setPartitionType((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_PARTITION__PARTITION_SUBTYPE:
				setPartitionSubtype((Integer)newValue);
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
			case CimPackage.CIM_DISK_PARTITION__PRIMARY_PARTITION:
				setPrimaryPartition(PRIMARY_PARTITION_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION__PARTITION_TYPE:
				setPartitionType(PARTITION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_PARTITION__PARTITION_SUBTYPE:
				setPartitionSubtype(PARTITION_SUBTYPE_EDEFAULT);
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
			case CimPackage.CIM_DISK_PARTITION__PRIMARY_PARTITION:
				return PRIMARY_PARTITION_EDEFAULT == null ? primaryPartition != null : !PRIMARY_PARTITION_EDEFAULT.equals(primaryPartition);
			case CimPackage.CIM_DISK_PARTITION__PARTITION_TYPE:
				return PARTITION_TYPE_EDEFAULT == null ? partitionType != null : !PARTITION_TYPE_EDEFAULT.equals(partitionType);
			case CimPackage.CIM_DISK_PARTITION__PARTITION_SUBTYPE:
				return PARTITION_SUBTYPE_EDEFAULT == null ? partitionSubtype != null : !PARTITION_SUBTYPE_EDEFAULT.equals(partitionSubtype);
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
		result.append(" (PrimaryPartition: ");
		result.append(primaryPartition);
		result.append(", PartitionType: ");
		result.append(partitionType);
		result.append(", PartitionSubtype: ");
		result.append(partitionSubtype);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskPartitionImpl
