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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities;
import org.dmtf.cim.CIM_DiskPartitionConfigurationService;
import org.dmtf.cim.CIM_GenericDiskPartition;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Partition Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskPartitionConfigurationServiceImpl#getPartitioningSchemes <em>Partitioning Schemes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskPartitionConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_DiskPartitionConfigurationService {
	/**
	 * The default value of the '{@link #getPartitioningSchemes() <em>Partitioning Schemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioningSchemes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARTITIONING_SCHEMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitioningSchemes() <em>Partitioning Schemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioningSchemes()
	 * @generated
	 * @ordered
	 */
	protected Integer partitioningSchemes = PARTITIONING_SCHEMES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskPartitionConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskPartitionConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPartitioningSchemes() {
		return partitioningSchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitioningSchemes(Integer newPartitioningSchemes) {
		Integer oldPartitioningSchemes = partitioningSchemes;
		partitioningSchemes = newPartitioningSchemes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE__PARTITIONING_SCHEMES, oldPartitioningSchemes, partitioningSchemes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetPartitionStyle(CIM_StorageExtent Extent, CIM_DiskPartitionConfigurationCapabilities PartitionStyle) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateOrModifyPartition(CIM_StorageExtent extent, Long StartingAddress, Long EndingAddress, String DeviceFileName, CIM_GenericDiskPartition Partition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE__PARTITIONING_SCHEMES:
				return getPartitioningSchemes();
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
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE__PARTITIONING_SCHEMES:
				setPartitioningSchemes((Integer)newValue);
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
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE__PARTITIONING_SCHEMES:
				setPartitioningSchemes(PARTITIONING_SCHEMES_EDEFAULT);
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
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE__PARTITIONING_SCHEMES:
				return PARTITIONING_SCHEMES_EDEFAULT == null ? partitioningSchemes != null : !PARTITIONING_SCHEMES_EDEFAULT.equals(partitioningSchemes);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE___SET_PARTITION_STYLE__CIM_STORAGEEXTENT_CIM_DISKPARTITIONCONFIGURATIONCAPABILITIES:
				return SetPartitionStyle((CIM_StorageExtent)arguments.get(0), (CIM_DiskPartitionConfigurationCapabilities)arguments.get(1));
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE___CREATE_OR_MODIFY_PARTITION__CIM_STORAGEEXTENT_LONG_LONG_STRING_CIM_GENERICDISKPARTITION:
				return CreateOrModifyPartition((CIM_StorageExtent)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2), (String)arguments.get(3), (CIM_GenericDiskPartition)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (PartitioningSchemes: ");
		result.append(partitioningSchemes);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskPartitionConfigurationServiceImpl
