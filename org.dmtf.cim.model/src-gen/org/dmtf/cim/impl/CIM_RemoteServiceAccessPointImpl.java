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

import org.dmtf.cim.CIM_RemoteServiceAccessPoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Remote Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteServiceAccessPointImpl#getAccessInfo <em>Access Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteServiceAccessPointImpl#getInfoFormat <em>Info Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteServiceAccessPointImpl#getOtherInfoFormatDescription <em>Other Info Format Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteServiceAccessPointImpl#getAccessContext <em>Access Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteServiceAccessPointImpl#getOtherAccessContext <em>Other Access Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RemoteServiceAccessPointImpl extends CIM_ServiceAccessPointImpl implements CIM_RemoteServiceAccessPoint {
	/**
	 * The default value of the '{@link #getAccessInfo() <em>Access Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessInfo() <em>Access Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessInfo()
	 * @generated
	 * @ordered
	 */
	protected String accessInfo = ACCESS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoFormat() <em>Info Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INFO_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoFormat() <em>Info Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer infoFormat = INFO_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherInfoFormatDescription() <em>Other Info Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInfoFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherInfoFormatDescription() <em>Other Info Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInfoFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherInfoFormatDescription = OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessContext() <em>Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessContext()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_CONTEXT_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getAccessContext() <em>Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessContext()
	 * @generated
	 * @ordered
	 */
	protected Integer accessContext = ACCESS_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAccessContext() <em>Other Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAccessContext()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ACCESS_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAccessContext() <em>Other Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAccessContext()
	 * @generated
	 * @ordered
	 */
	protected String otherAccessContext = OTHER_ACCESS_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RemoteServiceAccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RemoteServiceAccessPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessInfo() {
		return accessInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessInfo(String newAccessInfo) {
		String oldAccessInfo = accessInfo;
		accessInfo = newAccessInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO, oldAccessInfo, accessInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInfoFormat() {
		return infoFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoFormat(Integer newInfoFormat) {
		Integer oldInfoFormat = infoFormat;
		infoFormat = newInfoFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT, oldInfoFormat, infoFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherInfoFormatDescription() {
		return otherInfoFormatDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherInfoFormatDescription(String newOtherInfoFormatDescription) {
		String oldOtherInfoFormatDescription = otherInfoFormatDescription;
		otherInfoFormatDescription = newOtherInfoFormatDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION, oldOtherInfoFormatDescription, otherInfoFormatDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessContext() {
		return accessContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessContext(Integer newAccessContext) {
		Integer oldAccessContext = accessContext;
		accessContext = newAccessContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT, oldAccessContext, accessContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAccessContext() {
		return otherAccessContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAccessContext(String newOtherAccessContext) {
		String oldOtherAccessContext = otherAccessContext;
		otherAccessContext = newOtherAccessContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT, oldOtherAccessContext, otherAccessContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				return getAccessInfo();
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				return getInfoFormat();
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				return getOtherInfoFormatDescription();
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				return getAccessContext();
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				return getOtherAccessContext();
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
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				setAccessInfo((String)newValue);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				setInfoFormat((Integer)newValue);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				setOtherInfoFormatDescription((String)newValue);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				setAccessContext((Integer)newValue);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				setOtherAccessContext((String)newValue);
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
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				setAccessInfo(ACCESS_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				setInfoFormat(INFO_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				setOtherInfoFormatDescription(OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				setAccessContext(ACCESS_CONTEXT_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				setOtherAccessContext(OTHER_ACCESS_CONTEXT_EDEFAULT);
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
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				return ACCESS_INFO_EDEFAULT == null ? accessInfo != null : !ACCESS_INFO_EDEFAULT.equals(accessInfo);
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				return INFO_FORMAT_EDEFAULT == null ? infoFormat != null : !INFO_FORMAT_EDEFAULT.equals(infoFormat);
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				return OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT == null ? otherInfoFormatDescription != null : !OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT.equals(otherInfoFormatDescription);
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				return ACCESS_CONTEXT_EDEFAULT == null ? accessContext != null : !ACCESS_CONTEXT_EDEFAULT.equals(accessContext);
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				return OTHER_ACCESS_CONTEXT_EDEFAULT == null ? otherAccessContext != null : !OTHER_ACCESS_CONTEXT_EDEFAULT.equals(otherAccessContext);
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
		result.append(" (AccessInfo: ");
		result.append(accessInfo);
		result.append(", InfoFormat: ");
		result.append(infoFormat);
		result.append(", OtherInfoFormatDescription: ");
		result.append(otherInfoFormatDescription);
		result.append(", AccessContext: ");
		result.append(accessContext);
		result.append(", OtherAccessContext: ");
		result.append(otherAccessContext);
		result.append(')');
		return result.toString();
	}

} //CIM_RemoteServiceAccessPointImpl
