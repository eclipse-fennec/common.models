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

import org.dmtf.cim.CIM_NetworkService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkServiceImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkServiceImpl#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkServiceImpl#getStartupConditions <em>Startup Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkServiceImpl#getStartupParameters <em>Startup Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_NetworkServiceImpl extends CIM_ServiceImpl implements CIM_NetworkService {
	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keywords;

	/**
	 * The default value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected String serviceURL = SERVICE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartupConditions() <em>Startup Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> startupConditions;

	/**
	 * The cached value of the '{@link #getStartupParameters() <em>Startup Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> startupParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKeywords() {
		if (keywords == null) {
			keywords = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_SERVICE__KEYWORDS);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceURL() {
		return serviceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceURL(String newServiceURL) {
		String oldServiceURL = serviceURL;
		serviceURL = newServiceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_SERVICE__SERVICE_URL, oldServiceURL, serviceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStartupConditions() {
		if (startupConditions == null) {
			startupConditions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_SERVICE__STARTUP_CONDITIONS);
		}
		return startupConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStartupParameters() {
		if (startupParameters == null) {
			startupParameters = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_SERVICE__STARTUP_PARAMETERS);
		}
		return startupParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_SERVICE__KEYWORDS:
				return getKeywords();
			case CimPackage.CIM_NETWORK_SERVICE__SERVICE_URL:
				return getServiceURL();
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_CONDITIONS:
				return getStartupConditions();
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_PARAMETERS:
				return getStartupParameters();
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
			case CimPackage.CIM_NETWORK_SERVICE__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_NETWORK_SERVICE__SERVICE_URL:
				setServiceURL((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_CONDITIONS:
				getStartupConditions().clear();
				getStartupConditions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_PARAMETERS:
				getStartupParameters().clear();
				getStartupParameters().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_NETWORK_SERVICE__KEYWORDS:
				getKeywords().clear();
				return;
			case CimPackage.CIM_NETWORK_SERVICE__SERVICE_URL:
				setServiceURL(SERVICE_URL_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_CONDITIONS:
				getStartupConditions().clear();
				return;
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_PARAMETERS:
				getStartupParameters().clear();
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
			case CimPackage.CIM_NETWORK_SERVICE__KEYWORDS:
				return keywords != null && !keywords.isEmpty();
			case CimPackage.CIM_NETWORK_SERVICE__SERVICE_URL:
				return SERVICE_URL_EDEFAULT == null ? serviceURL != null : !SERVICE_URL_EDEFAULT.equals(serviceURL);
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_CONDITIONS:
				return startupConditions != null && !startupConditions.isEmpty();
			case CimPackage.CIM_NETWORK_SERVICE__STARTUP_PARAMETERS:
				return startupParameters != null && !startupParameters.isEmpty();
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
		result.append(" (Keywords: ");
		result.append(keywords);
		result.append(", ServiceURL: ");
		result.append(serviceURL);
		result.append(", StartupConditions: ");
		result.append(startupConditions);
		result.append(", StartupParameters: ");
		result.append(startupParameters);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkServiceImpl
