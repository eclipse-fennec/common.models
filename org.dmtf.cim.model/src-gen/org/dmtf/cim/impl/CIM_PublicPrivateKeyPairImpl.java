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

import org.dmtf.cim.CIM_PublicPrivateKeyPair;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Public Private Key Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyPairImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyPairImpl#getNonRepudiation <em>Non Repudiation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyPairImpl#getBackedUp <em>Backed Up</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyPairImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PublicPrivateKeyPairImpl extends CIM_UsersCredentialImpl implements CIM_PublicPrivateKeyPair {
	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Integer use = USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonRepudiation() <em>Non Repudiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonRepudiation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NON_REPUDIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonRepudiation() <em>Non Repudiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonRepudiation()
	 * @generated
	 * @ordered
	 */
	protected Boolean nonRepudiation = NON_REPUDIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackedUp() <em>Backed Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackedUp()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BACKED_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackedUp() <em>Backed Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackedUp()
	 * @generated
	 * @ordered
	 */
	protected Boolean backedUp = BACKED_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected String repository = REPOSITORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PublicPrivateKeyPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PublicPrivateKeyPair();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUse(Integer newUse) {
		Integer oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNonRepudiation() {
		return nonRepudiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonRepudiation(Boolean newNonRepudiation) {
		Boolean oldNonRepudiation = nonRepudiation;
		nonRepudiation = newNonRepudiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__NON_REPUDIATION, oldNonRepudiation, nonRepudiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBackedUp() {
		return backedUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackedUp(Boolean newBackedUp) {
		Boolean oldBackedUp = backedUp;
		backedUp = newBackedUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__BACKED_UP, oldBackedUp, backedUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository(String newRepository) {
		String oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__USE:
				return getUse();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__NON_REPUDIATION:
				return getNonRepudiation();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__BACKED_UP:
				return getBackedUp();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__REPOSITORY:
				return getRepository();
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
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__USE:
				setUse((Integer)newValue);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__NON_REPUDIATION:
				setNonRepudiation((Boolean)newValue);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__BACKED_UP:
				setBackedUp((Boolean)newValue);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__REPOSITORY:
				setRepository((String)newValue);
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
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__USE:
				setUse(USE_EDEFAULT);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__NON_REPUDIATION:
				setNonRepudiation(NON_REPUDIATION_EDEFAULT);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__BACKED_UP:
				setBackedUp(BACKED_UP_EDEFAULT);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
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
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__USE:
				return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__NON_REPUDIATION:
				return NON_REPUDIATION_EDEFAULT == null ? nonRepudiation != null : !NON_REPUDIATION_EDEFAULT.equals(nonRepudiation);
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__BACKED_UP:
				return BACKED_UP_EDEFAULT == null ? backedUp != null : !BACKED_UP_EDEFAULT.equals(backedUp);
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
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
		result.append(" (Use: ");
		result.append(use);
		result.append(", NonRepudiation: ");
		result.append(nonRepudiation);
		result.append(", BackedUp: ");
		result.append(backedUp);
		result.append(", Repository: ");
		result.append(repository);
		result.append(')');
		return result.toString();
	}

} //CIM_PublicPrivateKeyPairImpl
