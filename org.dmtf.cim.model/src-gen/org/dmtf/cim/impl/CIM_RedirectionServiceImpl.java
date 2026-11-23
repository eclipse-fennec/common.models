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

import org.dmtf.cim.CIM_RedirectionService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Redirection Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedirectionServiceImpl#getRedirectionServiceType <em>Redirection Service Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedirectionServiceImpl#getOtherRedirectionServiceType <em>Other Redirection Service Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedirectionServiceImpl#getMaxCurrentEnabledSAPs <em>Max Current Enabled SA Ps</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedirectionServiceImpl#getSharingMode <em>Sharing Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RedirectionServiceImpl extends CIM_ServiceImpl implements CIM_RedirectionService {
	/**
	 * The cached value of the '{@link #getRedirectionServiceType() <em>Redirection Service Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectionServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> redirectionServiceType;

	/**
	 * The default value of the '{@link #getOtherRedirectionServiceType() <em>Other Redirection Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRedirectionServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_REDIRECTION_SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRedirectionServiceType() <em>Other Redirection Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRedirectionServiceType()
	 * @generated
	 * @ordered
	 */
	protected String otherRedirectionServiceType = OTHER_REDIRECTION_SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCurrentEnabledSAPs() <em>Max Current Enabled SA Ps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrentEnabledSAPs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CURRENT_ENABLED_SA_PS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCurrentEnabledSAPs() <em>Max Current Enabled SA Ps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrentEnabledSAPs()
	 * @generated
	 * @ordered
	 */
	protected Integer maxCurrentEnabledSAPs = MAX_CURRENT_ENABLED_SA_PS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharingMode() <em>Sharing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharingMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHARING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharingMode() <em>Sharing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharingMode()
	 * @generated
	 * @ordered
	 */
	protected Integer sharingMode = SHARING_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RedirectionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RedirectionService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRedirectionServiceType() {
		if (redirectionServiceType == null) {
			redirectionServiceType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REDIRECTION_SERVICE__REDIRECTION_SERVICE_TYPE);
		}
		return redirectionServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRedirectionServiceType() {
		return otherRedirectionServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRedirectionServiceType(String newOtherRedirectionServiceType) {
		String oldOtherRedirectionServiceType = otherRedirectionServiceType;
		otherRedirectionServiceType = newOtherRedirectionServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDIRECTION_SERVICE__OTHER_REDIRECTION_SERVICE_TYPE, oldOtherRedirectionServiceType, otherRedirectionServiceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxCurrentEnabledSAPs() {
		return maxCurrentEnabledSAPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCurrentEnabledSAPs(Integer newMaxCurrentEnabledSAPs) {
		Integer oldMaxCurrentEnabledSAPs = maxCurrentEnabledSAPs;
		maxCurrentEnabledSAPs = newMaxCurrentEnabledSAPs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDIRECTION_SERVICE__MAX_CURRENT_ENABLED_SA_PS, oldMaxCurrentEnabledSAPs, maxCurrentEnabledSAPs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSharingMode() {
		return sharingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharingMode(Integer newSharingMode) {
		Integer oldSharingMode = sharingMode;
		sharingMode = newSharingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REDIRECTION_SERVICE__SHARING_MODE, oldSharingMode, sharingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REDIRECTION_SERVICE__REDIRECTION_SERVICE_TYPE:
				return getRedirectionServiceType();
			case CimPackage.CIM_REDIRECTION_SERVICE__OTHER_REDIRECTION_SERVICE_TYPE:
				return getOtherRedirectionServiceType();
			case CimPackage.CIM_REDIRECTION_SERVICE__MAX_CURRENT_ENABLED_SA_PS:
				return getMaxCurrentEnabledSAPs();
			case CimPackage.CIM_REDIRECTION_SERVICE__SHARING_MODE:
				return getSharingMode();
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
			case CimPackage.CIM_REDIRECTION_SERVICE__REDIRECTION_SERVICE_TYPE:
				getRedirectionServiceType().clear();
				getRedirectionServiceType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REDIRECTION_SERVICE__OTHER_REDIRECTION_SERVICE_TYPE:
				setOtherRedirectionServiceType((String)newValue);
				return;
			case CimPackage.CIM_REDIRECTION_SERVICE__MAX_CURRENT_ENABLED_SA_PS:
				setMaxCurrentEnabledSAPs((Integer)newValue);
				return;
			case CimPackage.CIM_REDIRECTION_SERVICE__SHARING_MODE:
				setSharingMode((Integer)newValue);
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
			case CimPackage.CIM_REDIRECTION_SERVICE__REDIRECTION_SERVICE_TYPE:
				getRedirectionServiceType().clear();
				return;
			case CimPackage.CIM_REDIRECTION_SERVICE__OTHER_REDIRECTION_SERVICE_TYPE:
				setOtherRedirectionServiceType(OTHER_REDIRECTION_SERVICE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_REDIRECTION_SERVICE__MAX_CURRENT_ENABLED_SA_PS:
				setMaxCurrentEnabledSAPs(MAX_CURRENT_ENABLED_SA_PS_EDEFAULT);
				return;
			case CimPackage.CIM_REDIRECTION_SERVICE__SHARING_MODE:
				setSharingMode(SHARING_MODE_EDEFAULT);
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
			case CimPackage.CIM_REDIRECTION_SERVICE__REDIRECTION_SERVICE_TYPE:
				return redirectionServiceType != null && !redirectionServiceType.isEmpty();
			case CimPackage.CIM_REDIRECTION_SERVICE__OTHER_REDIRECTION_SERVICE_TYPE:
				return OTHER_REDIRECTION_SERVICE_TYPE_EDEFAULT == null ? otherRedirectionServiceType != null : !OTHER_REDIRECTION_SERVICE_TYPE_EDEFAULT.equals(otherRedirectionServiceType);
			case CimPackage.CIM_REDIRECTION_SERVICE__MAX_CURRENT_ENABLED_SA_PS:
				return MAX_CURRENT_ENABLED_SA_PS_EDEFAULT == null ? maxCurrentEnabledSAPs != null : !MAX_CURRENT_ENABLED_SA_PS_EDEFAULT.equals(maxCurrentEnabledSAPs);
			case CimPackage.CIM_REDIRECTION_SERVICE__SHARING_MODE:
				return SHARING_MODE_EDEFAULT == null ? sharingMode != null : !SHARING_MODE_EDEFAULT.equals(sharingMode);
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
		result.append(" (RedirectionServiceType: ");
		result.append(redirectionServiceType);
		result.append(", OtherRedirectionServiceType: ");
		result.append(otherRedirectionServiceType);
		result.append(", MaxCurrentEnabledSAPs: ");
		result.append(maxCurrentEnabledSAPs);
		result.append(", SharingMode: ");
		result.append(sharingMode);
		result.append(')');
		return result.toString();
	}

} //CIM_RedirectionServiceImpl
