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

import org.dmtf.cim.CIM_X509CRL;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM X509CRL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CRLImpl#getNextUpdate <em>Next Update</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CRLImpl#getEncodedCRL <em>Encoded CRL</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CRLImpl#getSerialNumbers <em>Serial Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_X509CRLImpl extends CIM_X509InfrastructureImpl implements CIM_X509CRL {
	/**
	 * The default value of the '{@link #getNextUpdate() <em>Next Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextUpdate() <em>Next Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextUpdate()
	 * @generated
	 * @ordered
	 */
	protected String nextUpdate = NEXT_UPDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEncodedCRL() <em>Encoded CRL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedCRL()
	 * @generated
	 * @ordered
	 */
	protected EList<String> encodedCRL;

	/**
	 * The cached value of the '{@link #getSerialNumbers() <em>Serial Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serialNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_X509CRLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_X509CRL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextUpdate() {
		return nextUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextUpdate(String newNextUpdate) {
		String oldNextUpdate = nextUpdate;
		nextUpdate = newNextUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509CRL__NEXT_UPDATE, oldNextUpdate, nextUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEncodedCRL() {
		if (encodedCRL == null) {
			encodedCRL = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509CRL__ENCODED_CRL);
		}
		return encodedCRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSerialNumbers() {
		if (serialNumbers == null) {
			serialNumbers = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_X509CRL__SERIAL_NUMBERS);
		}
		return serialNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_X509CRL__NEXT_UPDATE:
				return getNextUpdate();
			case CimPackage.CIM_X509CRL__ENCODED_CRL:
				return getEncodedCRL();
			case CimPackage.CIM_X509CRL__SERIAL_NUMBERS:
				return getSerialNumbers();
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
			case CimPackage.CIM_X509CRL__NEXT_UPDATE:
				setNextUpdate((String)newValue);
				return;
			case CimPackage.CIM_X509CRL__ENCODED_CRL:
				getEncodedCRL().clear();
				getEncodedCRL().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_X509CRL__SERIAL_NUMBERS:
				getSerialNumbers().clear();
				getSerialNumbers().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_X509CRL__NEXT_UPDATE:
				setNextUpdate(NEXT_UPDATE_EDEFAULT);
				return;
			case CimPackage.CIM_X509CRL__ENCODED_CRL:
				getEncodedCRL().clear();
				return;
			case CimPackage.CIM_X509CRL__SERIAL_NUMBERS:
				getSerialNumbers().clear();
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
			case CimPackage.CIM_X509CRL__NEXT_UPDATE:
				return NEXT_UPDATE_EDEFAULT == null ? nextUpdate != null : !NEXT_UPDATE_EDEFAULT.equals(nextUpdate);
			case CimPackage.CIM_X509CRL__ENCODED_CRL:
				return encodedCRL != null && !encodedCRL.isEmpty();
			case CimPackage.CIM_X509CRL__SERIAL_NUMBERS:
				return serialNumbers != null && !serialNumbers.isEmpty();
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
		result.append(" (NextUpdate: ");
		result.append(nextUpdate);
		result.append(", EncodedCRL: ");
		result.append(encodedCRL);
		result.append(", SerialNumbers: ");
		result.append(serialNumbers);
		result.append(')');
		return result.toString();
	}

} //CIM_X509CRLImpl
