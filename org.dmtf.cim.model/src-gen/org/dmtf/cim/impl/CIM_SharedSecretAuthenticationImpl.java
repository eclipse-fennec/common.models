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

import org.dmtf.cim.CIM_SharedSecretAuthentication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Shared Secret Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SharedSecretAuthenticationImpl#getIDOfPrincipal <em>ID Of Principal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SharedSecretAuthenticationImpl#getContextOfSecret <em>Context Of Secret</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SharedSecretAuthenticationImpl extends CIM_AuthenticationConditionImpl implements CIM_SharedSecretAuthentication {
	/**
	 * The default value of the '{@link #getIDOfPrincipal() <em>ID Of Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOfPrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_PRINCIPAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIDOfPrincipal() <em>ID Of Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOfPrincipal()
	 * @generated
	 * @ordered
	 */
	protected String idOfPrincipal = ID_OF_PRINCIPAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextOfSecret() <em>Context Of Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOfSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_OF_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextOfSecret() <em>Context Of Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOfSecret()
	 * @generated
	 * @ordered
	 */
	protected String contextOfSecret = CONTEXT_OF_SECRET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SharedSecretAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SharedSecretAuthentication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIDOfPrincipal() {
		return idOfPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOfPrincipal(String newIDOfPrincipal) {
		String oldIDOfPrincipal = idOfPrincipal;
		idOfPrincipal = newIDOfPrincipal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__ID_OF_PRINCIPAL, oldIDOfPrincipal, idOfPrincipal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextOfSecret() {
		return contextOfSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextOfSecret(String newContextOfSecret) {
		String oldContextOfSecret = contextOfSecret;
		contextOfSecret = newContextOfSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__CONTEXT_OF_SECRET, oldContextOfSecret, contextOfSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__ID_OF_PRINCIPAL:
				return getIDOfPrincipal();
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__CONTEXT_OF_SECRET:
				return getContextOfSecret();
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
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__ID_OF_PRINCIPAL:
				setIDOfPrincipal((String)newValue);
				return;
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__CONTEXT_OF_SECRET:
				setContextOfSecret((String)newValue);
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
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__ID_OF_PRINCIPAL:
				setIDOfPrincipal(ID_OF_PRINCIPAL_EDEFAULT);
				return;
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__CONTEXT_OF_SECRET:
				setContextOfSecret(CONTEXT_OF_SECRET_EDEFAULT);
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
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__ID_OF_PRINCIPAL:
				return ID_OF_PRINCIPAL_EDEFAULT == null ? idOfPrincipal != null : !ID_OF_PRINCIPAL_EDEFAULT.equals(idOfPrincipal);
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION__CONTEXT_OF_SECRET:
				return CONTEXT_OF_SECRET_EDEFAULT == null ? contextOfSecret != null : !CONTEXT_OF_SECRET_EDEFAULT.equals(contextOfSecret);
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
		result.append(" (IDOfPrincipal: ");
		result.append(idOfPrincipal);
		result.append(", ContextOfSecret: ");
		result.append(contextOfSecret);
		result.append(')');
		return result.toString();
	}

} //CIM_SharedSecretAuthenticationImpl
