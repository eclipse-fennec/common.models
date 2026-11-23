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

import org.dmtf.cim.CIM_InstalledSoftwareIdentity;
import org.dmtf.cim.CIM_SoftwareIdentity;
import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Installed Software Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledSoftwareIdentityImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledSoftwareIdentityImpl#getInstalledSoftware <em>Installed Software</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InstalledSoftwareIdentityImpl extends MinimalEObjectImpl.Container implements CIM_InstalledSoftwareIdentity {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected CIM_System system;

	/**
	 * The cached value of the '{@link #getInstalledSoftware() <em>Installed Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledSoftware()
	 * @generated
	 * @ordered
	 */
	protected CIM_SoftwareIdentity installedSoftware;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InstalledSoftwareIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InstalledSoftwareIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (CIM_System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(CIM_System newSystem) {
		CIM_System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareIdentity getInstalledSoftware() {
		if (installedSoftware != null && installedSoftware.eIsProxy()) {
			InternalEObject oldInstalledSoftware = (InternalEObject)installedSoftware;
			installedSoftware = (CIM_SoftwareIdentity)eResolveProxy(oldInstalledSoftware);
			if (installedSoftware != oldInstalledSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__INSTALLED_SOFTWARE, oldInstalledSoftware, installedSoftware));
			}
		}
		return installedSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SoftwareIdentity basicGetInstalledSoftware() {
		return installedSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstalledSoftware(CIM_SoftwareIdentity newInstalledSoftware) {
		CIM_SoftwareIdentity oldInstalledSoftware = installedSoftware;
		installedSoftware = newInstalledSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__INSTALLED_SOFTWARE, oldInstalledSoftware, installedSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__INSTALLED_SOFTWARE:
				if (resolve) return getInstalledSoftware();
				return basicGetInstalledSoftware();
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
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__SYSTEM:
				setSystem((CIM_System)newValue);
				return;
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__INSTALLED_SOFTWARE:
				setInstalledSoftware((CIM_SoftwareIdentity)newValue);
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
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__SYSTEM:
				setSystem((CIM_System)null);
				return;
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__INSTALLED_SOFTWARE:
				setInstalledSoftware((CIM_SoftwareIdentity)null);
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
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__SYSTEM:
				return system != null;
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY__INSTALLED_SOFTWARE:
				return installedSoftware != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_InstalledSoftwareIdentityImpl
