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

import org.dmtf.cim.CIM_HostedShare;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Hosted Share</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_HostedShareImpl#getRemoteShareWWN <em>Remote Share WWN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_HostedShareImpl extends CIM_HostedDependencyImpl implements CIM_HostedShare {
	/**
	 * The default value of the '{@link #getRemoteShareWWN() <em>Remote Share WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteShareWWN()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SHARE_WWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteShareWWN() <em>Remote Share WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteShareWWN()
	 * @generated
	 * @ordered
	 */
	protected String remoteShareWWN = REMOTE_SHARE_WWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_HostedShareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_HostedShare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemoteShareWWN() {
		return remoteShareWWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteShareWWN(String newRemoteShareWWN) {
		String oldRemoteShareWWN = remoteShareWWN;
		remoteShareWWN = newRemoteShareWWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HOSTED_SHARE__REMOTE_SHARE_WWN, oldRemoteShareWWN, remoteShareWWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_HOSTED_SHARE__REMOTE_SHARE_WWN:
				return getRemoteShareWWN();
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
			case CimPackage.CIM_HOSTED_SHARE__REMOTE_SHARE_WWN:
				setRemoteShareWWN((String)newValue);
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
			case CimPackage.CIM_HOSTED_SHARE__REMOTE_SHARE_WWN:
				setRemoteShareWWN(REMOTE_SHARE_WWN_EDEFAULT);
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
			case CimPackage.CIM_HOSTED_SHARE__REMOTE_SHARE_WWN:
				return REMOTE_SHARE_WWN_EDEFAULT == null ? remoteShareWWN != null : !REMOTE_SHARE_WWN_EDEFAULT.equals(remoteShareWWN);
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
		result.append(" (RemoteShareWWN: ");
		result.append(remoteShareWWN);
		result.append(')');
		return result.toString();
	}

} //CIM_HostedShareImpl
