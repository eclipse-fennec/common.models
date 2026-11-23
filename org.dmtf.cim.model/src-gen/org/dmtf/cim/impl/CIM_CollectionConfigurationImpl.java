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

import org.dmtf.cim.CIM_CollectionConfiguration;
import org.dmtf.cim.CIM_CollectionOfMSEs;
import org.dmtf.cim.CIM_Configuration;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Collection Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CollectionConfigurationImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CollectionConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CollectionConfigurationImpl extends MinimalEObjectImpl.Container implements CIM_CollectionConfiguration {
	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected CIM_CollectionOfMSEs collection;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CIM_Configuration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CollectionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CollectionConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionOfMSEs getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject)collection;
			collection = (CIM_CollectionOfMSEs)eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_COLLECTION_CONFIGURATION__COLLECTION, oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_CollectionOfMSEs basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(CIM_CollectionOfMSEs newCollection) {
		CIM_CollectionOfMSEs oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COLLECTION_CONFIGURATION__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (CIM_Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_COLLECTION_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(CIM_Configuration newConfiguration) {
		CIM_Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COLLECTION_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COLLECTION_CONFIGURATION__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case CimPackage.CIM_COLLECTION_CONFIGURATION__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
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
			case CimPackage.CIM_COLLECTION_CONFIGURATION__COLLECTION:
				setCollection((CIM_CollectionOfMSEs)newValue);
				return;
			case CimPackage.CIM_COLLECTION_CONFIGURATION__CONFIGURATION:
				setConfiguration((CIM_Configuration)newValue);
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
			case CimPackage.CIM_COLLECTION_CONFIGURATION__COLLECTION:
				setCollection((CIM_CollectionOfMSEs)null);
				return;
			case CimPackage.CIM_COLLECTION_CONFIGURATION__CONFIGURATION:
				setConfiguration((CIM_Configuration)null);
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
			case CimPackage.CIM_COLLECTION_CONFIGURATION__COLLECTION:
				return collection != null;
			case CimPackage.CIM_COLLECTION_CONFIGURATION__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_CollectionConfigurationImpl
