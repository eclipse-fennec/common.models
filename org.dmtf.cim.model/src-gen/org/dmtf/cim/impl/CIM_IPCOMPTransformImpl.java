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

import org.dmtf.cim.CIM_IPCOMPTransform;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IPCOMP Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPCOMPTransformImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPCOMPTransformImpl#getOtherAlgorithm <em>Other Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPCOMPTransformImpl#getPrivateAlgorithm <em>Private Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPCOMPTransformImpl#getDictionarySize <em>Dictionary Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPCOMPTransformImpl extends CIM_SATransformImpl implements CIM_IPCOMPTransform {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAlgorithm() <em>Other Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAlgorithm() <em>Other Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherAlgorithm = OTHER_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateAlgorithm() <em>Private Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRIVATE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateAlgorithm() <em>Private Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Long privateAlgorithm = PRIVATE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDictionarySize() <em>Dictionary Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionarySize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DICTIONARY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDictionarySize() <em>Dictionary Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionarySize()
	 * @generated
	 * @ordered
	 */
	protected Integer dictionarySize = DICTIONARY_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPCOMPTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPCOMPTransform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(Integer newAlgorithm) {
		Integer oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPCOMP_TRANSFORM__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAlgorithm() {
		return otherAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAlgorithm(String newOtherAlgorithm) {
		String oldOtherAlgorithm = otherAlgorithm;
		otherAlgorithm = newOtherAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPCOMP_TRANSFORM__OTHER_ALGORITHM, oldOtherAlgorithm, otherAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPrivateAlgorithm() {
		return privateAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateAlgorithm(Long newPrivateAlgorithm) {
		Long oldPrivateAlgorithm = privateAlgorithm;
		privateAlgorithm = newPrivateAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPCOMP_TRANSFORM__PRIVATE_ALGORITHM, oldPrivateAlgorithm, privateAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDictionarySize() {
		return dictionarySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDictionarySize(Integer newDictionarySize) {
		Integer oldDictionarySize = dictionarySize;
		dictionarySize = newDictionarySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPCOMP_TRANSFORM__DICTIONARY_SIZE, oldDictionarySize, dictionarySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IPCOMP_TRANSFORM__ALGORITHM:
				return getAlgorithm();
			case CimPackage.CIM_IPCOMP_TRANSFORM__OTHER_ALGORITHM:
				return getOtherAlgorithm();
			case CimPackage.CIM_IPCOMP_TRANSFORM__PRIVATE_ALGORITHM:
				return getPrivateAlgorithm();
			case CimPackage.CIM_IPCOMP_TRANSFORM__DICTIONARY_SIZE:
				return getDictionarySize();
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
			case CimPackage.CIM_IPCOMP_TRANSFORM__ALGORITHM:
				setAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_IPCOMP_TRANSFORM__OTHER_ALGORITHM:
				setOtherAlgorithm((String)newValue);
				return;
			case CimPackage.CIM_IPCOMP_TRANSFORM__PRIVATE_ALGORITHM:
				setPrivateAlgorithm((Long)newValue);
				return;
			case CimPackage.CIM_IPCOMP_TRANSFORM__DICTIONARY_SIZE:
				setDictionarySize((Integer)newValue);
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
			case CimPackage.CIM_IPCOMP_TRANSFORM__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IPCOMP_TRANSFORM__OTHER_ALGORITHM:
				setOtherAlgorithm(OTHER_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IPCOMP_TRANSFORM__PRIVATE_ALGORITHM:
				setPrivateAlgorithm(PRIVATE_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IPCOMP_TRANSFORM__DICTIONARY_SIZE:
				setDictionarySize(DICTIONARY_SIZE_EDEFAULT);
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
			case CimPackage.CIM_IPCOMP_TRANSFORM__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case CimPackage.CIM_IPCOMP_TRANSFORM__OTHER_ALGORITHM:
				return OTHER_ALGORITHM_EDEFAULT == null ? otherAlgorithm != null : !OTHER_ALGORITHM_EDEFAULT.equals(otherAlgorithm);
			case CimPackage.CIM_IPCOMP_TRANSFORM__PRIVATE_ALGORITHM:
				return PRIVATE_ALGORITHM_EDEFAULT == null ? privateAlgorithm != null : !PRIVATE_ALGORITHM_EDEFAULT.equals(privateAlgorithm);
			case CimPackage.CIM_IPCOMP_TRANSFORM__DICTIONARY_SIZE:
				return DICTIONARY_SIZE_EDEFAULT == null ? dictionarySize != null : !DICTIONARY_SIZE_EDEFAULT.equals(dictionarySize);
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
		result.append(" (Algorithm: ");
		result.append(algorithm);
		result.append(", OtherAlgorithm: ");
		result.append(otherAlgorithm);
		result.append(", PrivateAlgorithm: ");
		result.append(privateAlgorithm);
		result.append(", DictionarySize: ");
		result.append(dictionarySize);
		result.append(')');
		return result.toString();
	}

} //CIM_IPCOMPTransformImpl
