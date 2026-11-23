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

import org.dmtf.cim.CIM_VideoBIOSElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Video BIOS Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoBIOSElementImpl#getIsShadowed <em>Is Shadowed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VideoBIOSElementImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VideoBIOSElementImpl extends CIM_SoftwareElementImpl implements CIM_VideoBIOSElement {
	/**
	 * The default value of the '{@link #getIsShadowed() <em>Is Shadowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsShadowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SHADOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsShadowed() <em>Is Shadowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsShadowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean isShadowed = IS_SHADOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected String releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VideoBIOSElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VideoBIOSElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsShadowed() {
		return isShadowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsShadowed(Boolean newIsShadowed) {
		Boolean oldIsShadowed = isShadowed;
		isShadowed = newIsShadowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_BIOS_ELEMENT__IS_SHADOWED, oldIsShadowed, isShadowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(String newReleaseDate) {
		String oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIDEO_BIOS_ELEMENT__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__IS_SHADOWED:
				return getIsShadowed();
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__RELEASE_DATE:
				return getReleaseDate();
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
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__IS_SHADOWED:
				setIsShadowed((Boolean)newValue);
				return;
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__RELEASE_DATE:
				setReleaseDate((String)newValue);
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
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__IS_SHADOWED:
				setIsShadowed(IS_SHADOWED_EDEFAULT);
				return;
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
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
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__IS_SHADOWED:
				return IS_SHADOWED_EDEFAULT == null ? isShadowed != null : !IS_SHADOWED_EDEFAULT.equals(isShadowed);
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
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
		result.append(" (IsShadowed: ");
		result.append(isShadowed);
		result.append(", ReleaseDate: ");
		result.append(releaseDate);
		result.append(')');
		return result.toString();
	}

} //CIM_VideoBIOSElementImpl
