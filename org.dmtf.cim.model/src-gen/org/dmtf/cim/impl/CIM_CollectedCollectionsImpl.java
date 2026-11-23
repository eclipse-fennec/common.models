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

import org.dmtf.cim.CIM_CollectedCollections;
import org.dmtf.cim.CIM_CollectionOfMSEs;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Collected Collections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CollectedCollectionsImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CollectedCollectionsImpl#getCollectionInCollection <em>Collection In Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CollectedCollectionsImpl extends MinimalEObjectImpl.Container implements CIM_CollectedCollections {
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
	 * The cached value of the '{@link #getCollectionInCollection() <em>Collection In Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionInCollection()
	 * @generated
	 * @ordered
	 */
	protected CIM_CollectionOfMSEs collectionInCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CollectedCollectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CollectedCollections();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION, oldCollection, collection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionOfMSEs getCollectionInCollection() {
		if (collectionInCollection != null && collectionInCollection.eIsProxy()) {
			InternalEObject oldCollectionInCollection = (InternalEObject)collectionInCollection;
			collectionInCollection = (CIM_CollectionOfMSEs)eResolveProxy(oldCollectionInCollection);
			if (collectionInCollection != oldCollectionInCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION_IN_COLLECTION, oldCollectionInCollection, collectionInCollection));
			}
		}
		return collectionInCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_CollectionOfMSEs basicGetCollectionInCollection() {
		return collectionInCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionInCollection(CIM_CollectionOfMSEs newCollectionInCollection) {
		CIM_CollectionOfMSEs oldCollectionInCollection = collectionInCollection;
		collectionInCollection = newCollectionInCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION_IN_COLLECTION, oldCollectionInCollection, collectionInCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION_IN_COLLECTION:
				if (resolve) return getCollectionInCollection();
				return basicGetCollectionInCollection();
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
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION:
				setCollection((CIM_CollectionOfMSEs)newValue);
				return;
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION_IN_COLLECTION:
				setCollectionInCollection((CIM_CollectionOfMSEs)newValue);
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
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION:
				setCollection((CIM_CollectionOfMSEs)null);
				return;
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION_IN_COLLECTION:
				setCollectionInCollection((CIM_CollectionOfMSEs)null);
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
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION:
				return collection != null;
			case CimPackage.CIM_COLLECTED_COLLECTIONS__COLLECTION_IN_COLLECTION:
				return collectionInCollection != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_CollectedCollectionsImpl
