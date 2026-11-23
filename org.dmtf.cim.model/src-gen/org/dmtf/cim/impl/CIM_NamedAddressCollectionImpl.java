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

import org.dmtf.cim.CIM_NamedAddressCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Named Address Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedAddressCollectionImpl#getCollectionAlias <em>Collection Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NamedAddressCollectionImpl extends CIM_SystemSpecificCollectionImpl implements CIM_NamedAddressCollection {
	/**
	 * The default value of the '{@link #getCollectionAlias() <em>Collection Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionAlias() <em>Collection Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionAlias()
	 * @generated
	 * @ordered
	 */
	protected String collectionAlias = COLLECTION_ALIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NamedAddressCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NamedAddressCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollectionAlias() {
		return collectionAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionAlias(String newCollectionAlias) {
		String oldCollectionAlias = collectionAlias;
		collectionAlias = newCollectionAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS, oldCollectionAlias, collectionAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				return getCollectionAlias();
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
			case CimPackage.CIM_NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				setCollectionAlias((String)newValue);
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
			case CimPackage.CIM_NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				setCollectionAlias(COLLECTION_ALIAS_EDEFAULT);
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
			case CimPackage.CIM_NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				return COLLECTION_ALIAS_EDEFAULT == null ? collectionAlias != null : !COLLECTION_ALIAS_EDEFAULT.equals(collectionAlias);
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
		result.append(" (CollectionAlias: ");
		result.append(collectionAlias);
		result.append(')');
		return result.toString();
	}

} //CIM_NamedAddressCollectionImpl
