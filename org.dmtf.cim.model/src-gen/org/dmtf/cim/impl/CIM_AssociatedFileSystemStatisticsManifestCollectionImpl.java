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

import org.dmtf.cim.CIM_AssociatedFileSystemStatisticsManifestCollection;
import org.dmtf.cim.CIM_FileSystemStatisticsManifestCollection;
import org.dmtf.cim.CIM_StatisticsCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Associated File System Statistics Manifest Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedFileSystemStatisticsManifestCollectionImpl#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedFileSystemStatisticsManifestCollectionImpl#getManifestCollection <em>Manifest Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssociatedFileSystemStatisticsManifestCollectionImpl extends MinimalEObjectImpl.Container implements CIM_AssociatedFileSystemStatisticsManifestCollection {
	/**
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
	protected CIM_StatisticsCollection statistics;

	/**
	 * The cached value of the '{@link #getManifestCollection() <em>Manifest Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestCollection()
	 * @generated
	 * @ordered
	 */
	protected CIM_FileSystemStatisticsManifestCollection manifestCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AssociatedFileSystemStatisticsManifestCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssociatedFileSystemStatisticsManifestCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticsCollection getStatistics() {
		if (statistics != null && statistics.eIsProxy()) {
			InternalEObject oldStatistics = (InternalEObject)statistics;
			statistics = (CIM_StatisticsCollection)eResolveProxy(oldStatistics);
			if (statistics != oldStatistics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__STATISTICS, oldStatistics, statistics));
			}
		}
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StatisticsCollection basicGetStatistics() {
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatistics(CIM_StatisticsCollection newStatistics) {
		CIM_StatisticsCollection oldStatistics = statistics;
		statistics = newStatistics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__STATISTICS, oldStatistics, statistics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemStatisticsManifestCollection getManifestCollection() {
		if (manifestCollection != null && manifestCollection.eIsProxy()) {
			InternalEObject oldManifestCollection = (InternalEObject)manifestCollection;
			manifestCollection = (CIM_FileSystemStatisticsManifestCollection)eResolveProxy(oldManifestCollection);
			if (manifestCollection != oldManifestCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__MANIFEST_COLLECTION, oldManifestCollection, manifestCollection));
			}
		}
		return manifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_FileSystemStatisticsManifestCollection basicGetManifestCollection() {
		return manifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestCollection(CIM_FileSystemStatisticsManifestCollection newManifestCollection) {
		CIM_FileSystemStatisticsManifestCollection oldManifestCollection = manifestCollection;
		manifestCollection = newManifestCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__MANIFEST_COLLECTION, oldManifestCollection, manifestCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__STATISTICS:
				if (resolve) return getStatistics();
				return basicGetStatistics();
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__MANIFEST_COLLECTION:
				if (resolve) return getManifestCollection();
				return basicGetManifestCollection();
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
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__STATISTICS:
				setStatistics((CIM_StatisticsCollection)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__MANIFEST_COLLECTION:
				setManifestCollection((CIM_FileSystemStatisticsManifestCollection)newValue);
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
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__STATISTICS:
				setStatistics((CIM_StatisticsCollection)null);
				return;
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__MANIFEST_COLLECTION:
				setManifestCollection((CIM_FileSystemStatisticsManifestCollection)null);
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
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__STATISTICS:
				return statistics != null;
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION__MANIFEST_COLLECTION:
				return manifestCollection != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_AssociatedFileSystemStatisticsManifestCollectionImpl
